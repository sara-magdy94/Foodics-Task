package Pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	@FindBy(xpath  = "//img[@data-image-index= '11']")
	WebElement FirstimgLink;
	
	
	@FindBy(css  = "span.a-offscreen")
	WebElement PricesLink;
	
	@FindBy(xpath  = "//input[@id= 'add-to-cart-button']")
	WebElement AddTocartBTN;
	
	
	@FindBy(xpath = "//span[contains(text(),'Added to Cart')]")
	WebElement AddedToCartText;
	
	@FindBy(xpath  = "//img[@data-image-index= '12']")
	WebElement secondimgLink;
	
	@FindBy(xpath  = "//img[@data-image-index= '13']")
	WebElement thirdimgLink;

	@FindBy(xpath  = "//img[@data-image-index= '14']")
	WebElement forthimgLink;
	
	
	@FindBy(xpath  = "//img[@data-image-index= '15']")
	WebElement fifthimgLink;
	
	@FindBy(xpath   = "//span[contains(text(),' No Thanks ')]")
	WebElement Nothanks;
	
	
	@FindBy(xpath  = "//input[@value= 'Proceed to checkout']")
	WebElement CheckOutLink;
	
	@FindBy(xpath  = "//div[@id= 'attach-desktop-sideSheet']")
	WebElement Slidesheet;
	
	
	//open ClickAllLink
	public void ClickAllLink() {
	
		AllLink.click();
	}
	
	// user ClickOnSeeAllLink
	public void ClickOnSeeAllLink() {
		
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

public   void addItems(WebDriver driver)

{	JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();",FirstimgLink);
	

FirstimgLink.click();
AddTocartBTN.click();
String ActualResult = AddedToCartText.getText();
String ExpectedResults = "Added to Cart" ;
Assert.assertEquals(ActualResult , ExpectedResults);
System.out.println(ActualResult);
driver.navigate().back();
driver.navigate().back();
secondimgLink.click();
AddTocartBTN.click();
Assert.assertEquals(ActualResult , ExpectedResults);
System.out.println(ActualResult);
driver.navigate().back();
driver.navigate().back();
thirdimgLink.click();
AddTocartBTN.click();
Assert.assertEquals(ActualResult , ExpectedResults);
System.out.println(ActualResult);
driver.navigate().back();
driver.navigate().back();
forthimgLink.click();
AddTocartBTN.click();

driver.navigate().back();
fifthimgLink.click();
AddTocartBTN.click();

Assert.assertEquals(ActualResult , ExpectedResults);
System.out.println(ActualResult);

}



public void ClickOnNothanks () {
	
	Nothanks.click();
	}

public void ClickOnProceedCheckout() {
	
	CheckOutLink.click();
	}}

