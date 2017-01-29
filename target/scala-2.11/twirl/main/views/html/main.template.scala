
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.61*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*16.70*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),format.raw/*20.32*/("""
        """),format.raw/*21.9*/("""<div class="container">
            """),_display_(/*22.14*/content),format.raw/*22.21*/("""
        """),format.raw/*23.9*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(messages)

  def f:((String) => (Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (messages) => apply(title)(content)(messages)

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
                  DATE: Sun Jan 29 16:32:03 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/main.scala.html
                  HASH: 29a3a10918e7e670b5817b357eea88ada4f47d68
                  MATRIX: 793->260|947->319|975->321|1055->426|1091->435|1126->443|1152->448|1241->510|1256->516|1319->557|1407->618|1422->624|1483->663|1535->688|1550->694|1612->735|1706->891|1742->900|1806->937|1834->944|1870->953
                  LINES: 25->7|30->7|32->9|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|42->20|43->21|44->22|44->22|45->23
                  -- GENERATED --
              */
          