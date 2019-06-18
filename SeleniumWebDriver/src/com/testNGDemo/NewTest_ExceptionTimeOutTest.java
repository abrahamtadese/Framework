package com.testNGDemo;

import org.testng.annotations.Test;

public class NewTest_ExceptionTimeOutTest {
	
  @Test 
  public void infinitLoopTest() {
	  int i=1;
	  while(i<=7) {
		  System.out.println(i);
		  i++;
	  }
	  
	  
  }
}
