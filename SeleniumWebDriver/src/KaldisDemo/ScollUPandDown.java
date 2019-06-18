package KaldisDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScollUPandDown {
	
	WebDriver driver;
	
	public void launchChrome() {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// manage window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	public void lanchmacy() throws InterruptedException  {
		// launch macy's Url
		driver.get("https://www.macys.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		JavascriptExecutor ball = (JavascriptExecutor)driver;
		ball.executeScript("scrollBy(0, 5700)");	
		
		Thread.sleep(2000);
		ball.executeScript("scrollBy(0, -5700)");
		
	//	((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
			

	}

	public static void main(String[] args) throws InterruptedException {
		
		 ScollUPandDown sky = new  ScollUPandDown();
		 sky.launchChrome();
		 sky.lanchmacy();
	}

}
