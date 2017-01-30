
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

     object tweet_Scope1 {
import models.Tweet

class tweet extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Tweet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(tweet : Tweet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.17*/("""

"""),format.raw/*4.1*/("""<div class="row">
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

"""))
      }
    }
  }

  def render(tweet:Tweet): play.twirl.api.HtmlFormat.Appendable = apply(tweet)

  def f:((Tweet) => play.twirl.api.HtmlFormat.Appendable) = (tweet) => apply(tweet)

  def ref: this.type = this

}


}
}

/**/
object tweet extends tweet_Scope0.tweet_Scope1.tweet
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 17:11:42 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/tweet.scala.html
                  HASH: 39cf6faef5fe6906af913ea6ad51bd48969a933a
                  MATRIX: 574->22|684->37|712->39|835->136|848->141|883->156|913->159|966->186|979->191|1009->201|1112->277|1126->282|1155->290|1228->336|1242->341|1271->349
                  LINES: 23->2|28->2|30->4|34->8|34->8|34->8|34->8|35->9|35->9|35->9|38->12|38->12|38->12|39->13|39->13|39->13
                  -- GENERATED --
              */
          