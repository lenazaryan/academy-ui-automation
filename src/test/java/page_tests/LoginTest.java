package page_tests;

import data_provider.TestData;
import driver_config.DriverConfig;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page_objects.LoginPage;

public class LoginTest extends BaseTests{
    final String LOGIN_PAGE_URL = "https://sso.teachable.com/secure/9521/identity/login/password";
    @BeforeMethod
    public void navigateToLoginPage(){
        DriverConfig.getDriver().get(LOGIN_PAGE_URL);
    }

    @Test(dataProvider = "loginData", dataProviderClass = TestData.class)
    public void loginTestInvalidCredentials(String email, String password){
        LoginPage loginPage = new LoginPage();
        loginPage.fillEmail(email);
        loginPage.fillPassword(password);
        loginPage.clickLogin();
        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue();
        softAssert.assertAll();
    }
}
