package com.com.ebay_account;

import org.testng.annotations.Test;

import Utility.StartBrowser;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Ebay_accountTest {
	
	WebDriver driver;
	
	
  @Test
  public void ebaysignIn() {
	  
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	  driver.findElement(By.xpath("//a[@id='InLineCreateAnAccount']")).click();
	  driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("thomas");
	  driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Jefferson");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("thomas@gmail.com");
	  driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("abcdef1234");
	  driver.findElement(By.xpath("//button[@id='ppaFormSbtBtn']")).click();
	  
	  
	  
	  
	  
	  
  }
  @BeforeClass
  public void setUP() {
	  
	 driver = StartBrowser.launchBrowser("chrome",  "https://www.ebay.com/");
  }

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
	  
	  
  }

}
