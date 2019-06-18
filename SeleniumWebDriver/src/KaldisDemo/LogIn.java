package KaldisDemo;

import org.openqa.selenium.By;

public class LogIn extends FB{

	
	public void Log() {
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		
	driver.findElement(By.id("u_0_2")).click();
	}
	public static void main(String[] args) {
		
	LogIn run = new LogIn();
	run.launchChrome();
	run.Log();

	}

}
