package frameworkDemo;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class NewTest_PasswdTest {
	
	public static WebDriver driver=null;
  @Test
  @Parameters({"search"})
  public void f(String search) throws InterruptedException {
	  sturbucksDemoOne account=new sturbucksDemoOne(driver);
	  account.forgot();
	  Thread.sleep(2000);
	  passwdPage passwd = new passwdPage(driver);
	  passwd.searchfieldelement(search);
	  Thread.sleep(2000);
	  passwd.searchbutton();
	//  passwd.cancelbutton();
	  
	  driver.quit();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	
  }

}
