
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
import models.User
import views.viewForms.tweetForm

class landing extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Option[User],List[Tweet],Form[tweetForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(user: Option[User], tweets: List[Tweet],tweet: Form[tweetForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.95*/("""

"""),format.raw/*6.1*/("""<div class="col-md-8">

"""),_display_(/*8.2*/user/*8.6*/ match/*8.12*/ {/*9.5*/case Some(user) =>/*9.23*/ {_display_(_display_(/*9.26*/tweetPost(tweet)))}/*10.5*/case None =>/*10.17*/ {}}),format.raw/*11.2*/("""
"""),_display_(/*12.2*/for(tweet <- tweets) yield /*12.22*/{_display_(Seq[Any](format.raw/*12.23*/("""
    """),_display_(/*13.6*/tweetView(tweet)),format.raw/*13.22*/("""
""")))}),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""</div>

<div class="col-md-4">
    <h2>Hashtags</h2>
    <ul class="list-group">
        <li class="list-group-item">First item</li>
        <li class="list-group-item">Second item</li>
        <li class="list-group-item">Third item</li>
    </ul>
</div>

<div class="col-md-4">
    <h2>Hashtags</h2>
    <ul class="list-group">
        <li class="list-group-item">First item</li>
        <li class="list-group-item">Second item</li>
        <li class="list-group-item">Third item</li>
    </ul>
</div>"""))
      }
    }
  }

  def render(user:Option[User],tweets:List[Tweet],tweet:Form[tweetForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,tweets,tweet)(messages)

  def f:((Option[User],List[Tweet],Form[tweetForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,tweets,tweet) => (messages) => apply(user,tweets,tweet)(messages)

  def ref: this.type = this

}


}
}

/**/
object landing extends landing_Scope0.landing_Scope1.landing
              /*
                  -- GENERATED --
                  DATE: Wed Feb 01 22:46:39 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/landing.scala.html
                  HASH: b0fd93f115aa0856f643bc234a1637b8abb1c5a8
                  MATRIX: 656->56|844->149|872->151|922->176|933->180|947->186|956->193|982->211|1012->214|1039->236|1060->248|1084->253|1112->255|1148->275|1187->276|1219->282|1256->298|1288->300|1317->302
                  LINES: 24->4|29->4|31->6|33->8|33->8|33->8|33->9|33->9|33->9|33->10|33->10|33->11|34->12|34->12|34->12|35->13|35->13|36->14|38->16
                  -- GENERATED --
              */
          