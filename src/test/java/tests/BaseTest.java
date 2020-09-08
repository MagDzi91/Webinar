package tests;

import config.DriverHelper;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class BaseTest {

    public WebDriver driver;

    @Before
    public void setup() {
        this.driver = DriverHelper.getDriver();
    }

    @After
    public void cleanUp() {
        DriverHelper.closeDriver();
    }
}