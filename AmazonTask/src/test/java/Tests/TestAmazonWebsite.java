package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import data.excelReader;



import Pages.HomePage;
import Pages.LoginPage;
import Pages.PageBase;
import Pages.ShippingDetails;
//import Pages.UserRegisterationPage;


@Test
public class TestAmazonWebsite extends TestPase {
	
	WebDriver driver;
	HomePage homeObject;
	PageBase PageObject;
	LoginPage LoginObject;
	ShippingDetails ShippingDetailsObject;
	
//	Faker fakeData = new Faker();
//	String Name = fakeData.name().fullName();
//
//	String MobileNum = fakeData.phoneNumber().cellPhone();
//	String ZipCode = fakeData.address().zipCode();
//	String password = fakeData.number().digits(8).toString();
//	
//
//
//	String city = fakeData.address().city();
//	String State = fakeData.address().state();
//	String governorate = fakeData.address().state();
//
//	
//	String Country = fakeData.address().country();
//	String Address1 = fakeData.address().fullAddress();
//	String district = fakeData.address().fullAddress();
String Email = "Saramagdydarwish@gmail.com";
String Password = "123456S";
String Name = "sara magdy";
String MobileNum = "01060334453";
String Street = "cairo- 10 omar bn khattab";
String building = "111";
String State = "cairo";
String City2 = "cairo";
String District = "cairo";
String gavernorate = "Cairo";
	
//@DataProvider (name = "ExcelData")
//public Object [][] ShippingDetailsData() throws IOException {
//	ExcelReader ER = new ExcelReader();
//	
//	return ER.getExcelData("sheet1");
//	
//}
	@Test (priority = 1, alwaysRun = true )
	
	public void UserCanclickAllSuccessfully() throws Throwable {
		
		
		homeObject = new HomePage(TestPase.driver);
		PageObject = new PageBase(TestPase.driver);
		LoginObject = new LoginPage(TestPase.driver);
		ShippingDetailsObject = new ShippingDetails(TestPase.driver);
		
		//navigate to All page 
	homeObject.ClickAllLink();
	homeObject.ClickOnSeeAllLink();
	homeObject.ClickVideoGamesLink();
	homeObject.AllVideoGamesLink();
	homeObject.ClickOnFreeShippingLink();
	homeObject.ScrollDown(TestPase.driver);
	
	homeObject.ClickFeaturedFilter();
	
	homeObject.ClickHighToLowFilters();
	homeObject.addItems(TestPase.driver);

	homeObject.ClickOnProceedCheckout();
	
	
	
	
		//fill all fields in sign up page
		LoginObject.UserLogin(Email,Password);
	
		ShippingDetailsObject.UserRegisteration(Name,MobileNum, Street, building ,City2, District, gavernorate);
		ShippingDetailsObject.ScrolldownToSaveBtn_And_AssertOnOrder_total(TestPase.driver);

	}

}
