package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage extends BasePage{
    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogoImage(){
        return driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
    }

    public WebElement getCartAmazon() {
        return driver.findElement(By.xpath("//div[@id='nav-cart-text-container']"));
    }
}
