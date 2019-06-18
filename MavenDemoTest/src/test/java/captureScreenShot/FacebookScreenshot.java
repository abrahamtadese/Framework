package captureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookScreenshot {
	
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = Utility.StartBrowser.launchBrowser("chrome", "http://wwww.facebook.com/");
		
		
	}
	
	@Test
	public void screenShot() throws Exception {
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
	
	Utility.Screenshot.getScreenshot(driver, "facebook10.png");
		
	
		
		driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys("abraham");
		driver.findElement(By.xpath("//input[@id='u_0_g']")).sendKeys("tadese");
		
		Thread.sleep(2000);
		
	Utility.Screenshot.getScreenshot(driver, "facebook11.png");
		
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
		
	}
}
