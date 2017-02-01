
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


    """),format.raw/*5.5*/("""<div>
        <label class="col-sm-2 control-label">Account Name</label>
        <div class="col-sm-10">
                """),_display_(/*8.18*/tweet/*8.23*/.tweetOwnerName),format.raw/*8.38*/("""
        """),format.raw/*9.9*/("""</div>
    </div>

    <div>
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
                <button type="button" onclick="showBox"""),_display_(/*38.56*/tweet/*38.61*/.tweetID),format.raw/*38.69*/(""" """),format.raw/*38.70*/("""()" class="btn btn-default" id="showCommentBox">Comment</button>
            </div>
        </div>


        <div id="commentArea"""),_display_(/*43.30*/tweet/*43.35*/.tweetID),format.raw/*43.43*/("""" style="visibility: hidden">
            <div class="form-group">
                <label class="col-sm-2 control-label">Comment</label>
                <div class="col-sm-10">
                    <textarea class="form-control" id="comment" name="comment" rows="3"></textarea>
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
    function showBox"""),_display_(/*60.22*/tweet/*60.27*/.tweetID),format.raw/*60.35*/(""" """),format.raw/*60.36*/("""() """),format.raw/*60.39*/("""{"""),format.raw/*60.40*/("""
        """),format.raw/*61.9*/("""document.getElementById("commentArea"""),_display_(/*61.46*/tweet/*61.51*/.tweetID),format.raw/*61.59*/("""").style.visibility = "visible";
        document.getElementById("showCommentBox").remove();
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/("""
"""),format.raw/*64.1*/("""</script>"""))
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
                  DATE: Wed Feb 01 22:46:40 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/tweetView.scala.html
                  HASH: 2f241c7ec109f698dea7c4cabe27da8c3cdf4078
                  MATRIX: 586->22|695->36|728->43|876->165|889->170|924->185|959->194|1124->332|1138->337|1169->347|1205->356|1341->465|1355->470|1389->483|1471->538|1485->543|1514->551|1843->853|1857->858|1891->871|1973->926|1987->931|2016->939|2187->1083|2201->1088|2230->1096|2259->1097|2416->1227|2430->1232|2459->1240|3082->1836|3096->1841|3125->1849|3154->1850|3185->1853|3214->1854|3250->1863|3314->1900|3328->1905|3357->1913|3481->2010|3509->2011|3537->2012
                  LINES: 23->2|28->2|31->5|34->8|34->8|34->8|35->9|41->15|41->15|41->15|42->16|47->21|47->21|47->21|48->22|48->22|48->22|59->33|59->33|59->33|60->34|60->34|60->34|64->38|64->38|64->38|64->38|69->43|69->43|69->43|86->60|86->60|86->60|86->60|86->60|86->60|87->61|87->61|87->61|87->61|89->63|89->63|90->64
                  -- GENERATED --
              */
          