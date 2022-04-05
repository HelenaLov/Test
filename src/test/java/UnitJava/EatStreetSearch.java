package UnitJava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EatStreetSearch extends TestInit {

    @Test
    public void searchMadison() {
        driver.get("https://qa2.eatstreet.com/");
        getElementByXpath("//input[@id='input-food-search']").sendKeys("Madison, WI\n");
        getElementByXpath("//a[@id='enter-address-btn']").click();
        getElementByXpath("//a[@id='find-restaurants']").click();

        waitTILLELelementContainsText("//h1", "Madison");

        Assert.assertTrue(getElementByXpath("//h1").getText().contains("Madison"));
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-delivery']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filters-checkbox-takeout']").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Free Delivery']/..").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Order Ahead']/..").isDisplayed());
        Assert.assertTrue(getElementByXpath("//input[@id='filter-Specials']/..").isDisplayed());
    }
}
