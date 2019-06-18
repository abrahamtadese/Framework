package com.testNGDemo;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest_TestA {
	
	@BeforeTest
	public void before() {
		
		// open browser
		System.out.println("before test");
	}
	
	@AfterTest
	public void after() {
		
		//close browser
		
		System.out.println("aftertest");
	}
	
	
	
  @Test
  public void TestA() {
	  
	  String expvalue="A";
	  String actvalue="A";
	  //assertions
	 Assert.assertEquals(expvalue, actvalue);
	//  Assert.assertTrue(true, "error");
	  
	  // intentional fail the test
	//  Assert.fail("error");
  }
}
