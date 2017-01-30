package controllers

import akka.actor.ActorSystem
import javax.inject._

import DAO.DatabaseController
import models.User
import play.api._
import play.api.data.Form
import play.api.mvc._
import play.api.data.Forms._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.twirl.api.Html
import views.html.tweetContent
import views.viewForms.userAuthForm

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
    val tweets = DatabaseController.getTweets()
    val result = for {
      account_id <- request.session.get("accountID")   //***** burası giriş
      username <-  request.session.get("username")
    } yield {
      val user = User(Some(account_id.toInt), username,"",0)

      tweets.map{tweets =>
        Ok(views.html.index(webJarAssets, Some(user),
        views.html.landing(tweetContent(tweets))))}
    }
    result.getOrElse(
      tweets.map{tweets =>
        Ok(views.html.index(webJarAssets, None,
          views.html.landing(tweetContent(tweets))))}
    )
  }

}
