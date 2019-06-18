package WebDriverExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtons {

	WebDriver driver;

	public void openChrome() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void openLamorghini() {

		try {
			String Url = "https://www.lamborghini.com/en-en";
			driver.get(Url);
			System.out.println(Url);

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='close']")).click();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void upperList() {
			
		  try {
			List<WebElement> links = driver.findElements(By.xpath("//div[@class='column ten push-one reset last desktop-holder']//ul[1]/li"));
			
			  int count = links.size();
			  System.out.println(count);
			  
			  for ( WebElement temp : links) {
			  
			  String sun = temp.getText();
			  
			  System.out.println(sun);
			  
			  }
			 
				
				WebElement car1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div[3]/nav/ul[1]/li[1]"));
				Actions car2 = new Actions(driver);
				car2.moveToElement(car1).perform();
				Thread.sleep(2000);
				
				List<WebElement> links1 = driver.findElements(By.xpath("//*[@id=\"submenu_0\"]//a"));
				
				int count1 = links1.size();
				System.out.println(count1);
				
				for(WebElement temp1:links1) {
					
					String moon = temp1.getText();
					System.out.println(moon);
				}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
			
			
			
		}
	
	public void quit()  {
		try {
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args)  {

		try {
			RadioButtons buttons = new RadioButtons();
			buttons.openChrome();
			buttons.openLamorghini();
			buttons.upperList();
			buttons.quit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
