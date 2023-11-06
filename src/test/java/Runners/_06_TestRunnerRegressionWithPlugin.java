package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest"
)
public class _06_TestRunnerRegressionWithPlugin extends AbstractTestNGCucumberTests {
}
