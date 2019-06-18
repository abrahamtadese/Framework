package ExcelDataProviderDemo;

import org.testng.annotations.Test;

import com.Utility.StartBrowser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class FacebookExcelData {
	
	WebDriver driver;
	
//	data provider is a testNG annotation and it has only one attribute 'name'
	// used for data driven testing
	

	@BeforeClass
	public void setUp() {
	  
	  driver =   StartBrowser.launchBrowser("chrome", "https://www.facebook.com/");
	  

	}

	
  @Test(dataProvider = "dp")
  public void facebookAccount(String n, String s) throws Exception {
	  
	
	  
	  facebookAccount obj = new facebookAccount(driver);
	  obj.login(n, s);
	  
	  Thread.sleep(2000);
	  
		
  }	
	  
 
  @DataProvider(name="dp")
  public Object[][] getData() {
	  
	  ExcelDataTwo DC = new ExcelDataTwo("C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\src\\ExcelUtility\\Files\\Excel Sheet Files\\InputData.xlsx");
		
	int rows =  DC.getRowCount(0);
	
	Object[][] data = new Object[rows][2];
	
	for (int i=0; i<rows; i++) {
		
		data[i][0] = DC.getData(0, i, 0);
		data[i][1]= DC.getData(0, i, 1);
		
	}
	

		
		return data;
	}

  	@AfterClass
  	public void tearDown() {
  		
  		driver.quit();
  	}

}
