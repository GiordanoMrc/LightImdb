
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/marcelopc/gitProjects/imdb/IMDB_Main/conf/routes
// @DATE:Wed Jul 05 22:30:26 BRT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:9
  UsuarioController_3: controllers.UsuarioController,
  // @LINE:14
  FilmeController_2: controllers.FilmeController,
  // @LINE:18
  AvaliacaoController_0: controllers.AvaliacaoController,
  // @LINE:23
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:9
    UsuarioController_3: controllers.UsuarioController,
    // @LINE:14
    FilmeController_2: controllers.FilmeController,
    // @LINE:18
    AvaliacaoController_0: controllers.AvaliacaoController,
    // @LINE:23
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_1, UsuarioController_3, FilmeController_2, AvaliacaoController_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, UsuarioController_3, FilmeController_2, AvaliacaoController_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/""", """controllers.UsuarioController.novoLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/""", """controllers.UsuarioController.loginSubmissao"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme/""", """controllers.FilmeController.listar(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme/novo/""", """controllers.FilmeController.novoFilme"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme""", """controllers.FilmeController.novoFilmeSubmissao"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme/deletar/""", """controllers.FilmeController.deletarFilme(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme/avaliar/""", """controllers.AvaliacaoController.listarAvaliacoes(email:String, idFilme:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme/avaliar/novo""", """controllers.AvaliacaoController.novaAvaliacao"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filme/avaliar/""", """controllers.AvaliacaoController.submeterAvaliacao"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
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

  // @LINE:9
  private[this] lazy val controllers_UsuarioController_novoLogin1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/")))
  )
  private[this] lazy val controllers_UsuarioController_novoLogin1_invoker = createInvoker(
    UsuarioController_3.novoLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "novoLogin",
      Nil,
      "GET",
      """""",
      this.prefix + """login/"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UsuarioController_loginSubmissao2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/")))
  )
  private[this] lazy val controllers_UsuarioController_loginSubmissao2_invoker = createInvoker(
    UsuarioController_3.loginSubmissao,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "loginSubmissao",
      Nil,
      "POST",
      """""",
      this.prefix + """login/"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_FilmeController_listar3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme/")))
  )
  private[this] lazy val controllers_FilmeController_listar3_invoker = createInvoker(
    FilmeController_2.listar(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FilmeController",
      "listar",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """filme/"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_FilmeController_novoFilme4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme/novo/")))
  )
  private[this] lazy val controllers_FilmeController_novoFilme4_invoker = createInvoker(
    FilmeController_2.novoFilme,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FilmeController",
      "novoFilme",
      Nil,
      "GET",
      """""",
      this.prefix + """filme/novo/"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_FilmeController_novoFilmeSubmissao5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme")))
  )
  private[this] lazy val controllers_FilmeController_novoFilmeSubmissao5_invoker = createInvoker(
    FilmeController_2.novoFilmeSubmissao,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FilmeController",
      "novoFilmeSubmissao",
      Nil,
      "POST",
      """""",
      this.prefix + """filme"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_FilmeController_deletarFilme6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme/deletar/")))
  )
  private[this] lazy val controllers_FilmeController_deletarFilme6_invoker = createInvoker(
    FilmeController_2.deletarFilme(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FilmeController",
      "deletarFilme",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """filme/deletar/"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AvaliacaoController_listarAvaliacoes7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme/avaliar/")))
  )
  private[this] lazy val controllers_AvaliacaoController_listarAvaliacoes7_invoker = createInvoker(
    AvaliacaoController_0.listarAvaliacoes(fakeValue[String], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AvaliacaoController",
      "listarAvaliacoes",
      Seq(classOf[String], classOf[Int]),
      "GET",
      """""",
      this.prefix + """filme/avaliar/"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_AvaliacaoController_novaAvaliacao8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme/avaliar/novo")))
  )
  private[this] lazy val controllers_AvaliacaoController_novaAvaliacao8_invoker = createInvoker(
    AvaliacaoController_0.novaAvaliacao,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AvaliacaoController",
      "novaAvaliacao",
      Nil,
      "GET",
      """""",
      this.prefix + """filme/avaliar/novo"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_AvaliacaoController_submeterAvaliacao9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filme/avaliar/")))
  )
  private[this] lazy val controllers_AvaliacaoController_submeterAvaliacao9_invoker = createInvoker(
    AvaliacaoController_0.submeterAvaliacao,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AvaliacaoController",
      "submeterAvaliacao",
      Nil,
      "POST",
      """""",
      this.prefix + """filme/avaliar/"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:7
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:9
    case controllers_UsuarioController_novoLogin1_route(params) =>
      call { 
        controllers_UsuarioController_novoLogin1_invoker.call(UsuarioController_3.novoLogin)
      }
  
    // @LINE:10
    case controllers_UsuarioController_loginSubmissao2_route(params) =>
      call { 
        controllers_UsuarioController_loginSubmissao2_invoker.call(UsuarioController_3.loginSubmissao)
      }
  
    // @LINE:14
    case controllers_FilmeController_listar3_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_FilmeController_listar3_invoker.call(FilmeController_2.listar(email))
      }
  
    // @LINE:15
    case controllers_FilmeController_novoFilme4_route(params) =>
      call { 
        controllers_FilmeController_novoFilme4_invoker.call(FilmeController_2.novoFilme)
      }
  
    // @LINE:16
    case controllers_FilmeController_novoFilmeSubmissao5_route(params) =>
      call { 
        controllers_FilmeController_novoFilmeSubmissao5_invoker.call(FilmeController_2.novoFilmeSubmissao)
      }
  
    // @LINE:17
    case controllers_FilmeController_deletarFilme6_route(params) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_FilmeController_deletarFilme6_invoker.call(FilmeController_2.deletarFilme(id))
      }
  
    // @LINE:18
    case controllers_AvaliacaoController_listarAvaliacoes7_route(params) =>
      call(params.fromQuery[String]("email", None), params.fromQuery[Int]("idFilme", None)) { (email, idFilme) =>
        controllers_AvaliacaoController_listarAvaliacoes7_invoker.call(AvaliacaoController_0.listarAvaliacoes(email, idFilme))
      }
  
    // @LINE:19
    case controllers_AvaliacaoController_novaAvaliacao8_route(params) =>
      call { 
        controllers_AvaliacaoController_novaAvaliacao8_invoker.call(AvaliacaoController_0.novaAvaliacao)
      }
  
    // @LINE:20
    case controllers_AvaliacaoController_submeterAvaliacao9_route(params) =>
      call { 
        controllers_AvaliacaoController_submeterAvaliacao9_invoker.call(AvaliacaoController_0.submeterAvaliacao)
      }
  
    // @LINE:23
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
