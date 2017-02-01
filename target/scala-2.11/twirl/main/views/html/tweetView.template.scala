
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tweetView_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object tweetView_Scope1 {
import models.Tweet

class tweetView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Tweet,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(tweet: Tweet):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.16*/("""


"""),format.raw/*5.1*/("""<form class="form-horizontal">
    <div class="form-group">
        <label class="col-sm-2 control-label">Account Name</label>
        <div class="col-sm-10">
                """),_display_(/*9.18*/tweet/*9.23*/.tweetOwnerName),format.raw/*9.38*/("""
        """),format.raw/*10.9*/("""</div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">Tweet</label>
        <div class="col-sm-10">
                """),_display_(/*16.18*/tweet/*16.23*/.tweetText),format.raw/*16.33*/("""
        """),format.raw/*17.9*/("""</div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="button" class="btn btn-default">Like</button>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="button" onclick="showBox()" class="btn btn-default" id="showCommentBox">Comment</button>
        </div>
    </div>

    <div id="commentArea" style="visibility: hidden">
        <div class="form-group">
            <label class="col-sm-2 control-label">Comment</label>
            <div class="col-sm-10">
                <textarea class="form-control" id="comment" rows="3"></textarea>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Comment</button>
            </div>
        </div>
    </div>
</form>

<script>
    function showBox() """),format.raw/*49.24*/("""{"""),format.raw/*49.25*/("""
        """),format.raw/*50.9*/("""document.getElementById("commentArea").style.visibility = "visible";
        document.getElementById("showCommentBox").remove();
    """),format.raw/*52.5*/("""}"""),format.raw/*52.6*/("""
"""),format.raw/*53.1*/("""</script>"""))
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
object tweetView extends tweetView_Scope0.tweetView_Scope1.tweetView
              /*
                  -- GENERATED --
                  DATE: Wed Feb 01 21:11:24 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/tweetView.scala.html
                  HASH: cd38a4c7fb33935fd0ed8455357524591b694540
                  MATRIX: 586->22|695->36|724->39|926->215|939->220|974->235|1010->244|1194->401|1208->406|1239->416|1275->425|2272->1394|2301->1395|2337->1404|2497->1537|2525->1538|2553->1539
                  LINES: 23->2|28->2|31->5|35->9|35->9|35->9|36->10|42->16|42->16|42->16|43->17|75->49|75->49|76->50|78->52|78->52|79->53
                  -- GENERATED --
              */
          