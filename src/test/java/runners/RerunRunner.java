package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//publish=true is used to generate readable cloud report
		publish=true,
		//if we want to run only the failed scenarios which are mentioned in failed_scenarios.txt file we have to mention the file location in features file
		features = "@target/failed_scenarios.txt",
		glue = {"stepDefs"},
		//to get better console readable output - monochrome
		monochrome = true,
		//without testcases we want to verify the execution.- dryRun
//		dryRun=false,
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

public class RerunRunner {

}
