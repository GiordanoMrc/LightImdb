
package views.html.filmes

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listagemFilme_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class listagemFilme extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Filme],String,play.twirl.api.HtmlFormat.Appendable] {

  /* listagem Template File */
  def apply/*2.2*/(filmes: List[Filme], email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.38*/("""

"""),_display_(/*4.2*/main("IMDB")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""
    """),format.raw/*5.5*/("""<h1>"""),_display_(/*5.10*/email),format.raw/*5.15*/("""</h1>
   <ul>
     """),_display_(/*7.7*/for(filme <- filmes) yield /*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""
       """),format.raw/*8.8*/("""<li>"""),_display_(/*8.13*/filme/*8.18*/.titulo),format.raw/*8.25*/(""" """),format.raw/*8.26*/("""- """),_display_(/*8.29*/filme/*8.34*/.diretor),format.raw/*8.42*/(""" """),format.raw/*8.43*/("""- """),_display_(/*8.46*/filme/*8.51*/.anoProducao),format.raw/*8.63*/("""<button><a href=""""),_display_(/*8.81*/routes/*8.87*/.AvaliacaoController.listarAvaliacoes(email,filme.ID_FILME)),format.raw/*8.146*/("""">Avaliar</a></button><button><a href=""""),_display_(/*8.186*/routes/*8.192*/.FilmeController.deletarFilme(filme.ID_FILME)),format.raw/*8.237*/("""" >Deletar</a></button></li>
     """)))}),format.raw/*9.7*/("""
   """),format.raw/*10.4*/("""</ul><button><a href=""""),_display_(/*10.27*/routes/*10.33*/.FilmeController.novoFilme()),format.raw/*10.61*/("""">Cadastrar novo filme</a></button>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(filmes:List[Filme],email:String): play.twirl.api.HtmlFormat.Appendable = apply(filmes,email)

  def f:((List[Filme],String) => play.twirl.api.HtmlFormat.Appendable) = (filmes,email) => apply(filmes,email)

  def ref: this.type = this

}


}

/* listagem Template File */
object listagemFilme extends listagemFilme_Scope0.listagemFilme
              /*
                  -- GENERATED --
                  DATE: Wed Jul 05 22:30:27 BRT 2017
                  SOURCE: /home/marcelopc/gitProjects/imdb/IMDB_Main/app/views/filmes/listagemFilme.scala.html
                  HASH: 5432bcb6a9ff2cfeb931314137880bbd2e52fe31
                  MATRIX: 586->30|717->66|745->69|765->81|804->83|835->88|866->93|891->98|936->118|971->138|1010->140|1044->148|1075->153|1088->158|1115->165|1143->166|1172->169|1185->174|1213->182|1241->183|1270->186|1283->191|1315->203|1359->221|1373->227|1453->286|1520->326|1535->332|1601->377|1665->412|1696->416|1746->439|1761->445|1810->473|1877->510
                  LINES: 20->2|25->2|27->4|27->4|27->4|28->5|28->5|28->5|30->7|30->7|30->7|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|31->8|32->9|33->10|33->10|33->10|33->10|34->11
                  -- GENERATED --
              */
          