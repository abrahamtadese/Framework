package WebDriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VolunteerSignUp {
	
	WebDriver driver;
	
	public void openChrome() {

	
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
		}
	
	public void openVolunteer() {
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	public void openDataTables() {
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
	}
		

	public static void main(String[] args) {
		
		 VolunteerSignUp object = new  VolunteerSignUp();
		 object.openChrome();
		 object.openVolunteer();
		 object.openDataTables();
		
	}
}


