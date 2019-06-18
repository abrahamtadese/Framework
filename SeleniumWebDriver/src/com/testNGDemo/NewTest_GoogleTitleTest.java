package com.testNGDemo;

import org.testng.annotations.Test;

import com.Utility.StartBrowser;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class NewTest_GoogleTitleTest {
	
	WebDriver driver;
	
	 @BeforeMethod
	  public void setUp() {
		 
	driver = StartBrowser.launchBrowser("chrome", "https://www.google.com/");
		 
	  }

  @Test (priority=1)
  public void verifygoogleTitleTest() {
	  String title = driver.getTitle();
	  System.out.println(title);
	// to validate the correct title, using assert class  
	  Assert.assertEquals(title, "Google", "Google");
  }
  
  @Test (priority=2)
  public void googleLogoTest() {
	  
	 boolean b =  driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	 	System.out.println("google logo displayed");
	 	
	 	Assert.assertTrue(b);
	 	Assert.assertEquals(b, true);
  }
 
  @AfterMethod
  public void tearDown() {
	  
	  driver.quit();
  }

}
