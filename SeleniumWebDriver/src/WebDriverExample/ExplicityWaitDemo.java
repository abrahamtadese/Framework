package WebDriverExample;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitDemo {
	
	WebDriver driver;
	
	public void openChrome() {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	public void userNameWaiting() {
		
		WebDriverWait mywait = new WebDriverWait(driver,10000);
		
		driver.get("http://www.newtours.demoaut.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		username.sendKeys("mercury");
		
		WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("ethiopia");
		
		
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
	
		
	//	int count = links.size();
	//	System.out.println(count);
		System.out.println(links.size());
		
		for (int i=0; i<links.size(); i++) {
			String listText = links.get(i).getText();
			
			System.out.println(listText);
		}
	}
	
	
	public void emailResponseTime() {
		
		try {
			String Url = "http://www.newtours.demoaut.com/";
			driver.get(Url);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			

			driver.findElement(By.name("userName")).sendKeys("abraham");
			driver.findElement(By.name("password")).sendKeys("ethiopia");
			driver.findElement(By.name("login")).click();
			
			List<WebElement> links = driver.findElements(By.xpath("//td//td//td[1]//table[1]//tr"));
			
			int count = links.size();
			System.out.println(count);
			
			for (WebElement object : links) {
				String text = object.getText();
				System.out.println(text);
				
				if (text.equalsIgnoreCase("Vacations")){
					object.click();
					//System.out.println(driver.getCurrentUrl());
					//System.out.println(driver.getTitle());
					break;
			}
		} 
		}
			catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		//response email on time frame
		
		 ExplicityWaitDemo obj = new  ExplicityWaitDemo();
		 obj.openChrome();
		 obj.userNameWaiting();
		 obj.emailResponseTime();
		 

	}

}
