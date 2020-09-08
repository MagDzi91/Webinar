package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DriverHelper {

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = startDriver();
        }
        return driver;
    }

    private static WebDriver startDriver() {
        ClassLoader classLoader = DriverHelper.class.getClassLoader();
        String chromeDriverPath = classLoader.getResource("chromedriver.exe").getFile();

        File chromeDriver = new File(chromeDriverPath);

        System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver() {
        driver.close();
        driver.quit();
        driver = null;
    }
}

