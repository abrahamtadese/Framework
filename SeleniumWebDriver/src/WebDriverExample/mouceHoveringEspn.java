package WebDriverExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouceHoveringEspn {
	
	WebDriver driver;
	
	public void open() {
	
	System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	}
	
	
	public void openEspn() {
		
		driver.get("http://www.espn.com/");
		System.out.println(driver.getCurrentUrl());
	}
	
	public void hover()  {
		
		try {
			
			
			WebElement nfl = driver.findElement(By.xpath("//a[@name='&lpos=sitenavdefault+sitenav_nfl']//span//span[@class='link-text'][contains(text(),'NFL')]"));
			Actions sport = new Actions(driver);
			sport.moveToElement(nfl).perform();
			Thread.sleep(2000);
			
			WebElement  nba = driver.findElement(By.xpath("//a[@name='&lpos=sitenavdefault+sitenav_nba']//span//span[@class='link-text'][contains(text(),'NBA')]"));
			Actions sport1 = new Actions(driver);
			sport1.moveToElement(nba).perform();
			Thread.sleep(2000);
			
			WebElement  mba = driver.findElement(By.xpath("//a[@name='&lpos=sitenavdefault+sitenav_mlb']//span//span[@class='link-text'][contains(text(),'MLB')]"));
			Actions sport2 = new Actions(driver);
			sport2.moveToElement(mba).perform();
			Thread.sleep(2000);
		
			
			WebElement  soccer = driver.findElement(By.xpath("//a[@name='&lpos=sitenavdefault+sitenav_soccer']//span//span[@class='link-text'][contains(text(),'Soccer')]"));
			Actions sport3 = new Actions(driver);
			sport3.moveToElement(soccer).perform();
			Thread.sleep(2000);
			
			
			WebElement  mma = driver.findElement(By.xpath("//a[@name='&lpos=sitenavdefault+sitenav_mma']//span//span[@class='link-text'][contains(text(),'MMA')]"));
			Actions sport4 = new Actions(driver);
			sport4.moveToElement(mma).perform();
			Thread.sleep(2000);
			
			WebElement nhl = driver.findElement(By.xpath("//a[@name='&lpos=sitenavdefault+sitenav_nhl']//span//span[@class='link-text'][contains(text(),'NHL')]"));
			Actions sport5 = new Actions(driver);
			sport5.moveToElement(nhl).perform();
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

		
		public void soccermenu() {
		
			
			
			WebElement  soccer = driver.findElement(By.xpath("//a[@name='&lpos=sitenavdefault+sitenav_soccer']//span//span[@class='link-text'][contains(text(),'Soccer')]"));
			Actions sport3 = new Actions(driver);
			sport3.moveToElement(soccer).perform();
			
			
			
			List<WebElement> links = driver.findElements(By.xpath("//*[@id=\"global-nav\"]/ul/li[4]/div/ul[1]"));
			
			
			
			int count = links.size();
			System.out.println(count);
			
			for (WebElement object : links) {
				String text = object.getText();
				System.out.println(text);
				
			}
		}
			
			public void stop() {
				try {
					Thread.sleep(2000);
					driver.quit();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		
			
	
	public static void main(String[] args) {
		
		mouceHoveringEspn sun = new mouceHoveringEspn();
		sun.open();
		sun.openEspn();
		sun.hover();
		sun.soccermenu();
		sun.stop();

	}

}
