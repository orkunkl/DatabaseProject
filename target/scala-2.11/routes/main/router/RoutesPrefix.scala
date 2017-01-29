
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/orkun/Workspace/DatabaseProject/conf/routes
// @DATE:Sun Jan 29 21:29:06 CET 2017


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
