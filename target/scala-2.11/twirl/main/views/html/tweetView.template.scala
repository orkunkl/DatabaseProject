
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

    <div class="form-group">
        <label class="col-sm-2 control-label">Account Name</label>
        <div class="col-sm-10">
                """),_display_(/*8.18*/tweet/*8.23*/.tweetOwnerName),format.raw/*8.38*/("""
        """),format.raw/*9.9*/("""</div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">Tweet</label>
        <div class="col-sm-10">
                """),_display_(/*15.18*/tweet/*15.23*/.tweetText),format.raw/*15.33*/("""
        """),format.raw/*16.9*/("""</div>
    </div>

    <form class="form-horizontal">

        <input type="hidden" name="accountID" value=""""),_display_(/*21.55*/tweet/*21.60*/.tweetOwnerID),format.raw/*21.73*/("""">
        <input type="hidden" name="tweetID" value=""""),_display_(/*22.53*/tweet/*22.58*/.tweetID),format.raw/*22.66*/("""">
        
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="button" class="btn btn-default">Like</button>
            </div>
        </div>
    </form>

    <form class="form-horizontal">

        <input type="hidden" name="accountID" value=""""),_display_(/*33.55*/tweet/*33.60*/.tweetOwnerID),format.raw/*33.73*/("""">
        <input type="hidden" name="tweetID" value=""""),_display_(/*34.53*/tweet/*34.58*/.tweetID),format.raw/*34.66*/("""">

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
    function showBox() """),format.raw/*61.24*/("""{"""),format.raw/*61.25*/("""
        """),format.raw/*62.9*/("""document.getElementById("commentArea").style.visibility = "visible";
        document.getElementById("showCommentBox").remove();
    """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/("""
"""),format.raw/*65.1*/("""</script>"""))
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
                  DATE: Wed Feb 01 19:47:19 CET 2017
                  SOURCE: /home/furkan/Desktop/DatabaseProject/app/views/tweetView.scala.html
                  HASH: 136adef7e7115066765601f4584923590fc0171b
                  MATRIX: 586->22|687->38|719->62|812->36|840->125|869->127|1095->327|1108->332|1143->347|1178->356|1362->513|1376->518|1407->528|1443->537|1579->646|1593->651|1627->664|1709->719|1723->724|1752->732|2089->1042|2103->1047|2137->1060|2219->1115|2233->1120|2262->1128|3146->1984|3175->1985|3211->1994|3371->2127|3399->2128|3427->2129
                  LINES: 23->2|27->3|27->3|28->2|29->3|29->3|34->8|34->8|34->8|35->9|41->15|41->15|41->15|42->16|47->21|47->21|47->21|48->22|48->22|48->22|59->33|59->33|59->33|60->34|60->34|60->34|87->61|87->61|88->62|90->64|90->64|91->65
                  -- GENERATED --
              */
          