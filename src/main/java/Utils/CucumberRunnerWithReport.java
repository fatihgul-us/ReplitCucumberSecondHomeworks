package Utils;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = "StepFiles",
        plugin = {"html:target/cucumber_report", "pretty"}
)
public class CucumberRunnerWithReport extends AbstractTestNGCucumberTests {

    //extends AbstractTestNGCucumberTests
}
