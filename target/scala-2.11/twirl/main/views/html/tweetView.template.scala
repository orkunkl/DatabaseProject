
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

implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ b3.horizontal.fieldConstructor("col-md-2", "col-md-10") }};
Seq[Any](format.raw/*2.16*/("""
"""),format.raw/*3.89*/("""  """),format.raw/*3.91*/("""// Declares a horizontal field constructor as default

<form class="form-horizontal">
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
                  DATE: Wed Feb 01 19:24:09 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/tweetView.scala.html
                  HASH: c4e7e1dbd915e5fe1ba1654024d9d17e92f49953
                  MATRIX: 586->22|687->38|719->62|812->36|840->125|869->127|1126->358|1139->363|1174->378|1210->387|1394->544|1408->549|1439->559|1475->568|2472->1537|2501->1538|2537->1547|2697->1680|2725->1681|2753->1682
                  LINES: 23->2|27->3|27->3|28->2|29->3|29->3|35->9|35->9|35->9|36->10|42->16|42->16|42->16|43->17|75->49|75->49|76->50|78->52|78->52|79->53
                  -- GENERATED --
              */
          