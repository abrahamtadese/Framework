package WebDriverExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookLogIn {
	
	WebDriver driver;
	
	public void openchrome() throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		getfaceBook();
	//	logIn();
		signIn();
	
	
		
	}
	
	public void getfaceBook() {
		
		
			String Url = "https://www.facebook.com/";
			driver.get(Url);
			System.out.println(Url);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		
		}
		
	
	
		public void logIn() throws InterruptedException {
			
			
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abraham");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ethiopia");
				driver.findElement(By.id("loginbutton")).click();
				Thread.sleep(3000);
				
		}
		
		public void signIn() throws InterruptedException {
			
				driver.findElement(By.name("firstname")).sendKeys("firstName");
				driver.findElement(By.name("lastname")).sendKeys("lastName");
				driver.findElement(By.name("reg_email__")).sendKeys("123456789");
				driver.findElement(By.name("reg_passwd__")).sendKeys("addis");
				driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
				
				//driver.findElement(By.xpath("//option[contains(text(),'Sep')]")).click();
				WebElement month = driver.findElement(By.id("month"));
				Select months = new Select(month);
				months.selectByVisibleText("Sep");
				
				//driver.findElement(By.xpath("//select[2]//option[12]")).click();
				WebElement day = driver.findElement(By.id("day"));
				Select days = new Select(day);
				days.selectByVisibleText("12");
				
				//driver.findElement(By.xpath("//option[contains(text(),'2004')]")).click();
				WebElement year = driver.findElement(By.id("year"));
				Select years = new Select(year);
				years.selectByVisibleText("2004");
				
				Thread.sleep(2000);
				
				driver.findElement(By.name("websubmit")).click();
				
				
				
		}
		

			
	public static void main(String[] args) throws InterruptedException {
		
		facebookLogIn kaldis = new facebookLogIn();
		kaldis.openchrome();
		
		
	}

}
