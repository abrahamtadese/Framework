package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpiceJetLogIn {
	
	WebDriver driver;
	
	SpiceJetLogIn(WebDriver driver){
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(id="ctl00_mainContent_ddl_originStation1_CTXT") WebElement departure;
	
	@FindBy(xpath="//a[contains(text(),'Adampur (AIP)')]") WebElement aman;
	
	@FindBy(id="ctl00_mainContent_ddl_destinationStation1_CTXT") WebElement arrival;
	
	@FindBy(xpath="//li[contains(@class,'city_selected')]//a[contains(text(),'Bengaluru (BLR)')]") WebElement bang;
	
//	@FindBy(xpath="//input[@id='ctl00_mainContent_view_date1']") WebElement dapdate;
	
	@FindBy(xpath="//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'21')]") WebElement time1;
	
//	@FindBy(xpath="//input[@id='ctl00_mainContent_view_date2']") WebElement arridate;
	
	@FindBy(xpath="//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'15')]") WebElement time2;
	
	@FindBy(id="divpaxinfo") WebElement adult;
	
	@FindBy(xpath="//span[@id='hrefIncAdt']") WebElement adult2;
	 
	@FindBy(xpath="//span[@id='hrefIncChd']") WebElement child;
	
	@FindBy(xpath="//input[@id='btnclosepaxoption']") WebElement done;
	
	
	
	
	
	public void JetlogIn() {
		
		departure.click();
		aman.click();
		arrival.click();
		bang.click();
	}
	
	public void date() {
	//	dapdate.click();
		time1.click();
	//	arridate.click();
		time2.click();
	}
	public void passenger() {
		
	
		adult.click();
		adult2.click();
		child.click();
		done.click();
		
	}
	}
	


