package WebDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	WebDriver driver;
	
	public void lauchChrome() {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	public void waiting() throws InterruptedException {
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
	    WebElement sun = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		//WebElement sun = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		boolean status = sun.isDisplayed();
		
		if (status) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is not displayed");
		}
		 
		
		Thread.sleep(2000);
		driver.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		ExplicitWait object = new ExplicitWait();
		object.lauchChrome();
		object.waiting();

	}

}
