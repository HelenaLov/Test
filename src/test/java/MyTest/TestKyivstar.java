package MyTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestKyivstar {

    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

//    @AfterTest
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

    public void openSite() {
        driver.get("https://kyivstar.ua/uk/mm");
    }

    public void btnpopovnutuRahynok() {
        driver.findElement(By.xpath("//a[@href='https://pay.kyivstar.ua/']")).click();
    }

    public void btnPereitu() {
        driver.findElement(By.xpath("//span[@class='link-btn__content']")).click();
    }

    public void scrolWindow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
    }

    @Test
    public void testKyivstar() {
        openSite();
        openFullscreanWindow();
        btnpopovnutuRahynok();
        btnPereitu();
        scrolWindow();
        Assert.assertTrue(driver.getCurrentUrl().contains("no-war"));
    }

    @Test
    public void testКyivstarDergSektor() {
        openSite();
        openFullscreanWindow();
        btnDergSector();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        sleep(2);
        js.executeScript("window.scrollBy(0,3000)", "");
        sleep(2);
        js.executeScript("window.scrollBy(0,300)", "");
        driver.findElements(By.xpath("//button[@class='btn btn--primary btn--m']")).get(1).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("замовити консультацію"));
    }

    public void btnDergSector() {
        driver.findElements(By.xpath("//span[@class='link-text']")).get(2).click();
    }

    @Test
    public void googleSomeWord() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kyivstar\n");
        sleep(3);
        Assert.assertTrue(driver.getCurrentUrl().contains("kyivstar"));
        driver.quit();
    }

    @Test
    public void kiestarBag() {
        driver.get("https://kyivstar.ua/business/products/government");
        openFullscreanWindow();
        sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9500)", "");
        sleep(2);
        driver.findElements(By.xpath("//span[@class='btn__content']")).get(3).click();
        driver.findElement(By.xpath("//input [@class='input input--m']")).sendKeys("Martin");

        //   driver.quit();

    }

}




