
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ports_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class ports extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Port],String,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ports: List[Port], device: String, deviceId: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""

"""),_display_(/*3.2*/main("Ports page")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<h1>Liste des ports du device """),_display_(/*4.36*/device),format.raw/*4.42*/("""</h1>

    """),_display_(/*6.6*/for(port <- ports) yield /*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
        """),format.raw/*7.9*/("""<ul>
        	<li><a href="/devices/"""),_display_(/*8.33*/deviceId),format.raw/*8.41*/("""/ports/"""),_display_(/*8.49*/port/*8.53*/.getId()),format.raw/*8.61*/("""">"""),_display_(/*8.64*/port/*8.68*/.getName()),format.raw/*8.78*/("""</a></li>
            """),_display_(/*9.14*/defining("/assets/images/" + device + "/" + port.getName() + "/" + port.getName())/*9.96*/ { portPath =>_display_(Seq[Any](format.raw/*9.110*/("""
            	"""),_display_(/*10.15*/defining(portPath + "-daily.png")/*10.48*/ { dailyPath =>_display_(Seq[Any](format.raw/*10.63*/("""
                	"""),format.raw/*11.18*/("""<img src=""""),_display_(/*11.29*/dailyPath),format.raw/*11.38*/("""" alt="Daily graph" height="170" width="372" >
            	""")))}),format.raw/*12.15*/("""
            	"""),_display_(/*13.15*/defining(portPath + "-weekly.png")/*13.49*/ { weeklyPath =>_display_(Seq[Any](format.raw/*13.65*/("""
                	"""),format.raw/*14.18*/("""<img src=""""),_display_(/*14.29*/weeklyPath),format.raw/*14.39*/("""" alt="Weekly graph" height="170" width="372" >
            	""")))}),format.raw/*15.15*/("""
            	"""),_display_(/*16.15*/defining(portPath + "-monthly.png")/*16.50*/ { monthlyPath =>_display_(Seq[Any](format.raw/*16.67*/("""
                	"""),format.raw/*17.18*/("""<img src=""""),_display_(/*17.29*/monthlyPath),format.raw/*17.40*/("""" alt="Monthly graph" height="170" width="372" >
            	""")))}),format.raw/*18.15*/("""
            	"""),_display_(/*19.15*/defining(portPath + "-annual.png")/*19.49*/ { annualPath =>_display_(Seq[Any](format.raw/*19.65*/("""
                	"""),format.raw/*20.18*/("""<img src=""""),_display_(/*20.29*/annualPath),format.raw/*20.39*/("""" alt="Annual graph" height="170" width="372" >
            	""")))}),format.raw/*21.15*/("""
        	""")))}),format.raw/*22.11*/("""
        """),format.raw/*23.9*/("""</ul>
    """)))}),format.raw/*24.6*/("""

    """),format.raw/*26.5*/("""<a href="/">Home</a>
""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(ports:List[Port],device:String,deviceId:Long): play.twirl.api.HtmlFormat.Appendable = apply(ports,device,deviceId)

  def f:((List[Port],String,Long) => play.twirl.api.HtmlFormat.Appendable) = (ports,device,deviceId) => apply(ports,device,deviceId)

  def ref: this.type = this

}


}

/**/
object ports extends ports_Scope0.ports
              /*
                  -- GENERATED --
                  DATE: Mon Jun 12 14:35:02 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/ports.scala.html
                  HASH: 6b76d0c7846f81a66e526e24d164745717ebca22
                  MATRIX: 761->1|907->52|937->57|963->75|1002->77|1034->83|1091->114|1117->120|1156->134|1189->152|1227->153|1263->163|1327->201|1355->209|1389->217|1401->221|1429->229|1458->232|1470->236|1500->246|1550->270|1640->352|1692->366|1735->382|1777->415|1830->430|1877->449|1915->460|1945->469|2038->531|2081->547|2124->581|2178->597|2225->616|2263->627|2294->637|2388->700|2431->716|2475->751|2530->768|2577->787|2615->798|2647->809|2742->873|2785->889|2828->923|2882->939|2929->958|2967->969|2998->979|3092->1042|3135->1054|3172->1064|3214->1076|3249->1084|3302->1107
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|39->8|39->8|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|53->22|54->23|55->24|57->26|58->27
                  -- GENERATED --
              */
          