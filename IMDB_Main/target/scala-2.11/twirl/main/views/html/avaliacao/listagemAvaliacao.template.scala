
package views.html.avaliacao

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listagemAvaliacao_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class listagemAvaliacao extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Avaliacao],String,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* listagem Avaliacoes*/
  def apply/*2.2*/(avaliacoes: List[Avaliacao], email: String)(implicit flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.68*/("""

"""),_display_(/*4.2*/main("Avaliacoes")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
  """),_display_(/*5.4*/flash/*5.9*/.get("erro")),format.raw/*5.21*/("""
  """),format.raw/*6.3*/("""<h1>"""),_display_(/*6.8*/email),format.raw/*6.13*/("""</h1>
  <ul>
  """),_display_(/*8.4*/for(avaliacao <- avaliacoes) yield /*8.32*/ {_display_(Seq[Any](format.raw/*8.34*/("""
    """),format.raw/*9.5*/("""<li>"""),_display_(/*9.10*/avaliacao/*9.19*/.email),format.raw/*9.25*/(""" """),format.raw/*9.26*/("""- """),_display_(/*9.29*/avaliacao/*9.38*/.ID_FILME),format.raw/*9.47*/(""" """),format.raw/*9.48*/("""- """),_display_(/*9.51*/avaliacao/*9.60*/.comentario),format.raw/*9.71*/(""" """),format.raw/*9.72*/("""- """),_display_(/*9.75*/avaliacao/*9.84*/.nota),format.raw/*9.89*/(""" """),format.raw/*9.90*/("""<a>Deletar</a></button></li>
  """)))}),format.raw/*10.4*/("""
  """),format.raw/*11.3*/("""</ul><button><a href=""""),_display_(/*11.26*/routes/*11.32*/.AvaliacaoController.novaAvaliacao()),format.raw/*11.68*/("""">Cadastrar nova Avaliacao</a></button>
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(avaliacoes:List[Avaliacao],email:String,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(avaliacoes,email)(flash)

  def f:((List[Avaliacao],String) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (avaliacoes,email) => (flash) => apply(avaliacoes,email)(flash)

  def ref: this.type = this

}


}

/* listagem Avaliacoes*/
object listagemAvaliacao extends listagemAvaliacao_Scope0.listagemAvaliacao
              /*
                  -- GENERATED --
                  DATE: Wed Jul 05 22:55:36 BRT 2017
                  SOURCE: /home/marcelopc/gitProjects/imdb/IMDB_Main/app/views/avaliacao/listagemAvaliacao.scala.html
                  HASH: 94ff9e9af1f79f1cb0dcc8877d739d73776ade76
                  MATRIX: 603->26|764->92|792->95|818->113|857->115|886->119|898->124|930->136|959->139|989->144|1014->149|1055->165|1098->193|1137->195|1168->200|1199->205|1216->214|1242->220|1270->221|1299->224|1316->233|1345->242|1373->243|1402->246|1419->255|1450->266|1478->267|1507->270|1524->279|1549->284|1577->285|1639->317|1669->320|1719->343|1734->349|1791->385|1862->426
                  LINES: 20->2|25->2|27->4|27->4|27->4|28->5|28->5|28->5|29->6|29->6|29->6|31->8|31->8|31->8|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|33->10|34->11|34->11|34->11|34->11|35->12
                  -- GENERATED --
              */
          