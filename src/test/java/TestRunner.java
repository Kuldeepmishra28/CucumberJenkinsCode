
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/cucumberSpec/features",
		glue="cucumberSpec.StepDefinitions",
		plugin= {"pretty","html:testResults/results.html"},
		publish=true)
		


public class TestRunner {

}
