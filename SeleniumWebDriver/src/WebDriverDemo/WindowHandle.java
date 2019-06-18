package WebDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	WebDriver driver;
	
	public void openchrome() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}
	
	public void faceBook() {
		
		String Url = "https://www.facebook.com/";
		driver.get(Url);
		System.out.println(Url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	public void windowhandle() {
		
		String windows = driver.getWindowHandle();
		System.out.println(windows);
		
	}
	
	public void abs_path_faceBook() {
	
		String email = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]";
		String password = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
		String login = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]";
		
		driver.findElement(By.xpath(email)).sendKeys("abraham");
		driver.findElement(By.xpath(password)).sendKeys("ethiopia");
		driver.findElement(By.xpath(login)).click();
		
		}
		
	public void rel_path_facebook() {

		driver.navigate().back();
		
        String email = "//input[@id='email']";
		String password = "//input[@id='pass']";
		String login = "//input[@id='u_0_8']";
		driver.findElement(By.xpath(email)).clear();
		driver.findElement(By.xpath(email)).sendKeys("abraham1");
		driver.findElement(By.xpath(password)).sendKeys("ethiopia1");
		driver.findElement(By.xpath(login)).click();
		
	}
	
	public void stop() {
		driver.quit();
	}
		
	public static void main(String[] args) {
		
		WindowHandle sun = new WindowHandle();
		sun.openchrome();
		sun.windowhandle();
		sun.faceBook();
		sun.abs_path_faceBook();
		sun.rel_path_facebook();
		sun.stop();
		
	}

}
