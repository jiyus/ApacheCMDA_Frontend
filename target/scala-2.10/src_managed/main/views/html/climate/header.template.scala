
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
    def apply/*18.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.4*/("""
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0;" href="/climate"><img
					src='"""),_display_(Seq[Any](/*29.12*/routes/*29.18*/.Assets.at("images/logo.png"))),format.raw/*29.47*/("""' style="height: 15px; width: 250px;"></a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<form class="navbar-form navbar-right" role="register">
					<button type="submit" class="btn btn-default"><a href=""""),_display_(Seq[Any](/*33.62*/routes/*33.68*/.Application.sign())),format.raw/*33.87*/("""">Sign up</a></button>
				</form>
				

				<ul class="nav navbar-nav navbar-right">
					<form class="navbar-form navbar-right" role="sign">
						<div class="form-group">
							<input class="form-control" id="ex1" type="text"  placeholder="Username">
							<input type="text" class="form-control" placeholder="Password">
						</div>
						<button type="submit" class="btn btn-default">Login</button>
					</form>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Service<b
							class="caret"></b></a>
						<ul class="dropdown-menu">

						<li><a href=""""),_display_(Seq[Any](/*50.21*/routes/*50.27*/.ClimateServiceController.climateServices())),format.raw/*50.70*/("""">Service List</a></li>
					
						</ul>
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Dataset<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						
						<li><a href=""""),_display_(Seq[Any](/*59.21*/routes/*59.27*/.DatasetController.datasetList())),format.raw/*59.59*/("""">Dataset List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*60.21*/routes/*60.27*/.DatasetController.searchDataset())),format.raw/*60.61*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*63.42*/("""
						"""),format.raw/*64.67*/("""
							"""),format.raw/*65.34*/("""
						"""),format.raw/*66.37*/("""
							"""),format.raw/*67.101*/("""
							"""),format.raw/*68.106*/("""
						"""),format.raw/*69.16*/("""
					"""),format.raw/*70.15*/("""
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">About<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*76.21*/routes/*76.27*/.ClimateServiceController.home())),format.raw/*76.59*/("""">Home</a></li>
						<li><a href=""""),_display_(Seq[Any](/*77.21*/routes/*77.27*/.AboutusController.aboutUs())),format.raw/*77.55*/("""">About Us</a></li>
						<li><a href=""""),_display_(Seq[Any](/*78.21*/routes/*78.27*/.AboutusController.aboutProject())),format.raw/*78.60*/("""">About project</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 06 17:00:42 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/ApacheCMDA-master/ApacheCMDA_Frontend/app/views/climate/header.scala.html
                    HASH: fdc37bed24eb88d97f9e4d6bb420d7add385ee9d
                    MATRIX: 3171->1205|3267->1207|3799->1703|3814->1709|3865->1738|4133->1970|4148->1976|4189->1995|4829->2599|4844->2605|4909->2648|5189->2892|5204->2898|5258->2930|5338->2974|5353->2980|5409->3014|5491->3104|5526->3171|5562->3205|5597->3242|5634->3343|5671->3449|5706->3465|5740->3480|5965->3669|5980->3675|6034->3707|6106->3743|6121->3749|6171->3777|6247->3817|6262->3823|6317->3856
                    LINES: 56->18|59->18|70->29|70->29|70->29|74->33|74->33|74->33|91->50|91->50|91->50|100->59|100->59|100->59|101->60|101->60|101->60|104->63|105->64|106->65|107->66|108->67|109->68|110->69|111->70|117->76|117->76|117->76|118->77|118->77|118->77|119->78|119->78|119->78
                    -- GENERATED --
                */
            