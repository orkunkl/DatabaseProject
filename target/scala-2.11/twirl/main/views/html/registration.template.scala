
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registration_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object registration_Scope1 {
import views.viewForms.userAuthForm

class registration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[userAuthForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(User : Form[userAuthForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor  // Declares a vertical field constructor as default

Seq[Any](format.raw/*3.58*/("""

"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/b3/*7.4*/.form(action = routes.AsyncController.signInNewUser(), 'id -> "signInNewUser")/*7.82*/ {_display_(Seq[Any](format.raw/*7.84*/("""
    """),_display_(/*8.6*/b3/*8.8*/.text(User("roomname"), '_value -> "", '_label -> "Room name", 'autofocus -> "true", '_required -> "true")),format.raw/*8.114*/("""
    """),_display_(/*9.6*/b3/*9.8*/.password(User("password"), '_value -> "", '_label -> "Password", '_required -> "true")),format.raw/*9.95*/("""
    """),_display_(/*10.6*/b3/*10.8*/.submit('class -> "btn btn-default")/*10.44*/{_display_(Seq[Any](format.raw/*10.45*/(""" """),format.raw/*10.46*/("""Sign in """)))}),format.raw/*10.55*/("""
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
object registration extends registration_Scope0.registration_Scope1.registration
              /*
                  -- GENERATED --
                  DATE: Sun Jan 29 17:17:37 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/registration.scala.html
                  HASH: 9414bbbfb73897b94b60d710bf9f3a406b3d4a00
                  MATRIX: 633->39|872->95|900->187|927->189|936->191|1022->269|1061->271|1092->277|1101->279|1228->385|1259->391|1268->393|1375->480|1407->486|1417->488|1462->524|1501->525|1530->526|1570->535|1602->537
                  LINES: 23->3|28->3|30->6|31->7|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|34->10|35->11
                  -- GENERATED --
              */
          