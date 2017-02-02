
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object landing_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object landing_Scope1 {
import models.User
import models.Trend
import views.viewForms.tweetForm

class landing extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Option[User],List[Tweet],Form[tweetForm],Seq[Trend],Seq[Trend],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(user: Option[User], tweets: List[Tweet],tweet: Form[tweetForm], trendTweets: Seq[Trend], trendHashtags: Seq[Trend])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.147*/("""

"""),format.raw/*6.1*/("""<div class="col-md-8">

"""),_display_(/*8.2*/user/*8.6*/ match/*8.12*/ {/*9.5*/case Some(user) =>/*9.23*/ {_display_(_display_(/*9.26*/tweetPost(tweet)))}/*10.5*/case None =>/*10.17*/ {}}),format.raw/*11.2*/("""
"""),_display_(/*12.2*/for(tweet <- tweets) yield /*12.22*/{_display_(Seq[Any](format.raw/*12.23*/("""
    """),_display_(/*13.6*/tweetView(tweet)),format.raw/*13.22*/("""
""")))}),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""</div>

<div class="col-md-4">
    <h2>Hashtags</h2>
    <ul class="list-group">
        """),_display_(/*21.10*/for(trend <- trendHashtags) yield /*21.37*/{_display_(Seq[Any](format.raw/*21.38*/("""
            """),format.raw/*22.13*/("""<li class="list-group-item"><a href=""""),_display_(/*22.51*/routes/*22.57*/.PageController.showHashtag(trend.trendID.get)),format.raw/*22.103*/("""">"""),_display_(/*22.106*/trend/*22.111*/.trendName),format.raw/*22.121*/("""</a></li>
        """)))}),format.raw/*23.10*/("""
    """),format.raw/*24.5*/("""</ul>
</div>

<div class="col-md-4">
    <h2>Tweets</h2>
    <ul class="list-group">
        """),_display_(/*30.10*/for(trend <- trendTweets) yield /*30.35*/{_display_(Seq[Any](format.raw/*30.36*/("""
            """),format.raw/*31.13*/("""<li class="list-group-item"><a href=""""),_display_(/*31.51*/routes/*31.57*/.PageController.showHashtag(trend.trendID.get)),format.raw/*31.103*/("""">"""),_display_(/*31.106*/trend/*31.111*/.trendName),format.raw/*31.121*/("""</a></li>
        """)))}),format.raw/*32.10*/("""
    """),format.raw/*33.5*/("""</ul>
</div>

<script>
        function showBox (boxNo) """),format.raw/*37.34*/("""{"""),format.raw/*37.35*/("""
            """),format.raw/*38.13*/("""document.getElementById("commentArea" + boxNo).style.visibility = "visible";
            document.getElementById("showCommentBox" + boxNo).remove();
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""
"""),format.raw/*41.1*/("""</script>
"""))
      }
    }
  }

  def render(user:Option[User],tweets:List[Tweet],tweet:Form[tweetForm],trendTweets:Seq[Trend],trendHashtags:Seq[Trend],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,tweets,tweet,trendTweets,trendHashtags)(messages)

  def f:((Option[User],List[Tweet],Form[tweetForm],Seq[Trend],Seq[Trend]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,tweets,tweet,trendTweets,trendHashtags) => (messages) => apply(user,tweets,tweet,trendTweets,trendHashtags)(messages)

  def ref: this.type = this

}


}
}

/**/
object landing extends landing_Scope0.landing_Scope1.landing
              /*
                  -- GENERATED --
                  DATE: Thu Feb 02 15:24:09 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/landing.scala.html
                  HASH: 24ab6100c526a04fb7d2418d839f428874b9fdb7
                  MATRIX: 698->76|939->221|967->223|1017->248|1028->252|1042->258|1051->265|1077->283|1107->286|1134->308|1155->320|1179->325|1207->327|1243->347|1282->348|1314->354|1351->370|1383->372|1412->374|1529->464|1572->491|1611->492|1652->505|1717->543|1732->549|1800->595|1831->598|1846->603|1878->613|1928->632|1960->637|2081->731|2122->756|2161->757|2202->770|2267->808|2282->814|2350->860|2381->863|2396->868|2428->878|2478->897|2510->902|2594->958|2623->959|2664->972|2848->1129|2877->1130|2905->1131
                  LINES: 25->4|30->4|32->6|34->8|34->8|34->8|34->9|34->9|34->9|34->10|34->10|34->11|35->12|35->12|35->12|36->13|36->13|37->14|39->16|44->21|44->21|44->21|45->22|45->22|45->22|45->22|45->22|45->22|45->22|46->23|47->24|53->30|53->30|53->30|54->31|54->31|54->31|54->31|54->31|54->31|54->31|55->32|56->33|60->37|60->37|61->38|63->40|63->40|64->41
                  -- GENERATED --
              */
          