package com_DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KaldisHomePage {
	
	WebDriver driver;
	
	
	KaldisHomePage (WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,  this);
	}
	
	
	@FindBy(xpath="//input[@id='u_0_e']") WebElement firstname;
	@FindBy(xpath="//input[@id='u_0_g']") WebElement lastname;
	@FindBy(xpath="//input[@id='u_0_j']") WebElement email;
	@FindBy(xpath="//input[@id='u_0_q']") WebElement newemail;
	
	public void sigIn(String fname, String lname, String mail, String mail2) {
		firstname.clear();
		firstname.sendKeys(fname);
		lastname.clear();
		lastname.sendKeys(lname);
		email.clear();
		email.sendKeys(mail);
		newemail.clear();
		newemail.sendKeys(mail2);
	}
	
	

}
