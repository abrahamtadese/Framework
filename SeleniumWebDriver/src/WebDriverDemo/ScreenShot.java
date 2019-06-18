package WebDriverDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
		
	}
	
	public void expdiatraveling() throws InterruptedException, IOException {
		
		driver.get("https://www.expedia.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		shotmaking("expdia1.png");
		
		driver.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys(" dulles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys(" addis ababa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='text'])[1]")).click();
		
		shotmaking("expdia2.png");
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	public void shotmaking(String name) throws IOException, InterruptedException {
		
	//	String name = "expedia.png";  not needed for now b/c two screenshots needed
		String sky = "C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\ScreenShots\\";
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(sky + name));
				// new File ("C:\\ScreenShotsWebDriver\\expdia1.png")
		
		Thread.sleep(2000);
	}
       
	public static void main(String[] args) throws Exception, IOException {
		ScreenShot sun = new ScreenShot();
		sun.launchChrome();
		sun.expdiatraveling();
		//sun.shotmaking();
		

	}

}
