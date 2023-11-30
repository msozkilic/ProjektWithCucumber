package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/"}


        // master report için
)
public class _08_TestRunnerParalel_MasterReport extends AbstractTestNGCucumberTests {
    @BeforeClass(alwaysRun = true) // bazı java versiyon hatalırı için

    @Parameters("browser")
    public void beforeClass(String browser)
    {
        GWD.threadBrowserName.set(browser);
        //burada browser set edilecek
        // bu threade browsername set edildi.
    }

}
