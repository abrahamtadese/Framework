package pageObjectModel;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NewTest_SpiceJetLogInTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	  public void setUp() {
		
	driver = com.Utility.StartBrowser.launchBrowser("chrome",  "https://www.spicejet.com/");
		  
	
	  }
	
  @Test
  public void f() throws InterruptedException {
	 
	  Reporter.log("the browser is excuting");
	  
	  SpiceJetLogIn obj = new SpiceJetLogIn(driver);
	  obj.JetlogIn();
	  Thread.sleep(2000);
	  obj.date();
	  Thread.sleep(2000);
	  obj.passenger();
	  Thread.sleep(2000);
	
	  
  }
  	@AfterMethod
  	public void tearDown() {
  		
  		driver.quit();
  	}
  	

}
