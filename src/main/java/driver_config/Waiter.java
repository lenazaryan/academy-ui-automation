package driver_config;

import org.openqa.selenium.By;
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
            wait.wait(3000L);
        } catch (InterruptedException exception) {
        }
    }

    public static void waitForVisibility(String xpath) {
        setWait(5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
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
