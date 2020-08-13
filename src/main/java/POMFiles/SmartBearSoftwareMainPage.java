package POMFiles;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearSoftwareMainPage extends BaseClass {
    public SmartBearSoftwareMainPage() {

        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    WebElement myElement;
    By byElement;
    @FindBy(css = "input[type=text]")
    private WebElement userName;

    @FindBy(css = "input[type=password]")
    private WebElement passWord;

    @FindBy(css = "input[type=submit]")
    private WebElement logIn;

    @FindBy(xpath = "//h2[contains(text(),'List of All Orders')]")
    private WebElement listOfAllOrdersText;

    private By listOfCheckBox = By.cssSelector("input[type='checkbox']");

    @FindBy(xpath = "//a[@id='ctl00_MainContent_btnCheckAll']")
    private WebElement checkAll;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_btnDelete']")
    private WebElement deleteAll;

    @FindBy(xpath = "//*[@id=\"ctl00_MainContent_orderMessage\"]")
    private WebElement deleteMessage;



    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "logIn":
                myElement = logIn;
                break;
            case "checkAll":
                myElement = checkAll;
                break;

            case "deleteAll":
                myElement = deleteAll;
                break;
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String Keys) {
        switch (elementName) {
            case "userName":
                myElement = userName;
                break;
            case "passWord":
                myElement = passWord;
                break;
        }
        sendKeysFunction(myElement, Keys);
    }

    public String findElementAndGetText(String elementName) {
        switch (elementName) {
            case "listOfAllOrdersText":
                myElement = listOfAllOrdersText;
                break;
            case "deleteMessage":
                myElement = deleteMessage;
                break;

        }
        return myElement.getText();
    }

    public int findElementAndGetNumber(String elementName) {
        switch (elementName) {
            case "listOfCheckBox":
                byElement = listOfCheckBox;
                break;
        }
        return BaseDriver.getDriver().findElements(byElement).size();
    }
}
