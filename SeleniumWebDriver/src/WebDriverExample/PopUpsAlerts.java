package WebDriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpsAlerts {
	
	WebDriver driver;

	public void openChrome() {

		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
}
	
	
	public void AutomationPopUp() throws InterruptedException{
		
		driver.get("http://testautomationpractice.blogspot.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
	}

	public static void main(String[] args) throws InterruptedException {
		PopUpsAlerts obj = new PopUpsAlerts();
		obj.openChrome();
		obj.AutomationPopUp();
		
		
	}
}
		
	


