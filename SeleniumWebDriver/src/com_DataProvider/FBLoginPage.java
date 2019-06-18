package com_DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {
	
 WebDriver driver;
	
	// create the constructor
	
	public FBLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") WebElement emailID;
	@FindBy(id="pass") WebElement passwordID;
	@FindBy(id="u_0_2") WebElement loginbutton;
	
	
	public void login(String email, String password) {
		emailID.clear(); emailID.sendKeys(email);
		passwordID.clear(); passwordID.sendKeys(password);
		loginbutton.click();
		
		
	}
}

