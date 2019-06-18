package com_DataProvider;

import org.testng.annotations.Test;

import com.Utility.StartBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class NewTest_FBTwoDimTest {
	
	WebDriver driver;
	
	 @BeforeClass
	  public void setUp() {
		  
		 driver =  StartBrowser.launchBrowser("chrome",  "https://www.facebook.com/");
	  }
	
  @Test (dataProvider= "TestData")
  public void f(int n, int s, int y) throws InterruptedException {
	  
	  
	WebElement se = driver.findElement(By.id("month"));
	  Select dropdown = new Select(se);
	  dropdown.selectByIndex(n);
	  
	  Thread.sleep(2000);
	  
	  WebElement de = driver.findElement(By.id("day"));
	  Select dropdown1 = new Select(de);
	  dropdown1.selectByIndex(s);
	  
	  Thread.sleep(2000);
	  WebElement ye = driver.findElement(By.id("year"));
	  Select dropdown2 = new Select(ye);
	  dropdown2.selectByIndex(y);
	  
	 

  }
	  @DataProvider(name="TestData")
	  public Object[][] getData() {
		  
		  Object data[][] = new Object [3][3];
		  
		

		 int x = 1;
		 
		 for (int i=0; i<3; i++) {
			 for( int j=0; j<3; j++) {
				 
				 data[i][j] = x;
				 x +=1;
			 }
		 }
		 
		return data;
		 
		
	
		  
	  }
	  
  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }
 

}
