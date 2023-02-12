package page_objects;

import driver_config.DriverConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//a[normalize-space()='Login']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='nav-outer clearfix']//a[normalize-space()='Courses']")
    private WebElement coursesButton;


    public HomePage() {
        PageFactory.initElements(DriverConfig.getDriver(), this);
    }

    public String getTitleOfHomePage(){
        return DriverConfig.getDriver().getTitle();
    }

    public CoursesPage navigateToCoursesPage(){
        coursesButton.click();
        return new CoursesPage();
    }
    public LoginPage clickLogin(){
        loginButton.click();
        return new LoginPage();
    }
}
