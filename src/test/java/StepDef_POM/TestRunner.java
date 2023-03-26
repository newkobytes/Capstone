package StepDef_POM;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features="src/test/java/feature" ,
glue= "StepDef_POM"
)

public class TestRunner {

	
	
}
