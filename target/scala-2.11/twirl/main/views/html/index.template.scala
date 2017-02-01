
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

     object index_Scope1 {
import models.User

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[WebJarAssets,Option[User],Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(webJarAssets: WebJarAssets, user: Option[User], content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.94*/("""

"""),format.raw/*12.4*/("""
"""),_display_(/*13.2*/main("Twitter", webJarAssets, user)/*13.37*/ {_display_(Seq[Any](format.raw/*13.39*/("""

    """),_display_(/*15.6*/content),format.raw/*15.13*/("""

""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(webJarAssets:WebJarAssets,user:Option[User],content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(webJarAssets,user,content)(messages)

  def f:((WebJarAssets,Option[User],Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (webJarAssets,user,content) => (messages) => apply(webJarAssets,user,content)(messages)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Wed Feb 01 19:33:40 CET 2017
                  SOURCE: /home/furkan/Desktop/DatabaseProject/app/views/index.scala.html
                  HASH: 85896cea825660a29f0492e0329b7e0f299621f9
                  MATRIX: 607->115|794->207|823->403|851->405|895->440|935->442|968->449|996->456|1029->459
                  LINES: 23->6|28->6|30->12|31->13|31->13|31->13|33->15|33->15|35->17
                  -- GENERATED --
              */
          