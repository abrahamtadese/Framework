package WebDriverDemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	
	WebDriver driver;
	
	public void openchrome() {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	public void actitimelogin() throws Exception  {
		
		try {
			driver.get("https://online.actitime.com/tcg/login.do");
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			Thread.sleep(2000);
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			
			System.out.print("please enter username: ");
			String username = input.nextLine();
			driver.findElement(By.name("username")).sendKeys(username);
			
			
			System.out.print("please enter password: ");
			String password = input.nextLine();
			driver.findElement(By.name("pwd")).sendKeys(password);
			
		
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
			String valid = "//span[contains(text(),'Username or Password is invalid. Please try again.')]";
			
			WebElement valid1 = driver.findElement(By.xpath(valid));
		
		
			boolean object = valid1.isDisplayed();
			 
			 if(object) {
				 
				 System.out.println("please try again");
			 }
			 else {
				 
				 System.out.println("Wrong Info Entered");
			 
			 }
			 
			
				System.out.println(driver.getCurrentUrl());
				
				
				TakesScreenshot temp = (TakesScreenshot)driver;
				File source = temp.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(source, new File("C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\ScreenShots\\actitime.png"));
				
				System.out.println("ActiTime screenshot captured");
			 
			 
			 Thread.sleep(1000);
			 driver.quit();
			
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
	

	public static void main(String[] args) throws Exception {
		
		
		
		ActiTime time = new ActiTime();
		time.openchrome();
		time.actitimelogin();
		

	}

}
