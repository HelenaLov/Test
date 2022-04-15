package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestListForMasuv {

    WebDriver driver;

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

    @Test
    public void doitbing() {
        String bingSearch = "https://www.bing.com";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(bingSearch);

        List<String> wordsToCheck = Arrays.asList("Cats", "Dogs", "Straus", "bear", "chick", "bee", "bird", "stork",
                "turkey", "goose", "swan", "cock", "falcon", "flamingo", "magpie", "sheep", "lamb", "pig", "rabbit",
                "lion", "panda", "puma", "tiger", "zebra", "raccoon", "monkey", "panther", "leopard", "giraffe",
                "elephant", "deer", "lynx", "yak", "bat", "parrot");

        for (String word : wordsToCheck) {
            driver.findElement(By.xpath("//input[@name='q']")).sendKeys(word + "\n");
            new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains(word));
            Assert.assertTrue(driver.getCurrentUrl().contains(word));
            driver.get(bingSearch);
        }
    }

    @Test
    public void doityahoo() {
        String yahooSearch = "https://www.yahoo.com/";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(yahooSearch);

        List<String> wordsToCheck = Arrays.asList("Cats", "Dogs", "Straus", "bear", "chick", "bee", "bird", "stork",
                "turkey", "goose", "swan", "cock", "falcon", "flamingo", "magpie", "sheep", "lamb", "pig", "rabbit",
                "lion", "panda", "puma", "tiger", "zebra", "raccoon", "monkey", "panther", "leopard", "giraffe",
                "elephant", "deer", "lynx", "yak", "bat", "parrot");

        for (String word : wordsToCheck) {
            driver.findElement(By.xpath("//input[@name='p']")).sendKeys(word + "\n");
            new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains(word));
            Assert.assertTrue(driver.getCurrentUrl().contains(word));
            driver.get(yahooSearch);
        }
    }
}