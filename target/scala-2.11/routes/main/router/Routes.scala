
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/orkun/Workspace/DatabaseProject/conf/routes
// @DATE:Sun Jan 29 21:29:06 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:18
  Assets_1: controllers.Assets,
  // @LINE:21
  WebJarAssets_0: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:18
    Assets_1: controllers.Assets,
    // @LINE:21
    WebJarAssets_0: controllers.WebJarAssets
  ) = this(errorHandler, AsyncController_2, Assets_1, WebJarAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AsyncController_2, Assets_1, WebJarAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.AsyncController.landing"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.AsyncController.signInNewUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AsyncController.logInUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/""" + "$" + """file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_AsyncController_landing0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_AsyncController_landing0_invoker = createInvoker(
    AsyncController_2.landing,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "landing",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AsyncController_message1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message1_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """""",
      this.prefix + """message"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_AsyncController_signInNewUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_AsyncController_signInNewUser2_invoker = createInvoker(
    AsyncController_2.signInNewUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "signInNewUser",
      Nil,
      "POST",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AsyncController_logInUser3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AsyncController_logInUser3_invoker = createInvoker(
    AsyncController_2.logInUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "logInUser",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_WebJarAssets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at5_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """ WebJars""",
      this.prefix + """webjars/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_AsyncController_landing0_route(params) =>
      call { 
        controllers_AsyncController_landing0_invoker.call(AsyncController_2.landing)
      }
  
    // @LINE:12
    case controllers_AsyncController_message1_route(params) =>
      call { 
        controllers_AsyncController_message1_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:14
    case controllers_AsyncController_signInNewUser2_route(params) =>
      call { 
        controllers_AsyncController_signInNewUser2_invoker.call(AsyncController_2.signInNewUser)
      }
  
    // @LINE:16
    case controllers_AsyncController_logInUser3_route(params) =>
      call { 
        controllers_AsyncController_logInUser3_invoker.call(AsyncController_2.logInUser)
      }
  
    // @LINE:18
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:21
    case controllers_WebJarAssets_at5_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at5_invoker.call(WebJarAssets_0.at(file))
      }
  }
}
