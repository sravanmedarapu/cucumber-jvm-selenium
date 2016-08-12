package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.NAME, using = "email")
    public static WebElement email;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement password;

    @FindBy(how = How.ID, using = "signInSubmit")
    public static WebElement signin_button;

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
