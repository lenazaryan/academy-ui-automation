package page_objects;

import driver_config.DriverConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath="//div[@class='container m-auto-xs col-4-l col-5-m col-10-xs p-h-6-l']")
    private WebElement loginForm;
    @FindBy(xpath="//input[@id='email']")
    private WebElement emailField;
    @FindBy(xpath="//input[@id='password']")
    private WebElement passwordField;
    @FindBy(xpath="//input[@name='commit']")
    private WebElement loginButton;

    public LoginPage(){
        PageFactory.initElements(DriverConfig.getDriver(), this);
    }

    public void fillEmail(String email){
        emailField.sendKeys(email);
    }
    public void fillPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickLogin(){
        loginButton.click();
    }
    public void login(String email, String password){
        fillEmail(email);
        fillPassword(password);
        clickLogin();
    }
}
