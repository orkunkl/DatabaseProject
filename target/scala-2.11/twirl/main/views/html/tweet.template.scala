
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tweet_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class tweet extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Tweet,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tweet : Tweet)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor  // Declares a vertical field constructor as default

Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<div class="row">
    <div class="col-md-12">"""),_display_(/*6.29*/tweet/*6.34*/.tweetText),format.raw/*6.44*/("""</div>
    """),_display_(/*7.6*/b3/*7.8*/.form(action = routes.AsyncController.logInUser, 'id -> tweet.tweetID)/*7.78*/ {_display_(Seq[Any](format.raw/*7.80*/("""
        """),_display_(/*8.10*/b3/*8.12*/.submit('class -> "btn btn-default")/*8.48*/{_display_(Seq[Any](format.raw/*8.49*/(""" """),format.raw/*8.50*/("""Login """)))}),format.raw/*8.57*/("""
    """)))}),format.raw/*9.6*/("""

"""),format.raw/*11.1*/("""</div>
"""))
      }
    }
  }

  def render(tweet:Tweet,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(tweet)(messages)

  def f:((Tweet) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (tweet) => (messages) => apply(tweet)(messages)

  def ref: this.type = this

}


}

/**/
object tweet extends tweet_Scope0.tweet
              /*
                  -- GENERATED --
                  DATE: Sun Jan 29 18:39:44 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/tweet.scala.html
                  HASH: ff72232c88fbce66a8604aeee1533d2d46f3183e
                  MATRIX: 535->1|762->45|790->137|817->138|889->184|902->189|932->199|969->211|978->213|1056->283|1095->285|1131->295|1141->297|1185->333|1223->334|1251->335|1288->342|1323->348|1352->350
                  LINES: 20->1|25->1|27->4|28->5|29->6|29->6|29->6|30->7|30->7|30->7|30->7|31->8|31->8|31->8|31->8|31->8|31->8|32->9|34->11
                  -- GENERATED --
              */
          