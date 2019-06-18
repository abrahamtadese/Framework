package frameworkDemo;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class NewTest_AmazonPageTest {
	
	 WebDriver driver;
	
  @Test
  public void verifyAmzondLogIn() throws InterruptedException {
	  
	  AmazonPage obj = new AmazonPage(driver);
	  obj.hovering();
	  obj.signingIN();
	  
	  Thread.sleep(3000);
		
		boolean button = driver.findElement(By.xpath("//input[@id='signInSubmit']")).isDisplayed();
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
		
		driver.get("https://www.amazon.com/");
		
  }

}
