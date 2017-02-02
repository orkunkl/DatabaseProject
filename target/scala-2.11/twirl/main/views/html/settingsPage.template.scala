
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object settingsPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class settingsPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<form class="form-horizontal" action=""""),_display_(/*3.40*/routes/*3.46*/.UserAuthenticationController.deleteAccount),format.raw/*3.89*/("""">
    <input type="submit" value="Delete Account" class="btn btn-default"/>
</form>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object settingsPage extends settingsPage_Scope0.settingsPage
              /*
                  -- GENERATED --
                  DATE: Wed Feb 01 22:49:50 CET 2017
                  SOURCE: /home/furkan/Desktop/DatabaseProject/app/views/settingsPage.scala.html
                  HASH: b787619583f006a11936d64de5c6356cc43bd7bd
                  MATRIX: 534->1|630->3|658->5|723->44|737->50|800->93
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3
                  -- GENERATED --
              */
          