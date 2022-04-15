package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchBing extends TestInit {
    String searchEngine = "https://www.bing.com";

    @Test
    public void googleSomeWord() {
        String searchWord = "dogs";
        serch(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleCats() {
        String searchWord = "cats";
        serch(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleStraus() {
        String searchWord = "straus";
        serch(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleHorse() {
        String searchWord = "horse";
        serch(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
}
