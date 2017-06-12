
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/eischer/IdeaProjects/switchmonitor/conf/routes
// @DATE:Mon Jun 12 15:58:55 CEST 2017

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
  DeviceController_3: controllers.DeviceController,
  // @LINE:11
  PortController_2: controllers.PortController,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:8
    DeviceController_3: controllers.DeviceController,
    // @LINE:11
    PortController_2: controllers.PortController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, DeviceController_3, PortController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, DeviceController_3, PortController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """devices""", """controllers.DeviceController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """devices""", """controllers.DeviceController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """devices/""" + "$" + """id<[^/]+>""", """controllers.DeviceController.show(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """devices/""" + "$" + """device_id<[^/]+>/ports""", """controllers.PortController.index(device_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """devices/""" + "$" + """device_id<[^/]+>/ports/""" + "$" + """port_id<[^/]+>""", """controllers.PortController.show(device_id:Long, port_id:Long)"""),
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
    DeviceController_3.index,
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
  private[this] lazy val controllers_DeviceController_submit2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("devices")))
  )
  private[this] lazy val controllers_DeviceController_submit2_invoker = createInvoker(
    DeviceController_3.submit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DeviceController",
      "submit",
      Nil,
      "POST",
      """""",
      this.prefix + """devices"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_DeviceController_show3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("devices/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DeviceController_show3_invoker = createInvoker(
    DeviceController_3.show(fakeValue[Long]),
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

  // @LINE:11
  private[this] lazy val controllers_PortController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("devices/"), DynamicPart("device_id", """[^/]+""",true), StaticPart("/ports")))
  )
  private[this] lazy val controllers_PortController_index4_invoker = createInvoker(
    PortController_2.index(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PortController",
      "index",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """devices/""" + "$" + """device_id<[^/]+>/ports"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PortController_show5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("devices/"), DynamicPart("device_id", """[^/]+""",true), StaticPart("/ports/"), DynamicPart("port_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PortController_show5_invoker = createInvoker(
    PortController_2.show(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PortController",
      "show",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """devices/""" + "$" + """device_id<[^/]+>/ports/""" + "$" + """port_id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
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
        controllers_DeviceController_index1_invoker.call(DeviceController_3.index)
      }
  
    // @LINE:9
    case controllers_DeviceController_submit2_route(params) =>
      call { 
        controllers_DeviceController_submit2_invoker.call(DeviceController_3.submit)
      }
  
    // @LINE:10
    case controllers_DeviceController_show3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DeviceController_show3_invoker.call(DeviceController_3.show(id))
      }
  
    // @LINE:11
    case controllers_PortController_index4_route(params) =>
      call(params.fromPath[Long]("device_id", None)) { (device_id) =>
        controllers_PortController_index4_invoker.call(PortController_2.index(device_id))
      }
  
    // @LINE:12
    case controllers_PortController_show5_route(params) =>
      call(params.fromPath[Long]("device_id", None), params.fromPath[Long]("port_id", None)) { (device_id, port_id) =>
        controllers_PortController_show5_invoker.call(PortController_2.show(device_id, port_id))
      }
  
    // @LINE:15
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
