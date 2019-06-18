package frameworkDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest_Dependency {

@Test()
  public void first() {
	  
	  System.out.println("first method");
	  
	  int a=6;
	  int b =8; 
	  int c= a+b;
	  Assert.assertEquals(c, 14);
  }
  
  @Test(dependsOnMethods = {"first"})
  public void second() {
	  
	  System.out.println("second method");
  }
  
  @Test(dependsOnMethods = {"second"})
  public void third() {
	  
	  System.out.println("third");
  }
  
  @Test()
  public void fourth() {
	  
	  System.out.println("fourth");
  }
}

