package WebDriverExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ListPrinting {
	
	WebDriver driver;
	
	public void open() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}

	
	public void listcounting() {
		
		try {
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
			System.out.println(driver.getCurrentUrl());
			
			WebElement object;
			
			// object = driver.findElement(By.xpath("//button[@class='dropbtn']"));
			//object= driver.findElement(By.xpath("//button[contains(text(),'Automation Tools')]"));
			object= driver.findElement(By.xpath("//button[text()='Automation Tools']"));
			
			
			Actions temp = new Actions(driver);
			temp.moveToElement(object).perform();
			
			List<WebElement> links  = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
			int count = links.size();
			System.out.println(count);
			
			for (WebElement sun : links) {
				String sun1 = sun.getText();
				System.out.println("List names is: "+sun1);
				
				if (sun1.equalsIgnoreCase("Appium")){
					sun.click();
					System.out.println(driver.getCurrentUrl());
					System.out.println(driver.getTitle());
					break;
					
				}
					
				}
			
			Thread.sleep(2000);
			
			driver.quit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		ListPrinting sun = new ListPrinting();
		sun.open();
		sun.listcounting();
		

	}

}
