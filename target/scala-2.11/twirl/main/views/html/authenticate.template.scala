
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object authenticate_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object authenticate_Scope1 {
import views.viewForms.userAuthForm

class authenticate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[userAuthForm],Form[userAuthForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(registrationForm: Form[userAuthForm], loginForm: Form[userAuthForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.100*/("""

"""),format.raw/*5.1*/("""<div class="row">
    """),_display_(/*6.6*/registration(registrationForm)),format.raw/*6.36*/("""
    """),_display_(/*7.6*/login(loginForm)),format.raw/*7.22*/("""
"""),format.raw/*8.1*/("""</div>"""))
      }
    }
  }

  def render(registrationForm:Form[userAuthForm],loginForm:Form[userAuthForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(registrationForm,loginForm)(messages)

  def f:((Form[userAuthForm],Form[userAuthForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (registrationForm,loginForm) => (messages) => apply(registrationForm,loginForm)(messages)

  def ref: this.type = this

}


}
}

/**/
object authenticate extends authenticate_Scope0.authenticate_Scope1.authenticate
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 15:33:19 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/authenticate.scala.html
                  HASH: b6546bcbe5238f4d4a44e33d1948b65847320f55
                  MATRIX: 652->39|846->137|874->139|922->162|972->192|1003->198|1039->214|1066->215
                  LINES: 23->3|28->3|30->5|31->6|31->6|32->7|32->7|33->8
                  -- GENERATED --
              */
          