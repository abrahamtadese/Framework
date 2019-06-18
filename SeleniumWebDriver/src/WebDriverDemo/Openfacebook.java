package WebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openfacebook {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\abrah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage()).window().maximize();
		String url ="http://www.facebook.com";
		driver.get(url);
		
		
	
	
		String sun = driver.getCurrentUrl();
		System.out.println("The url is : "+sun);
		
	
		String title = driver.getTitle();
		System.out.println("The title for the page: "+title);
		
		//id element
		//driver.findElement(By.id("email")).sendKeys("abraham");
		WebElement emailfield = driver.findElement(By.id("email"));
		emailfield.sendKeys("abraham");
		emailfield.clear();
		emailfield.sendKeys("josiah");
		
		//name element
		//driver.findElement(By.name("pass")).sendKeys("facebook");
		WebElement passwordfield = driver.findElement(By.name("pass"));
		passwordfield.sendKeys("book");
		passwordfield.clear();
		passwordfield.sendKeys("facebook");
		
		//link element
		
		WebElement linkfield = driver.findElement(By.linkText("Forgot account?"));
		linkfield.click();
				
		//partial link element  is similar to link element
		WebElement partiallinktest = driver.findElement(By.partialLinkText("Forgot account?"));
		partiallinktest.click();
		
		//tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		
		
		
		
		

	}

}
