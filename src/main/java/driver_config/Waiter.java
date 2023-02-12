package driver_config;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {
    static WebDriverWait wait;

    public static void setWait(int sec) {
        wait = new WebDriverWait(DriverConfig.getDriver(), Duration.ofSeconds(sec));
        try {
            wait.wait();
        } catch (InterruptedException exception) {
        }
    }

    public static boolean waitForVisibility(WebElement webElement) {
        setWait(5);
        try {
            wait.until(ExpectedConditions.visibilityOf(webElement));
            return true;
        } catch (TimeoutException exception) {
            return false;
        }
    }

    public void waitUntilElementIsClickable(WebElement webElement){
        setWait(5);
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
