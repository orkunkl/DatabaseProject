
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[WebJarAssets,Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(webJarAssets: WebJarAssets)(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.74*/("""


"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Pizarra (ALPHA)</title>
        <link rel='stylesheet' href='"""),_display_(/*14.39*/routes/*14.45*/.WebJarAssets.at(webJarAssets.locate("css/bootstrap.min.css"))),format.raw/*14.107*/("""'>
        <link rel='stylesheet' media="screen" href='"""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""'>
        <link rel='shortcut icon' type="image/png" href='"""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""'>
    </head>
    <body>
        <header class="navbar navbar-inverse navbar-static-top">
            <div class="container">
                <a href="/" class="navbar-brand">Pizarra</a>
                <ul class="nav navbar-nav pull-right">
                    <li><a href="/add">Add</a></li>
                </ul>
            </div>
        </header>
        <div class="container">
        """),_display_(/*28.10*/content),format.raw/*28.17*/("""
        """),format.raw/*29.9*/("""</div>
        """),format.raw/*30.26*/("""
        """),format.raw/*31.9*/("""<footer></footer>
    </body>
</html>
"""))
      }
    }
  }

  def render(webJarAssets:WebJarAssets,content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(webJarAssets)(content)(messages)

  def f:((WebJarAssets) => (Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (webJarAssets) => (content) => (messages) => apply(webJarAssets)(content)(messages)

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
                  DATE: Sun Jan 29 21:42:39 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/main.scala.html
                  HASH: 648082c34bdfe9c7442c939ff3bd74ff21472c7c
                  MATRIX: 799->260|966->332|996->335|1144->456|1159->462|1243->524|1326->580|1341->586|1404->627|1492->688|1507->694|1568->733|1990->1128|2018->1135|2054->1144|2097->1176|2133->1185
                  LINES: 25->7|30->7|33->10|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|51->28|51->28|52->29|53->30|54->31
                  -- GENERATED --
              */
          