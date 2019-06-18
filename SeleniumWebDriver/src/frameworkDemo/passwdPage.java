package frameworkDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class passwdPage {
	
	 WebDriver driver;
	
	@FindBy(xpath="//input[@id='identify_email']") WebElement emailfield;
	@FindBy(xpath="//input[@id='u_0_2']") WebElement searchfield;
	@FindBy(xpath="//span[@class='uiButtonText']") WebElement cancelfield;
	
	
	
	public passwdPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchfieldelement(String search) {
		emailfield.sendKeys(search);
	}
	
	public void searchbutton() {
		searchfield.click();
	}
	
	public void cancelbutton() {
		cancelfield.click();
	}
}
