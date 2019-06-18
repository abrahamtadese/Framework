package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ByFindLogIn {
	static WebDriver driver = null;
	

	// create constructor
	public ByFindLogIn(WebDriver driver) {
		
		ByFindLogIn.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='userName']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//input[@name='login']") WebElement login;
//	@FindBy(how=How.XPATH, using="//input[@name='login']") WebElement login;
	
	
	

	
	//only one method
	public void loginmethod(String name, String pass) {
		
		username.sendKeys(name);
		password.sendKeys(pass);
		login.click();
		
	}
	

	
}



