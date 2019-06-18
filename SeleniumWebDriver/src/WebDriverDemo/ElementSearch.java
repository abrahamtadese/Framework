package WebDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementSearch {
	
	WebDriver driver;
	
	public void findElement() {
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
			
			driver.findElement(By.linkText("Your Amazon.com")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
			driver.findElement(By.className("nav-input")).click();
			driver.findElement(By.className("s-image")).click();
			driver.navigate().back();
			
			driver.findElement(By.partialLinkText("Sell")).click();
			
			System.out.println("Current Url is: "+driver.getCurrentUrl());
			
			
			 driver.navigate().to("https://www.google.com/");
			 driver.findElement(By.name("q")).click();
			 driver.findElement(By.name("q")).clear();
			 driver.findElement(By.name("q")).sendKeys("lebron james"); 
			 Thread.sleep(2000);
			 driver.findElement(By.name("btnK")).click();
			// driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Collections'])[1]/following::b[1]")).click();
			 
			 Thread.sleep(2000);
			  
			 driver.close();
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	

	public static void main(String[] args) {
	
		ElementSearch josi = new ElementSearch();
		josi.findElement();
	}

}
