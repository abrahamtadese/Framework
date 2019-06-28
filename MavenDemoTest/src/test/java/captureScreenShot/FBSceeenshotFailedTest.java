package captureScreenShot;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utility.StartBrowser;

public class FBSceeenshotFailedTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = StartBrowser.launchBrowser("chrome", "https://www.facebook.com/");
	}
	
	
	@Test
	public void shotRun() {
		
		FBWrongAcc obj = new FBWrongAcc(driver);
		
		obj.facebookRun("abebe", "kebede");
		
		
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
