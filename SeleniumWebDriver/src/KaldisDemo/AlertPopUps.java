package KaldisDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {
	
WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	public void alertaccept() throws InterruptedException {
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(2000);
		
		// driver.switchTo().alert().accept();  //accept alert or pop-ups
		
		Alert sky = driver.switchTo().alert();
		System.out.println(sky.getText());
		
		String stars = sky.getText();
		
		if (stars.equalsIgnoreCase(stars)) {
			System.out.println(stars+" is correct alert message");
		}
		else {
			System.out.println("wrong alert message");
		}
		
		sky.accept();  //click on OK
		// sky.dismiss(); //click on cancel
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		AlertPopUps kaldis = new AlertPopUps();
		kaldis.launchChrome();
		kaldis.alertaccept();
		 

	}

}
