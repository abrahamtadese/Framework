package WebDriverDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathElement {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("dell laptop");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		// all links represented by tag name a. 
		List <WebElement> temp1 = driver.findElements(By.tagName("a")); 
		System.out.println(temp1.size());
		
		
	
		//driver.findElement(By.xpath("//span[contains(text(),'Windows 10')]")).click();
		driver.findElement(By.xpath("//div[@id='w3-w0-w1-w0']")).click();
		
		
		List <WebElement> temp3 = driver.findElements(By.xpath("//div[@class='x-overlay__sub-panel']//label"));
		System.out.println(temp3.size());
		
		for (int i=0; i<temp3.size(); i++) {
			String sun = temp3.get(i).getText();
			
			System.out.println(sun);
				
			}
	
		
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Not%20Included_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%2010%20S_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%2010_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%208.1_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%208_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%20RT_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%207_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%20Vista_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%20XP_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%20ME_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%202000_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%2098_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%2095_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Windows%20NT_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_DOS_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Linux_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Chrome%20OS_cbx")).click();
	    driver.findElement(By.id("refineOverlay-subPanel-Operating%20System_Not%20Specified_cbx")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'x-overlay__close dialog__close icon-close')]")).click();
		
		
		List <WebElement> temp2 = driver.findElements(By.xpath("//li[@id='w3-w0-w1']//li[1]//ul[1]//li"));
		 
		System.out.println(temp2.size());
		
		for (WebElement sun:temp2) {
			
			String moon = sun.getText();
			System.out.println(moon);
			
			if (moon.equalsIgnoreCase("Windows 10 (23,189)")) {
				
			Thread.sleep(2000);
			sun.click();
				
			}
		}
	

		Thread.sleep(3000);
		driver.quit();
	
		
		
	}

}
