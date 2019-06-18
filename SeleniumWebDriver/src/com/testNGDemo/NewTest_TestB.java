package com.testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest_TestB {
	
	
  @Test(dataProvider = "dp")
  public void f(String n, String s, String browser) {
	  // the strings represent the rows
  }

  @DataProvider
  public Object[][] dp() {
	  Object[][] data = new Object[2][3]; //2 column, 3 row
	  //first column
	  data[0][0]= "user1";
	  data[0][1]= "pass1";
	  data[0][2]= "chrome";
	  //second column
	  data[1][0]="user2";
	  data[1][1]="pass2";
	  data[1][2]= "firefox";
	  
	return data;
	
  
  }
}
