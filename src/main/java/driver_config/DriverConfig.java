package driver_config;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverConfig {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }
    public static WebDriver driverSetUp(){
        if (driver == null) {
            ChromeOptions chromeOptions = new ChromeOptions();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
            chromeOptions.addArguments("disable-infobars");
            chromeOptions.addArguments("--disable-extensions");
            chromeOptions.setAcceptInsecureCerts(true);
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
        }
        return driver;
    }

    public static void driverQuit(){
        driver.quit();
        driver = null;
    }
}
