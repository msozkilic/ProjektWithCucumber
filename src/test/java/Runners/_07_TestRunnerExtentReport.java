package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;


@CucumberOptions(

        features = {"src/test/java/FeatureFiles"},
        tags = "@SmokeTest",
        glue = {"StepDefinitions"})

@Listeners({ExtentITestListenerClassAdapter.class})
public class _07_TestRunnerExtentReport extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name","Serkan Kilic");
        ExtentService.getInstance().setSystemInfo("Application Name","Campus");
        //ExtentService.getInstance().setSystemInfo("Operating System Info",System.getProperty());
        ExtentService.getInstance().setSystemInfo("Department","QA");



    }
}

