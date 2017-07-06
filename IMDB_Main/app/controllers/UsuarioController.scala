package controllers

import java.lang.ProcessBuilder.Redirect
import java.security.Security

import play.api.mvc._
import models.Usuario
import models.UsuarioDAO
import javax.inject.Inject

import play.api.data._
import play.api.data.Forms._
import javax.inject.Singleton

import jdk.nashorn.internal.ir.RuntimeNode.Request
import play.api.i18n.I18nSupport
import play.api.i18n.MessagesApi
/**
  *Controlle para submissao de um novo login,
  * 2 metodos para lidar com a pagina de formulario e
  * a estrutura formulario em si.
  *
  */

@Singleton
class UsuarioController @Inject()(dao: UsuarioDAO, val messagesApi: MessagesApi) extends Controller  with I18nSupport {

  def novoLogin = Action { implicit request =>
    Ok(views.html.login.usuarioLogin(loginForm))
  }

  def loginSubmissao = Action { implicit request =>
    loginForm.bindFromRequest.fold (
      formWitherrors => {
        BadRequest(views.html.login.usuarioLogin(formWitherrors))
      },
      usuario => {
        val user = Usuario(usuario.email , usuario.senha)
        try { /*Uso try catch para tratar os erros em pesquisas SQL e flashing para informmar o usuario*/
          val result: Usuario = dao.procuraUsuario(user)
          if (result.senha == usuario.senha) {
            Redirect(routes.FilmeController.listar(usuario.email))
          } else {
            Redirect(routes.HomeController.index()).flashing("erro"->"Usuario ou senha invalido")
          }
        } catch {
            case e: Exception =>
              Redirect(routes.HomeController.index()).flashing("erro"->"Usuario ou senha invalido")
        }
      }
    )
  }

  val loginForm = Form (mapping(
    "email"-> email,
    "senha"-> nonEmptyText
    )(Usuario.apply)(Usuario.unapply)
  )

}


