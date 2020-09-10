package config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class WaitHelper {

    public static void implicitlyWait() {
        DriverHelper.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverHelper.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
}
