package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//publish=true is used to generate readable cloud report
		publish=true,
		features = "src//test//resources//features//Googlesearch.feature",
		glue = {"stepDefs"},
		//to get the readable console output 
		monochrome = true,
		//dryRun will just verify the stepdef and feature implementation of all the steps. If not same it will show error. drRun will not execute all the testcases it will just verify.
//		dryRun=false,
		//some steps may take longer time to execute , if we know the time period in detail. then use the usage plugin.
		//usage we have to give the path where we need to store the output.
		plugin = {"pretty",
//				  "usage:target/reports/usageReports",
//				  "json:target/reports/jsonReport.json",
				  "html:target/reports/htmlReport.html",
//				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				  "junit:target/reports/junitReports.xml"
				  //rerun is a plugin which will generate a file of a failed scenarios those will be tracked in the file 
				  //this file will contain the locator of the failed scenario
				  "rerun:target/failed_scenarios.txt"
				}
		)
public class GooglePageRunner {
	
	

}
