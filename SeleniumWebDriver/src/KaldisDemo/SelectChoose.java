package KaldisDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectChoose {
	
WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	}
	
public void openAutomation() throws InterruptedException {
		
		driver.get("http://testautomationpractice.blogspot.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	    Thread.sleep(2000);
		// click the box
		driver.findElement(By.xpath("//select[@id='products']")).click();
		// select the element
		WebElement ball = driver.findElement(By.xpath("//select[@id='products']"));
		Select basketball = new Select(ball);
		basketball.selectByVisibleText("Google");
		// click the selected
		driver.findElement(By.xpath("//select[@id='products']")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='animals']")).click();
		// select the element
		WebElement ball1 = driver.findElement(By.xpath("//select[@id='animals']"));
		Select basketball1 = new Select(ball1);
		basketball1.selectByVisibleText("Baby Cat");
		// click the selected
		driver.findElement(By.xpath("//select[@id='animals']")).click();
		
		Thread.sleep(2000);
		
		List <WebElement> sky = driver.findElements(By.xpath("//fieldset[2]"));
		
		for (WebElement skyline:sky) {
			
			String skyblue = skyline.getText();
			System.out.println(skyblue);
		}
		
		
		
		
}

public void dragAndDrop() throws InterruptedException {
	
	WebElement sun = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
	WebElement moon = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions plant = new Actions(driver);
	plant.dragAndDrop(sun, moon).build().perform();
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
}
		
		

	public static void main(String[] args) throws InterruptedException {
		
		SelectChoose soccerball = new SelectChoose();
		soccerball.launchChrome();
		soccerball.openAutomation();
		soccerball.dragAndDrop();
		
		

	}

}
