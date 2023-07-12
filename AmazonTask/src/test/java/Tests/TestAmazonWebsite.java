package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import data.excelReader;

import Data.ExcelReader;
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
	
	
	@DataProvider(name="MyData")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}	

//
//	
//	String Country = fakeData.address().country();
//	String Address1 = fakeData.address().fullAddress();
//	String district = fakeData.address().fullAddress();
	
//	
//String Email = "Saramagdydarwish@gmail.com";
//String Password = "123456S";
//String Name = "sara magdy";
//String MobileNum = "01060334453";
//String Street = "cairo- 10 omar bn khattab";
//String building = "111";
//String State = "cairo";
//String City2 = "cairo";
//String District = "cairo";
//String gavernorate = "Cairo";
	
//@DataProvider (name = "ExcelData")
//public Object [][] ShippingDetailsData() throws IOException {
//	ExcelReader ER = new ExcelReader();
//
//	return ER.getExcelData("sheet1");
//}
	@Test (priority = 1, alwaysRun = true , dataProvider = "MyData")
	
	public void UserCanclickAllSuccessfully( String Email,String Password , String Name,String MobileNum,String Street ,String building, String City2 , String District, String gavernorate ) throws Throwable {
		
		
		homeObject = new HomePage(TestPase.driver);
		PageObject = new PageBase(TestPase.driver);
		LoginObject = new LoginPage(TestPase.driver);
		ShippingDetailsObject = new ShippingDetails(TestPase.driver);
		
		//navigate to All page 
	homeObject.ClickAllLink();
	homeObject.ClickOnSeeAllLink(TestPase.driver);
	homeObject.ClickVideoGamesLink();
	homeObject.AllVideoGamesLink();
	homeObject.ClickOnFreeShippingLink();
	homeObject.ScrollDown(TestPase.driver);
	
	homeObject.ClickFeaturedFilter();
	
	homeObject.ClickHighToLowFilters();
	homeObject.addIFirstItem(TestPase.driver);
	homeObject.addISecondItem(TestPase.driver);
	homeObject.addIThirdItem(TestPase.driver);
	homeObject.addIForthItem(TestPase.driver);

	homeObject.ClickOnProceedCheckout();

		//fill all fields in sign up page
		LoginObject.UserLogin(Email,Password);
	
		ShippingDetailsObject.UserRegisteration(driver, Name,MobileNum, Street, building ,City2, District, gavernorate);
		ShippingDetailsObject.ScrolldownToSaveBtn_And_AssertOnOrder_total(TestPase.driver);

	}

}
