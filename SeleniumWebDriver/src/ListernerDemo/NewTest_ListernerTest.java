package ListernerDemo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




 @Listeners(ListernerDemo.TestNGListerner.class)

public class NewTest_ListernerTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		
		driver = com.Utility.StartBrowser.launchBrowser("chrome", "https://www.google.com/");
			
	
	}
	

	@Test
	public void googleTitleVerify() {
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
	
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
	@Test
	public void titleMatch() {
		
		System.out.println("test 2 dummy");
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	}


