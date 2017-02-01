
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/orkun/Workspace/DatabaseProject/conf/routes
// @DATE:Wed Feb 01 19:24:10 CET 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversePageController PageController = new controllers.ReversePageController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWebJarAssets WebJarAssets = new controllers.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserAuthenticationController UserAuthenticationController = new controllers.ReverseUserAuthenticationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversePageController PageController = new controllers.javascript.ReversePageController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWebJarAssets WebJarAssets = new controllers.javascript.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserAuthenticationController UserAuthenticationController = new controllers.javascript.ReverseUserAuthenticationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
