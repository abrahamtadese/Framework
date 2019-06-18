package com.testNGDemo;

import org.testng.annotations.Test;

import com.Utility.StartBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NewTest_GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	  public void setUp() {
		
		driver = StartBrowser.launchBrowser("chrome", "https://www.google.com/");
	  }
	
	
  @Test (priority = 1)
  public void googleTitleTest() {
	  
	  System.out.println(driver.getTitle());
  }
  
  @Test (priority = 2)
  public void googleURl() {
	  System.out.println(driver.getCurrentUrl());
	  
  }
  
  @Test (priority = 3)
  public void googleLogoTest() {
	  
	 boolean b =  driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	 	System.out.println("google logo displayed");
  }
  
  
  
   @AfterMethod
   public void tearDown() {
	   
	   driver.quit();
	     
   }

}
