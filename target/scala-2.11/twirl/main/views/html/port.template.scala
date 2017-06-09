
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

class port extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Port,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(portId: Long, port: Port):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/main("Port page")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h1>Port: """),_display_(/*4.16*/portId),format.raw/*4.22*/("""</h1>

    <ul>
        <li>"""),_display_(/*7.14*/port/*7.18*/.getName()),format.raw/*7.28*/("""</li>
        <li>"""),_display_(/*8.14*/port/*8.18*/.getIn()),format.raw/*8.26*/("""</li>
        <li>"""),_display_(/*9.14*/port/*9.18*/.getOut()),format.raw/*9.27*/("""</li>
    </ul>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(portId:Long,port:Port): play.twirl.api.HtmlFormat.Appendable = apply(portId,port)

  def f:((Long,Port) => play.twirl.api.HtmlFormat.Appendable) = (portId,port) => apply(portId,port)

  def ref: this.type = this

}


}

/**/
object port extends port_Scope0.port
              /*
                  -- GENERATED --
                  DATE: Fri Jun 09 15:25:37 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/port.scala.html
                  HASH: 1e00fd249b3f8ac31862817a53a8e717609a3af9
                  MATRIX: 746->1|867->27|897->32|922->49|961->51|993->57|1030->68|1056->74|1114->106|1126->110|1156->120|1202->140|1214->144|1242->152|1288->172|1300->176|1329->185|1378->204
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|42->11
                  -- GENERATED --
              */
          