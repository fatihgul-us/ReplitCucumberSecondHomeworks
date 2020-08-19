package RunnerClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {"html:target/Reports"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepFiles"},
        dryRun = false
)
public class RunnerAll extends AbstractTestNGCucumberTests {

}
