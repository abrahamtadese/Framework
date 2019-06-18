package KaldisDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	
WebDriver driver;
	public String un = "Username";
	public String pw = "pasword";
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	OpenUrl();
	}
	
	public void OpenUrl() {
		
		driver.get("https://www.facebook.com/");
	}

	public static void main(String[] args) {
		
		FB excute= new FB();
		excute.launchChrome();
		

	}

}
