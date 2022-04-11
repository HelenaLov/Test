package MyTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestElika {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
//    public void afterTest() {
//        driver.quit();
//    }

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
    public void testElika() {
        driver.get("https://elika-delivery.com/");
        openFullscreanWindow();
        driver.findElement(By.xpath("//a[@href='/recipes/']")).click();

    }
}
