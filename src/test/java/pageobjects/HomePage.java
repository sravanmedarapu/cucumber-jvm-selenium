package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class HomePage extends BaseClass{

	public HomePage(WebDriver driver){
		super(driver);
	}    

	
	@FindBy(how=How.ID, using="nav-link-yourAccount")
	public static WebElement your_account;
	
	@FindBy(how=How.XPATH, using="//div[@id='nav-flyout-ya-signin']//span[contains(text(),'Sign in')]")
	public static WebElement signin;
	
	@FindBy(how=How.ID, using="nav-your-amazon")
	public static WebElement users_amazon;

	@FindBy(how=How.ID, using="your-orders-button-announce")
	public static WebElement your_orders;

	@FindBy(how=How.ID, using="twotabsearchtextbox")
	public static WebElement search_field;

	@FindBy(how=How.CLASS_NAME, using="nav-input")
	public static WebElement search_button;

	@FindBy(how=How.ID, using="nav-item-signout")
	public static WebElement signOut;




		
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	