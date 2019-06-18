package WebDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationURl {
	
	WebDriver driver;

	
	public void launchChrome() {
	
	
	System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	
	public void navigation() throws InterruptedException {
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
	
	public void quit() {
		
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		
		NavigationURl obj = new NavigationURl();
		obj.launchChrome();
		obj.navigation();
		obj.quit();

	}

}
