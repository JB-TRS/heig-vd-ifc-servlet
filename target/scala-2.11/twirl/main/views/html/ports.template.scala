
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

class ports extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Port],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ports: List[Port]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/main("Ports page")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<h1>Liste des ports</h1>

    """),_display_(/*6.6*/for(port <- ports) yield /*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
        """),format.raw/*7.9*/("""<ul>
            <li>"""),_display_(/*8.18*/port/*8.22*/.getName()),format.raw/*8.32*/("""</li>
            <li>"""),_display_(/*9.18*/port/*9.22*/.getIn()),format.raw/*9.30*/("""</li>
            <li>"""),_display_(/*10.18*/port/*10.22*/.getOut()),format.raw/*10.31*/("""</li>
        </ul>
    """)))}),format.raw/*12.6*/("""
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(ports:List[Port]): play.twirl.api.HtmlFormat.Appendable = apply(ports)

  def f:((List[Port]) => play.twirl.api.HtmlFormat.Appendable) = (ports) => apply(ports)

  def ref: this.type = this

}


}

/**/
object ports extends ports_Scope0.ports
              /*
                  -- GENERATED --
                  DATE: Fri Jun 09 15:33:01 CEST 2017
                  SOURCE: C:/Users/eischer/IdeaProjects/switchmonitor/app/views/ports.scala.html
                  HASH: 66442c2e4b4785b77c0a2f985601ad2939552f49
                  MATRIX: 749->1|863->20|893->25|919->43|958->45|990->51|1048->84|1081->102|1119->103|1155->113|1204->136|1216->140|1246->150|1296->174|1308->178|1336->186|1387->210|1400->214|1430->223|1487->250|1520->253
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|44->13
                  -- GENERATED --
              */
          