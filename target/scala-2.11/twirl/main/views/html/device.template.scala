
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

class device extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Device,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(deviceId: Long, device: Device):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Device page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<h1>Equipements: """),_display_(/*4.23*/deviceId),format.raw/*4.31*/("""</h1>

    <ul>
        <li>"""),_display_(/*7.14*/device/*7.20*/.getName()),format.raw/*7.30*/("""</li>
        <li>"""),_display_(/*8.14*/device/*8.20*/.getIpAddress()),format.raw/*8.35*/("""</li>
    </ul>
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(deviceId:Long,device:Device): play.twirl.api.HtmlFormat.Appendable = apply(deviceId,device)

  def f:((Long,Device) => play.twirl.api.HtmlFormat.Appendable) = (deviceId,device) => apply(deviceId,device)

  def ref: this.type = this

}


}

/**/
object device extends device_Scope0.device
              /*
                  -- GENERATED --
                  DATE: Fri Jun 09 14:47:48 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/device.scala.html
                  HASH: 4b5fafda8b0d9adf49d4604f33af3125909b9ad6
                  MATRIX: 752->1|879->33|909->38|936->57|975->59|1007->65|1051->83|1079->91|1137->123|1151->129|1181->139|1227->159|1241->165|1276->180|1325->199
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|38->7|38->7|38->7|39->8|39->8|39->8|41->10
                  -- GENERATED --
              */
          