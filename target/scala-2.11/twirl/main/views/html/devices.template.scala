
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object devices_Scope0 {
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

class devices extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Device],Form[Device],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(devices: List[Device], deviceForm: Form[Device]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),_display_(/*3.2*/main("Devices page")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h1>Liste des équipements</h1>

    """),_display_(/*6.6*/for(device <- devices) yield /*6.28*/{_display_(Seq[Any](format.raw/*6.29*/("""
        """),format.raw/*7.9*/("""<ul>
            <li><a href="/devices/"""),_display_(/*8.36*/device/*8.42*/.getId()),format.raw/*8.50*/("""">"""),_display_(/*8.53*/device/*8.59*/.getName()),format.raw/*8.69*/("""</a></li>
        </ul>
    """)))}),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""<h1>Ajouter un Equipement</h1>


    """),_display_(/*15.6*/helper/*15.12*/.form(action = routes.DeviceController.submit())/*15.60*/ {_display_(Seq[Any](format.raw/*15.62*/("""

    	"""),_display_(/*17.7*/helper/*17.13*/.inputText(deviceForm("name"))),format.raw/*17.43*/("""

    	"""),_display_(/*19.7*/helper/*19.13*/.inputText(deviceForm("ip"))),format.raw/*19.41*/("""
	""")))}),format.raw/*20.3*/("""


    """),format.raw/*23.5*/("""<a href="/">Home</a>
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(devices:List[Device],deviceForm:Form[Device]): play.twirl.api.HtmlFormat.Appendable = apply(devices,deviceForm)

  def f:((List[Device],Form[Device]) => play.twirl.api.HtmlFormat.Appendable) = (devices,deviceForm) => apply(devices,deviceForm)

  def ref: this.type = this

}


}

/**/
object devices extends devices_Scope0.devices
              /*
                  -- GENERATED --
                  DATE: Mon Jun 12 15:58:55 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/devices.scala.html
                  HASH: 5e1bedfc61513bc85742853a8b552b5fca652981
                  MATRIX: 768->1|912->50|942->55|970->75|1009->77|1041->83|1105->122|1142->144|1180->145|1216->155|1283->196|1297->202|1325->210|1354->213|1368->219|1398->229|1459->260|1494->268|1561->309|1576->315|1633->363|1673->365|1709->375|1724->381|1775->411|1811->421|1826->427|1875->455|1909->459|1946->469|1999->492
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|39->8|39->8|39->8|41->10|43->12|46->15|46->15|46->15|46->15|48->17|48->17|48->17|50->19|50->19|50->19|51->20|54->23|55->24
                  -- GENERATED --
              */
          