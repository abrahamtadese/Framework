package com.com.ebay_account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EbayLogIn {
	
	
	WebDriver driver;
	
	 EbayLogIn(WebDriver driver){
		 
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
	 
	 
	 
	 @FindBy(how=How.XPATH, using="//*[@id=\"gh-p-3\"]/a")
		WebElement helpNContactMenuLink;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"register\"]")
		WebElement registerAccLink;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"firstname\"]")
		WebElement fNameInput;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"lastname\"]")
		WebElement lNameInput;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"email\"]")
		WebElement emailInput;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"PASSWORD\"]")
		WebElement passInput;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"ppaFormSbtBtn\"]")
		WebElement createAccButton;
	 
	 
	 public void ebaysingIn(String fname, String lname, String email, String passw) {
		 
		 signIn.click();
		 creataccount.click();
		 firstname.sendKeys(fname);
		 lastname.sendKeys(lname);
		 mail.sendKeys(email);
		 pass.sendKeys(passw);
		 button.click();
		 
		 
	 }
	 
		public void EbayLogInp(String fname, String lname, String emailin, String pass) {
			helpNContactMenuLink.click();
			registerAccLink.click();
			fNameInput.clear();
			fNameInput.sendKeys(fname);
			lNameInput.clear();
			lNameInput.sendKeys(lname);
			emailInput.clear();
			emailInput.sendKeys(emailin);
			passInput.clear();
			passInput.sendKeys(pass);
			createAccButton.click();
	
	

}
}
