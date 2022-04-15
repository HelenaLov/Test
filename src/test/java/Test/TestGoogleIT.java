package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogleIT extends TestInit {
    String serchEngine = "https://www.google.com.ua/";

    @Test
    public void googleSomeWord() {
        String searchWord = "dogs";
        serch(searchWord, serchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleCats() {
        String searchWord = "cats";
        serch(searchWord, serchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleStraus() {
        String searchWord = "straus";
        serch(searchWord, serchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleHorse() {
        String searchWord = "horse";
        serch(searchWord, serchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));

    }

    @Test
    public void googleBear() {
        String searchWord = "bear";
        serch(searchWord, serchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));

    }

    @Test
    public void googleChick() {
        String searchWord = "chick";
        serch(searchWord, serchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
}