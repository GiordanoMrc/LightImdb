
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("IMDB rocks on Play :)")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
  """),format.raw/*4.3*/("""<h1>LIGHT IMDB</h1>
  <h2>"""),_display_(/*5.8*/flash/*5.13*/.get("erro").getOrElse("Bem vindo")),format.raw/*5.48*/("""</h2>
  <a href=""""),_display_(/*6.13*/routes/*6.19*/.UsuarioController.novoLogin()),format.raw/*6.49*/("""">Entrar</a>
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(flash)

  def f:(() => (Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (flash) => apply()(flash)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Jul 05 22:53:00 BRT 2017
                  SOURCE: /home/marcelopc/gitProjects/imdb/IMDB_Main/app/views/index.scala.html
                  HASH: c19656c18acdb776c58108ad0ca98745e2bb42c1
                  MATRIX: 526->1|646->26|674->29|711->58|750->60|779->63|831->90|844->95|899->130|943->148|957->154|1007->184|1050->198
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7
                  -- GENERATED --
              */
          