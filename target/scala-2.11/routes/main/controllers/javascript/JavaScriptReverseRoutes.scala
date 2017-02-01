
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/home/orkun/Workspace/DatabaseProject/conf/routes
// @DATE:Wed Feb 01 21:20:23 CET 2017
=======
// @SOURCE:/home/furkan/Desktop/DatabaseProject/conf/routes
// @DATE:Wed Feb 01 19:33:40 CET 2017
>>>>>>> developmentFurkan2

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:10
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReversePageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def likeTweet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PageController.likeTweet",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "likeTweet"})
        }
      """
    )
  
    // @LINE:10
    def landing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PageController.landing",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:24
    def postTweet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PageController.postTweet",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "posttweet"})
        }
      """
    )
  
    // @LINE:22
    def showSettings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PageController.showSettings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showsettings"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseUserAuthenticationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def signInNewUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAuthenticationController.signInNewUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
    // @LINE:20
    def deleteAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAuthenticationController.deleteAccount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteaccount"})
        }
      """
    )
  
    // @LINE:12
    def logOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAuthenticationController.logOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:18
    def logInUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAuthenticationController.logInUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:14
    def authenticatePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserAuthenticationController.authenticatePage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
