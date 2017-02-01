
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tweetPost_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object tweetPost_Scope1 {
import views.viewForms.tweetForm
import b3.vertical.fieldConstructor  // Declares a vertical field constructor as default

class tweetPost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[tweetForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(tweet: Form[tweetForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.55*/("""
"""),_display_(/*6.2*/b3/*6.4*/.form(routes.PageController.postTweet())/*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
    """),_display_(/*7.6*/b3/*7.8*/.textarea( tweet("tweetText"), '_label -> "Tweet", '_rows -> "3")),format.raw/*7.73*/("""
    """),_display_(/*8.6*/b3/*8.8*/.text( tweet("hashtags"), '_label -> "Hashtags")),format.raw/*8.56*/("""
    """),_display_(/*9.6*/b3/*9.8*/.text( tweet("location"), '_label -> "Locations")),format.raw/*9.57*/("""
    """),_display_(/*10.6*/b3/*10.8*/.submit('class -> "btn btn-default")/*10.44*/{_display_(Seq[Any](format.raw/*10.45*/(""" """),format.raw/*10.46*/("""Tweet """)))}),format.raw/*10.53*/("""
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(tweet:Form[tweetForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(tweet)(messages)

  def f:((Form[tweetForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (tweet) => (messages) => apply(tweet)(messages)

  def ref: this.type = this

}


}
}

/**/
object tweetPost extends tweetPost_Scope0.tweetPost_Scope1.tweetPost
              /*
                  -- GENERATED --
                  DATE: Wed Feb 01 19:33:40 CET 2017
                  SOURCE: /home/furkan/Desktop/DatabaseProject/app/views/tweetPost.scala.html
                  HASH: b4ec3040029f4e3dbb8fb230040c2ed0f5db734c
                  MATRIX: 707->127|855->180|882->182|891->184|939->224|978->226|1009->232|1018->234|1103->299|1134->305|1143->307|1211->355|1242->361|1251->363|1320->412|1352->418|1362->420|1407->456|1446->457|1475->458|1513->465|1545->467
                  LINES: 24->5|29->5|30->6|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|34->10|35->11
                  -- GENERATED --
              */
          