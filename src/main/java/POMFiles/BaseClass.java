package POMFiles;


import Utils.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseClass {

    WebDriver driver;
    WebDriverWait wait;

    public BaseClass() {
        driver = BaseDriver.getDriver();
        this.wait = new WebDriverWait(driver, 5);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value)  {
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys(value);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement elementToWait) {
        wait.until(ExpectedConditions.visibilityOf(elementToWait));
    }

    public void ElementContainsText(WebElement element, String text) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(text));
    }
}


