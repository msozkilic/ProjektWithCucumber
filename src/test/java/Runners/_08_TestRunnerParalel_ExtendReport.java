package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"html:target//cucumber-reports.html"}
)
public class _08_TestRunnerParalel_ExtendReport extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name","Ahmet Ak");
        ExtentService.getInstance().setSystemInfo("Application Name","Campus");
        //ExtentService.getInstance().setSystemInfo("Operating System Info",System.getProperty());
        ExtentService.getInstance().setSystemInfo("Department","SDET");
        ExtentService.getInstance().setSystemInfo("Ek Satir","Aciklamalar");
    }



}
