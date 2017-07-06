
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*16.46*/routes/*16.52*/.Assets.versioned("lib/bootstrap/css/bootstrap.min.css")),format.raw/*16.108*/("""">
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.versioned("lib/bootstrap/js/bootstrap.min.js")),format.raw/*17.75*/("""" crossorigin="anonymous"></script>

    </head>
    <body>
        """),format.raw/*22.32*/("""
        """),_display_(/*23.10*/content),format.raw/*23.17*/("""

      """),format.raw/*25.7*/("""<script src=""""),_display_(/*25.21*/routes/*25.27*/.Assets.versioned("javascripts/main.js")),format.raw/*25.67*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Jul 05 22:30:27 BRT 2017
                  SOURCE: /home/marcelopc/gitProjects/imdb/IMDB_Main/app/views/main.scala.html
                  HASH: 4016d04ee5e769cf720a4cb8ecb51e2e1b843da1
                  MATRIX: 784->260|909->290|937->292|1017->397|1053->406|1088->414|1114->419|1203->481|1218->487|1281->528|1369->589|1384->595|1445->634|1520->682|1535->688|1613->744|1657->761|1672->767|1747->821|1843->979|1880->989|1908->996|1943->1004|1984->1018|1999->1024|2060->1064
                  LINES: 25->7|30->7|32->9|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|44->22|45->23|45->23|47->25|47->25|47->25|47->25
                  -- GENERATED --
              */
          