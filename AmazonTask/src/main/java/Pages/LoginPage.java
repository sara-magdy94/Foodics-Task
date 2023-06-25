package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	
	@FindBy(id  = "ap_email")
	WebElement yourEmailBox;
	
//	
	@FindBy(id  = "ap_password")
	WebElement yourPasswordBox;
//	
@FindBy(id  = "signInSubmit")
	WebElement  signInSubmitBTn;
////	
	@FindBy(id  = "continue")
	WebElement ContinueBtn;
	
	//open ClickAllLink
	 public void UserLogin( String Email , String Password) {
	
			SetTextElementText(yourEmailBox , Email);
			Clickbtn(ContinueBtn);	
			SetTextElementText(yourPasswordBox , Password);
			
			Clickbtn(signInSubmitBTn);
	
			}
}
