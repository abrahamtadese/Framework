package frameworkDemo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkTest {
	public static WebDriver driver = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is after class");
		
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after method");
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abraham");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ethiopia");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void test2() {
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
