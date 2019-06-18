package KaldisDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUpsCancel {
	
WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	public void cancelPopUps() throws InterruptedException {
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(2000);
	//	driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		
	}
	
	
	public void alertWithTextBox() throws InterruptedException {
		driver.get("http://demo.automationtesting.in/Alerts.html");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("abraham");
		driver.switchTo().alert().accept();
	
		Thread.sleep(2000);
		driver.quit();	
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		 Alert_PopUpsCancel ups = new  Alert_PopUpsCancel();
		 ups.launchChrome();
		// ups.cancelPopUps();
		 ups.alertWithTextBox();
		

	}

}
