
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/eischer/IdeaProjects/switchmonitor/conf/routes
// @DATE:Mon Jun 12 15:58:55 CEST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDeviceController DeviceController = new controllers.ReverseDeviceController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePortController PortController = new controllers.ReversePortController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDeviceController DeviceController = new controllers.javascript.ReverseDeviceController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePortController PortController = new controllers.javascript.ReversePortController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
