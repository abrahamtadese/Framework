package KaldisDemo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class macyShopping {
	
	WebDriver driver;
	
	public void openChrome() {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// manage window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	public void openmacy() throws InterruptedException, Exception {
		// launch macy's Url
		driver.get("https://www.macys.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		sreenshot("macy1.png");
		
		
	// hovering 18 lists	
		WebElement element = driver.findElement(By.xpath("//span[@id='shopByDepartmentLabelText']"));
		Actions ball = new Actions(driver);
		ball.moveToElement(element).perform();
			Thread.sleep(2000);
	// print of the 18 list shop by department	
		 List <WebElement> worldcup = driver.findElements(By.xpath("//ul[@id='mainNavigationFobs']//li"));
		 System.out.println(worldcup.size()); 
		  Thread.sleep(2000);
		 for (WebElement sky:worldcup) {
		 String stars = sky.getText(); 
		 System.out.print(stars+"/"); 
		 }
		 System.out.println();
		 
		 WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'WOMEN')]"));
		 WebElement element2 = driver.findElement(By.xpath("//li[@id='flexid_1']//a"));
		 WebElement element3 =driver.findElement(By.xpath("//span[contains(text(),'KIDS & BABY')]"));
		 WebElement element4 = driver.findElement(By.xpath("//span[contains(text(),'HOME')]"));
		 WebElement element5 = driver.findElement(By.xpath("//span[contains(text(),'SHOES')]"));
		 WebElement element6 = driver.findElement(By.xpath("//span[contains(text(),'HANDBAGS')]"));
		 WebElement element7 = driver.findElement(By.xpath("//span[contains(text(),'BEAUTY')]"));
		 WebElement element8 = driver.findElement(By.xpath("//span[contains(text(),'FURNITURE')]")); 
		 WebElement element9 = driver.findElement(By.xpath("//span[contains(text(),'BED & BATH')]"));
		 WebElement element10 = driver.findElement(By.xpath("//span[contains(text(),'JEWELRY')]"));
		 WebElement element11 = driver.findElement(By.xpath("//span[contains(text(),'WATCHES')]")); 
		 WebElement element12 =driver.findElement(By.xpath("//span[contains(text(),'JUNIORS')]"));
		 WebElement element13 =driver.findElement(By.xpath("//span[contains(text(),'PLUS & PETITE')]"));
		 WebElement element14 = driver.findElement(By.xpath("//li[@id='flexid_187458']//span[contains(text(),'BABY')]"));
		 WebElement element15 =driver.findElement(By.xpath("//span[contains(text(),'SPORTS FAN SHOP')]")); 
		 WebElement element16 = driver.findElement(By.xpath("//span[contains(text(),\"FATHER'S DAY GIFT GUIDE\")]"));
		 WebElement element17 =driver.findElement(By.xpath("//span[contains(text(),'THE EDIT')]"));
		 WebElement element18 = driver.findElement(By.xpath("//span[contains(text(),'SALE & CLEARANCE')]"));
		 
		 Thread.sleep(2000);
		 
		ball.moveToElement(element1)
			.moveToElement(element2)
			.moveToElement(element3)
			.moveToElement(element4)
			.moveToElement(element5)
			.moveToElement(element6)
		   	.moveToElement(element7)
		   	.moveToElement(element8)
		   	.moveToElement(element9)
		   	.moveToElement(element10)
		   	.moveToElement(element11) 
		   	.moveToElement(element12) 
		    .moveToElement(element13) 
		    .moveToElement(element14) 
		  	.moveToElement(element15)
		  	.moveToElement(element16)
		  	.moveToElement(element17)
		  	.moveToElement(element18)
		  	.build()
		  	.perform();
		
			Thread.sleep(2000);
			
			
			
		// verifying correct page displayed which is the last one which is sales and clearance
		WebElement josi = driver.findElement(By.xpath("//*[@id=\"mainNavigationFlyouts\"]/div[18]/div[4]/ul[3]/li[2]/a"));
		boolean status = josi.isDisplayed();
		if (status) {
			System.out.println("correct sales and clearance page is displayed");	
		}
		
		sreenshot("macy1.png");
	}
	
		public void sreenshot(String name) throws InterruptedException, IOException {
			
		
	   Thread.sleep(2000);
	   
        TakesScreenshot shot = (TakesScreenshot)driver;
		File source1 = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source1, new File("C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\ScreenShots\\"+name));
		
		System.out.println("Macy's sales and clearance screenshot captured");
		
		
	}
	
	public void quit() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) throws Exception {
		
		macyShopping object = new macyShopping();
		object.openChrome();
		object.openmacy();
		object.quit();
		

	}

}
