package AssertionDemo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest_AssertionTest {
	
	
  @Test
  public void test1() {
	  
	  // assert is action class a: soft assert b:hard assert
	  //  expected 12 but was 14: error
	  Assert.assertEquals(12, 14);
  }
  
  @Test
  public void test2() {
	  //expected 12 but was 13
	  System.out.println("Test case 2 started");
	  Assert.assertEquals("do not match : error", 12,  13);
	  System.out.println("Test case 2 completed");
  }
  
  @Test
  public void test3() {
	  
	  System.out.println("Test case 3 started");
	 
	  Assert.assertEquals("Words does not match",  "Hello", "Hello");
	  
	  System.out.println("Test case 3 completed");
  }
}





