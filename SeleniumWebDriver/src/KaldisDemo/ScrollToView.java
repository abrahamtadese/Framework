package KaldisDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToView {
	
	WebDriver driver;

	public void launchChrome() {

		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();  
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			//dynamic wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	}
	
	public void scroll() throws InterruptedException {
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
		Thread.sleep(2000);
		 
		JavascriptExecutor temp = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'bxc-grid__image--light')]//a"));
		temp.executeScript("arguments[0].scrollIntoView(true);",element); 
		
		System.out.println(element.getText());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@class,'bxc-grid__image--light')]//a")).click();
		
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		 ScrollToView object = new  ScrollToView();
		 object.launchChrome();
		 object.scroll();

	}

}
