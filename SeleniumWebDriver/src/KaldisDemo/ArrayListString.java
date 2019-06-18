package KaldisDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListString {
	
WebDriver driver;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\eclipse-workspace\\DriversAndJars\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	public void arraylistclass() {
		
		ArrayList <String> basket = new ArrayList<String>();
		basket.add("lexus");  //array list 0
		basket.add("bugatti");  //array list 1
		basket.add("aston martin");  //array list 2
		basket.add("ferari");  //array list 3
		basket.add("lamborghini");   //array list 4
		basket.add("peugot");   //array list 5
		basket.add("corvette");  //array list 6
		
		System.out.println(basket.size());
		System.out.println(basket);
		
	//	basket.remove(3);
	//	System.out.println(basket);
		
	//	basket.clear();
	//	System.out.println(basket);
		
	// for loop to print all the list
		
		for (int i=0; i<basket.size(); i++) {
			System.out.println(basket.get(i));
		}
		
	// for loop for printing all the list
		for (String cars : basket) {
			
			System.out.println(cars);
			
			
		}
		
		// iterator interface and used as object method
				@SuppressWarnings("rawtypes")
		// iterator to print all the list
				Iterator it = basket.iterator();
				
				while(it.hasNext()) {
	 				
					Object value = it.next();
					System.out.println(value);
				}
		
		
				ArrayList <String> soccer = new ArrayList<String>();
				soccer.add("iphone");  //array list 0
				soccer.add("samsung");  //array list 1
				soccer.add("LG");  //array list 2
				
				basket.addAll(soccer);  //combine basket and soccer list
				System.out.println(basket.size());
				System.out.println(basket);
				
				for ( String wall:basket) {   // String and Object can be used as object method
					System.out.println(wall);
				}
				
				System.out.println("...............");
				
				ArrayList <String> baseball = new ArrayList<String>();
				baseball.add("iphone");  //array list 0
				baseball.add("car");  //array list 1
				baseball.add("shoe");  //array list 2
	
				soccer.retainAll(baseball);
				System.out.println(soccer);
				for (int i=0; i<soccer.size(); i++) {
					System.out.println(soccer.get(i));
				}
				
				
				
				
		
		
	}

	public static void main(String[] args) {
		
		ArrayListString moon = new ArrayListString();
	//	moon.launchChrome();
		moon.arraylistclass();
		

	}

}
