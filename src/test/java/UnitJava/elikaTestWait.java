package UnitJava;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class elikaTestWait extends TestInit {
    //Implicit Wait

    @Test
    public void searchEliKwait() {
        driver.get("https://elika-delivery.com/");
        getElementByXpath("//a[@href='/recipes/']").click();
        getElementByXpath("//li[@id='menu-item-502']").click();
        for (String s : Arrays.asList("//li[@id='menu-item-953']", "//li[@id='menu-item-99']",
                "//li[@id='menu-item-2194']", "//li[@id='menu-item-992']")) {
            getElementByXpath(s).isDisplayed();
        }
        Assert.assertTrue(getElementByXpath("//h2").getText().contains("Дізнайтеся де придбати продукцію"));
    }
    //Explicit Wait
}
