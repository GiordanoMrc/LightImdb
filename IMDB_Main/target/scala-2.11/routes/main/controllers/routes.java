
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/marcelopc/gitProjects/imdb/IMDB_Main/conf/routes
// @DATE:Wed Jul 05 22:30:26 BRT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFilmeController FilmeController = new controllers.ReverseFilmeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAvaliacaoController AvaliacaoController = new controllers.ReverseAvaliacaoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUsuarioController UsuarioController = new controllers.ReverseUsuarioController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFilmeController FilmeController = new controllers.javascript.ReverseFilmeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAvaliacaoController AvaliacaoController = new controllers.javascript.ReverseAvaliacaoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUsuarioController UsuarioController = new controllers.javascript.ReverseUsuarioController(RoutesPrefix.byNamePrefix());
  }

}
