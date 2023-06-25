package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.ExtentReports.reporter.extentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//import io.github.bonigarcia.wdm.WebDriverManager;
public class TestPase {

	public static WebDriver driver;
	public static   ExtentReports	extent;
	public static ExtentHtmlReporter htmlReporter;


	@BeforeSuite
	public void startDriver() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/ChromeDriversLatest/chromedriver.exe");


		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.eg/s?k=amazon&language=en");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		

	htmlReporter = new ExtentHtmlReporter("extentreport.html");
	extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test1 = extent.createTest("addItems to cart successfully then checkout" );
	test1.log(Status.INFO, "Starting TesCase");
	ExtentTest test2 = extent.createTest("open login page" ); 
		test2.pass(" open registration page ");
		test2.log(Status.INFO, "open login page");		
		ExtentTest test3 = extent.createTest("fill data in shipping Details page" ); 
	test3.pass("Data Filled successfully");
	ExtentTest test4 = extent.createTest("save data" ); 
	 test4.pass("data saved successfully");
		ExtentTest test5 = extent.createTest("User Can check order totall" ); 
	 test5.pass("order total checked successfully");

	}
	
	
@AfterClass
	public void flushReport() {
		
		extent.flush();
	}



	@AfterSuite
	public void stopDriver() {
		driver.quit();	
		extent.flush();
	}
}
