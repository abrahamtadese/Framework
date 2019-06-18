package KaldisDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderScroll {
	
WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	}
	
	public void slidingOnTheSide() throws InterruptedException {
		
		
		driver.get("https://jqueryui.com/slider/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(0);
		
		WebElement sky = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDropBy(sky, 550, 0).build().perform();
		Thread.sleep(2000);
		act.dragAndDropBy(sky, -550, 0).build().perform();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		SliderScroll ball = new SliderScroll();
		ball.launchChrome();
		ball.slidingOnTheSide();

	}

}
