package UnitJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

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
    @Test
    public void doitgoogle() {
        String googleSearch = "https://www.google.com.ua";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(googleSearch);

        List<String> wordsToCheck = Arrays.asList("Cats", "Dogs", "Straus", "bear", "chick", "bee", "bird", "stork",
                "turkey", "goose", "swan", "cock", "falcon", "flamingo", "magpie", "sheep", "lamb", "pig", "rabbit",
                "lion", "panda", "puma", "tiger", "zebra", "raccoon", "monkey", "panther", "leopard", "giraffe",
                "elephant", "deer", "lynx", "yak", "bat", "parrot");

        for (String word : wordsToCheck) {
            driver.findElement(By.xpath("//input[@name='q']")).sendKeys(word + "\n");
            new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains(word));
            Assert.assertTrue(driver.getCurrentUrl().contains(word));
            driver.get(googleSearch);
        }
    }

}