package controllers

import java.lang.ProcessBuilder.Redirect

import play.api.mvc._
import models.Filme
import models.FilmeDAO
import javax.inject.Inject

import play.api.data._
import play.api.data.Forms._
import javax.inject.Singleton

import play.api.i18n.I18nSupport
import play.api.i18n.MessagesApi

/**
 * A classe que processa as requisicoes do usuario 
 * relacionadas a filmes e interage com o meio de 
 * persitencia. 
 * 
 * Utiliza o mecanismo de injecao de dependencia do 
 * PlayFramework para ter acesso ao DAO FilmeDAO.  
 */
@Singleton
class FilmeController @Inject()(dao: FilmeDAO, val messagesApi: MessagesApi, var emailUsuario: String) extends Controller with I18nSupport {

  def listar(email: String) = Action {
    var filmes = dao.listar
    emailUsuario=email;
    Ok(views.html.filmes.listagemFilme(filmes,email))
  }
  
  def novoFilme = Action {
    Ok(views.html.filmes.novoFilme(filmeForm))
  }

  def novoFilmeSubmissao = Action { implicit request =>
    filmeForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.filmes.novoFilme(formWithErrors))
      },
      filme => {
        val novoFilme = Filme(0, filme.titulo, filme.diretor, filme.ano)
        dao.salvar(novoFilme)
        Redirect(routes.FilmeController.listar(emailUsuario))
      }
    )
  }

  def deletarFilme(id : Int)  = Action { implicit request =>
    dao.deletar(id)
    Redirect(routes.FilmeController.listar(emailUsuario))
  }

  val filmeForm = Form(
    mapping(
      "Titulo"  -> nonEmptyText,
      "Diretor" -> nonEmptyText,
      "Ano" -> number(min=1950, max=2050)
    )(FilmeVO.apply)(FilmeVO.unapply)
  )
}

case class FilmeVO(titulo: String, diretor: String, ano: Int)