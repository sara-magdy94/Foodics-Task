package Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class PageBase {

	

	 WebDriver driver ;


	//create constractor
	public PageBase (WebDriver Driver) {
		PageFactory.initElements(Driver,this);


	}
	
	
	// click on btn
	protected  static void Clickbtn(WebElement button) {
		
		button.click();
	}
	
	// send text to element by value
protected  static void SetTextElementText(WebElement TextElement , String value ) 
{
		
	TextElement.sendKeys(value);
	}





	}


