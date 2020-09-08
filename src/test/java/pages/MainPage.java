package pages;

import config.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {

    @FindBy(css = "#block_top_menu>ul>li:nth-child(2)>a")
    private WebElement dresses;

    @FindBy (linkText = "Evening Dresses")
    private WebElement eveningDresses;



    public MainPage() {
        PageFactory.initElements(DriverHelper.getDriver(), this);
    }

    public void selectEveningDresses() {
        dresses.click();
    }

}
