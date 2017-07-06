
package views.html.avaliacao

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object novaAvaliacao_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class novaAvaliacao extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[AvaliacaoVO],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /* novaAvaliacao Template File */
  def apply/*2.2*/(avaliacaoForm: Form[AvaliacaoVO])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.65*/("""

"""),_display_(/*4.2*/main("nova Avaliacao")/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
  """),_display_(/*5.4*/helper/*5.10*/.form(action = routes.AvaliacaoController.submeterAvaliacao())/*5.72*/ {_display_(Seq[Any](format.raw/*5.74*/("""
    """),_display_(/*6.6*/helper/*6.12*/.inputText(avaliacaoForm("Comentario"))),format.raw/*6.51*/("""
    """),_display_(/*7.6*/helper/*7.12*/.inputText(avaliacaoForm("Nota"))),format.raw/*7.45*/("""

    """),format.raw/*9.5*/("""<div class="form-actions">
      <button type="submit">Cadastrar novo filme</button>
    </div>
  """)))}),format.raw/*12.4*/("""
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(avaliacaoForm:Form[AvaliacaoVO],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(avaliacaoForm)(messages)

  def f:((Form[AvaliacaoVO]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (avaliacaoForm) => (messages) => apply(avaliacaoForm)(messages)

  def ref: this.type = this

}


}

/* novaAvaliacao Template File */
object novaAvaliacao extends novaAvaliacao_Scope0.novaAvaliacao
              /*
                  -- GENERATED --
                  DATE: Wed Jul 05 22:30:27 BRT 2017
                  SOURCE: /home/marcelopc/gitProjects/imdb/IMDB_Main/app/views/avaliacao/novaAvaliacao.scala.html
                  HASH: d24cc353a88d5a39cdde768aa014660953da1a2f
                  MATRIX: 602->35|760->98|788->101|818->123|857->125|886->129|900->135|970->197|1009->199|1040->205|1054->211|1113->250|1144->256|1158->262|1211->295|1243->301|1372->400|1404->402
                  LINES: 20->2|25->2|27->4|27->4|27->4|28->5|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|30->7|32->9|35->12|36->13
                  -- GENERATED --
              */
          