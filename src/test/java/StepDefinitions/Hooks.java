package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {
    @Before
    public void before() {
        System.out.println("Senaryo basladi");
    }

    @After
    public void after(Scenario scenario) {
        //todo ekran görüntüsü burada al,senaryo hatali ise.
        System.out.println("Senaryo bitti");
        System.out.println("senaryonun sonucu= " + scenario.getStatus());
        System.out.println("senaryo failed= " + scenario.isFailed());

        //Excele sonuclari yazdiracagiz,scenario,browserTipi,zaman,
        LocalDateTime date = null;
        DateTimeFormatter formatter = null;

        ExcelUtility.writeExcel("src/test/java/ApachiPOI/resource/ScenarioStatus.xlsx",
                scenario, GWD.threadBrowserName.get(), date.format(formatter));


        date = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("dd.MM.yy");


        if (scenario.isFailed()) {
            // SenaryoAdı202001011000
            String scenarioName = scenario.getName();

            TakesScreenshot screenshot = (TakesScreenshot) GWD.getDriver();
            File ekranDosyasi = screenshot.getScreenshotAs(OutputType.FILE);
            // ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());

            try {
                FileUtils.copyFile(ekranDosyasi,
                        new File("target/FailedScreenShots/" +
                                scenario.getId() + date.format(formatter) + ".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // en son çıkmadan ekranı görelim diye bilerek koyduk
        // çalışma mantığı ile ilgilis yok.
        GWD.quitDriver();
    }
    public String getBase64Screenshot() {
        return ((TakesScreenshot) GWD.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
