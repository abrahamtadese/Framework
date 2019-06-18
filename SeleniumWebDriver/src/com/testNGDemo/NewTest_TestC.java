package com.testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest_TestC {
	
  @Test(dataProvider = "dp")
  public void f(String n, String s, String browser) {
	  // the declared strings represents the rows
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	//first column
      new Object[] { "user1", "pass1" , "chrome"},
      // second column
      new Object[] { "user2", "pass2", "firefox" },
      // third column
      new Object[] { "user3", "pass3", "IE" },
    };
  }
}
