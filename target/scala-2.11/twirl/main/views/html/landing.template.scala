
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object landing_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object landing_Scope1 {
import views.viewForms.userAuthForm
import models.User

class landing extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.46*/("""


    """),_display_(/*7.6*/content),format.raw/*7.13*/("""
"""))
      }
    }
  }

  def render(content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(content)(messages)

  def f:((Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (content) => (messages) => apply(content)(messages)

  def ref: this.type = this

}


}
}

/**/
object landing extends landing_Scope0.landing_Scope1.landing
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 17:11:42 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/landing.scala.html
                  HASH: 14608a58af982236a2fd5694f055da50bdc5444b
                  MATRIX: 623->59|762->103|795->111|822->118
                  LINES: 24->4|29->4|32->7|32->7
                  -- GENERATED --
              */
          