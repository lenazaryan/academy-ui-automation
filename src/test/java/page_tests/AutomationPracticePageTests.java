package page_tests;

import driver_config.DriverConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.BasePage;
import page_objects.CoursesPage;
import page_objects.HomePage;

public class AutomationPracticePageTests extends BaseTests{
    final String BASE_URL = "https://rahulshettyacademy.com/AutomationPractice/";
    @BeforeMethod
    public void navigateToBasePage(){
        DriverConfig.getDriver().get(BASE_URL);
    }
    @Test
    public void testNavigateToHomePage(){
        BasePage basePage = new BasePage();
        HomePage homePage = basePage.clickHomeButton();
        Assert.assertEquals(homePage.getTitleOfHomePage(),
                "Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy",
                "HomePage Title not found");                                                                         //text in <span> but not text between <span> tags
    }

    @Test
    public void testNavigateToCoursesPage() throws InterruptedException {
        BasePage basePage = new BasePage();
        HomePage homePage = basePage.clickHomeButton();
        CoursesPage coursesPage = homePage.navigateToCoursesPage();
        Assert.assertEquals(coursesPage.getURL(), "https://courses.rahulshettyacademy.com/courses",
                "Incorrect text!");
    }

    @Test
    public void testSelectDropdownOption(){
        BasePage basePage = new BasePage();
        String option = basePage.selectDropdownByValue("option1");
        Assert.assertEquals(option, "Option1", "Incorrect Value");
    }


}
