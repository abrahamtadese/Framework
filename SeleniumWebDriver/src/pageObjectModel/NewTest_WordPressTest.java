package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.StartBrowser;

public class NewTest_WordPressTest {
	
	WebDriver driver;
	
  @Test
  public void verifyValidLogin() throws InterruptedException {
	  
	  // this will launch browser and Url
	 driver =   StartBrowser.launchBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
	  
	 //created page object using page factory
	 wordPress loginPage =  PageFactory.initElements(driver, wordPress.class);
	 
	 // call the method
	 loginPage.starting("james",  "demo123");
	 
	 Thread.sleep(2000);
	 driver.quit();
  }
}
