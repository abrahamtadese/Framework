
package frameworkDemo;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {
	public static WebDriver driver = null;
	
	@BeforeClass
	public static void setUpBeforeClass()  {
//		HomePage execute = new HomePage(driver);
//		execute.openchrome();

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		
	}

	@Test
	public void test() {
		HomePage execute = new HomePage(driver);
	//	execute.openchrome();
		execute.enteringtheemail("abraham");
		execute.password("abraham.com");
		execute.clickbutton();

		
	
	}
}
	

	

	
	
	
	



