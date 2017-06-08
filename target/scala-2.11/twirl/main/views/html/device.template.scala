
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

     object device_Scope1 {
import org.w3c.dom.Element

class device extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Seq[Element],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(deviceId: Long, devices: Seq[Element]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.41*/("""


    """),_display_(/*6.6*/main("Device page")/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
        """),format.raw/*7.9*/("""<h1>Equipements: """),_display_(/*7.27*/deviceId),format.raw/*7.35*/("""</h1>

        <ul>
            """),_display_(/*10.14*/devices/*10.21*/.map/*10.25*/ { device =>_display_(Seq[Any](format.raw/*10.37*/("""
                """),format.raw/*11.17*/("""<li>"""),_display_(/*11.22*/device/*11.28*/.getElementsByTagName("name").item(0).getTextContent()),format.raw/*11.82*/("""</li>
                <li>"""),_display_(/*12.22*/device/*12.28*/.getElementsByTagName("ip").item(0).getTextContent()),format.raw/*12.80*/("""</li>
            """)))}),format.raw/*13.14*/("""
        """),format.raw/*14.9*/("""</ul>
    """)))}),format.raw/*15.6*/("""
"""))
      }
    }
  }

  def render(deviceId:Long,devices:Seq[Element]): play.twirl.api.HtmlFormat.Appendable = apply(deviceId,devices)

  def f:((Long,Seq[Element]) => play.twirl.api.HtmlFormat.Appendable) = (deviceId,devices) => apply(deviceId,devices)

  def ref: this.type = this

}


}
}

/**/
object device extends device_Scope0.device_Scope1.device
              /*
                  -- GENERATED --
                  DATE: Thu Jun 08 15:04:42 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/device.scala.html
                  HASH: 55ec2e06955880f3f6bc267c0a12085b5de236ed
                  MATRIX: 814->32|948->71|984->82|1011->101|1050->103|1086->113|1130->131|1158->139|1221->175|1237->182|1250->186|1300->198|1346->216|1378->221|1393->227|1468->281|1523->309|1538->315|1611->367|1662->387|1699->397|1741->409
                  LINES: 30->3|35->3|38->6|38->6|38->6|39->7|39->7|39->7|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|44->12|44->12|44->12|45->13|46->14|47->15
                  -- GENERATED --
              */
          