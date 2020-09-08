package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class MainPage {

    @FindBy(css = "#block_top_menu>ul>li:nth-child(2)>a")
    private WebElement dresses;

    @FindBy (linkText = "Evening Dresses")
    private WebElement eveningDresses;



    public MainPage() {
        PageFactory.initElements(BaseTest.setUp(), this);
    }

    public MainPage selectEveningDresses() {
        dresses.click();
        return new MainPage();

    }

}
