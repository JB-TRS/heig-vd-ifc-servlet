
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

class port extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Port,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(portId: Long, port: Port, device: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main("Port page")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h2>Device: """),_display_(/*4.18*/device),format.raw/*4.24*/(""" """),format.raw/*4.25*/("""-> Port: """),_display_(/*4.35*/port/*4.39*/.getName()),format.raw/*4.49*/("""</h2>

    <ul>
        """),_display_(/*7.10*/defining("/assets/images/" + device + "/" + port.getName() + "/" + port.getName())/*7.92*/ { portPath =>_display_(Seq[Any](format.raw/*7.106*/("""
            """),_display_(/*8.14*/defining(portPath + "-daily.png")/*8.47*/ { dailyPath =>_display_(Seq[Any](format.raw/*8.62*/("""
                """),format.raw/*9.17*/("""<img src="""),_display_(/*9.27*/dailyPath),format.raw/*9.36*/(""" """),format.raw/*9.37*/("""alt="Daily graph" height="170" width="372" >
            """)))}),format.raw/*10.14*/("""
            """),_display_(/*11.14*/defining(portPath + "-weekly.png")/*11.48*/ { weeklyPath =>_display_(Seq[Any](format.raw/*11.64*/("""
                """),format.raw/*12.17*/("""<img src="""),_display_(/*12.27*/weeklyPath),format.raw/*12.37*/(""" """),format.raw/*12.38*/("""alt="Weekly graph" height="170" width="372" >
            """)))}),format.raw/*13.14*/("""
            """),_display_(/*14.14*/defining(portPath + "-monthly.png")/*14.49*/ { monthlyPath =>_display_(Seq[Any](format.raw/*14.66*/("""
                """),format.raw/*15.17*/("""<img src="""),_display_(/*15.27*/monthlyPath),format.raw/*15.38*/(""" """),format.raw/*15.39*/("""alt="Monthly graph" height="170" width="372" >
            """)))}),format.raw/*16.14*/("""
            """),_display_(/*17.14*/defining(portPath + "-annual.png")/*17.48*/ { annualPath =>_display_(Seq[Any](format.raw/*17.64*/("""
                """),format.raw/*18.17*/("""<img src="""),_display_(/*18.27*/annualPath),format.raw/*18.37*/(""" """),format.raw/*18.38*/("""alt="Annual graph" height="170" width="372" >
            """)))}),format.raw/*19.14*/("""
        """)))}),format.raw/*20.10*/("""
    """),format.raw/*21.5*/("""</ul>
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(portId:Long,port:Port,device:String): play.twirl.api.HtmlFormat.Appendable = apply(portId,port,device)

  def f:((Long,Port,String) => play.twirl.api.HtmlFormat.Appendable) = (portId,port,device) => apply(portId,port,device)

  def ref: this.type = this

}


}

/**/
object port extends port_Scope0.port
              /*
                  -- GENERATED --
                  DATE: Mon Jun 12 09:58:21 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/port.scala.html
                  HASH: fe8946680f0ae11e6352fa47c46ba33b925a5691
                  MATRIX: 753->1|890->43|920->48|945->65|984->67|1016->73|1055->86|1081->92|1109->93|1145->103|1157->107|1187->117|1241->145|1331->227|1383->241|1424->256|1465->289|1517->304|1562->322|1598->332|1627->341|1655->342|1745->401|1787->416|1830->450|1884->466|1930->484|1967->494|1998->504|2027->505|2118->565|2160->580|2204->615|2259->632|2305->650|2342->660|2374->671|2403->672|2495->733|2537->748|2580->782|2634->798|2680->816|2717->826|2748->836|2777->837|2868->897|2910->908|2943->914|2981->922
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|50->19|51->20|52->21|53->22
                  -- GENERATED --
              */
          