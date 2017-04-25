
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nickwhite/Google Drive/Current Classes/461L Software Design Lab/Team Project/Wingspan/play-example/conf/routes
// @DATE:Fri Apr 21 13:39:11 CDT 2017


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
