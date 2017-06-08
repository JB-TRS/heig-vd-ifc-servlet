
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/eischer/IdeaProjects/switchmonitor/conf/routes
// @DATE:Thu Jun 08 11:03:30 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:8
  DeviceController_2: controllers.DeviceController,
  // @LINE:12
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:8
    DeviceController_2: controllers.DeviceController,
    // @LINE:12
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, DeviceController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, DeviceController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """devices""", """controllers.DeviceController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """devices/""" + "$" + """id<[^/]+>""", """controllers.DeviceController.show(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_DeviceController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("devices")))
  )
  private[this] lazy val controllers_DeviceController_index1_invoker = createInvoker(
    DeviceController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeviceController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """devices"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_DeviceController_show2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("devices/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DeviceController_show2_invoker = createInvoker(
    DeviceController_2.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeviceController",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """devices/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_DeviceController_index1_route(params) =>
      call { 
        controllers_DeviceController_index1_invoker.call(DeviceController_2.index)
      }
  
    // @LINE:9
    case controllers_DeviceController_show2_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DeviceController_show2_invoker.call(DeviceController_2.show(id))
      }
  
    // @LINE:12
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
