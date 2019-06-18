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

public class StarbucksDemo {
	
	public static WebDriver driver = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.facebook.com/");

		sturbucksDemoOne obj = new sturbucksDemoOne(driver);
		obj.emailIn();
		obj.passwordIn();
	//	obj.logIn();
		
		
		
		Thread.sleep(3000);
		
		
		fail("Not yet implemented");
	}

}
