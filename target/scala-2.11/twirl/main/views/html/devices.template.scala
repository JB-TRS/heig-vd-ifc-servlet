
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
            <li><a href="/devices/"""),_display_(/*8.36*/device/*8.42*/.getId()),format.raw/*8.50*/("""">"""),_display_(/*8.53*/device/*8.59*/.getName()),format.raw/*8.69*/("""</a></li>
        </ul>
    """)))}),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""<a href="/">Home</a>
""")))}),format.raw/*13.2*/("""
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
                  DATE: Mon Jun 12 14:35:02 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/devices.scala.html
                  HASH: 076087a029474fc2c675cb4a1822fa8d14184e06
                  MATRIX: 755->1|873->24|903->29|931->49|970->51|1002->57|1066->96|1103->118|1141->119|1177->129|1244->170|1258->176|1286->184|1315->187|1329->193|1359->203|1420->234|1455->242|1508->265
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|39->8|39->8|39->8|41->10|43->12|44->13
                  -- GENERATED --
              */
          