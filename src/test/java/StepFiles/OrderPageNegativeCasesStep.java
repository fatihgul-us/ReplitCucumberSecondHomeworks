package StepFiles;

import POMFiles.NewOrderPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class OrderPageNegativeCasesStep {
NewOrderPage page = new NewOrderPage();
    @And("^Verify if Quantity did not entered, you should get \"([^\"]*)\" message$")
    public void verifyIfQuantityDidNotEnteredYouShouldGetMessage(String message){
        Assert.assertEquals(message,page.findElementAndGetText("quantityError"));
    }

    @Then("^Verify if Customer Name did not entered, you should get \"([^\"]*)\" message$")
    public void verifyIfCustomerNameDidNotEnteredYouShouldGetMessage(String message) {
        Assert.assertEquals(message,page.findElementAndGetText("customerNameError"));
    }

    @Then("^Verify if Street did not entered, you should get \"([^\"]*)\" message$")
    public void verifyIfStreetDidNotEnteredYouShouldGetMessage(String message) {
        Assert.assertEquals(message,page.findElementAndGetText("streetNameError"));
    }

    @Then("^Verify if City did not entered, you should get \"([^\"]*)\" message$")
    public void verifyIfCityDidNotEnteredYouShouldGetMessage(String message) {
        Assert.assertEquals(message,page.findElementAndGetText("cityNameError"));
    }

    @Then("^Verify if Zip did not entered, you should get \"([^\"]*)\" message$")
    public void verifyIfZipDidNotEnteredYouShouldGetMessage(String message) {
        Assert.assertEquals(message,page.findElementAndGetText("zipError"));
    }

    @And("^Verify if Card did not entered, you should get \"([^\"]*)\" message$")
    public void verifyIfCardDidNotEnteredYouShouldGetMessage(String message) {
        Assert.assertEquals(message,page.findElementAndGetText("cardTypeError"));
    }

    @And("^Verify if Card Nr did not entered, you should get \"([^\"]*)\" message$")
    public void verifyIfCardNrDidNotEnteredYouShouldGetMessage(String message) {
        Assert.assertEquals(message,page.findElementAndGetText("cardNumberError"));
    }

    @And("^Verify if Expire Date did not entered, you should get \"([^\"]*)\" message$")
    public void verifyIfExpireDateDidNotEnteredYouShouldGetMessage(String message) {
        Assert.assertEquals(message,page.findElementAndGetText("expDateError"));
    }
}
