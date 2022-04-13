package UnitJava;

import org.testng.annotations.Test;
import pageObjects.GoogleHomePage;

public class TestWebDriwer extends TestInit {

    @Test
    public void runGoogle() {
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchField().sendKeys("dogs\n");
        googleHomePage.getSearchField().click();
    }

    @Test
    public void clickEnterBtn() {
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getEnterBtn().click();
    }

    public void goToGoogle() {
        driver.get("https://www.google.com.ua/");
    }
}
