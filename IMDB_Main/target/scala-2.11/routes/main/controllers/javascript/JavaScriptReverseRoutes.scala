
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/marcelopc/gitProjects/imdb/IMDB_Main/conf/routes
// @DATE:Wed Jul 05 22:30:26 BRT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseFilmeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def listar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FilmeController.listar",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0)])})
        }
      """
    )
  
    // @LINE:15
    def novoFilme: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FilmeController.novoFilme",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/novo/"})
        }
      """
    )
  
    // @LINE:16
    def novoFilmeSubmissao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FilmeController.novoFilmeSubmissao",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "filme"})
        }
      """
    )
  
    // @LINE:17
    def deletarFilme: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FilmeController.deletarFilme",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/deletar/" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseAvaliacaoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def submeterAvaliacao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AvaliacaoController.submeterAvaliacao",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/avaliar/"})
        }
      """
    )
  
    // @LINE:19
    def novaAvaliacao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AvaliacaoController.novaAvaliacao",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/avaliar/novo"})
        }
      """
    )
  
    // @LINE:18
    def listarAvaliacoes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AvaliacaoController.listarAvaliacoes",
      """
        function(email0,idFilme1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filme/avaliar/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0), (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("idFilme", idFilme1)])})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def novoLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.novoLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/"})
        }
      """
    )
  
    // @LINE:10
    def loginSubmissao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.loginSubmissao",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/"})
        }
      """
    )
  
  }


}
