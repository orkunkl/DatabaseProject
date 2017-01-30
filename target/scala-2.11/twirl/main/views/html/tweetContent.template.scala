
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tweetContent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object tweetContent_Scope1 {
import models.Tweet
import views.html.tweet

class tweetContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Tweet],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(tweets : List[Tweet]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.24*/("""

"""),_display_(/*6.2*/for(t <- tweets) yield /*6.18*/{_display_(Seq[Any](format.raw/*6.19*/("""
    """),format.raw/*7.5*/("""tweet(t)
""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(tweets:List[Tweet]): play.twirl.api.HtmlFormat.Appendable = apply(tweets)

  def f:((List[Tweet]) => play.twirl.api.HtmlFormat.Appendable) = (tweets) => apply(tweets)

  def ref: this.type = this

}


}
}

/**/
object tweetContent extends tweetContent_Scope0.tweetContent_Scope1.tweetContent
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 17:16:43 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/tweetContent.scala.html
                  HASH: 09bf8e6d4c62baeecc4a711448c6a2e4f7687e71
                  MATRIX: 625->48|742->70|770->73|801->89|839->90|870->95|909->105
                  LINES: 24->4|29->4|31->6|31->6|31->6|32->7|33->8
                  -- GENERATED --
              */
          