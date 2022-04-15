package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBAT {

    public void sleep(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBAT() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bat.ua/");
        driver.manage().window().maximize();
        driver.findElements(By.xpath("//a[@class='ow_fnav_a']")).get(4).click();
        driver.findElement(By.xpath("//input[@class='inputField']")).sendKeys("GLO");
        driver.findElement(By.xpath("//button[@class='btnSearch']")).click();
        driver.findElement(By.xpath("//a[@href='/group/sites/BAT_ALAJQW.nsf/vwPagesWebLive/DOB4QKQZ?opendocument']")).click();
        sleep();
         Assert.assertTrue(driver.findElement(By.xpath("//a[@id='myglo']")).isDisplayed());
    }
}


