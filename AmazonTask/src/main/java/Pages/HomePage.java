package Pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class HomePage extends PageBase{
	
WebDriver driver;


	public HomePage(WebDriver driver) {
		super(driver);
	}

// All link element locator
	@FindBy(css  = "a#nav-hamburger-menu")
	WebElement AllLink;
	
	// See all link element locator
	@FindBy(css = "a.hmenu-item.hmenu-compressed-btn")
	WebElement SeeAllLink;
	
	@FindBy(xpath = "//div[contains(text(),'Video Games')]")
	WebElement VideoGamesLink;
	
	@FindBy(xpath = "//a[contains(text(),'All Video Games')]")
	WebElement AllVideoGamesLink;
	
	@FindBy(xpath = "//span[contains(text(),'Free Shipping')]")
	WebElement FreeShipping;
	
	@FindBy(xpath  = "//*[@id=\"p_n_condition-type/28071525031\"]/span/a/span")
	WebElement NewFilter;
	
	
	
	@FindBy(css  = "span#a-autoid-0-announce")
	WebElement FeaturedFilters;
	
	
	@FindBy(id  = "s-result-sort-select_2")
	WebElement HighToLowFilters;
//	
	@FindBy(xpath  = "//img[@data-image-index= '11']")
	WebElement FirstimgLink;
	
	@FindBy(xpath  = "(//span[@class= 'a-price-whole'])[8]")
	WebElement FirstproductPrice;
	
	@FindBy(css  = "span.a-offscreen")
	WebElement PricesLink;
	
	@FindBy(xpath  = "//span[@id= 'mbc-buybutton-addtocart-1']")
	WebElement AddTocartBTN1;
	
	@FindBy(xpath  = "//input[@id= 'add-to-cart-button']")
	WebElement AddTocartBTN;
	
	
	@FindBy(xpath = "(//div[@class= 'a-alert-content'])[22]")
	WebElement AddedToCartText1;
	
	@FindBy(xpath = "//span[contains(text(),'Added to Cart')]")
	WebElement AddedToCartText;
	
	@FindBy(xpath  = "//img[@data-image-index= '12']")
	WebElement secondimgLink;
	
	
	
	@FindBy(xpath  = "(//span[@class= 'a-price-whole'])[9]")
	WebElement secondProductprice;
	
	
	@FindBy(xpath  = "//img[@data-image-index= '14']")
	WebElement thirdimgLink;

	@FindBy(xpath  = "(//span[@class= 'a-price-whole'])[10]")
	WebElement thirdproductPrice;
	
	@FindBy(xpath  = "(//span[@class= 'a-price-whole'])[11]")
	WebElement ForthproductPrice;
//	
	
	@FindBy(xpath  = "(//span[@class= 'a-price-whole'])[12]")
	WebElement FifthproductPrice;
	
	
	@FindBy(xpath  = "//img[@data-image-index= '15']")
	WebElement fifthimgLink;
//	
	
	
			//span[contains(text(),' No Thanks ')]
	@FindBy(xpath  = "//input[@value= 'Proceed to checkout']")
	WebElement CheckOutLink;
	
	@FindBy(xpath  = "//div[@id= 'attach-desktop-sideSheet']")
	WebElement Slidesheet;
	
	
	@FindBy(xpath  = "//a[@id='nav-cart']")
	WebElement MyCart;
	
	//span[@id= 'attachSiNoCoverage-announce']
	
	//open ClickAllLink
	public void ClickAllLink() {
	
		AllLink.click();
	}
	
	// user ClickOnSeeAllLink
	public void ClickOnSeeAllLink(WebDriver drive) {
		
		SeeAllLink.click();
	}
	
	
	public void ClickVideoGamesLink() {
		
		VideoGamesLink.click();
	}
	
	public void AllVideoGamesLink() {
		
		AllVideoGamesLink.click();
	}
	
	public void ClickOnFreeShippingLink() {
		
		FreeShipping.click();
	}
	
	public void ClickNewFilter() {
		
		NewFilter.click();
	}
	
	public  void ScrollDown(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",NewFilter);
	    NewFilter.click();



	}
public void ClickFeaturedFilter() {
		
	FeaturedFilters.click();
	}
	

public void ClickHighToLowFilters() {
	
	HighToLowFilters.click();
	}

public   void addIFirstItem(WebDriver driver)

{	JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();",secondimgLink);
	
//
driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
String Price1 = FirstproductPrice.getText();
FirstproductPrice.click();
AddTocartBTN.click();
String ActualResult = AddedToCartText.getText();
String ExpectedResults = "Added to Cart" ;
Assert.assertEquals(ActualResult , ExpectedResults);
System.out.println(ActualResult + " " + "And it's price is: " + Price1 );
driver.navigate().back();
driver.navigate().back();
}
public   void addISecondItem(WebDriver driver) throws InterruptedException

{	JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();",secondProductprice);

//
driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
String Price2 = secondProductprice.getText();

secondProductprice.click();
WebDriverWait wait = new WebDriverWait(driver,(100));
wait.until(ExpectedConditions.elementToBeClickable(AddTocartBTN));
AddTocartBTN.click();

String ActualResult = AddedToCartText.getText();
System.out.println(ActualResult + " " + "And it's price is: " + Price2);
driver.navigate().back();
driver.navigate().back();
Thread.sleep(1000);
}

public   void addIThirdItem(WebDriver driver) throws InterruptedException

{	JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();",ForthproductPrice);
	
//
driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
String Price3 = ForthproductPrice.getText();
ForthproductPrice.click();
AddTocartBTN.click();

String ActualResult = AddedToCartText.getText();
System.out.println(ActualResult + " " +  "And it's price is: " + Price3);
driver.navigate().back();
driver.navigate().back();
}

public   void addIForthItem(WebDriver driver) throws InterruptedException{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",FifthproductPrice);
	
String Price4 = FifthproductPrice.getText();
FifthproductPrice.click();
AddTocartBTN.click();

String ActualResult = AddedToCartText.getText();
System.out.println(ActualResult + " " +  "And it's price is: " + Price4);

}

//public   void addIForthItem(WebDriver driver)
//
//{	JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("arguments[0].scrollIntoView();",ForthproductPrice);
//	
////
//driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
//String Price4 = ForthproductPrice.getText();
//ForthproductPrice.click();
//AddTocartBTN.click();
//
//String ActualResult = AddedToCartText.getText();
//System.out.println(ActualResult + " " +  "And it's price is: " + Price4);
//
//}

//thirdproductPrice.click();
//AddTocartBTN.click();
//String Price3 = thirdproductPrice.getText();
//
//System.out.println(ActualResult + "/t" +  "And it's price is: " + Price3);
//driver.navigate().back();
//driver.navigate().back();
//Assert.assertEquals(ActualResult , ExpectedResults);
//String Price4 = ForthproductPrice.getText();
//ForthproductPrice.click();
//AddTocartBTN.click();
//System.out.println(ActualResult + "/t" +  "And it's price is: " + Price4);





//WebDriverWait wait = new WebDriverWait(driver,(100));
////wait.until(ExpectedConditions.elementToBeClickable(AddTocartBTN));
//AddTocartBTN.click();
////String Price3 = thirdproductPrice.getText();
//Assert.assertEquals(ActualResult , ExpectedResults);
//System.out.println(ActualResult  + "/t" +  "And it's price is: " + Price3);
//driver.navigate().back();
//driver.navigate().back();
//String Price4 = thirdproductPrice.getText();
//fifthimgLink.click();
//AddTocartBTN.click();


//driver.navigate().back();
//thirdimgLink.click();
//AddTocartBTN.click();
//AddTocartBTN.click();
//Assert.assertEquals(ActualResult , ExpectedResults);
//System.out.println(ActualResult);
//MyCart.click();




//public void ClickOnNothanks () {
//	
//	Nothanks.click();
//	}

public void ClickOnProceedCheckout() {
	
	CheckOutLink.click();
	}}

