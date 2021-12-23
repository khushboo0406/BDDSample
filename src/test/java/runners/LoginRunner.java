package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="src//test//resources//CRMFeatures//Login.feature",
		glue={"stepDefs"},
		monochrome=true
		)
public class LoginRunner {

}
