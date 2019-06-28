package com.netflix.testcase;

import org.testng.annotations.Test;

import com.netflix.element.Netflix_hompage;
import com.utility.StartBrowser;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NetflixTest {
	
	WebDriver driver;
	
	  @BeforeClass
	  public void setUp() {
		 driver= StartBrowser.launchBrowser("chrome", "https://www.netflix.com/");
	  }
	
  @Test
  public void netflixSignInVerification() {
	  
	  Netflix_hompage obj =  PageFactory.initElements(driver, Netflix_hompage.class);
	  obj.flix("egla@gmail.com",  "123qwe");
	  
	  
  }
  
	@AfterMethod
	public void facebooktesting(ITestResult result) {
		
		if(ITestResult.SUCCESS==result.getStatus()) {
			
			com.utility.Screenshot.getScreenshot(driver, result.getName());
		}
		
		else if (ITestResult.FAILURE==result.getStatus()) {
			
			com.utility.Screenshot.getScreenshot(driver, result.getName());
		}
			
		}


  @AfterClass
  public void tearDown() {
	  
	  try {
		driver.quit();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
  }
}
