
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

class ports extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Port],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ports: List[Port], device: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/main("Ports page")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<h1>Liste des ports du device """),_display_(/*4.36*/device),format.raw/*4.42*/("""</h1>

    """),_display_(/*6.6*/for(port <- ports) yield /*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
        """),format.raw/*7.9*/("""<ul>
            <li>"""),_display_(/*8.18*/port/*8.22*/.getName()),format.raw/*8.32*/("""</li>
            """),_display_(/*9.14*/defining("/assets/images/" + device + "/" + port.getName() + "/" + port.getName())/*9.96*/ { portPath =>_display_(Seq[Any](format.raw/*9.110*/("""
            	"""),_display_(/*10.15*/defining(portPath + "-daily.png")/*10.48*/ { dailyPath =>_display_(Seq[Any](format.raw/*10.63*/("""
                	"""),format.raw/*11.18*/("""<img src="""),_display_(/*11.28*/dailyPath),format.raw/*11.37*/(""" """),format.raw/*11.38*/("""alt="Daily graph" height="170" width="372" >
            	""")))}),format.raw/*12.15*/("""
            	"""),_display_(/*13.15*/defining(portPath + "-weekly.png")/*13.49*/ { weeklyPath =>_display_(Seq[Any](format.raw/*13.65*/("""
                	"""),format.raw/*14.18*/("""<img src="""),_display_(/*14.28*/weeklyPath),format.raw/*14.38*/(""" """),format.raw/*14.39*/("""alt="Weekly graph" height="170" width="372" >
            	""")))}),format.raw/*15.15*/("""
            	"""),_display_(/*16.15*/defining(portPath + "-monthly.png")/*16.50*/ { monthlyPath =>_display_(Seq[Any](format.raw/*16.67*/("""
                	"""),format.raw/*17.18*/("""<img src="""),_display_(/*17.28*/monthlyPath),format.raw/*17.39*/(""" """),format.raw/*17.40*/("""alt="Monthly graph" height="170" width="372" >
            	""")))}),format.raw/*18.15*/("""
            	"""),_display_(/*19.15*/defining(portPath + "-annual.png")/*19.49*/ { annualPath =>_display_(Seq[Any](format.raw/*19.65*/("""
                	"""),format.raw/*20.18*/("""<img src="""),_display_(/*20.28*/annualPath),format.raw/*20.38*/(""" """),format.raw/*20.39*/("""alt="Annual graph" height="170" width="372" >
            	""")))}),format.raw/*21.15*/("""
        	""")))}),format.raw/*22.11*/("""
        """),format.raw/*23.9*/("""</ul>
    """)))}),format.raw/*24.6*/("""
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(ports:List[Port],device:String): play.twirl.api.HtmlFormat.Appendable = apply(ports,device)

  def f:((List[Port],String) => play.twirl.api.HtmlFormat.Appendable) = (ports,device) => apply(ports,device)

  def ref: this.type = this

}


}

/**/
object ports extends ports_Scope0.ports
              /*
                  -- GENERATED --
                  DATE: Mon Jun 12 10:00:19 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/ports.scala.html
                  HASH: 8b5d092dc28c1ba957857a0b27e77508d6bfbfef
                  MATRIX: 756->1|886->36|916->41|942->59|981->61|1013->67|1070->98|1096->104|1135->118|1168->136|1206->137|1242->147|1291->170|1303->174|1333->184|1379->204|1469->286|1521->300|1564->316|1606->349|1659->364|1706->383|1743->393|1773->402|1802->403|1893->463|1936->479|1979->513|2033->529|2080->548|2117->558|2148->568|2177->569|2269->630|2312->646|2356->681|2411->698|2458->717|2495->727|2527->738|2556->739|2649->801|2692->817|2735->851|2789->867|2836->886|2873->896|2904->906|2933->907|3025->968|3068->980|3105->990|3147->1002|3180->1005
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|51->20|52->21|53->22|54->23|55->24|56->25
                  -- GENERATED --
              */
          