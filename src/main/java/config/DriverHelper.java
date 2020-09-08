package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverHelper {

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = startDriver();
        }
        return driver;
    }

    private static WebDriver startDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MagdaDziedzic\\Desktop\\Chromedriver\\chromedriver.exe");
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

