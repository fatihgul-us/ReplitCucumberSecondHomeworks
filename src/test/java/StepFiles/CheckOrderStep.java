package StepFiles;

import POMFiles.SmartBearSoftwareMainPage;
import Utils.BaseDriver;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOrderStep {
    public CheckOrderStep() {

        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    WebElement myElement;

    SmartBearSoftwareMainPage page = new SmartBearSoftwareMainPage();

    @Given("^Navigate to the given web page \"([^\"]*)\"$")
    public void navigate_to_the_given_web_page(String webPage) {
        BaseDriver.getDriver().get(webPage);
        BaseDriver.getDriver().manage().window().maximize();
    }

    @Then("^Enter user name: \"([^\"]*)\" and Password: \"([^\"]*)\"$")
    public void enter_user_name_and_Password(String userName, String passWord) {
        page.findElementAndSendKeysFunction("userName", userName);
        page.findElementAndSendKeysFunction("passWord", passWord);
    }

    @Then("^Click on the login button$")
    public void click_on_the_login_button() {
        page.findElementAndClickFunction("logIn");
    }

    @Given("^Verify that view all orders page page is open$")
    public void verify_that_view_all_orders_page_page_is_open() {
        String text = page.findElementAndGetText("listOfAllOrdersText");
        Assert.assertEquals("List of All Orders", text);
    }

    @Then("^Verify (\\d+) items are displayed in the view all orders page$")
    public void verify_items_are_displayed_in_the_view_all_orders_page(int numberOfOrder) {
        int a = page.findElementAndGetNumber("listOfCheckBox");
        Assert.assertEquals(numberOfOrder, a);
    }

    @Given("^Click on Select All button$")
    public void click_on_Select_All_button() {

        page.findElementAndClickFunction("checkAll");
    }

    @Then("^Click on Delete Selected button$")
    public void click_on_Delete_Selected_button() {
        page.findElementAndClickFunction("deleteAll");
    }

    @Then("^Verify item count is (\\d+)$")
    public void verify_item_count_is(int arg1) {
        String message = page.findElementAndGetText("deleteMessage");
        Assert.assertEquals("List of orders is empty. In order to add new order use this link.",message);
    }


}
