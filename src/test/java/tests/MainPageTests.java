package tests;

import org.junit.Test;
import pages.EveningDressesPage;
import pages.MainPage;

public class MainPageTests extends BaseTest {

    @Test
    public void clickOnEveningDresses() {
        MainPage mainPage = new MainPage();
        EveningDressesPage eveningDressesPage = new EveningDressesPage();

        mainPage.selectEveningDresses();
        eveningDressesPage.getTitileOfThePage()
                .changeViewToList()
                .clickOnMoreButton()
                .changeColorToPink()
                .changeSizeToL();
    }
}
