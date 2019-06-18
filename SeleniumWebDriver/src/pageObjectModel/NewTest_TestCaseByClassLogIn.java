package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest_TestCaseByClassLogIn {
  @Test
  public void verifylogIn() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("http://www.newtours.demoaut.com/");
			
			ByClassLogIn obj = new ByClassLogIn(driver);
//			obj.userele("abraham");
//			obj.passele("abraham.com");
//			obj.loginele();
			
			obj.loginNOW("abraham", "abraham.com");
			
			
	
			
			
			Thread.sleep(2000);
			driver.quit();
  }
}
