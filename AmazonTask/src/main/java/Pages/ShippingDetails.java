package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingDetails extends PageBase{

	WebDriver driver ;

	public ShippingDetails(WebDriver Driver) {
		super(Driver);
		// TODO Auto-generated constructor stub
	}

	// NameTxtBox field locator
	@FindBy(xpath= "//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement NameTxtBox;

	// MobileNumTxtBox field locator
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement MobileNumTxtBox;


	// StreetName field locator
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement StreetName;

	// cityFieldtext field locator
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
	WebElement cityFieldtext;

	// City field locator
	@FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[1]/div/div[12]/ul/li[1]")
	WebElement City;

	// BuildingName  field locator
	@FindBy(id = "address-ui-widgets-enter-building-name-or-number")
	WebElement BuildingName;

	// DistrictFieldtext  field locator
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressDistrictOrCounty']")
	WebElement DistrictFieldtext;

	//District field locator
	@FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[1]/div/div[14]/ul/li[1]")
	WebElement District;
	
	//Governorate field locator
	@FindBy(id = "address-ui-widgets-enterAddressStateOrRegion")
	WebElement Governorate;

	//SaveBtn locator
	@FindBy(xpath = "//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")
	WebElement SaveBtn;

	//Order total locator
	@FindBy(xpath  = "//*[@id=\"subtotals-marketplace-table\"]/table/tbody/tr[6]/td[2]")
	WebElement OrderTotal;


	


	public void UserRegisteration( String Name ,String MobileNum ,String Street, String building , String city ,String district, String governorate ) throws Exception {

		SetTextElementText(NameTxtBox , Name);
		SetTextElementText(MobileNumTxtBox , MobileNum);
		SetTextElementText(StreetName , Street);
		SetTextElementText(BuildingName , building);
		cityFieldtext.click();
		Thread.sleep(5000);
		SetTextElementText(cityFieldtext , city);
		City.click();
		DistrictFieldtext.click();
		Thread.sleep(5000);
		DistrictFieldtext.click();
		SetTextElementText(DistrictFieldtext , district);
		District.click();
		SetTextElementText(Governorate , governorate);
		Thread.sleep(5000);
		}

	
	public   void ScrolldownToSaveBtn_And_AssertOnOrder_total(WebDriver driver) throws InterruptedException

	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",SaveBtn);
		Clickbtn(SaveBtn);  


		String ActualResult = OrderTotal.getText();
		String ExpextedResult = "EGP 37,447.00";
		Assert.assertEquals(ActualResult, ExpextedResult);
		System.out.println("Total Order is : " +  ActualResult + "" + "and can't have cash on Delivery payment method");
	}
}
