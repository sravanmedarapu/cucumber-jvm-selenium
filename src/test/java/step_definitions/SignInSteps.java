package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import static org.testng.Assert.assertTrue;


public class SignInSteps {
    public WebDriver driver;


    public SignInSteps() {
        driver = BaseDriver.getDriver();
    }

    @When("^I open amazon.co.uk website$")
    public void i_open_amazon_co_uk_website() throws Throwable {
        driver.get("https://www.amazon.co.uk");
    }

    @When("^I sign in$")
    public void i_sign_in() throws Throwable {
        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, LoginPage.class);

        HomePage.your_account.click();
        //HomePage.signin.click();
        LoginPage.email.sendKeys("amazonuk.testuser@gmail.com");
        LoginPage.password.sendKeys("password");
        LoginPage.signin_button.click();
        Reporter.log("SignIn Action is successfully performed");
    }

    @Then("I Should see co.uk in the url domain")
    public void i_see_co_uk_in_url() {
        assertTrue(driver.getCurrentUrl().contains(".co.uk"));
    }


    @Then("I Should See HomePage")
    public void i_see_homepage() {
        assertTrue(HomePage.users_amazon.isDisplayed());
    }


    @Then("I should be able to logout")
    public void i_should_be_able_logout(){
        driver.get("https://www.amazon.co.uk");
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click();", HomePage.signOut);
    }
}