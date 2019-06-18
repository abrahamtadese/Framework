package pageObjectModel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bestBuyService {
	
	WebDriver driver;
	
	bestBuyService(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,  this);
		
		
	}
	
	
	@FindBy(xpath="/html/body") WebElement xbutton;
	@FindBy(xpath="//a[@id='menu3']") WebElement services;
	@FindBy(xpath="//a[contains(text(),'Service Appointments')]") WebElement appoint;
	@FindBy(xpath="//p[contains(text(),'Chat with an Agent')]") WebElement chat;
	@FindBy(xpath="//input[@id='emailAddress']") WebElement email;
	@FindBy(xpath="//button[contains(@class,'btn btn-secondary btn-lg btn-block')]") WebElement chatnow;
	
	@FindBy(xpath="//span[contains(text(),'×')]") WebElement x;
	
	@FindBy(xpath="//a[contains(@class,'btn btn-link-unstyled v-medium')]//img[contains(@class,'src-components-common--productImage--3nvuJ')]") WebElement mac;
	@FindBy(xpath="//button[@class='btn-unstyled body-copy src-components-common--skipButton--2wzQP']") WebElement skip;
	@FindBy(xpath="//div[@class='list']//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//button[1]") WebElement change;
	@FindBy(xpath="//*[@id=\"store-row-calendar-1\"]/div/div/div[2]/div/section/div[1]/div/table/tbody/tr[2]/td[3]/span") WebElement june4;
	
	
	public void livechat(String mail) {
		xbutton.click();
		services.click();
		appoint.click();
		chat.click();
		email.sendKeys(mail);
		chatnow.click();
		
	}
	
	public void appointment() {
		x.click();
		services.click();
		appoint.click();
		mac.click();
		skip.click();
		change.click();
		june4.click();
	}
	
	public void screenshot(String name) throws IOException, InterruptedException {
		
	
		String sky = "C:\\Users\\abrah\\eclipse-workspace\\SeleniumWebDriver\\ScreenShots\\";
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(sky + name));
				
		Thread.sleep(2000);
		
		
	}

}
