package frameworkDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 WebDriver driver;
	
	// create the constructor
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") WebElement emailid;
	@FindBy(id="pass") WebElement passwordfield;
	@FindBy(xpath="//input[@id='u_0_j']") WebElement cellnumber;
	@FindBy(id="u_0_2") WebElement loginbutton;
	
	
	public void enteringtheemail(String email) {
		emailid.sendKeys(email);
	}
	public void password(String password) {
		passwordfield.sendKeys(password);
	}
	
	public void celling(String cell) {
		cellnumber.sendKeys(cell);
	}
	public void clickbutton()  {
		loginbutton.click();
	}
		
	
		
		
	}


