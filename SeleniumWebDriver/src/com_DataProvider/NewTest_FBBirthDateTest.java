package com_DataProvider;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class NewTest_FBBirthDateTest {
	
	 WebDriver driver;
	 
	 @BeforeMethod
	 public void setUp() {
		 
		 driver =   StartBrowser.launchBrowser("chrome", "https://www.facebook.com/"); 
		 
	 }
	
  @Test(dataProvider = "dp")
  public void f(int n, int s) throws InterruptedException {
	  
	  Reporter.log("The browser is started now executing the code", true);
	 

 	new FBBirthDatePage(driver);

	  
	  WebElement se = driver.findElement(By.id("month"));
	  Select dropdown = new Select(se);
	  dropdown.selectByIndex(n);
	  
	  Thread.sleep(2000);
	  
	  WebElement de = driver.findElement(By.id("day"));
	  Select dropdown1 = new Select(de);
	  dropdown1.selectByIndex(s);
	  

	  
	 Reporter.log("This is index no. :"+n, true);
	 
	 Thread.sleep(2000);
	 driver.quit();
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
       new Object[] { 1, 29 },
       new Object[]	{ 3, 17},
       new Object[] { 5, 28},
       new Object[] { 7, 11},
       new Object[]	{ 8, 9},
       new Object[] {12, 17},
      
    };
  }
  
  @AfterMethod
  public void tearDown() {
	  
	  driver.quit();
  }


}
