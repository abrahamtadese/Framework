package frameworkDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class NewTest_HomePageTest {
	
	 WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  HomePage exe = new HomePage(driver);
	  
//	  SoftAssert selected = new SoftAssert();
	  
	  exe.enteringtheemail("james@gmail.com");
	  
	  exe.password("john12");
	  exe.celling("1234567890");
	  exe.clickbutton();
	  Thread.sleep(2000);
//	  selected.assertTrue(driver.findElement(By.id("loginbutton")).isSelected());
//	  selected.assertAll();
	  
//	Thread.sleep(3000);
	
//	SoftAssert checks = new SoftAssert();
//	checks.assertTrue(driver.findElement(By.id("u_0_2")).isSelected());
		
		boolean button = driver.findElement(By.id("u_0_2")).isDisplayed();
		System.out.println(button);
		
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
