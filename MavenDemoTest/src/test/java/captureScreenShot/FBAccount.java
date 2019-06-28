package captureScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FBAccount {
	
	
	WebDriver driver;
	
	FBAccount(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
		
	//	@FindBy(xpath="//input[@id='u_0_e']") WebElement fname;
	//	@FindBy(xpath="//input[@id='u_0_g']") WebElement lname;
		
		@FindBy(how=How.XPATH, using="//input[@id='u_0_e']") WebElement fname;
		@FindBy(how=How.XPATH, using="//input[@id='u_0_g']") WebElement lname;
		
		
		
		
		
		public void facebookRun(String name1, String name2) {
			
			fname.sendKeys(name1);
			lname.sendKeys(name2);
			
			
		}
			
		}

		
		
	
		
		
		

