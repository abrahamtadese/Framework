package captureScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBWrongAcc {
	
	
WebDriver driver;
	
	FBWrongAcc(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// intentionally provide wrong x path
		
		@FindBy(xpath="//input[@id='u_0_e'123]") WebElement fname;
		@FindBy(xpath="//input[@id='u_0_g']") WebElement lname;
		
		
		
		public void facebookRun(String name1, String name2) {
			
			fname.sendKeys(name1);
			lname.sendKeys(name2);
			
			
		}
			
		}


