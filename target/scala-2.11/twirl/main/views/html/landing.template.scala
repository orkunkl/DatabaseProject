
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

"""),_display_(/*6.2*/user/*6.6*/ match/*6.12*/ {/*7.5*/case Some(user) =>/*7.23*/ {_display_(_display_(/*7.26*/tweetPost(tweet)))}/*8.5*/case None =>/*8.17*/ {}}),format.raw/*9.2*/("""
"""),_display_(/*10.2*/for(tweet <- tweets) yield /*10.22*/{_display_(Seq[Any](format.raw/*10.23*/("""
    """),_display_(/*11.6*/tweetView(tweet)),format.raw/*11.22*/("""
""")))}))
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
                  DATE: Wed Feb 01 19:24:59 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/landing.scala.html
                  HASH: 4f464f084db7bb20831e2f5b3bc1888b0a689177
                  MATRIX: 656->56|844->149|872->152|883->156|897->162|906->169|932->187|962->190|988->212|1008->224|1031->229|1059->231|1095->251|1134->252|1166->258|1203->274
                  LINES: 24->4|29->4|31->6|31->6|31->6|31->7|31->7|31->7|31->8|31->8|31->9|32->10|32->10|32->10|33->11|33->11
                  -- GENERATED --
              */
          