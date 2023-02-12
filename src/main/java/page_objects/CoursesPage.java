package page_objects;

import driver_config.DriverConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesPage {
    @FindBy(xpath="//span[@class='navbar-current-user']")
    private WebElement currentUserNavbar;
    @FindBy(xpath="//div[@title='All-Access Membership']")
    private WebElement allAccess;
    @FindBy(xpath="//a[@href='/p/get-access-to-all-courses']//div[@class='col-lg-12']//div[@class='course-box-image-container']//img[@role='presentation']")
    private WebElement allAccessMembership;
    public CoursesPage(){
        PageFactory.initElements(DriverConfig.getDriver(), this);
    }


    public String getURL(){
        return DriverConfig.getDriver().getCurrentUrl();
    }

}
