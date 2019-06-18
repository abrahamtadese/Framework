package frameworkDemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest_ProviderData {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("This is equal : "+n);
	  System.out.println("This is equal string :"+s);

  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    new Object [] {3, "c"},
    };
      
    
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
