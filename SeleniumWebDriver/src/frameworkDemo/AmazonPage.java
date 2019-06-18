package frameworkDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
	
	 WebDriver driver;
	
	
	
	public AmazonPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,  this);
		
	}
	
	
	@FindBy(xpath="//span[@class='nav-line-2'][contains(text(),'Account & Lists')]") WebElement hover;
	
	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]") WebElement signIn;
	
	public void hovering() {
		Actions act = new Actions(driver);
		act.moveToElement(hover).build().perform();
		
	}
	
	public void signingIN() {
		
		signIn.click();
		
	}
	
	
		
	}
	


