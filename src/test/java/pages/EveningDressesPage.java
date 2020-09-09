package pages;

import config.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EveningDressesPage {

    @FindBy(css = "i.icon-th-list")
    private WebElement listView;

    @FindBy(css = "div.button-container.col-xs-7 > a:nth-child(2) >span")
    private WebElement moreButton;

    @FindBy(css = "a#color_24")
    private WebElement pinkColor;

    @FindBy(css = "select#group_1")
    private WebElement size;

    public EveningDressesPage() {
        PageFactory.initElements(DriverHelper.getDriver(), this);
    }


    public EveningDressesPage getTitileOfThePage() {
        System.out.println( DriverHelper.getDriver().getTitle());
        return new EveningDressesPage();
    }

    public EveningDressesPage changeViewToList() {
        listView.click();
        return new EveningDressesPage();

    }

    public EveningDressesPage clickOnMoreButton() {
        moreButton.click();
        return new EveningDressesPage();
    }

    public EveningDressesPage changeColorToPink() {
        pinkColor.click();
        return new EveningDressesPage();

    }

    public EveningDressesPage changeSizeToL() {
        Select sizeSelect = new Select(size);
        sizeSelect.selectByValue("3");
        return new EveningDressesPage();
    }
}
