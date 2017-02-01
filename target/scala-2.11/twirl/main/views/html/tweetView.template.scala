
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

<<<<<<< HEAD

"""),format.raw/*5.1*/("""<form class="form-horizontal">
    <div class="form-group">
=======
    <div>
>>>>>>> developmentFurkan2
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
<<<<<<< HEAD
                  DATE: Wed Feb 01 21:11:24 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/tweetView.scala.html
                  HASH: cd38a4c7fb33935fd0ed8455357524591b694540
                  MATRIX: 586->22|695->36|724->39|926->215|939->220|974->235|1010->244|1194->401|1208->406|1239->416|1275->425|2272->1394|2301->1395|2337->1404|2497->1537|2525->1538|2553->1539
                  LINES: 23->2|28->2|31->5|35->9|35->9|35->9|36->10|42->16|42->16|42->16|43->17|75->49|75->49|76->50|78->52|78->52|79->53
=======
                  DATE: Wed Feb 01 21:51:13 CET 2017
                  SOURCE: /home/furkan/Desktop/DatabaseProject/app/views/tweetView.scala.html
                  HASH: 45f15264e91ed2ebd5669f8419db9ffdfa7e73db
                  MATRIX: 586->22|687->38|719->62|812->36|840->125|869->127|1076->308|1089->313|1124->328|1159->337|1324->475|1338->480|1369->490|1405->499|1541->608|1555->613|1589->626|1671->681|1685->686|1714->694|2043->996|2057->1001|2091->1014|2173->1069|2187->1074|2216->1082|2387->1226|2401->1231|2430->1239|2459->1240|2616->1370|2630->1375|2659->1383|3282->1979|3296->1984|3325->1992|3354->1993|3385->1996|3414->1997|3450->2006|3514->2043|3528->2048|3557->2056|3681->2153|3709->2154|3737->2155
                  LINES: 23->2|27->3|27->3|28->2|29->3|29->3|34->8|34->8|34->8|35->9|41->15|41->15|41->15|42->16|47->21|47->21|47->21|48->22|48->22|48->22|59->33|59->33|59->33|60->34|60->34|60->34|64->38|64->38|64->38|64->38|69->43|69->43|69->43|86->60|86->60|86->60|86->60|86->60|86->60|87->61|87->61|87->61|87->61|89->63|89->63|90->64
>>>>>>> developmentFurkan2
                  -- GENERATED --
              */
          