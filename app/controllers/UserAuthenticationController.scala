package controllers

import java.util.Calendar
import javax.inject._

import DAO.DatabaseController
import akka.actor.ActorSystem
import models.{Like, User}
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import play.twirl.api.Html
import views.viewForms.userAuthForm

import scala.concurrent.{ExecutionContext, Future}

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
class UserAuthenticationController @Inject()(actorSystem: ActorSystem, DatabaseController: DatabaseController,
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
    DatabaseController.addNewUser(User(None, userCredentials.username, userCredentials.password)).map { user =>
      Redirect(routes.PageController.landing).withSession("accountID" -> user.accountID.get.toString, "username" -> user.username)
    }
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
                Redirect(routes.PageController.landing).withSession("accountID" -> user.accountID.get.toString, "username" -> user.username)
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

  def logOut = Action.async {
    Future(Redirect(routes.PageController.landing).withNewSession)
  }

  def authenticatePage = Action.async {
    Future(Ok(views.html.index(webJarAssets, None, views.html.authenticate(userAuth, userAuth))))
  }

  def deleteAccount = Action.async { implicit request =>
    val auth: Option[Future[Result]] = for {
      accountID <- request.session.get("accountID")
      username <- request.session.get("username")
    } yield {
      DatabaseController.deleteAccount(accountID.toInt).map { _ =>
        Redirect(routes.PageController.landing()).withNewSession
      }
    }
    auth.getOrElse(
      Future(Redirect(routes.PageController.landing()))
    )
  }
}
