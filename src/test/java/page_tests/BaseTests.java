package page_tests;

import driver_config.DriverConfig;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {

    @BeforeClass
    public void setup(){
        DriverConfig.driverSetUp();
    }

    @AfterClass
    public void tearDown(){
        DriverConfig.driverQuit();
    }
}
