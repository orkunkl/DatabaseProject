
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[WebJarAssets,Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(webJarAssets: WebJarAssets, content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.74*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main(webJarAssets)/*12.20*/ {_display_(Seq[Any](format.raw/*12.22*/("""

    """),format.raw/*14.5*/("""<div class="heading">
        <h1>¡Buenos días!</h1>
    </div>


    """),_display_(/*19.6*/content),format.raw/*19.13*/("""

""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(webJarAssets:WebJarAssets,content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(webJarAssets,content)(messages)

  def f:((WebJarAssets,Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (webJarAssets,content) => (messages) => apply(webJarAssets,content)(messages)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Jan 29 21:41:37 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/index.scala.html
                  HASH: c253e0c8f6594c107ae13a3b311353c6f7815d5a
                  MATRIX: 636->95|803->167|832->363|860->365|887->383|927->385|960->391|1057->462|1085->469|1118->472
                  LINES: 23->5|28->5|30->11|31->12|31->12|31->12|33->14|38->19|38->19|40->21
                  -- GENERATED --
              */
          