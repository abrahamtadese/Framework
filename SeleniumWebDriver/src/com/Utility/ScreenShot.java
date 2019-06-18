package com.Utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.Reporter;

public class ScreenShot {
	
	
	
	public static WebDriver  getScreenShot( WebDriver driver,  String name)  {
			
				
					try {
						File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						String screenFile = "C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\ScreenShots\\";
						FileUtils.copyFile(source, new File(screenFile + name));
						
						
					} catch (Exception e) {
						
						System.out.println(e.getMessage());
						
						
					} 
		
				
					System.out.println("Screensot taken");
					
				return driver;
}
		
}			

 

