package com.wordpress.login.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.wordpress.element.wordPress;

public class NewTest_WordPressTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		  // this will launch browser and Url
		 driver =   com.utility.StartBrowser.launchBrowser("chrome", "https://wordpress.com/log-in");
	}
	
	
	
  @Test
  public void verifyValidLogin() throws InterruptedException {
	  
	
	  
	 //created page object using page factory
	 wordPress loginPage =  PageFactory.initElements(driver, wordPress.class);
	 
	 // call the method
	 loginPage.starting("james",  "demo123");
	 
	 Thread.sleep(2000);
	 driver.quit();
  }
  
  
  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }
}


