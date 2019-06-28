package com.ebay.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EbayLogIn {
	
	
	WebDriver driver;
	
	 public EbayLogIn(WebDriver driver){
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
		 
	 }
	 
	 @FindBy(xpath="//a[contains(text(),'Sign in')]") WebElement signIn;
	 @FindBy(xpath="//a[@id='InLineCreateAnAccount']") WebElement creataccount;
	 @FindBy(xpath="//input[@id='firstname']") WebElement firstname;
	 @FindBy(xpath="//input[@id='lastname']") WebElement lastname;
	 @FindBy(xpath="//input[@id='email']") WebElement mail;
	 @FindBy(xpath="//input[@id='PASSWORD']") WebElement pass;
	 @FindBy(xpath="//button[@id='ppaFormSbtBtn']") WebElement button;
	 
	 
	 

	 
	 
	 public void ebaysingIn(String fname, String lname, String email, String passw) {
		 
		 signIn.click();
		 creataccount.click();
		 firstname.sendKeys(fname);
		 lastname.sendKeys(lname);
		 mail.sendKeys(email);
		 pass.sendKeys(passw);
		 button.click();
		 
		 
		 
		 
	 }
	 
}
	
	



