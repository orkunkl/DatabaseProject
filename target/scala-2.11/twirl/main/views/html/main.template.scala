
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,WebJarAssets,Option[User],Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, webJarAssets: WebJarAssets, user : Option[User])(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.110*/("""


"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>title</title>
        <link rel='stylesheet' href='"""),_display_(/*14.39*/routes/*14.45*/.WebJarAssets.at(webJarAssets.locate("css/bootstrap.min.css"))),format.raw/*14.107*/("""'>
        <link rel='stylesheet' media="screen" href='"""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""'>
        <link rel='shortcut icon' type="image/png" href='"""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""'>
    </head>
    <body>
        <header class="navbar navbar-inverse navbar-static-top">
            <div class="container">
                <a href="/" class="navbar-brand">Pizarra</a>
                <form class="nav navbar-nav pull-right">
                    """),_display_(/*23.22*/user/*23.26*/ match/*23.32*/ {/*24.25*/case None =>/*24.37*/ {_display_(Seq[Any](format.raw/*24.39*/("""<li><a href="/authenticate">Register or Login</a></li>""")))}/*26.25*/case Some(u) =>/*26.40*/ {_display_(Seq[Any](format.raw/*26.42*/("""
                            """),format.raw/*27.29*/("""<li><a>Hello """),_display_(/*27.43*/u/*27.44*/.username),format.raw/*27.53*/("""</a></li>
                            <li><a href=""""),_display_(/*28.43*/routes/*28.49*/.PageController.showSettings),format.raw/*28.77*/("""">Settings </a></li>
                            <li><a href="/logout">Log out</a></li>
                        """)))}}),format.raw/*31.22*/("""
                """),format.raw/*32.17*/("""</form>
            </div>
        </header>
        <div class="container">
          """),_display_(/*36.12*/content),format.raw/*36.19*/("""
        """),format.raw/*37.9*/("""</div>
        """),format.raw/*38.26*/("""
        """),format.raw/*39.9*/("""<footer></footer>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,webJarAssets:WebJarAssets,user:Option[User],content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title,webJarAssets,user)(content)(messages)

  def f:((String,WebJarAssets,Option[User]) => (Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title,webJarAssets,user) => (content) => (messages) => apply(title,webJarAssets,user)(content)(messages)

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
<<<<<<< HEAD
                  DATE: Wed Feb 01 21:20:23 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/main.scala.html
                  HASH: d02c51daa7d48cd932f021b24a11d2a39cc5220e
                  MATRIX: 819->260|1023->368|1053->371|1191->482|1206->488|1290->550|1373->606|1388->612|1451->653|1539->714|1554->720|1615->759|1908->1025|1921->1029|1936->1035|1947->1062|1968->1074|2008->1076|2082->1157|2106->1172|2146->1174|2203->1203|2244->1217|2254->1218|2284->1227|2363->1279|2378->1285|2427->1313|2572->1448|2617->1465|2732->1553|2760->1560|2796->1569|2839->1601|2875->1610
                  LINES: 25->7|30->7|33->10|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|46->23|46->23|46->23|46->24|46->24|46->24|46->26|46->26|46->26|47->27|47->27|47->27|47->27|48->28|48->28|48->28|50->31|51->32|55->36|55->36|56->37|57->38|58->39
=======
                  DATE: Wed Feb 01 19:33:40 CET 2017
                  SOURCE: /home/furkan/Desktop/DatabaseProject/app/views/main.scala.html
                  HASH: 529daa0b98f3189afb18709c06e3379b734ab6b1
                  MATRIX: 819->260|1023->368|1053->371|1191->482|1206->488|1290->550|1373->606|1388->612|1451->653|1539->714|1554->720|1615->759|1908->1025|1921->1029|1936->1035|1947->1062|1968->1074|2008->1076|2082->1156|2106->1171|2146->1173|2203->1202|2241->1213|2251->1214|2281->1223|2411->1343|2456->1360|2571->1448|2599->1455|2635->1464|2678->1496|2714->1505
                  LINES: 25->7|30->7|33->10|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|46->23|46->23|46->23|46->24|46->24|46->24|46->25|46->25|46->25|47->26|47->26|47->26|47->26|49->29|50->30|54->34|54->34|55->35|56->36|57->37
>>>>>>> developmentFurkan2
                  -- GENERATED --
              */
          