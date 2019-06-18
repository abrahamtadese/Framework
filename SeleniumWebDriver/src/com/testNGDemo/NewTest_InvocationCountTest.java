package com.testNGDemo;

import org.testng.annotations.Test;

public class NewTest_InvocationCountTest {
	
  @Test (invocationCount = 7)
  public void sum() {
	  int a=10; int b=20; int c= a+b;
	  System.out.println("sum is : "+c);
  }
}
