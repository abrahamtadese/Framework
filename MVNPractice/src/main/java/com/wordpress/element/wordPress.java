package com.wordpress.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class wordPress  {
	
	WebDriver driver;
	
	public  wordPress(WebDriver driver){
		
		this.driver= driver;
		
	}
	
	@FindBy(xpath="//input[@id='usernameOrEmail']") WebElement userName;
	@FindBy(xpath="//button[@class='button form-button is-primary']") WebElement cont;
	
	@FindBy(xpath="//input[@id='password']") WebElement passWord;
	@FindBy(xpath="//button[@class='button form-button is-primary']") WebElement logIn;
	
	public void starting(String name, String pass) {
		
		userName.sendKeys(name);
		cont.click();
		passWord.sendKeys(pass);
		logIn.click();
	}
}
