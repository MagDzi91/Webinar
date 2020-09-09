package pages;

import config.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class MainPage {

    @FindBy(css = "#block_top_menu>ul>li:nth-child(2)>a")
    private WebElement dresses;

    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    private WebElement eveningDresses;

//    @FindBy(css = "i.icon-th-list")
//    private WebElement listView;
//
//    @FindBy(css = "div.button-container.col-xs-7 > a:nth-child(2) >span")
//    private WebElement moreButton;
//
//    @FindBy(css = "a#color_24")
//    private WebElement pinkColor;
//
//    @FindBy(css = "select#group_1")
//    private WebElement size;



    public MainPage() {
        PageFactory.initElements(DriverHelper.getDriver(), this);
    }

    public MainPage selectEveningDresses() {
        Actions actions = new Actions(DriverHelper.getDriver());
        actions.moveToElement(dresses).build().perform();
        eveningDresses.click();
        return new MainPage();
        }

//        public MainPage getTitileOfThePage() {
//            System.out.println( DriverHelper.getDriver().getTitle());
//            return new MainPage();
//        }
//
//        public MainPage changeViewToList() {
//        listView.click();
//        return new MainPage();
//
//        }
//
//        public MainPage clickOnMoreButton() {
//        moreButton.click();
//        return new MainPage();
//        }
//
//        public MainPage changeColorToPink() {
//        pinkColor.click();
//        return new MainPage();
//
//        }
//
//        public MainPage changeSizeToL() {
//            Select sizeSelect = new Select(size);
//            sizeSelect.selectByValue("3");
//            return new MainPage();
//        }
    }

