package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		//features="src//test//resources//taggedFeatures//ModuleOne.feature",
		//features at folder level when we have to execute multiple feature file from the same folder.
		features="src//test//resources//taggedFeatures//",
		glue={"stepDefs"},
		monochrome=true,
		//tags="@RegressionTest"
		//tags="@SmokeTest"
		
		//if we want to execute both the scenario regression and smoke test.
		tags="@RegressionTest or @SmokeTest"
		
		//if we want to execute both the scenario regression and smoke test AND RegressionTestOne.
		//tags="@RegressionTest or @SmokeTest or @RegressionTestOne"
		
		//and is used when that scenario is to be included in both regression and smoke test.
		//tags="@RegressionTest and @SmokeTest"
		
		//other than smoke test want to execute all the scenarios.
		//tags="not @SmokeTest"
		
		//Selecting from features level 
		//when we are selecting one feature all the scenarios are applicable.
		//tags="@PhaseOne"
		
		//when want to select one feature and ony specific test from that feature file
		//tags="@PhaseOne and @RegressionTest"

		
		//All the scenarios from phaseOne with regressiontest and phaseTwo with smokeTest
		//tags="@PhaseOne and @RegressionTest or @PhaseTwo and @SmokeTest"
		)

public class TaggedRunner {


}
