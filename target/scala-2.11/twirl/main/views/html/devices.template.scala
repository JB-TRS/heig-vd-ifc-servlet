
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

class devices extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Device],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(devices: List[Device]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("Devices page")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h1>Liste des équipements</h1>

    """),_display_(/*6.6*/for(device <- devices) yield /*6.28*/{_display_(Seq[Any](format.raw/*6.29*/("""
        """),format.raw/*7.9*/("""<ul>
            <li>"""),_display_(/*8.18*/device/*8.24*/.getName()),format.raw/*8.34*/("""</li>
            <li>"""),_display_(/*9.18*/device/*9.24*/.getIpAddress()),format.raw/*9.39*/("""</li>
        </ul>
    """)))}),format.raw/*11.6*/("""
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(devices:List[Device]): play.twirl.api.HtmlFormat.Appendable = apply(devices)

  def f:((List[Device]) => play.twirl.api.HtmlFormat.Appendable) = (devices) => apply(devices)

  def ref: this.type = this

}


}

/**/
object devices extends devices_Scope0.devices
              /*
                  -- GENERATED --
                  DATE: Fri Jun 09 14:47:48 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/devices.scala.html
                  HASH: 31ceb947b01a8ac211045126a1e50b95de1ec943
                  MATRIX: 755->1|873->24|903->29|931->49|970->51|1002->57|1066->96|1103->118|1141->119|1177->129|1226->152|1240->158|1270->168|1320->192|1334->198|1369->213|1426->240|1459->243
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|42->11|43->12
                  -- GENERATED --
              */
          