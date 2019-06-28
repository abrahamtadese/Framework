package captureScreenShot;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utility.Screenshot;
import Utility.StartBrowser;

public class FBScreenshot {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
		
		driver = StartBrowser.launchBrowser("chrome", "https://www.facebook.com/");
	}
	
	
	
	
	@Test
	public void abc() throws Exception {
		
		
	//	FBAccount obj =	PageFactory.initElements(driver, FBAccount.class);
	//	obj.facebookRun("thomas", "Eric");
		
		
		FBAccount obj= new FBAccount(driver);
		obj.facebookRun("james", "lebron");
		
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	@AfterMethod
	public void shot(){
		
		driver = Screenshot.getScreenshot(driver, "facebook21");
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}

}
