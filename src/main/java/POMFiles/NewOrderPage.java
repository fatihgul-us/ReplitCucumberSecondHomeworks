package POMFiles;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewOrderPage extends BaseClass {
    WebElement myElement;

    public NewOrderPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "a[href='Process.aspx']")
    private WebElement orderButton;

    @FindBy(css = "select[id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement products;
    public By product = new By.ByCssSelector("select[id='ctl00_MainContent_fmwOrder_ddlProduct']>option");

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    private WebElement quantity;

    @FindBy(css = "input[value=Calculate]")
    private WebElement calculateButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    private WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    private WebElement streetName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    private WebElement cityName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    private WebElement stateName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zipCode;

    @FindBy(css = "input[value=Visa]")
    private WebElement visa;

    @FindBy(css = "input[value=MasterCard]")
    private WebElement masterCard;

    @FindBy(css = "input[value='American Express']")
    private WebElement americanExpress;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    private WebElement cardNumber;

    @FindBy(css = "input[id=ctl00_MainContent_fmwOrder_TextBox1")
    private WebElement expDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButton;

    @FindBy(css = "a[href='Default.aspx']")
    private WebElement viewAllButton;

    @FindBy(css="table[class='SampleTable']>tbody>tr")
    private WebElement listOfOrders; // Use to get the number of orders

    @FindBy(css = "table[class=\"SampleTable\"]>tbody>tr")
    public WebElement rowTable;
    public By rowsTable = new By.ByCssSelector("table[class=\"SampleTable\"]>tbody>tr");

    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/td[2]")
    private WebElement getCustomerName;

    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/td[3]")
    private WebElement getProducts;
    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/td[6]")
    private WebElement getStreetName;
    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/td[7]")
    private WebElement getCityName;
    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/td[8]")
    private WebElement getStateName;
    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/td[9]")
    private WebElement getZipCode;
    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/td[10]")
    private WebElement getCardType;
    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/td[11]")
    private WebElement getCardNumber;
    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr/td[12]")
    private WebElement getExpDate;
    // For negative case Error messages
    @FindBy(css = "#ctl00_MainContent_fmwOrder_RegularExpressionValidator1")
    private WebElement quantityError;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_RequiredFieldValidator2")
    private WebElement customerNameError;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_RequiredFieldValidator3")
    private WebElement streetNameError;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_RequiredFieldValidator4")
    private WebElement cityNameError;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_RequiredFieldValidator5")
    private WebElement zipError;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_CustomValidator1")
    private WebElement cardTypeError;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_RequiredFieldValidator6")
    private WebElement cardNumberError;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_RequiredFieldValidator7")
    private WebElement expDateError;

    public String findElementAndGetText(String elementName) {
        switch (elementName) {
            case "getCustomerName":
                myElement = getCustomerName;
                break;
            case "getProducts":
                myElement = getProducts;
                break;
            case "getStreetName":
                myElement = getStreetName;
                break;
            case "getCityName":
                myElement = getCityName;
                break;
            case "getStateName":
                myElement = getStateName;
                break;
            case "getZipCode":
                myElement = getZipCode;
                break;
            case "getCardType":
                myElement = getCardType;
                break;
            case "getCardNumber":
                myElement = getCardNumber;
                break;
            case "getExpDate":
                myElement = getExpDate;
                break;
                ////////////////////////////////////
            case "quantityError":
                myElement = quantityError;
                break;
            case "customerNameError":
                myElement = customerNameError;
                break;
            case "streetNameError":
                myElement = streetNameError;
                break;
            case "cityNameError":
                myElement = cityNameError;
                break;
            case "zipError":
                myElement = zipError;
                break;
            case "cardTypeError":
                myElement = cardTypeError;
                break;
            case "cardNumberError":
                myElement = cardNumberError;
                break;
            case "expDateError":
                myElement = expDateError;
                break;
          }
        return myElement.getText();
    }
    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "orderButton":
                myElement = orderButton;
                break;
            case "visa":
                myElement = visa;
                break;
            case "masterCard":
                myElement = masterCard;
                break;
            case "americanExpress":
                myElement = americanExpress;
                break;
            case "processButton":
                myElement = processButton;
                break;
            case "viewAllButton":
                myElement = viewAllButton;
                break;

        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String Keys) throws InterruptedException {
        switch (elementName) {
            case "quantity":
                myElement = quantity;
                break;
            case "customerName":
                myElement = customerName;
                break;
            case "streetName":
                myElement = streetName;
                break;
            case "cityName":
                myElement = cityName;
                break;
            case "stateName":
                myElement = stateName;
                break;
            case "zipCode":
                myElement = zipCode;
                break;
            case "cardNumber":
                myElement = cardNumber;
                break;
            case "expDate":
                myElement = expDate;
            break;
        }
        sendKeysFunction(myElement, Keys);
    }


//    public int findElementAndGetNumber(String elementName) {
//        switch (elementName) {
//            case "listOfCheckBox":
//                byElement = listOfCheckBox;
//                break;
//        }
//        return BaseDriver.getDriver().findElements(byElement).size();
//    }

    public void findElementAndSelect(WebElement products, String productName) {
        Select select = new Select(products);
        switch (productName) {

            case "FamilyAlbum":
                waitUntilVisible(products);
                select.selectByIndex(1);
                break;
            case "ScreenSaver":
                waitUntilVisible(products);
                select.selectByIndex(2);
                break;
            case "MyMoney":
                waitUntilVisible(products);
                select.selectByIndex(0);
                break;
        }
    }
}
