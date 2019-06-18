package ExcelDataProviderDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookAccount {
	
	WebDriver driver;
	
	facebookAccount(WebDriver driver){
		
		this.driver= driver;
		PageFactory.initElements(driver,  this);
	}
	
	@FindBy(id="email") WebElement emailID;
	@FindBy(id="pass") WebElement passwordID;
//	@FindBy(id="loginbutton") WebElement log;
	
	public void login(String name1, String name2) {
		
		emailID.clear(); emailID.sendKeys(name1);
		passwordID.clear(); passwordID.sendKeys(name2);
//		log.click();
	
	}
	
	

}
