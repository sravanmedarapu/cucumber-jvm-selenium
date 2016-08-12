package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage extends BaseClass{
	
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.ID, using="enterAddressFullName")
	public static WebElement fullName;
	
	@FindBy(how=How.ID, using="enterAddressAddressLine1")
	public static WebElement addLine1;

	@FindBy(how=How.ID, using="enterAddressCity")
	public static WebElement city;

	@FindBy(how=How.ID, using="enterAddressStateOrRegion")
	public static WebElement country;

	@FindBy(how=How.ID, using="enterAddressPostalCode")
	public static WebElement postalCode;

	@FindBy(how=How.ID, using="enterAddressPhoneNumber")
	public static WebElement phoneNum;


	@FindBy(how=How.LINK_TEXT, using="Deliver to this address")
	public static WebElement deliverToExistingAdress;

	@FindBy(how=How.ID, using="shipToThisAddress")
	public static WebElement deliverToThisAddPage1;


	@FindBy(how=How.ID, using="useSelectedAddress")
	public static WebElement deliverToThisAddPage2;


}
