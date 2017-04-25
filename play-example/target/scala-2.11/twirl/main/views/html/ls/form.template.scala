
package views.html.ls

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object form_Scope0 {
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

class form extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[LsData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lsForm: Form[LsData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*3.1*/("""<h1>ls form</h1>

"""),_display_(/*5.2*/flash/*5.7*/.getOrDefault("success", "")),format.raw/*5.35*/("""

"""),_display_(/*7.2*/helper/*7.8*/.form(action = routes.LsController.lsPost())/*7.52*/ {_display_(Seq[Any](format.raw/*7.54*/("""
  """),_display_(/*8.4*/helper/*8.10*/.CSRF.formField),format.raw/*8.25*/("""
  """),_display_(/*9.4*/helper/*9.10*/.inputText(lsForm("name"))),format.raw/*9.36*/("""
  """),_display_(/*10.4*/helper/*10.10*/.inputText(lsForm("age"))),format.raw/*10.35*/("""
  """),format.raw/*11.3*/("""<input type="submit" value="submit"/>
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(lsForm:Form[LsData]): play.twirl.api.HtmlFormat.Appendable = apply(lsForm)

  def f:((Form[LsData]) => play.twirl.api.HtmlFormat.Appendable) = (lsForm) => apply(lsForm)

  def ref: this.type = this

}


}

/**/
object form extends form_Scope0.form
              /*
                  -- GENERATED --
                  DATE: Thu Apr 20 17:18:15 CDT 2017
                  SOURCE: /Users/nickwhite/Google Drive/Current Classes/461L Software Design Lab/Team Project/Wingspan/play-example/app/views/ls/form.scala.html
                  HASH: baf80979a6ae8882ef62808e1a58d34ae2d4322a
                  MATRIX: 752->1|869->23|897->25|941->44|953->49|1001->77|1029->80|1042->86|1094->130|1133->132|1162->136|1176->142|1211->157|1240->161|1254->167|1300->193|1330->197|1345->203|1391->228|1421->231|1490->270
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|38->7|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12
                  -- GENERATED --
              */
          