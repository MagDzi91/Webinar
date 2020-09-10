package pages;

import config.DriverHelper;
import config.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class MainPage {

    @FindBy(css = "#block_top_menu>ul>li:nth-child(2)>a")
    private WebElement dresses;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    private WebElement eveningDresses;


    public MainPage() {
        PageFactory.initElements(DriverHelper.getDriver(), this);
    }

    public MainPage selectEveningDresses() {
        Actions actions = new Actions(DriverHelper.getDriver());
        actions.moveToElement(dresses).build().perform();
        WaitHelper.waitForVisibility(eveningDresses);
        eveningDresses.click();
        return new MainPage();
    }


}

