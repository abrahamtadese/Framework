package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ByClassLogIn {
	
	WebDriver driver;    // Create a class attribute
	
	By username = By.xpath("//input[@name='userName']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//input[@name='login']");

	// create constructor
	public ByClassLogIn(WebDriver driver) {
		
	//separate method to initialize web element of page object is initElement
		// important feature of page factory is cache feature that will store all
		// frequent used web-element in cache
		
		this.driver=driver;
		PageFactory.initElements(driver,  this);
	}
	
	public void loginNOW(String name, String pass) {
		driver.findElement(username).sendKeys(name);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		
	}
	
//	// method one
//	public void userele(String name) {
//		driver.findElement(username).sendKeys(name);
//	}
//	
//	// method two
//	public void passele(String pass) {
//		driver.findElement(password).sendKeys(pass);
//	}
//	
//	//method three
//	public void loginele() {
//		driver.findElement(login).click();
//	}

}
