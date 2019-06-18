package WebDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenEspnNBA {
	
	WebDriver driver;
	
	public void OpenChrome() {
		
		try {
			System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			Espn();
			//Lamborghini();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
			
		
	}
	
	public void Espn() {
				try {
					
					//driver.get("https://www.google.com/");
					String Url = "https://www.google.com/";
					driver.get(Url);
					System.out.println("The Url is: "+Url);
					    driver.findElement(By.name("q")).click();
					    driver.findElement(By.name("q")).clear();
					    driver.findElement(By.name("q")).sendKeys("espn");
					    driver.findElement(By.name("btnK")).click();
					    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Result with Site Links'])[1]/following::h3[1]")).click();
					   //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='GS'])[2]/following::h1[1]")).click();
					    
					   // driver.get("http://www.espn.com/nba/story/_/id/26754135/warriors-having-fun-durant-need-him");
					   driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Giants'])[2]/following::span[2]")).click();
					    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Top Leagues'])[1]/following::span[2]")).click();
					  
					    driver.findElement(By.linkText("Arsenal")).click();
					    driver.findElement(By.linkText("Arsenal demand UEFA explanation for Baku ticket debacle")).click();
					    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pause'])[1]/following::span[1]")).click();
					    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Play Video'])[1]/following::button[1]")).click();
					    
					    System.out.println("Current Url is: "+driver.getCurrentUrl());
					    System.out.println("Current title is: "+driver.getTitle());
					    
					  
					    
					    
					    
					    
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				    
			
	}
			
			public void Lamborghini() {
				try {
					
					String Url = "https://www.google.com/";
					driver.get(Url);
					System.out.println("The Url is: "+Url);
					    driver.findElement(By.name("q")).click();
					    driver.findElement(By.name("q")).clear();
					    driver.findElement(By.name("q")).sendKeys("labmborghini");
					    driver.findElement(By.name("btnK")).click();
					
					   System.out.println(driver.getCurrentUrl());
					   System.out.println(driver.getTitle());
					 
					   
					    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Result with Site Links'])[1]/following::h3[1]")).click();
					    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Results'])[1]/following::button[2]")).click();
					    
					    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Share to Email'])[1]/following::a[1]")).click();
					    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Huracán'])[4]/following::a[1]")).click();
					   
					 
					    
					    
					    driver.close();
					  
				
					    
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				    
				    
			
			
		}

	public static void main(String[] args) {
		OpenEspnNBA warriors = new OpenEspnNBA();
		warriors.OpenChrome();
		

	}

}
