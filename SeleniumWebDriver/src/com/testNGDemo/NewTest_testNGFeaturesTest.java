package com.testNGDemo;

import org.testng.annotations.Test;

public class NewTest_testNGFeaturesTest {
	
	
  @Test (priority=1)
  public void loginTest() {
	  System.out.println("loginTest");
	  int a=1/2;
  }
  
  @Test (priority=2, dependsOnMethods="loginTest")
  public void homePageTest() {
	  System.out.println("homePageTest");
  }
	  
	 @Test(priority=3, dependsOnMethods="homePageTest") 
	 public void searchPageTest() {
		 System.out.println("searchPageTest");
	 }
  }
  

