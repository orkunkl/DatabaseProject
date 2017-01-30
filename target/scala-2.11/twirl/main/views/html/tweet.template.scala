
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

class tweet extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Tweet],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tweets : List[Tweet])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""

"""),_display_(/*3.2*/for(tweet <- tweets) yield /*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-md-12">
        <ul>
            <li>
                <ul>"""),_display_(/*8.22*/tweet/*8.27*/.tweetOwnerName),format.raw/*8.42*/("""   """),format.raw/*8.45*/("""</ul>
                <ul>"""),_display_(/*9.22*/tweet/*9.27*/.tweetText),format.raw/*9.37*/("""</ul>
            </li>
            <li>
                <a href="/comment/"""),_display_(/*12.36*/tweet/*12.41*/.tweetID),format.raw/*12.49*/("""">Comment</a>
                <a href="/like/"""),_display_(/*13.33*/tweet/*13.38*/.tweetID),format.raw/*13.46*/("""">Like</a>
            </li>
        </ul>
        </div>
    </div>
""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(tweets:List[Tweet],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(tweets)(messages)

  def f:((List[Tweet]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (tweets) => (messages) => apply(tweets)(messages)

  def ref: this.type = this

}


}

/**/
object tweet extends tweet_Scope0.tweet
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 16:52:21 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/tweet.scala.html
                  HASH: 490805e96fbf52182c08c4538b2e84c9fac1f65d
                  MATRIX: 541->1|687->52|715->55|750->75|789->77|820->82|947->183|960->188|995->203|1025->206|1078->233|1091->238|1121->248|1224->324|1238->329|1267->337|1340->383|1354->388|1383->396|1483->466
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|32->8|32->8|32->8|32->8|33->9|33->9|33->9|36->12|36->12|36->12|37->13|37->13|37->13|42->18
                  -- GENERATED --
              */
          