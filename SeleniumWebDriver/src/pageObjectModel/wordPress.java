package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class wordPress  {
	
	WebDriver driver;
	
	public  wordPress(WebDriver driver){
		
		this.driver= driver;
		
	}
	
	@FindBy(xpath=("//input[@id='user_login']")) WebElement userName;
	@FindBy(xpath=("//input[@id='user_pass']")) WebElement passWord;
	@FindBy(xpath=("//input[@id='wp-submit']")) WebElement logIn;
	
	public void starting(String name, String pass) {
		
		userName.sendKeys(name);
		passWord.sendKeys(pass);
		logIn.click();
	}
}
