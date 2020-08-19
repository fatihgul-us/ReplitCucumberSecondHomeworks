package StepFiles;

import POMFiles.NewOrderPage;
import Utils.BaseDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class GiveNewOrderStep {
    NewOrderPage orderPage = new NewOrderPage();

    @Given("^Click on Order menu button$")
    public void click_on_Order_menu_button() {

        orderPage.findElementAndClickFunction("orderButton");
    }

    @Then("^Select type of product \"([^\"]*)\"$")
    public void selectTypeOfProduct(String product) {

        orderPage.findElementAndSelect(orderPage.products, product);
    }

    @And("^Enter \"([^\"]*)\"$")
    public void enter(String quantity) throws InterruptedException {
        orderPage.findElementAndSendKeysFunction("quantity", quantity);
    }

    @Then("^press Calculate button$")
    public void press_Calculate_button() throws InterruptedException {
        orderPage.findElementAndClickFunction("calculateButton");
        Thread.sleep(10);
    }

    @Then("^Fill Address Information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void fill_Address_Information(String name, String street, String city, String state, String zip) throws InterruptedException {
        orderPage.findElementAndSendKeysFunction("customerName", name);
        orderPage.findElementAndSendKeysFunction("streetName", street);
        orderPage.findElementAndSendKeysFunction("cityName", city);
        orderPage.findElementAndSendKeysFunction("stateName", state);
        orderPage.findElementAndSendKeysFunction("zipCode", zip);
    }

    @Then("^Select type of \"([^\"]*)\"$")
    public void selectTypeOf(String cardType) {
        if (cardType.equalsIgnoreCase("Visa"))
            orderPage.findElementAndClickFunction("visa");
        else if (cardType.equalsIgnoreCase("MasterCard"))
            orderPage.findElementAndClickFunction("masterCard");
        else if (cardType.equalsIgnoreCase("American Express"))
            orderPage.findElementAndClickFunction("americanExpress");
    }

    @Then("^Enter the \"([^\"]*)\" \"([^\"]*)\"$")
    public void enter_the(String cardNumber, String date) throws InterruptedException {
        orderPage.findElementAndSendKeysFunction("cardNumber", cardNumber);
        orderPage.findElementAndSendKeysFunction("expDate", date);
    }

    @Then("^Press process button$")
    public void press_process_button() {
        orderPage.findElementAndClickFunction("processButton");

    }


    @Then("^Press View All Orders button$")
    public void pressViewAllOrdersButton() {
        orderPage.findElementAndClickFunction("viewAllButton");


    }

    @Then("^Verify your order is created in the the view all orders page \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\"$")
    public void verifyYourOrderIsCreatedInTheTheViewAllOrdersPage(String name, String product, String street) {
//        List<WebElement> elements = BaseDriver.getDriver().findElements(orderPage.rowsTable);
//        String []row = elements.get(1).getText().split(" ");
//        System.out.println(row[0]+" "+row[1]);
//        Assert.assertEquals(name,row[0]+" "+row[1]); //check customer name
//        Assert.assertEquals(product,row[2]); //check product name

        Assert.assertEquals(name,orderPage.findElementAndGetText("getCustomerName")); //check customer name
        Assert.assertEquals(product,orderPage.findElementAndGetText("getProducts")); //check product name
        Assert.assertEquals(street,orderPage.findElementAndGetText("getStreetName"));
    }

    @And("^Verify \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\" in the the view all orders page$")
    public void verifyInTheTheViewAllOrdersPage(String city, String state, String zip, String card, String cardNo, String expireDate) {
//        List<WebElement> elements = BaseDriver.getDriver().findElements(orderPage.rowsTable);
//        String []row = elements.get(1).getText().split(" ");
//        System.out.println(row[0]+" "+row[1]);
//        Assert.assertEquals(city,row[2]); //check customer name
//        Assert.assertEquals(product,row[2]); //check product name

        Assert.assertEquals(city,orderPage.findElementAndGetText("getCityName"));
        Assert.assertEquals(state,orderPage.findElementAndGetText("getStateName"));
        Assert.assertEquals(zip,orderPage.findElementAndGetText("getZipCode"));
        Assert.assertEquals(card,orderPage.findElementAndGetText("getCardType"));
        Assert.assertEquals(cardNo,orderPage.findElementAndGetText("getCardNumber"));
        Assert.assertEquals(expireDate,orderPage.findElementAndGetText("getExpDate"));

    }



}
