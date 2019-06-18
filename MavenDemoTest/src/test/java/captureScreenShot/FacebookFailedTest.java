package captureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookFailedTest {
	

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = Utility.StartBrowser.launchBrowser("chrome", "http://wwww.facebook.com/");
		
		
	}
	
	@Test
	public void captureScreenShot() throws Exception {
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
	
	
		
	// Intentionally failed the test by providing wrong xPath
		
		driver.findElement(By.xpath("//input[@id='u_0_e'1]")).sendKeys("abraham");
		driver.findElement(By.xpath("//input[@id='u_0_g']")).sendKeys("jacob");
		
		Thread.sleep(2000);
		
	
	
	}
	
	@AfterMethod
	public void facebooktesting(ITestResult result) {
		
		if(ITestResult.SUCCESS==result.getStatus()) {
			
			Utility.Screenshot.getScreenshot(driver, result.getName());
		}
		
		else if (ITestResult.FAILURE==result.getStatus()) {
			
			Utility.Screenshot.getScreenshot(driver, result.getName());
		}
		
		
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
		
	}
}


