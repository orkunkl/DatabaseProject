
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

<<<<<<< HEAD

    """),format.raw/*5.5*/("""<div>
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
                <button type="button" onclick="showBox("""),_display_(/*38.57*/tweet/*38.62*/.tweetID),format.raw/*38.70*/(""")" class="btn btn-default" id="showCommentBox"""),_display_(/*38.116*/tweet/*38.121*/.tweetID),format.raw/*38.129*/("""">Comment</button>
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
object tweetView extends tweetView_Scope0.tweetView_Scope1.tweetView
              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Wed Feb 01 22:49:04 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/tweetView.scala.html
                  HASH: 9bf5428c3511158739a1765d02991b9b5d684c4f
                  MATRIX: 586->22|695->36|728->43|876->165|889->170|924->185|959->194|1124->332|1138->337|1169->347|1205->356|1341->465|1355->470|1389->483|1471->538|1485->543|1514->551|1843->853|1857->858|1891->871|1973->926|1987->931|2016->939|2188->1084|2202->1089|2231->1097|2305->1143|2320->1148|2350->1156|2461->1240|2475->1245|2504->1253
                  LINES: 23->2|28->2|31->5|34->8|34->8|34->8|35->9|41->15|41->15|41->15|42->16|47->21|47->21|47->21|48->22|48->22|48->22|59->33|59->33|59->33|60->34|60->34|60->34|64->38|64->38|64->38|64->38|64->38|64->38|69->43|69->43|69->43
=======
                  DATE: Wed Feb 01 22:45:50 CET 2017
                  SOURCE: /home/furkan/Desktop/DatabaseProject/app/views/tweetView.scala.html
                  HASH: 8f10ab1d413530e3b9d46be1bddcc7e007a7353a
                  MATRIX: 586->22|687->38|719->62|812->36|840->125|869->127|1076->308|1089->313|1124->328|1159->337|1324->475|1338->480|1369->490|1405->499|1541->608|1555->613|1589->626|1671->681|1685->686|1714->694|2043->996|2057->1001|2091->1014|2173->1069|2187->1074|2216->1082|2388->1227|2402->1232|2431->1240|2505->1286|2520->1291|2550->1299|2661->1383|2675->1388|2704->1396
                  LINES: 23->2|27->3|27->3|28->2|29->3|29->3|34->8|34->8|34->8|35->9|41->15|41->15|41->15|42->16|47->21|47->21|47->21|48->22|48->22|48->22|59->33|59->33|59->33|60->34|60->34|60->34|64->38|64->38|64->38|64->38|64->38|64->38|69->43|69->43|69->43
>>>>>>> developmentFurkan2
                  -- GENERATED --
              */
          