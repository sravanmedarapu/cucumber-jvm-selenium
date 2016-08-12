package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends BaseClass{
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//div[@id='atfResults']//li[1]//a")
	public static WebElement first_search_result;

	@FindBy(how=How.ID, using="productTitle")
	public static WebElement productTitle;

	@FindBy(how=How.ID, using="add-to-cart-button")
	public static WebElement addToCart;

	@FindBy(how=How.ID, using="hlb-ptc-btn-native")
	public static WebElement proceedToCheckout;


	public static String getProductTitle(){
		return productTitle.getText();
	}



	



}
