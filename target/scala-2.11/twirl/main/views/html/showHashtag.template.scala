
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showHashtag_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class showHashtag extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[Tweet],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Tweets : Seq[Tweet]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*3.2*/for(tweet <- Tweets) yield /*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),_display_(/*4.6*/tweetView(tweet)),format.raw/*4.22*/("""
""")))}))
      }
    }
  }

  def render(Tweets:Seq[Tweet]): play.twirl.api.HtmlFormat.Appendable = apply(Tweets)

  def f:((Seq[Tweet]) => play.twirl.api.HtmlFormat.Appendable) = (Tweets) => apply(Tweets)

  def ref: this.type = this

}


}

/**/
object showHashtag extends showHashtag_Scope0.showHashtag
              /*
                  -- GENERATED --
                  DATE: Thu Feb 02 15:29:30 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/showHashtag.scala.html
                  HASH: cb0b9b1544dbbd2fc047e76c96be08cd5e478233
                  MATRIX: 543->1|659->22|687->25|722->45|760->46|791->52|827->68
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|28->4
                  -- GENERATED --
              */
          