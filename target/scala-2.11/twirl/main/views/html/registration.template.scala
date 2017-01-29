
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

class registration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(User : Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor  // Declares a vertical field constructor as default

Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/b3/*5.4*/.form(action = routes.HomeController.newRoom(), 'id -> "newRoom")/*5.69*/ {_display_(Seq[Any](format.raw/*5.71*/("""
    """),_display_(/*6.6*/b3/*6.8*/.text(gameroom("roomname"), '_value -> "", '_label -> "Room name", 'autofocus -> "true", '_required -> "true")),format.raw/*6.118*/("""
    """),_display_(/*7.6*/b3/*7.8*/.password(gameroom("password"), '_value -> "", '_label -> "Password", '_required -> "true")),format.raw/*7.99*/("""

    """),_display_(/*9.6*/b3/*9.8*/.number(gameroom("vampire"), '_label -> "Vampire", 'placeholder -> "enter", '_required -> "true")),format.raw/*9.105*/("""
    """),_display_(/*10.6*/b3/*10.8*/.number(gameroom("villager"), '_label -> "Villager", 'placeholder -> "enter", '_required -> "true")),format.raw/*10.107*/("""
""")))}))
      }
    }
  }

  def render(User:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(User)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (User) => apply(User)

  def ref: this.type = this

}


}

/**/
object registration extends registration_Scope0.registration
              /*
                  -- GENERATED --
                  DATE: Sun Jan 29 15:04:53 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/registration.scala.html
                  HASH: 96887c2724b88886712e225e531b4212270c77ce
                  MATRIX: 545->1|747->20|775->112|802->114|811->116|884->181|923->183|954->189|963->191|1094->301|1125->307|1134->309|1245->400|1277->407|1286->409|1404->506|1436->512|1446->514|1567->613
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|30->7|32->9|32->9|32->9|33->10|33->10|33->10
                  -- GENERATED --
              */
          