
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,List[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(email: String, vfile: String, dataset: String, climateServices: List[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*18.97*/("""

"""),format.raw/*21.1*/("""
"""),_display_(Seq[Any](/*22.2*/main("Home")/*22.14*/ {_display_(Seq[Any](format.raw/*22.16*/("""

<div class="jumbotron">
	<div class="row">

		<div class="col-lg-5">
			</br></br>
			<img src="/assets/images/iceberg.jpg" height="400" width="400" />
		</div>
		<div class="col-lg-6">
			<h2>Climate Service List</h2>
			"""),_display_(Seq[Any](/*33.5*/for(climateService <- climateServices) yield /*33.43*/{_display_(Seq[Any](format.raw/*33.44*/("""
				<li><a href = """"),_display_(Seq[Any](/*34.21*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*34.90*/(""""><font size="3">"""),_display_(Seq[Any](/*34.108*/climateService/*34.122*/.getClimateServiceName())),format.raw/*34.146*/("""</a></font></li>
			""")))})),format.raw/*35.5*/("""
			<p> Our website is to provide your a quick and easy way to search the
				<b>Climate Service</b> you want.
			</p>
			
			<!-- """),_display_(Seq[Any](/*40.10*/if(!session.get("username"))/*40.38*/{_display_(Seq[Any](format.raw/*40.39*/(""" -->
			
			<p>
				"""),_display_(Seq[Any](/*43.6*/if(false)/*43.15*/{_display_(Seq[Any](format.raw/*43.16*/(""" <a class="btn btn-primary" href="climate/register"
					role="button">Register &raquo;</a> """)))})),format.raw/*44.42*/("""
			</p>
			<!-- """)))})),format.raw/*46.10*/(""" -->
		</div>
	</div>
</div>

""")))})),format.raw/*51.2*/("""
"""))}
    }
    
    def render(email:String,vfile:String,dataset:String,climateServices:List[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(email,vfile,dataset,climateServices)
    
    def f:((String,String,String,List[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (email,vfile,dataset,climateServices) => apply(email,vfile,dataset,climateServices)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 06 17:00:42 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/ApacheCMDA-master/ApacheCMDA_Frontend/app/views/climate/home.scala.html
                    HASH: 7fc5b3275f78ad4cf433d91d9ce5d3384bab24a3
                    MATRIX: 3220->1205|3427->1300|3456->1320|3493->1322|3514->1334|3554->1336|3814->1561|3868->1599|3907->1600|3964->1621|4055->1690|4110->1708|4134->1722|4181->1746|4233->1767|4401->1899|4438->1927|4477->1928|4533->1949|4551->1958|4590->1959|4715->2052|4765->2070|4827->2101
                    LINES: 56->18|60->18|62->21|63->22|63->22|63->22|74->33|74->33|74->33|75->34|75->34|75->34|75->34|75->34|76->35|81->40|81->40|81->40|84->43|84->43|84->43|85->44|87->46|92->51
                    -- GENERATED --
                */
            