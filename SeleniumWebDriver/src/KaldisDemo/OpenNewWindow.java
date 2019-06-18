package KaldisDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewWindow {
	
WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	}
	
	
	public void newwindows() throws InterruptedException {
	// to launch face-book	
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
	
	//	 window-handle is for each window session ID's
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent window session ID : "+parentwindow);
		System.out.println("Parent window title : "+driver.getTitle());
		
	// to open the second window using action class from driver
		WebElement ball = driver.findElement(By.xpath("//a[contains(text(),'Forgot account?')]"));
		Actions options = new Actions(driver);	
		options.keyDown(Keys.SHIFT).click(ball).build().perform();
		
	// to open third window
	//	ball.sendKeys(Keys.chord(Keys.COMMAND,Keys.RETURN));  

	// set to store unique value	
		
		Set <String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size()+" windows are open");
		System.out.println("All window's sessions are: "+allwindows);
		
		Iterator <String> sky = allwindows.iterator();
		while(sky.hasNext()) {
			String childwindow = sky.next();
			if(!parentwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println("Childwindow session: "+childwindow);
				String bus = driver.switchTo().window(childwindow).getTitle();
				System.out.println("Child window title: "+bus);
			}
		}
		
	
		
		
        driver.switchTo().window(parentwindow);
        System.out.println(driver.getTitle());
	
		
		}

	

	public static void main(String[] args) throws InterruptedException {
		 OpenNewWindow object = new  OpenNewWindow();
		 object.launchChrome();
		 object.newwindows();
		 
		 
		 

	}

}
