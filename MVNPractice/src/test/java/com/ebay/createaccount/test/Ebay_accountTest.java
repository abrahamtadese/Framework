package com.ebay.createaccount.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebay.element.EbayLogIn;

import org.openqa.selenium.WebDriver;

public class Ebay_accountTest  {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
		
		driver = com.utility.StartBrowser.launchBrowser("chrome", "https://www.ebay.com/");
		
		
		
		
	}
	

	
  @Test()
  public void ebay() throws Exception {
	  
	 
	
	  EbayLogIn obj = new EbayLogIn(driver);
	  
	  obj.ebaysingIn("thomas", "abebe", "thom@gmail.com", "123erft");
	  Thread.sleep(2000);
	  
  }
  
  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
	  
  }

  


}
