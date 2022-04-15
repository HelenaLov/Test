package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestYahooIT extends TestInit {
    String searchEngine = "https://www.yahoo.com/";

    @Test
    public void googleSomeWord() {

        String searchWord = "dogs";
        serch(searchWord);
        sleep(10);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleCats() {
        String searchWord = "cats";
        serch(searchWord);
        sleep(10);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleStraus() {
        String searchWord = "straus";
        serch(searchWord);
        sleep(10);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleHorse() {
        String searchWord = "horse";
        serch(searchWord);
        sleep(10);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    public void serch(String googleWorld) {
        driver.get(searchEngine);
        getElementByXpath("//input[@name='p']").sendKeys(googleWorld + "\n");
    }
}
