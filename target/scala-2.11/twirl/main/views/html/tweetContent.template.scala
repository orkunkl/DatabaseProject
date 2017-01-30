
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

class tweetContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Tweet],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(tweets : List[Tweet]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<ul>
"""),_display_(/*4.2*/for(tweet <- tweets) yield /*4.22*/{_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<li>"""),_display_(/*5.10*/tweet/*5.15*/.tweetOwnerName),format.raw/*5.30*/("""</li>
    <li>"""),_display_(/*6.10*/tweet/*6.15*/.tweetText),format.raw/*6.25*/("""</li>
""")))}),format.raw/*7.2*/("""
"""),format.raw/*8.1*/("""</ul>"""))
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
                  DATE: Mon Jan 30 15:18:35 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/tweetContent.scala.html
                  HASH: d7e414ef033d60c3bb32c760f4d196a6b66c88de
                  MATRIX: 601->22|718->44|745->45|776->51|811->71|849->72|880->77|911->82|924->87|959->102|1000->117|1013->122|1043->132|1079->139|1106->140
                  LINES: 23->2|28->2|29->3|30->4|30->4|30->4|31->5|31->5|31->5|31->5|32->6|32->6|32->6|33->7|34->8
                  -- GENERATED --
              */
          