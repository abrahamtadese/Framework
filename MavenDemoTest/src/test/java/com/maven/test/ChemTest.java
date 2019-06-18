package com.maven.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ChemTest {
	
	@Test (priority=1)
	public void multi() {
		System.out.println("mul");
		int a=10;
		int b= 20;
		Assert.assertEquals(200, a*b);
}
	@Test (priority=2)
	public void div() {
		System.out.println("div");
		int a=10;
		int b= 20;
		Assert.assertEquals(2, b/a);
}

}
