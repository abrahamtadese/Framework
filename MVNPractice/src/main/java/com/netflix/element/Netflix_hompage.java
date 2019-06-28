package com.netflix.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Netflix_hompage {
	
	
	
	WebDriver driver;
	
	public Netflix_hompage (WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
	@FindBy(xpath="//a[@class='authLinks redButton']") WebElement sign;
	@FindBy(xpath="//input[@id='id_userLoginId']") WebElement mail;
	@FindBy(xpath="//input[@id='id_password']") WebElement pass;
	@FindBy(xpath="//button[@class='btn login-button btn-submit btn-small']") WebElement In;
	
	
	public void flix(String m, String p) {
		
		sign.click();
		mail.sendKeys(m);
		pass.sendKeys(p);
		In.click();
		
		
		
		
	}
	

}
