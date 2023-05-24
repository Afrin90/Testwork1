package Contact_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Feature1"},
plugin = {"json:target/cucumber.json"},
glue = "Step_contact")//tags = {"@Sanity"})

public class Runner2  extends AbstractTestNGCucumberTests {

}
