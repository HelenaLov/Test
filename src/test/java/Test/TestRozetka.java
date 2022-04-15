package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRozetka {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    public void openFullscreanWindow() {
        driver.manage().window().maximize();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkLoginRozetka() {
        driver.get("https://rozetka.com.ua/");
        openFullscreanWindow();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("холодильники");
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='search-form__inner']")).isDisplayed());
    }
}
