package step_definitions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.CheckoutPage;
import pageobjects.HomePage;
import pageobjects.SearchPage;

public class OrderItemSteps {

    public WebDriver driver;


    public OrderItemSteps() {
        driver = BaseDriver.getDriver();
    }

    @When("^I search item \"(.*?)\"$")
    public void i_search_item(String items) {
        PageFactory.initElements(driver, HomePage.class);
        String item = items;
        HomePage.search_field.sendKeys(item);
        HomePage.search_button.click();
    }

    @Then("^I should see results related \"(.*?)\"$")
    public void i_verify_order_summary_page_and_proceed(String item) throws Throwable {
        PageFactory.initElements(driver, SearchPage.class);
        SearchPage.first_search_result.click();
        Assert.assertTrue(SearchPage.getProductTitle().contains(item), "Product title does not related to searched item");
    }

    @Then("I should be able to place the order$")
    public void i_order_item(){
        SearchPage.addToCart.click();
        SearchPage.proceedToCheckout.click();
        PageFactory.initElements(driver, CheckoutPage.class);
       /* CheckoutPage.fullName.sendKeys("Mock User");
        CheckoutPage.addLine1.sendKeys("Aberdeen");
        CheckoutPage.city.sendKeys("Aberdeen");
        CheckoutPage.country.sendKeys("UK");
        CheckoutPage.phoneNum.sendKeys("+441234");
        CheckoutPage.postalCode.sendKeys("ab");*/
        CheckoutPage.deliverToExistingAdress.click();
    }
}
