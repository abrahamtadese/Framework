package ExcelDataProviderDemo;

import org.testng.annotations.Test;

import com.Utility.ScreenShot;
import com.Utility.StartBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class facebookMonthDayYear {
	
	WebDriver driver;
	
	  @BeforeClass
	  public void setUp() {
		  
		driver =  StartBrowser.launchBrowser("chrome", "https://www.facebook.com/");
	  }

	
  @Test(dataProvider = "dp")
  public void f(String n, String s, String y, String z) throws InterruptedException {
	  
	  Reporter.log("this browser is excuting",  true);
	  
	  driver.findElement(By.xpath("//input[@id='u_0_e']")).clear();
	  driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys(n);
	  
	  driver.findElement(By.xpath("//input[@id='u_0_g']")).clear();
	  driver.findElement(By.xpath("//input[@id='u_0_g']")).sendKeys(s);
	  
	  driver.findElement(By.xpath("//input[@id='u_0_j']")).clear();
	  driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys(y);
	  
	  driver.findElement(By.xpath("//input[@id='u_0_q']")).clear();
	  driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys(z);
	  

	  
	 Thread.sleep(2000);
	 
	   
  }
  



@DataProvider(name="dp")
public Object[][] getData() {
	
	  ExcelDataTwo DC = new ExcelDataTwo("C:\\Excel Sheet Files\\InputData.xlsx");
		
	int rows =  DC.getRowCount(0);
	
	Object[][] data = new Object[rows][4];
	
	for (int i=0; i<rows; i++) {
		
		data[i][0] = DC.getData(1, i, 0);
		data[i][1]= DC.getData(1, i, 1 );
		data[i][2]= DC.getData(1, i, 2);
		data[i][3]= DC.getData(1, i, 3);
		
	}
	

		
		return data;
	}



	@AfterClass
	public  void tearDown() {
		
		driver.quit();
	}
	
	
	
}


