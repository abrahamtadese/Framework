package com_DataProvider;

import org.testng.annotations.Test;

import com.Utility.StartBrowser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

public class NewTest_FBLoginTest {
	
	WebDriver driver;
	

	@BeforeMethod
	  public void beforeMethod() {
		  
		  driver =   StartBrowser.launchBrowser("chrome", "https://www.facebook.com/");
		  
	}
	
 // @Test(dataProvider = "dp")
  @Test()
  @Parameters({"n","s"})
  
  
  public void f(String n, String s) throws InterruptedException {
	  
	  
	  
	  FBLoginPage provides = new FBLoginPage(driver);
	  provides.login(n, s);
	 
	  
	  Thread.sleep(2000);
	  
	  
  }

//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { "user1", "password1" },
//      new Object[] { "user2", "password2" },
//      new Object[] {"user3", "password3"},
//    };
  //}
  
  
    @AfterMethod
    public void tearDown() {
    	
    	driver.quit();
    }


}
