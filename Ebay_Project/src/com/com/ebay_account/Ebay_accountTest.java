package com.com.ebay_account;

import org.testng.annotations.Test;

import Utility.StartBrowser;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;

public class Ebay_accountTest {
	
	WebDriver driver;
	
	
	
  @Test(priority=2)
  public void ebaysignIn() throws Exception {
	  
	 
	
	  EbayLogIn obj = new  EbayLogIn(driver);
	  
	  obj.ebaysingIn("thomas", "abebe", "thom@gmail.com", "123erft");
	  Thread.sleep(2000);
	  
  }
	  @Test(priority=1)
	  public void ebaylogIn() throws Exception {
		  
		  
		  EbayLogIn ob = new EbayLogIn(driver);
		  ob.EbayLogInp("abebe", "mulu", "abe@gmail", "1224yrtf");
		  Thread.sleep(2000);
		  
	  }
	  
  
  @BeforeClass
  public void setUp() {
	  
	 driver = StartBrowser.launchBrowser("chrome",  "https://www.ebay.com/");
  }

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
	  
	  
  }

}
