package com_DataProvider;

import org.testng.annotations.Test;

import com.Utility.ScreenShot;
import com.Utility.StartBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class NewTest_FBBirthDate_YearTest {
	
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String n, String s, String y) throws InterruptedException {
	  
	  Reporter.log("this browser is excuting",  true);
	  
	  
	  WebElement se = driver.findElement(By.id("month"));
	  Select dropdown = new Select(se);
	  dropdown.selectByVisibleText(n);
	  
	  Thread.sleep(2000);
	  
	  WebElement de = driver.findElement(By.id("day"));
	  Select dropdown1 = new Select(de);
	  dropdown1.selectByVisibleText(s);
	  
	  Thread.sleep(2000);
	  WebElement ye = driver.findElement(By.id("year"));
	  Select dropdown2 = new Select(ye);
	  dropdown2.selectByVisibleText(y);
	  
	 Thread.sleep(2000);
	 
	   
  }
  
  @BeforeClass
  public void setUp() {
	  
	driver = StartBrowser.launchBrowser("chrome", "https://www.facebook.com/");
	

	
  }



@DataProvider(name="dp")
public Object[][] getData() {
		
		Object[][] data = new Object[3][3];
		data[0][0]="Sep";
		data[0][1]="12";
		data[0][2]="2004";
		
		data[1][0]="Feb";
		data[1][1]="17";
		data[1][2]="2007";
		
		data[2][0]="Nov";
		data[2][1]="21";
		data[2][2]="2010";
		
		
		return data;
	}


	@AfterClass
	public  void tearDown() {
		
		driver.quit();
	}
}


