package WebDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazon {
	
	WebDriver driver;
	
	public void open() {
		try {
			System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			String Url = "https://www.amazon.com/";
			driver.get(Url);
			System.out.println("The Url is: "+Url);
			
			
			driver.findElement(By.linkText("Today's Deals")).click();
			
			//String sun = driver.getCurrentUrl();
			//System.out.println("Current Url is: "+sun);
			System.out.println("Currrent Url is: "+driver.getCurrentUrl());
			
			
			//String moon = driver.getTitle();
			//System.out.println("The Title of the page is: "+moon);
			System.out.println("The title of the page is: "+driver.getTitle());
			
			//String mountain = driver.getPageSource();
			//System.out.println("The current page source is: "+mountain);
			
			//System.out.println("The Current page source is: "+driver.getPageSource());
			
			String river = ("https://www.facebook.com/");
			driver.navigate().to(river);
			System.out.println("The Url is: "+river);
			
			
			driver.findElement(By.linkText("Forgot account?")).click();
			
			
			driver.findElement(By.id("identify_email")).sendKeys("123456789");
			driver.findElement(By.name("did_submit")).click();
			
			System.out.println("Current Url is: "+driver.getCurrentUrl());
			System.out.println("Currennt page source is: "+driver.getTitle());
	
			
			//Thread.sleep(3000);
			//driver.navigate().back();
			//Thread.sleep(3000);
			//driver.navigate().forward();
			//Thread.sleep(3000);
			//driver.navigate().refresh();
			
			driver.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		OpenAmazon obj = new OpenAmazon();
		obj.open();

	}

}
