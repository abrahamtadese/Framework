package KaldisDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrayListWedDriver {
	
	WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}

	
public void openAutomation() {
		
		driver.get("http://testautomationpractice.blogspot.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("animals")).click();
		WebElement ele = driver.findElement(By.id("animals"));
		Select animal = new Select(ele);
		animal.selectByVisibleText("Baby Cat");
		driver.findElement(By.id("animals")).click();
		
		
		

//		ArrayList <String> originalList =  new ArrayList <String>();
		
//	    originalList.

	//	List<WebElement> options = animal.getOptions();
		
	//	for (WebElement e: options) {
			
	//		originalList.add(e.getText());
	//		System.out.println(originalList);
			
		
		
	//	System.out.println(originalList);
		
	
	//	ArrayList tempList = new ArrayList();
	//	tempList = originalList;
		
	//	System.out.println("before sorting temp list: " +tempList);
		
	//	Collections.sort(tempList);
		
	//	System.out.println("after sorting list : "+ tempList);
		

}

		

	public static void main(String[] args) {
		
		ArrayListWedDriver sky = new ArrayListWedDriver();
		sky.launchChrome();
		sky.openAutomation();
			
		}

	}


