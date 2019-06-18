package WebDriverDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lamborghini {
	
	WebDriver driver;
	
	public void open() {
		
		try {
			System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			String Url = "https://www.lamborghini.com/en-en";
			driver.get(Url);
			System.out.println(Url);
			
			List <WebElement> temp = driver.findElements(By.xpath("//div[@class='column ten push-one reset last desktop-holder']//ul[1]//li"));
			System.out.println(temp.size());
			
			for (int i=0; i<temp.size(); i++) {
				String sun = temp.get(i).getText();
				System.out.print(sun+"  ");
				
			}
	
			
			System.out.println();
			
			
			
			WebElement luxurycar1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div[3]/nav/ul[1]/li[1]"));
			Actions car1 = new Actions(driver);
			car1.moveToElement(luxurycar1).perform();
			Thread.sleep(2000);
			
			
			List<WebElement> links = driver.findElements(By.xpath("//ul[@id='submenu_0']//li"));
			int count = links.size();
			System.out.println(count);
			
			for (WebElement object : links) {
				String text = object.getText();
				System.out.println(text);
			}
			
				
	
			
			
			WebElement luxurycar2 = driver.findElement(By.xpath("//ul[@id='submenu_0']//a[contains(text(),'Aventador')]"));
			Actions car2 = new Actions(driver);
			car2.moveToElement(luxurycar2).perform();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"submenu_0_2\"]")).click();
			
			System.out.println(driver.getTitle());
			
			driver.close();
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	    
	    
	  }
		
	

	public static void main(String[] args) {
		Lamborghini car = new Lamborghini();
		car.open();

	}

}
