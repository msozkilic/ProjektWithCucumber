package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest"

)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
