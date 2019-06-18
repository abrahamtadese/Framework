package KaldisDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListGeneric {
	
WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void arraylistclass() {
	
			ArrayList josi = new ArrayList(); // ArrayList start from 0 - 
			josi.add(7); // ArrayList [0]
			josi.add("messi"); //ArrayList [1]
			josi.add("rolando"); // ArrayList [2]
			josi.add(10.7); // arrayList [3]
			
			System.out.println(josi.size()); 
			System.out.println(josi);
			System.out.println(josi.get(1));
			
			josi.add(7);
			
	//		josi.remove("messi");
	//		System.out.println(josi);
			
	//		object.clear();
	//		System.out.println(josi);
			
			//print ArrayList in top to bottom order using for loops
			
			  int temp = josi.size();
			  
			  for (int i=0; i<temp; i++) {
				  
				Object sun =  josi.get(i); //Object is the objectfiyng method
				  System.out.println("Value of the ArrayList is "+sun);
			  }
			  
			  
			  
			  for (Object ball:josi) {
				  
				 System.out.println(ball);
			  }
	
		// iterator interface and objectifying
		Iterator it = josi.iterator();
		
		while(it.hasNext()) {
			
			Object value = it.next();
			System.out.println(value);
		}
		
	}

	public static void main(String[] args) {
		
		ArrayListGeneric sky = new ArrayListGeneric();
		//sky.launchChrome();
		sky.arraylistclass();
		
	}

}
