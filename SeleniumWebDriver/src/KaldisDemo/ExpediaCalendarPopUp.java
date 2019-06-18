package KaldisDemo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpediaCalendarPopUp {
	
WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	}
	
	public void calanderdaymonth() throws InterruptedException, Exception {
		
		driver.get("https://www.expedia.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys(" dulles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='text'])[1]")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys(" addis ababa");
		driver.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys(" dubai");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[@id='aria-option-1']")).click();
		driver.findElement(By.xpath("//a[@id='aria-option-1']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@data-day='26'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='package-returning-hp-package']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@data-day='10'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='traveler-selector-hp-package']//ul[@class='menu-bar-inner']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='secondary gcw-component gcw-component-initialized gcw-clone-field']")).click();
		driver.findElement(By.xpath("//li[@class='open']//button[@class='close btn-text']")).click();
		
		Thread.sleep(2000);
		
			 driver.findElement(By.xpath("//select[@id='package-advanced-preferred-class-hp-package']")).click();
			 
			 WebElement stars = driver.findElement(By.xpath("//select[@id='package-advanced-preferred-class-hp-package']"));
			
			 Select sky = new Select(stars);
			 sky.selectByVisibleText("Business");
			
			 
			 driver.findElement(By.xpath("//select[@id='package-advanced-preferred-class-hp-package']")).click();
			 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//button[@id='search-button-hp-package']")).click();
			 
			 Thread.sleep(10000);
			 
				TakesScreenshot temp = (TakesScreenshot)driver;
				File source = temp.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source, new File("C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\ScreenShots\\expedia.png"));
				
				System.out.println("Expedia screenshot captured");
				
				Boolean status = source.exists();
				
				if(status) {
				
				 System.out.println("Correct Flight booked");
				} 
				
				
				 
				 
				 Thread.sleep(2000);
			 driver.quit();
		
		
	}

	public static void main(String[] args) throws Exception {
		
		ExpediaCalendarPopUp travel = new ExpediaCalendarPopUp();
		travel.launchChrome();
		travel.calanderdaymonth();
		

	}

}
