package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EatstreetPageSignIn extends BasePage {
    public EatstreetPageSignIn(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        driver.get("https://eatstreet.com/signin");
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getLoginBtn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }

    public void closeModal() {
        driver.findElement(By.xpath("//button[contains(text(),'Got it')]"));
    }

    public WebElement getErrorMSG() {
        return driver.findElement(By.xpath("//span[contains(text(), 'is incorrect.')]"));
    }
}
