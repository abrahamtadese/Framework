package WebDriverDemo;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CapturedScreenShots {

	WebDriver driver;
	
	
	public void launchChrome() {
		
			System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
		}
	
	public void googlescreenshots() throws Exception {
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		
		
		TakesScreenshot temp = (TakesScreenshot)driver;
		File source = temp.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\ScreenShots\\google.png"));
		
		System.out.println("Google screenshot captured");
		
		
		
		
		
	}
	
	public void amazonscreenshot() throws Exception {
		
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());
		
		TakesScreenshot temp = (TakesScreenshot)driver;
		File source = temp.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\ScreenShots\\amazon.png"));
		
		System.out.println("Amazon screenshot captured");
		
	}
	
	public void lambscreenshot() throws Exception {
		
		driver.navigate().to("https://www.lamborghini.com/en-en");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		TakesScreenshot ball = (TakesScreenshot)driver;
		File source = ball.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\ScreenShots\\lamborghini.png"));
		
		System.out.println("Lamborghini screenshot captured");
	}
		
	public void quit() throws InterruptedException {	
		
		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) throws Exception {
		CapturedScreenShots temp = new CapturedScreenShots();
		temp.launchChrome();
		temp.googlescreenshots();
		temp.amazonscreenshot();
		temp.lambscreenshot();
		temp.quit();

	}

}
