package captureScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utility.StartBrowser;

public class facebookmvn {
	
	WebDriver driver;
	
	 @BeforeClass
	  public void setUp()  {
		 
	driver =	 StartBrowser.launchBrowser("chrome", "https://www.facebook.com/");
	
	  }

	  @Test
	  public void FBTestCase() throws Exception {
	  
	    driver.findElement(By.id("u_0_e")).click();
	    driver.findElement(By.id("u_0_e")).clear();
	    driver.findElement(By.id("u_0_e")).sendKeys("Abraham");
	    driver.findElement(By.id("u_0_g")).clear();
	    driver.findElement(By.id("u_0_g")).sendKeys("Tadese");
	    driver.findElement(By.id("u_0_g")).click();
	    driver.findElement(By.id("u_0_j")).click();
	    driver.findElement(By.id("u_0_j")).clear();
	    driver.findElement(By.id("u_0_j")).sendKeys("12345678+");
	    driver.findElement(By.id("u_0_q")).click();
	    driver.findElement(By.id("u_0_q")).clear();
	    driver.findElement(By.id("u_0_q")).sendKeys("123erty");
	 
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("month")).click();
	    new Select(driver.findElement(By.id("month"))).selectByVisibleText("Feb");
	    driver.findElement(By.id("month")).click();
	    driver.findElement(By.id("day")).click();
	    new Select(driver.findElement(By.id("day"))).selectByVisibleText("7");
	    driver.findElement(By.id("day")).click();
	    driver.findElement(By.id("year")).click();
	    new Select(driver.findElement(By.id("year"))).selectByVisibleText("2019");
	    driver.findElement(By.id("year")).click();
	    driver.findElement(By.id("u_0_8")).click();
	    driver.findElement(By.id("u_0_y")).click();
	    
	    Thread.sleep(2000);
	  }

	  @AfterClass
	  public void tearDown() throws Exception {
	    driver.quit();
	  
	  }


}
