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
class AsyncController @Inject() (actorSystem: ActorSystem, DatabaseController: DatabaseController,
                                 implicit val  messagesApi: MessagesApi, webJarAssets: WebJarAssets)(implicit exec: ExecutionContext) extends Controller with I18nSupport {

  /**
    *
    *   USER AUTHENTICATION
    *
    * */
  val userAuth = Form(
    mapping(
      "username" -> nonEmptyText,
      "password" -> nonEmptyText
    )(userAuthForm.apply)(userAuthForm.unapply)
  )
  def signInNewUser = Action.async(parse.form(userAuth)) { implicit request =>
    val userCredentials = request.body
    DatabaseController.addNewUser(User(None, userCredentials.username, userCredentials.password, 0)).map { user =>
      Redirect(routes.AsyncController.landing).withSession("accountID" -> user.toString, "username" -> user.username)
    }
    /*userAuth.bindFromRequest.fold (
      formWithErrors => {
        // binding failure, you retrieve the form containing errors:
        Future(Ok("aq"))
      },
      userCredentials => {
        /* binding success, you get the actual value. */
        DatabaseController.addNewUser(User(None, userCredentials.username, userCredentials.password, 0)).map { user =>
          Redirect(routes.AsyncController.landing).withSession("accountID" -> user.toString, "username" -> user.username)
        }
      }
    )*/
  }

  def logInUser = Action.async(parse.form(userAuth)){ implicit request =>
    userAuth.bindFromRequest.fold(
      formWithErrors => Future(Ok("form errors")),
      userCredentials => {
        DatabaseController.searchUser(userCredentials.username).map {
          _ match {
            case None => Ok("username not found")
            case Some(user) => {
              if(userCredentials.password == user.password){
                Redirect(routes.AsyncController.landing).withSession("accountID" -> user.toString, "username" -> user.username)
              }
              else {
                Ok("password incorrect")
              }
            }
          }
        }
      }
    )
  }
  def authenticate = Action.async { implicit request =>
    Future(Ok(views.html.index(webJarAssets, views.html.landing(userAuth, userAuth))))
  }
  def landing = Action.async { implicit request =>
    val result = for {
      account_id <- request.session.get("accountID")   //***** burası giriş
      username <-  request.session.get("username")
    } yield {
      Future(Ok("afferin")) // INTRO
    }
    result.getOrElse(Future(Ok(views.html.index(webJarAssets, views.html.landing(userAuth, userAuth)))))
  }
  def mainPage = Action.async { implicit request =>

    for {
      account_id <- request.session.get("account_id")
      username <-  request.session.get("username")
    } yield {
      Future(Ok("")) // INTRO
    }
    Future(Ok(""))
  }
  def message = Action.async {
    getFutureMessage(1.second).map { msg => Ok(msg) }
  }

  private def getFutureMessage(delayTime: FiniteDuration): Future[String] = {
    val promise: Promise[String] = Promise[String]()
    actorSystem.scheduler.scheduleOnce(delayTime) { promise.success("Hi!") }
    promise.future
  }

}
