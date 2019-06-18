package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest_SoftHardAssertionTest {
	
	
  @Test(priority=1)
  public void testSoft() {
	  //soft assertion: test completed though the test failed
	  
	  SoftAssert assertion = new SoftAssert();
	  System.out.println("test 1 started");
	  assertion.assertEquals(12, 13);
	  System.out.println("test 1 completed");
	  assertion.assertAll();
	  
	  
  }
  
  
  @Test (priority=2)
  public void testHard() {
	  
	  // hard assertion: test not completed once the assertion failed
	  System.out.println("test 2 started");
	  Assert.assertEquals(12, 13);
	  System.out.println("test 2 completed");
	  
  }
}
