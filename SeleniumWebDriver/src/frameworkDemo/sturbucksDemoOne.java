package frameworkDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sturbucksDemoOne {
	
	public static WebDriver driver = null;
	
	@FindBy(id="email")
	private WebElement emailid;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[contains(text(),'Forgot account?')]")
	WebElement forgotaccount;
	
	public sturbucksDemoOne(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void emailIn() {
		emailid.sendKeys("abraham");
	}
	public void passwordIn() {
		password.sendKeys("ethiopia");
	}
//	public void logIn() {
//		loginbutton.click();
		
//	}
	public void forgot() {
		forgotaccount.click();
	

}
	}
