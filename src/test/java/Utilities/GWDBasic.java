package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.slf4j.impl.SimpleLogger;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWDBasic {
    private static WebDriver driver;
    public static WebDriver getDriver() {



        if (driver == null) {
            Locale.setDefault(new Locale("EN"));//todo dille cikan problemleri hallediyor
            System.setProperty("user.language","EN");

            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(ChromeDriverService.CHROME_DRIVER_APPEND_LOG_PROPERTY, "true");
            System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            //todo firefox
            // WebDriverManager.firefoxdriver().setup();
            //driver=new FirefoxDriver();
        }
        return driver;

    }

    public static void quitDriver() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null)
            driver.quit();
        driver = null;
    }

    public static void Bekle(int saniye) {

        try {
            Thread.sleep(saniye+5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }

    }
}
