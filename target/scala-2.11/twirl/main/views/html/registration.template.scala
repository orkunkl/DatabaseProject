
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
"""),_display_(/*7.2*/b3/*7.4*/.form(routes.AsyncController.signInNewUser)/*7.47*/ {_display_(Seq[Any](format.raw/*7.49*/("""
    """),_display_(/*8.6*/b3/*8.8*/.text(User("username"), '_value -> "", '_label -> "Room name", 'autofocus -> "true", '_required -> "true")),format.raw/*8.114*/("""
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
                  DATE: Sun Jan 29 20:32:36 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/registration.scala.html
                  HASH: 348954ee4a27a1439ad0e3754fd73dea91531c14
                  MATRIX: 633->39|872->95|900->187|927->189|936->191|987->234|1026->236|1057->242|1066->244|1193->350|1224->356|1233->358|1340->445|1372->451|1382->453|1427->489|1466->490|1495->491|1535->500|1567->502
                  LINES: 23->3|28->3|30->6|31->7|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|34->10|35->11
                  -- GENERATED --
              */
          