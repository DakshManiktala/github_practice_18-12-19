package Cucum_package_3;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature88"
		,glue={"step_definition_3"}
		)

public class Test_runner_3 {

}