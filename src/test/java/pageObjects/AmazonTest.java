package pageObjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends TestInitPO {

    @Test
    public void checkHeader() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        openURL("https://www.amazon.com/");
        Assert.assertTrue(amazonHomePage.getLogoImage().isDisplayed());
    }

    @Test
    public void checkCard() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        openURL("https://www.amazon.com/");
        Assert.assertTrue(amazonHomePage.getCartAmazon().isDisplayed());
    }
}
