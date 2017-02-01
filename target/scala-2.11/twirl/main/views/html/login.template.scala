
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object login_Scope1 {
import views.viewForms.userAuthForm

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[userAuthForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(User : Form[userAuthForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor  // Declares a vertical field constructor as default

Seq[Any](format.raw/*3.58*/("""

"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/b3/*7.4*/.form(action = routes.UserAuthenticationController.logInUser)/*7.65*/ {_display_(Seq[Any](format.raw/*7.67*/("""
    """),_display_(/*8.6*/b3/*8.8*/.text(User("username"), '_value -> "", '_label -> "Username", 'autofocus -> "true", '_required -> "true")),format.raw/*8.113*/("""
    """),_display_(/*9.6*/b3/*9.8*/.password(User("password"), '_value -> "", '_label -> "Password", '_required -> "true")),format.raw/*9.95*/("""
    """),_display_(/*10.6*/b3/*10.8*/.submit('class -> "btn btn-default")/*10.44*/{_display_(Seq[Any](format.raw/*10.45*/(""" """),format.raw/*10.46*/("""Login """)))}),format.raw/*10.53*/("""
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(User:Form[userAuthForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(User)(messages)

  def f:((Form[userAuthForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (User) => (messages) => apply(User)(messages)

  def ref: this.type = this

}


}
}

/**/
object login extends login_Scope0.login_Scope1.login
              /*
                  -- GENERATED --
                  DATE: Wed Feb 01 19:33:40 CET 2017
                  SOURCE: /home/furkan/Desktop/DatabaseProject/app/views/login.scala.html
                  HASH: 031c3379e8840b9d2f18625f0626531d2c7cefa5
                  MATRIX: 612->39|851->95|879->187|906->189|915->191|984->252|1023->254|1054->260|1063->262|1189->367|1220->373|1229->375|1336->462|1368->468|1378->470|1423->506|1462->507|1491->508|1529->515|1561->517
                  LINES: 23->3|28->3|30->6|31->7|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|34->10|35->11
                  -- GENERATED --
              */
          