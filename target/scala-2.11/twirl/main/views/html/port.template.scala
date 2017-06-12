
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object port_Scope0 {
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

class port extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Port,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(port: Port, device: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Port page")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h2>Détail du port</h2>
    <h4>Equipement: """),_display_(/*5.22*/device),format.raw/*5.28*/("""</h4>
    <h4>Port: """),_display_(/*6.16*/port/*6.20*/.getName()),format.raw/*6.30*/("""</h4>

    <ul>
        """),_display_(/*9.10*/defining("/assets/images/" + device + "/" + port.getName() + "/" + port.getName())/*9.92*/ { portPath =>_display_(Seq[Any](format.raw/*9.106*/("""
            """),_display_(/*10.14*/defining(portPath + "-daily.png")/*10.47*/ { dailyPath =>_display_(Seq[Any](format.raw/*10.62*/("""
                """),format.raw/*11.17*/("""<li>Graph journalier</li>
                <img src="""),_display_(/*12.27*/dailyPath),format.raw/*12.36*/(""" """),format.raw/*12.37*/("""alt="Daily graph" height="255" width="558" >
            """)))}),format.raw/*13.14*/("""
            """),format.raw/*14.13*/("""<br>
            """),_display_(/*15.14*/defining(portPath + "-weekly.png")/*15.48*/ { weeklyPath =>_display_(Seq[Any](format.raw/*15.64*/("""
                """),format.raw/*16.17*/("""<li>Graph de la semaine</li>
                <img src="""),_display_(/*17.27*/weeklyPath),format.raw/*17.37*/(""" """),format.raw/*17.38*/("""alt="Weekly graph" height="255" width="558" >
            """)))}),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""<br>
            """),_display_(/*20.14*/defining(portPath + "-monthly.png")/*20.49*/ { monthlyPath =>_display_(Seq[Any](format.raw/*20.66*/("""
                """),format.raw/*21.17*/("""<li>Graph du mois</li>
                <img src="""),_display_(/*22.27*/monthlyPath),format.raw/*22.38*/(""" """),format.raw/*22.39*/("""alt="Monthly graph" height="255" width="558" >
            """)))}),format.raw/*23.14*/("""
            """),format.raw/*24.13*/("""<br>
            """),_display_(/*25.14*/defining(portPath + "-annual.png")/*25.48*/ { annualPath =>_display_(Seq[Any](format.raw/*25.64*/("""
                """),format.raw/*26.17*/("""<li>Graph annuel</li>
                <img src="""),_display_(/*27.27*/annualPath),format.raw/*27.37*/(""" """),format.raw/*27.38*/("""alt="Annual graph" height="255" width="558" >
            """)))}),format.raw/*28.14*/("""
        """)))}),format.raw/*29.10*/("""
    """),format.raw/*30.5*/("""</ul>

    <a href="/">Home</a>
""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(port:Port,device:String): play.twirl.api.HtmlFormat.Appendable = apply(port,device)

  def f:((Port,String) => play.twirl.api.HtmlFormat.Appendable) = (port,device) => apply(port,device)

  def ref: this.type = this

}


}

/**/
object port extends port_Scope0.port
              /*
                  -- GENERATED --
                  DATE: Mon Jun 12 14:35:02 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/port.scala.html
                  HASH: 4cf514b2f053f9612a2ea86989cb2c4c025d9755
                  MATRIX: 748->1|871->29|901->34|926->51|965->53|997->59|1069->105|1095->111|1143->133|1155->137|1185->147|1239->175|1329->257|1381->271|1423->286|1465->319|1518->334|1564->352|1644->405|1674->414|1703->415|1793->474|1835->488|1881->507|1924->541|1978->557|2024->575|2107->631|2138->641|2167->642|2258->702|2300->716|2346->735|2390->770|2445->787|2491->805|2568->855|2600->866|2629->867|2721->928|2763->942|2809->961|2852->995|2906->1011|2952->1029|3028->1078|3059->1088|3088->1089|3179->1149|3221->1160|3254->1166|3320->1202
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|37->6|37->6|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|55->24|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|64->33
                  -- GENERATED --
              */
          