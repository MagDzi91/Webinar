package Webinar12;

import config.DriverHelper;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    public WebDriver driver;

    @Before
    public void setUp() {
       this.driver = DriverHelper.getDriver();
    }

    @After
    public void cleanUp() {
        DriverHelper.closeDriver();
    }
}
