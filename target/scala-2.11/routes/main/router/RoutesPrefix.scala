
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/eischer/IdeaProjects/switchmonitor/conf/routes
// @DATE:Fri Jun 09 15:32:23 CEST 2017


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
