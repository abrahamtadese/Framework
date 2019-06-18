package AssertionDemo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest_AssertionTest1 {
	
	
  @Test
  public void test1() {
	  // pass the test: insert true
	  Assert.assertTrue(true);
	  // pass the test with message
	  String abc = "ball";
	  Assert.assertTrue("names do not matching", abc.contentEquals("ball"));

  }
  
  @Test
  public void test2() {
	  // fail the test : insert false
	  Assert.assertTrue(false);
}
}