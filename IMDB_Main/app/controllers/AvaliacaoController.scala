package controllers

import java.lang.ProcessBuilder.Redirect

import play.api.mvc._
import models.Avaliacao
import models.AvaliacaoDAO
import javax.inject.Inject

import play.api.data._
import play.api.data.Forms._
import javax.inject.Singleton

import play.api.i18n.I18nSupport
import play.api.i18n.MessagesApi
/**
  *  Controller referente a Avaliacao, 3 metodos simples um para listar, outro para enviar para pagina
  *  do formulario e outro para efetuar a submissao de uma avaliacao
  */
@Singleton
class AvaliacaoController @Inject()(dao: AvaliacaoDAO,val messagesApi: MessagesApi, var emailUsuario: String)  extends Controller with I18nSupport {
  /*declaradas duas variaveis de estado idFilme e email Usuario por construtor para nao precisar de inicializacao*/
  var idFilme: Int =0

  def listarAvaliacoes(email: String, id: Int) = Action { implicit request =>
    emailUsuario=email
    idFilme=id
    val avaliacoes = dao.listarAvaliacoes(idFilme)
    Ok(views.html.avaliacao.listagemAvaliacao(avaliacoes, emailUsuario))
  }
  def novaAvaliacao = Action {
    Ok(views.html.avaliacao.novaAvaliacao(avaliacaoForm))
  }
  def submeterAvaliacao =Action { implicit request =>
    avaliacaoForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.avaliacao.novaAvaliacao(formWithErrors))
      },
      avaliacao => {
        try { /*trato a falha na pesquisa pelo SQL num try catch*/
          var novaAvaliacao = Avaliacao(emailUsuario, idFilme, avaliacao.comentario, avaliacao.nota)
          dao.salvarAvaliacao(novaAvaliacao)
          Redirect(routes.AvaliacaoController.listarAvaliacoes(emailUsuario, idFilme))
        } catch {
          case e: Exception =>
            Redirect(routes.AvaliacaoController.listarAvaliacoes(emailUsuario, idFilme)).flashing("erro"->"Voce ja avaliou esse filme")
        }
      }
    )
  }
  /*formulario padrao*/
  val avaliacaoForm= Form(
    mapping(
      "Comentario" -> nonEmptyText,
      "Nota" -> number(min=0, max=10)
    )(AvaliacaoVO.apply)(AvaliacaoVO.unapply)
  )
}
  /*case class para formulario*/
case class AvaliacaoVO(comentario: String, nota: Int)