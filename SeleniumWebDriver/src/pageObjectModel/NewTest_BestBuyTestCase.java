package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utility.ScreenShot;
import com.Utility.StartBrowser;

public class NewTest_BestBuyTestCase {
	
	WebDriver driver;
	
	
  @Test
  public void verifychatting() throws InterruptedException, IOException {
	  
	driver =   com.Utility.StartBrowser.launchBrowser("chrome" , "https://www.bestbuy.com/");
	
	bestBuyService exe = new bestBuyService(driver);
	exe.livechat("JamesLebron23@gmail.com");
	Thread.sleep(2000);
	exe.screenshot("bestbuytest1.png");
	
	Thread.sleep(2000);
	  
	 
	  
  }

  @Test
  public void verifydate() throws InterruptedException, IOException {
	  
	bestBuyService sky = new bestBuyService(driver);
	sky.appointment();
	 Thread.sleep(2000);
	 sky.screenshot("bestbuytest2.png");
	 Thread.sleep(2000);
	 driver.quit();
	 
	  
	  
  }  
  }
		  
		  
		  