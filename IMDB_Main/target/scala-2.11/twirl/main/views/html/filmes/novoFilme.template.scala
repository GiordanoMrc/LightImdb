
package views.html.filmes

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object novoFilme_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class novoFilme extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[FilmeVO],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /* novoFilme Template File */
  def apply/*2.2*/(filmeForm: Form[FilmeVO])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.57*/("""

"""),_display_(/*4.2*/main("novo filme")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
 """),_display_(/*5.3*/helper/*5.9*/.form(action = routes.FilmeController.novoFilmeSubmissao())/*5.68*/{_display_(Seq[Any](format.raw/*5.69*/("""
  """),_display_(/*6.4*/helper/*6.10*/.inputText(filmeForm("Titulo"))),format.raw/*6.41*/("""
  """),_display_(/*7.4*/helper/*7.10*/.inputText(filmeForm("Diretor"))),format.raw/*7.42*/("""
  """),_display_(/*8.4*/helper/*8.10*/.inputText(filmeForm("Ano"))),format.raw/*8.38*/("""

  """),format.raw/*10.3*/("""<div class="form-actions">
    <button type="submit">Cadastrar novo filme</button>
  </div>
 """)))}),format.raw/*13.3*/("""
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(filmeForm:Form[FilmeVO],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(filmeForm)(messages)

  def f:((Form[FilmeVO]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (filmeForm) => (messages) => apply(filmeForm)(messages)

  def ref: this.type = this

}


}

/* novoFilme Template File */
object novoFilme extends novoFilme_Scope0.novoFilme
              /*
                  -- GENERATED --
                  DATE: Wed Jul 05 22:30:27 BRT 2017
                  SOURCE: /home/marcelopc/gitProjects/imdb/IMDB_Main/app/views/filmes/novoFilme.scala.html
                  HASH: 77a30ce9179d400157a952afbce6cedc1b181681
                  MATRIX: 583->31|733->86|761->89|787->107|826->109|854->112|867->118|934->177|972->178|1001->182|1015->188|1066->219|1095->223|1109->229|1161->261|1190->265|1204->271|1252->299|1283->303|1407->397|1439->399
                  LINES: 20->2|25->2|27->4|27->4|27->4|28->5|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|30->7|31->8|31->8|31->8|33->10|36->13|37->14
                  -- GENERATED --
              */
          