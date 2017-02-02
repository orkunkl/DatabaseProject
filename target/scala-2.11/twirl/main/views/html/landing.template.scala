
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
        """),format.raw/*24.9*/("""<li class="list-group-item">Barack Obama</li>
        <li class="list-group-item">Katy</li>
        <li class="list-group-item">Hello</li>
    </ul>
</div>

<div class="col-md-4">
    <h2>Tweets</h2>
    <ul class="list-group">
        """),_display_(/*33.10*/for(trend <- trendTweets) yield /*33.35*/{_display_(Seq[Any](format.raw/*33.36*/("""
            """),format.raw/*34.13*/("""<li class="list-group-item"><a href=""""),_display_(/*34.51*/routes/*34.57*/.PageController.showHashtag(trend.trendID.get)),format.raw/*34.103*/("""">"""),_display_(/*34.106*/trend/*34.111*/.trendName),format.raw/*34.121*/("""</a></li>
        """)))}),format.raw/*35.10*/("""
        """),format.raw/*36.9*/("""<li class="list-group-item">Orkun Kulce</li>
        <li class="list-group-item">Furkan Kaymak</li>
        <li class="list-group-item">Max Schmidhuber</li>
    </ul>
</div>

<script>
        function showBox (boxNo) """),format.raw/*43.34*/("""{"""),format.raw/*43.35*/("""
            """),format.raw/*44.13*/("""document.getElementById("commentArea" + boxNo).style.visibility = "visible";
            document.getElementById("showCommentBox" + boxNo).remove();
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/("""
"""),format.raw/*47.1*/("""</script>
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
                  DATE: Thu Feb 02 16:38:00 CET 2017
                  SOURCE: /home/orkun/Workspace/DatabaseProject/app/views/landing.scala.html
                  HASH: b7cb3b0a34d8b9c817fe89d9816559d543f2bc21
                  MATRIX: 698->76|939->221|967->223|1017->248|1028->252|1042->258|1051->265|1077->283|1107->286|1134->308|1155->320|1179->325|1207->327|1243->347|1282->348|1314->354|1351->370|1383->372|1412->374|1529->464|1572->491|1611->492|1652->505|1717->543|1732->549|1800->595|1831->598|1846->603|1878->613|1928->632|1964->641|2228->878|2269->903|2308->904|2349->917|2414->955|2429->961|2497->1007|2528->1010|2543->1015|2575->1025|2625->1044|2661->1053|2906->1270|2935->1271|2976->1284|3160->1441|3189->1442|3217->1443
                  LINES: 25->4|30->4|32->6|34->8|34->8|34->8|34->9|34->9|34->9|34->10|34->10|34->11|35->12|35->12|35->12|36->13|36->13|37->14|39->16|44->21|44->21|44->21|45->22|45->22|45->22|45->22|45->22|45->22|45->22|46->23|47->24|56->33|56->33|56->33|57->34|57->34|57->34|57->34|57->34|57->34|57->34|58->35|59->36|66->43|66->43|67->44|69->46|69->46|70->47
                  -- GENERATED --
              */
          