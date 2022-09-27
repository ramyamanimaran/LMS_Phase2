
package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
       (
		features=".//Features",
		glue= "stepDefinitions",
		dryRun=false,
		monochrome = true,
			plugin = {"pretty", 
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"html:target/html-reports/reports.html"}
							
		)


public class TestRun 
{

}













/*package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
       (
		features=".//Features/UserPage.feature",
		glue= "stepDefinitions",
		
		dryRun=false,
		monochrome = true,
		plugin = {"pretty","html:target/html-reports/reports.html"}
							
		)


public class TestRun 
{

}

*/




/*package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions
(
features = {"src/test/resources/Features"}, 
plugin = {"pretty"
		
		, "junit:target/cucumber-reports/Cucumber.xml"
		}, 
monochrome=true, 
//tags = "@Manageuserpage", 
//tags="@PageHeading", 
tags="@l1",
//tags="@array",
//tags="@linkedlist",
//tags="@stack",
//tags="@tree",
//tags="@graph",
//tags="@datastructure",
publish=true,
glue= {"stepDefinitions"},
dryRun=false)

public class testRun {

}



package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions
(
features = {"src/test/resources/Features"}, 
plugin = {"pretty", 
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		//"html:target/cucumber.html",
		//"junit: target/JunitReports/report.xml",
		//"json:target/cucumber-report/cucumber.json" 
		}, 


monochrome=true, 
//tags = "@Login", 
//tags="@Footer",
//tags ="@Delete",
//tags ="@NRecords",
//tags="@Sprogram",
//tags="@edit1",
tags = "@Page1",
//tags="@Delete1",
//tags="@Ascending1",
//tags="@Descending",
//tags="@ANewP1",
//tags="@MultiDele1",
publish=true,
glue= {"stepDefinations"},
dryRun=false)

public class testRun  {

}

*/