package com_DataProvider;

import org.testng.annotations.Test;

import ExcelDataProviderDemo.ExcelDataTwo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class NewTest_KaldisHomePageTest {
	
	WebDriver driver;
	
	 @BeforeClass
	  public void setUp() {
		 
		 driver = StartBrowser.launchBrowser("chrome",  "https://www.facebook.com/");
	  }
	
  @Test(dataProvider = "dp")
  public void f(String n, String s, String m, String x) throws Exception {
	  
	  
	  KaldisHomePage obj = new KaldisHomePage(driver);
	  obj.sigIn(n, s, m, x);
	  Thread.sleep(2000);
  }
  
  
  
  @DataProvider(name="dp")
  public Object[][] getData() {
	  
	ExcelDataTwo DC = new ExcelDataTwo("C:\\Excel Sheet Files\\facebookData.xlsx");
		
	int rows =  DC.getRowCount(0);
	
	Object[][] data = new Object[rows][4];
	
	for (int i=0; i<rows; i++) {
		
		data[i][0] = DC.getData(0, i, 0);
		data[i][1]= DC.getData(0, i, 1);
		data[i][2]= DC.getData(0, i, 2);
		data[i][3]= DC.getData(0, i, 3);
		
	}

		return data;
	}

//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { "Egla", "Solomon", "egla@gmail.com"},
//      new Object[] { "Tom", "Bob", "tom@gmail.com"},
//      new Object[] { "Bekele", "Mulu", "b@gmail.com"},
//      new Object[] { "Yared", "Rahel", "yared@gmail.com"},
//      
//    };
//  }
 

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
	  
  }

}
