package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;

public class BaseTest {

    static WebDriver driver;

    @BeforeTest
    public static WebDriver setUp() {
        if (driver == null) {
            driver = startDriver();
        }
        return driver;
    }

    private static WebDriver startDriver() {
        ClassLoader classLoader = BaseTest.class.getClassLoader();
        String chromeDriverPath = classLoader.getResource("chromedriver.exe").getFile();

        File chromeDriver = new File(chromeDriverPath);

        System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        return driver;
    }

    @AfterTest
    public static void tearDown() {
        driver.close();
        driver.quit();
        driver =null;
    }

}
