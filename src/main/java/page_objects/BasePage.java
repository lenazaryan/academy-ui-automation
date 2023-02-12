package page_objects;

import driver_config.DriverConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    @FindBy(id="coursesFrame")
    private WebElement iframe;
    @FindBy(xpath = "/html/body/header/div/a/button")
    private WebElement homeButton;

    @FindBy(linkText = "Courses")
    private WebElement coursesLink;

    @FindBy(xpath = "//select[@id='dropdown-class-example']")
    private WebElement dropdown;

    public BasePage() {
        PageFactory.initElements(DriverConfig.getDriver(), this);
    }


    public HomePage clickHomeButton(){
        homeButton.click();
        return new HomePage();
    }

    public String selectDropdownByValue(String value){
        Select select = new Select(dropdown);
        select.selectByValue(value);
        return new Select(dropdown).getFirstSelectedOption().getText().trim();
    }

}
