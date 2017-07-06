
package views.html.login

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usuarioLogin_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class usuarioLogin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Usuario],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /* Login Template File */
  def apply/*2.2*/(userForm: Form[Usuario])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.56*/("""

"""),_display_(/*4.2*/main("Login")/*4.15*/{_display_(Seq[Any](format.raw/*4.16*/("""
    """),_display_(/*5.6*/helper/*5.12*/.form(action = routes.UsuarioController.loginSubmissao())/*5.69*/ {_display_(Seq[Any](format.raw/*5.71*/("""
        """),_display_(/*6.10*/helper/*6.16*/.inputText(userForm("email"))),format.raw/*6.45*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(userForm("senha"))),format.raw/*7.45*/("""

        """),format.raw/*9.9*/("""<div class="form-actions">
            <button type="submit">Logar</button>
        </div>
    """)))}),format.raw/*12.6*/("""
""")))}),format.raw/*13.2*/("""


"""))
      }
    }
  }

  def render(userForm:Form[Usuario],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(messages)

  def f:((Form[Usuario]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (messages) => apply(userForm)(messages)

  def ref: this.type = this

}


}

/* Login Template File */
object usuarioLogin extends usuarioLogin_Scope0.usuarioLogin
              /*
                  -- GENERATED --
                  DATE: Wed Jul 05 22:30:27 BRT 2017
                  SOURCE: /home/marcelopc/gitProjects/imdb/IMDB_Main/app/views/login/usuarioLogin.scala.html
                  HASH: cbec1435d8089ca8ac0f83175065bc710913de8c
                  MATRIX: 584->27|733->81|761->84|782->97|820->98|851->104|865->110|930->167|969->169|1005->179|1019->185|1068->214|1104->224|1118->230|1167->259|1203->269|1329->365|1361->367
                  LINES: 20->2|25->2|27->4|27->4|27->4|28->5|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|30->7|32->9|35->12|36->13
                  -- GENERATED --
              */
          