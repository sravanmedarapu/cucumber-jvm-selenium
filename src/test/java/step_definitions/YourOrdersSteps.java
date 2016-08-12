package step_definitions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mocks.OrdersMock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.HomePage;

import java.util.HashMap;
import java.util.List;

public class YourOrdersSteps {

    public WebDriver driver;
    public List<HashMap<String, String>> datamap;


    public YourOrdersSteps() {
        driver = BaseDriver.getDriver();
    }

    @When("^I open Your Orders Page")
    public void i_open_your_orders_page() throws Throwable {

        PageFactory.initElements(driver, HomePage.class);
        HomePage.your_account.click();
        HomePage.your_orders.click();
    }

    @Then("I Should see following OrderName$")
    public void i_verify_order(List<String> orderNames) {
        String orderName = orderNames.get(0);
        Assert.assertTrue(OrdersMock.mockOrderVerify(orderName), "Verifying Order:" + orderName);
    }

}
