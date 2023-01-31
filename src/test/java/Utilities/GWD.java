package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.impl.SimpleLogger;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import static Utilities.GWDBasic.Bekle;

public class GWD {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();//WebDriver1,WebDriver 2
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        Locale.setDefault(new Locale("EN"));//todo dille cikan problemleri hallediyor
        System.setProperty("user.language", "EN");
        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if(threadBrowserName.get()==null)//paralel calismayan yani xmlden parametreyle gelmeyen
            threadBrowserName.set("chrome");

        if (threadDriver.get() == null) {

            String browserName = threadBrowserName.get();
            switch (browserName) {
                case "chrome":
                    System.setProperty(ChromeDriverService.CHROME_DRIVER_APPEND_LOG_PROPERTY, "true");
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
                    break;
                case "firefox":
                    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new FirefoxDriver());
                case "safari":

                    WebDriverManager.safaridriver().setup();
                    threadDriver.set(new SafariDriver());
                case "edge":

                    WebDriverManager.edgedriver().setup();
                    threadDriver.set(new EdgeDriver());
                    break;
            }
            return threadDriver.get();
        }

    public static void quitDriver() {

            Bekle(5);

            if (threadDriver.get() != null) {
                threadDriver.get().quit();

                WebDriver driver = threadDriver.get();
                driver = null;
                threadDriver.set(driver);
            }
        }

        public static void Bekle(int saniye){

            try {
                Thread.sleep(saniye + 5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }

        }
    }
}
