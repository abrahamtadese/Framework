package com_DataProvider;

import org.testng.annotations.Test;

import com.Utility.StartBrowser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
public class NewTest_SpiceJetAccountTest {
	
	WebDriver driver;
	
	@BeforeClass
	  public void setUp() throws IOException, InterruptedException {
		
	driver = StartBrowser.launchBrowser("chrome",  "https://www.spicejet.com/");
		
		
	  }
	
	
  @Test(dataProvider = "dp")
  public void verifySpiceJetAccount(String n, String s) throws InterruptedException, IOException {
	
	   
	 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  WebElement se = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	  Select dropdown = new Select(se);
	  dropdown.selectByVisibleText(n);
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	  WebElement de = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
	  Select dropdown1 = new Select(de);
	  dropdown1.selectByVisibleText(s);
	  
	  
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Adampur", "Bengalure" },
   //  new Object[] { 2, 2},
    };
  }
  
  
  @AfterClass
  public void tearDown() {
	  
	  
	  driver.quit();
  }

}
