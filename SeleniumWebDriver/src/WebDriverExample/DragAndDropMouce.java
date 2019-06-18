package WebDriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouce {
	
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
	
	public void launchQuery() throws InterruptedException {
		
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(0); //switch from iframe to frame
		
		
		WebElement sun = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement moon = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions sky = new Actions(driver);
		
		Thread.sleep(3000);
		
	//	sky.clickAndHold(sun).moveToElement(moon).release().build().perform();
		sky.dragAndDrop(sun, moon).build().perform();
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		 DragAndDropMouce mouce = new  DragAndDropMouce();
		 mouce.launchChrome();
		 mouce.launchQuery();
		

	}

}
