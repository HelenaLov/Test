package UnitJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver;

    @BeforeMethod
    public void beforeMyTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //      this.driver = driver;
    }

    @AfterMethod
    public void afterMyTest() {
        driver.quit();
    }

    public void serch(String googleWorld, String searchUrl) {
        driver.get(searchUrl);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(googleWorld + "\n");
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    int BASIC_TIME = 15;

    public void waitTILLELelementContainsText(String locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(locator), text));
    }

    public WebElement getElementByXpath(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
}


