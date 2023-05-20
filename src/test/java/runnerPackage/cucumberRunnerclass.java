package runnerPackage;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resource/cucumberD"},
plugin = {"json:target/cucumber.json"},
glue = "StepDeffiniation")//tags = {"@Sanity"})



public class cucumberRunnerclass extends AbstractTestNGCucumberTests{

}
