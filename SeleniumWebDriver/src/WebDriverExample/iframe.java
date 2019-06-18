package WebDriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	WebDriver driver;
	
	public void openchrome()  {
		
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}
	 
	public void iframeLocator() throws InterruptedException {
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")));
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("james lebron");
		
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		//driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		//driver.findElement(By.xpath("//input[@type='text']"));
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		
		iframe html = new iframe();
		html.openchrome();
		html.iframeLocator();
	}

}
