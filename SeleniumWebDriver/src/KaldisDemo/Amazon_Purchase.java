package KaldisDemo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Purchase {
	
	WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void purchaseShoes() throws InterruptedException, IOException {
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		 
	//	WebElement hello = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
		
		Actions act = new Actions(driver);
	//	act.moveToElement(hello).build().perform();
		
	//	driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[1]")).click();
	//	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abrahamtadese07@gmail.com");
	//	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("josiah12");
	//	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lebron 16 shoes men");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Nike Mens Lebron 16 Basketball Shoes')]")).click();
		Thread.sleep(2000);
		
		WebElement hello1 = driver.findElement(By.xpath("//li[4]//span[1]//span[1]//span[1]//input[1]"));
		act.moveToElement(hello1).build().perform();
		Thread.sleep(2000);
		WebElement hello2 = driver.findElement(By.xpath("//li[5]//span[1]//span[1]//span[1]//input[1]"));
		act.moveToElement(hello2).build().perform();
		Thread.sleep(2000);
		WebElement hello3 = driver.findElement(By.xpath("//li[6]//span[1]//span[1]//span[1]//input[1]"));
		act.moveToElement(hello3).build().perform();
		Thread.sleep(2000);
		WebElement hello4 = driver.findElement(By.xpath("//li[7]//span[1]//span[1]//span[1]//input[1]"));
		act.moveToElement(hello4).build().perform();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt'][contains(text(),'Select')]")).click();
		Thread.sleep(2000);
		
		List <WebElement> shoe = driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']//a"));
		System.out.println(shoe.size());
		
		for ( WebElement shoeblack: shoe) {
			String shoe1 = shoeblack.getText();
			System.out.println(shoe1);
				
		}
		
	
		
	
		Thread.sleep(2000);
		
		
//		TakesScreenshot temp = (TakesScreenshot)driver;
//		File source = temp.getScreenshotAs(OutputType.FILE);
		
//		FileUtils.copyFile(source, new File("C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\ScreenShots\\lebron16.png"));
		
//		System.out.println("lebron shoe screenshot captured");
		
	
		
		
	}	


	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Amazon_Purchase sky = new Amazon_Purchase();
		sky.launchChrome();
		sky.purchaseShoes();
	}

}
