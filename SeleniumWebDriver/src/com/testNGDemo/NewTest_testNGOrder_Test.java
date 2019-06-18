package com.testNGDemo;

//testNG is unit test framework, open source, free, jar files
//TDD -- test driven development
//purpose is to design test cases in a systematic way
//-html reports
//-different annotations
//-priorities/sequences
//-dependency
//- grouping
//-data provider
//
//-install testNG pugin in Eclipse: http://beust.com/eclipse/


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest_testNGOrder_Test {
	
	
	 @BeforeSuite
	  public void beforeSuite() {
		 System.out.println("before suite");
	  }
	 
	 @BeforeTest
	  public void beforeTest() {
		 System.out.println("before test");
	  }
	 
	 @BeforeClass
	 public void beforeClass() {
		 System.out.println("before class");
		 
	 }
	 
		@BeforeMethod
	  	public void beforeMethod() {
			System.out.println("before method");
	  }
	 
	
	 
  @Test
  public void verifytestorder1() {
	  System.out.println(" test1");
  }
  
  @Test
  public void verifytestorder2() {
	  System.out.println(" test2");
  }
  
  		@AfterMethod
  		public void afterMethod() {
  			System.out.println("after method");
  			
  		}


  	 @AfterClass
	  public void afterClass() {
  		 System.out.println("after class");
	  }
	
 

  	 @AfterTest
  	 public void afterTest() {
  		 System.out.println("after test");
  	 }

 

  	 @AfterSuite
  	 public void afterSuite() {
  		 System.out.println("after suite");
  	 }

	}
