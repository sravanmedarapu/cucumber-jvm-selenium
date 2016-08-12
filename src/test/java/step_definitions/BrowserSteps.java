package step_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BrowserSteps {



    @Given("^I open browser$")
    public void i_open_chrome_browser() throws Throwable {
        BaseDriver.getDriver();
    }

    @Then("^I quit browser$")
    public void i_quit_chrome_browser() throws Throwable {
        BaseDriver.quitDriver();
    }
}
