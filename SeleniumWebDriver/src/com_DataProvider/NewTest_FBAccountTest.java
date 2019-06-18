package com_DataProvider;

import org.testng.annotations.Test;

import com.Utility.StartBrowser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class NewTest_FBAccountTest {
	
	WebDriver driver;
	
//	data provider is a testNG annotation and it has only one attribute 'name'
	// used for data driven testing
	

@BeforeClass
public void setUp() {
	  
	  driver =   StartBrowser.launchBrowser("chrome", "https://www.facebook.com/");
	  

}

	
  @Test(dataProvider = "dp")
  public void facebookAccount(String n, String s) {
	  
	
	  
	  FBAccount obj = new FBAccount(driver);
	  obj.login(n, s);
	  
		
  }	
	  
 
  @DataProvider(name="dp")
  public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		data[0][0]="user1";
		data[0][1]="password1";
		
		data[1][0]="user2";
		data[1][1]="password2";
		
		data[2][0]="user3";
		data[2][1]="password3";
		
		return data;
	}

  	@AfterClass
  	public void tearDown() {
  		
  		driver.quit();
  	}

}
