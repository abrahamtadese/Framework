package com.utility;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	 
	
	public static WebDriver getScreenshot(WebDriver driver,  String name)  {
		
		
		try {
			TakesScreenshot shot = (TakesScreenshot)driver;
			
			File source = shot.getScreenshotAs(OutputType.FILE);
			
			String shotFolder = "C:\\Users\\abrah\\eclipse-workspace\\MVNPractice\\Screenshot\\";
			
			
				FileUtils.copyFile(source, new File(shotFolder+name+".png"));
				
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		} 
		
		System.out.println("Screenshot taken");
		return driver;
		
		

		
		
		
	}

}
