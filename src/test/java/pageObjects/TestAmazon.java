package pageObjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon extends TestInitPO {

    @Test
    public void checkLogo() {
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

    @Test
    public void checkHeader() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        Assert.assertTrue(amazonHomePage.getLogoImage().isDisplayed());
        Assert.assertTrue(amazonHomePage.getDeliverTo().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearchField().isDisplayed());
        Assert.assertTrue(amazonHomePage.getSearchImageBtn().isDisplayed());
    }

    @Test
    public void cheackSeach() {
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        amazonHomePage.getSearchField().sendKeys("keyboard");
        amazonHomePage.getSearchImageBtn().click();

        AmazonSearchPageResults amazonSearchResultsPage = new AmazonSearchPageResults(driver);
        Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());
    }

    @Override
    public void openFullscreanWindow() {
        super.openFullscreanWindow();
    }

    @Test
    public void checkErroyMsgDisplay(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        amazonHomePage.getAccountLists().click();
        amazonHomePage.getCreateAccount().click();
        amazonHomePage.getYourEmail().sendKeys("bchsbvss");
        amazonHomePage.getMobile().sendKeys("0997777777");
        amazonHomePage.getPassword().sendKeys("123456");
        amazonHomePage.getVerify().click();
        sleep(4);
        Assert.assertTrue(amazonHomePage.getErrorMSG().isDisplayed());
    }
}

