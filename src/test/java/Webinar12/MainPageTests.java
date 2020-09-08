package Webinar12;

import pages.MainPage;
import org.junit.Test;

public class MainPageTests extends BaseTest {

    @Test
    public void clickOnEveningDresses() {
        MainPage mainPage = new MainPage();
        mainPage.selectEveningDresses();

    }



}
