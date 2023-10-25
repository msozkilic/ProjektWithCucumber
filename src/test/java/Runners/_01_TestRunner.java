package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"},//todo feature files in path i verilecek
        glue = {"StepDefinations"}     //todo Step denfinetions in klasörü yaziliyor
)

public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
