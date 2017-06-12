
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object device_Scope0 {
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

class device extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Device,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(device: Device):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main("Device page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<h1>Equipements: """),_display_(/*4.23*/device/*4.29*/.getId()),format.raw/*4.37*/("""</h1>

    <ul>
        <li>Nom: """),_display_(/*7.19*/device/*7.25*/.getName()),format.raw/*7.35*/("""</li>
        <li>Adresse IP:"""),_display_(/*8.25*/device/*8.31*/.getIpAddress()),format.raw/*8.46*/("""</li>
        <li><a href="/devices/"""),_display_(/*9.32*/device/*9.38*/.getId()),format.raw/*9.46*/("""/ports">Graph des ports</a></li>
    </ul>

    <a href="/">Home</a>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(device:Device): play.twirl.api.HtmlFormat.Appendable = apply(device)

  def f:((Device) => play.twirl.api.HtmlFormat.Appendable) = (device) => apply(device)

  def ref: this.type = this

}


}

/**/
object device extends device_Scope0.device
              /*
                  -- GENERATED --
                  DATE: Mon Jun 12 14:35:02 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/device.scala.html
                  HASH: afc91e327fcb0a3d1fdba27d7e3e6e9fd7da8dc6
                  MATRIX: 747->1|858->17|888->22|915->41|954->43|986->49|1030->67|1044->73|1072->81|1135->118|1149->124|1179->134|1236->165|1250->171|1285->186|1349->224|1363->230|1391->238|1495->312
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|44->13
                  -- GENERATED --
              */
          