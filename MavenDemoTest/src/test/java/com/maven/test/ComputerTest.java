package com.maven.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ComputerTest {
	
	@Test (priority=1)
	public void sum() {
		System.out.println("sum");
		int a=10;
		int b= 20;
		Assert.assertEquals(30, a+b);
		
		
	}
	@Test (priority=2)
	public void sub() {
		System.out.println("sub");
		int a=10;
		int b= 20;
		Assert.assertEquals(10, b-a);
	}

}
