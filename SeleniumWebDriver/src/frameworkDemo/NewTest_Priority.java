package frameworkDemo;

import org.testng.annotations.Test;

public class NewTest_Priority {
	
	// Generally testNG tube execute with alphabetic order unless prioritized by user using the word priority
	
  @Test(priority=0)
  public void first() {
	  
	  System.out.println("first");
  }
  
  @Test(priority=1)
  public void second() {
	  
	  System.out.println("second");
  }
  
  @Test(priority=2)
  public void third() {
	  
	  System.out.println("third");
  }
  
  @Test(priority=3)
  public void fourth() {
	  
	  System.out.println("fourth");
  }
}
