package controllers

import java.util.Calendar

import akka.actor.ActorSystem
import javax.inject._

import DAO.DatabaseController
import models._
import play.api._
import play.api.Logger
import play.api.data.Form
import play.api.mvc._
import play.api.data.Forms._
import play.api.i18n.{I18nSupport, MessagesApi}
import views.viewForms.{LikeForm, tweetForm}

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.concurrent.{ExecutionContext, Future, Promise}
import scala.concurrent.duration._

/**
 * This controller creates an `Action` that demonstrates how to write
 * simple asynchronous code in a controller. It uses a timer to
 * asynchronously delay sending a response for 1 second.
 *
 * @param actorSystem We need the `ActorSystem`'s `Scheduler` to
 * run code after a delay.
 * @param exec We need an `ExecutionContext` to execute our
 * asynchronous code.
 */
@Singleton
class PageController @Inject()(actorSystem: ActorSystem, DatabaseController: DatabaseController,
                               implicit val  messagesApi: MessagesApi, webJarAssets: WebJarAssets)(implicit exec: ExecutionContext) extends Controller with I18nSupport {

  /**
    *
    *   PAGE CONTROL
    *
    * */
  def landing = Action.async { implicit request =>
    Logger.debug("landing")
    val tweets = DatabaseController.getTweets
    val result = for {
      account_id <- request.session.get("accountID")   //***** burası giriş
      username <-  request.session.get("username")
    } yield {
      val user = User(Some(account_id.toInt), username, "")

      tweets.map{tweets =>
        Ok(views.html.index(webJarAssets, Some(user),
        views.html.landing(Some(user), tweets, tweetViewForm)))}
    }
    result.getOrElse(
      tweets.map{tweets =>
        Ok(views.html.index(webJarAssets, None,
          views.html.landing(None, tweets, tweetViewForm)))}
    )
  }

  val tweetViewForm = Form(
    mapping(
      "tweetText" -> text,
      "hashtags" -> text,
      "location" -> text
    )(tweetForm.apply)(tweetForm.unapply)
  )

  def postTweet = Action.async(parse.form(tweetViewForm)) { implicit request =>
    Logger.debug("reached here : 69")
    val auth: Option[Future[Result]] = for {
      accountID <- request.session.get("accountID")
      username <- request.session.get("username")
    } yield {
      val tweetinfo = request.body
      val hashtagIDs = ArrayBuffer[Int]()
      /** This part is for adding new hashtags*/
      Logger.debug("reached here : 76")
      if(!tweetinfo.hashtags.isEmpty){
        tweetinfo.hashtags.replaceAll("\\s", "").split(",").foreach { hashtag =>
          DatabaseController.checkHashtag(hashtag).flatMap{
            _ match {
              case Some(found) => Logger.debug("reached here : 80"); Future("zuhaha")
              case None => Logger.debug("reached here : 81"); DatabaseController.insertHashtag(Hashtag(None, new java.sql.Date(Calendar.getInstance().getTime().getTime()), hashtag)).map(id => hashtagIDs += id)
            }
          }
        }
      }
      Logger.debug("reached here")
      /** This part is for location detecting and insering*/
      if(!tweetinfo.location.isEmpty)
        DatabaseController.getLocation(tweetinfo.location).flatMap {
          _ match {
            case None => DatabaseController.insertLocation(Location(None, tweetinfo.location)).flatMap{ location =>
              DatabaseController.insertTweet(Tweet(None, accountID.toInt, username, tweetinfo.tweetText, Some(location))).map{_ =>
                Redirect(routes.PageController.landing())
              }
            }
          }
        }
      else
        DatabaseController.insertTweet(Tweet(None, accountID.toInt, username, tweetinfo.tweetText, None)).flatMap { tweetID =>
          DatabaseController.insertRelation(hashtagIDs.map(id => HashtagTweetRelation(tweetID,id))).map{ _ =>
            Redirect(routes.PageController.landing())
          }
        }
    }
    auth.getOrElse{
      Future(Redirect(routes.PageController.landing()))
    }
  }


  val newLike = Form(
    mapping(
      "tweetID" -> number,
      "likerID" -> number,
      "postOwnerID" -> number
    )(LikeForm.apply)(LikeForm.unapply)
  )
  def likeTweet = Action.async(parse.form(newLike)) { implicit request =>
    val auth: Option[Future[Result]] = for {
      accountID <- request.session.get("accountID")
      username <- request.session.get("username")
    } yield {
      val tweetinfo = request.body
      DatabaseController.likeTweet(Like(tweetinfo.tweetID,tweetinfo.likerID,tweetinfo.postOwnerID, new java.sql.Date(Calendar.getInstance().getTime().getTime()))).map{
        _ => Redirect(routes.PageController.landing())
      }
    }
    auth.getOrElse(
      Future(Redirect(routes.PageController.landing()))
    )
  }
  def showSettings = Action.async { implicit request =>
    Future(Ok(views.html.index(webJarAssets, None, views.html.settingsPage())))
  }
  val newCommentForm = Form(
    mapping(
      "tweetID" -> number,
      "commentOwnerID" -> number,
      "postOwnerID" -> number
    )(LikeForm.apply)(LikeForm.unapply))

  def makeComment = Action.async { implicit request =>
    val auth: Option[Future[Result]] = for {
      accountID <- request.session.get("accountID")
      username <- request.session.get("username")
    } yield {

      Future(Ok(""))
    }
    Future(Ok(""))
  }
}
