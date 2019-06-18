package com_DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBBirthDatePage {
	
  WebDriver driver;

  
 public FBBirthDatePage(WebDriver driver){
	  
	  this.driver= driver;
	  PageFactory.initElements(driver, this);
  }
	
	
	
	@FindBy(id="month") WebElement month;
	@FindBy(id="'day") WebElement day;
	//@FindBy(id="year") WebElement year;
	@FindBy(xpath="//select[@id='year']") WebElement year;

	
  


}
