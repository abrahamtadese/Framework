package KaldisDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownAndUP {
	
	WebDriver driver;

	public void launchChrome() {

		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();  
			//manage window
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//dynamic wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	}
	
	public void keyUsage() throws InterruptedException {
		
		driver.get("http://www.uitestpractice.com/Students/Actions");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Actions act = new Actions(driver);
//		act.keyDown(Keys.CONTROL)
//		.click(driver.findElement(By.xpath("//li[@name='one']")))
//		.click(driver.findElement(By.xpath("//li[@name='six']")))
//		.click(driver.findElement(By.xpath("//li[@name='eleven']")))
//		.keyUp(Keys.CONTROL)
//		.build()
//		.perform();
//		
		
		WebElement one = driver.findElement(By.xpath("//li[@name='one']"));
		WebElement six = driver.findElement(By.xpath("//li[@name='six']"));
		WebElement eleven = driver.findElement(By.xpath("//li[@name='eleven']"));
		 
		act.keyDown(one, Keys.CONTROL)
		.keyDown(six, Keys.CONTROL)
		.keyUp(eleven, Keys.CONTROL)
		.build()
		.perform();
		
		Thread.sleep(2000);
			
	}
	
	public void dragAndRelease() throws InterruptedException {


		WebElement drag1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drag2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions sky = new Actions(driver);
		sky
		.dragAndDrop(drag1, drag2)
		.build()
		.perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		KeyDownAndUP obj = new KeyDownAndUP();
		obj.launchChrome();
		obj.keyUsage();
		obj.dragAndRelease();
		

	}

}
