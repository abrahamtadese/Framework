package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class StartBrowser {
		
		  static WebDriver driver;
			
			
		public static  WebDriver launchBrowser(String browserName, String Url) {
			
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",  "C:\\Selenium WebDriver Files\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\abrah\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				
			}
			else if (browserName.equalsIgnoreCase("IE")) {

				System.setProperty("webdriver.ie.driver",  "C:\\Users\\abrah\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
			
			driver.get(Url);
			
			
			return driver;
					
		}

	}


