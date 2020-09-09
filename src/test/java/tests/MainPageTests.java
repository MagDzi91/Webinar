package tests;

import org.junit.Test;
import pages.MainPage;

public class MainPageTests extends BaseTest {

    @Test
    public void clickOnEveningDresses() {
        MainPage mainPage = new MainPage();

        mainPage.selectEveningDresses()
                .getTitileOfThePage()
                .changeViewToList()
                .clickOnMoreButton()
                .changeColorToPink()
                .changeSizeToL();
    }

}
