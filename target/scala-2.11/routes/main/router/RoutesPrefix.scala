
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/home/orkun/Workspace/DatabaseProject/conf/routes
// @DATE:Wed Feb 01 21:20:23 CET 2017
=======
// @SOURCE:/home/furkan/Desktop/DatabaseProject/conf/routes
// @DATE:Wed Feb 01 19:33:40 CET 2017
>>>>>>> developmentFurkan2


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
