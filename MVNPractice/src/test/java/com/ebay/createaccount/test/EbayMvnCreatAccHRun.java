package com.ebay.createaccount.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AutomationFrameWork.PracticeProjectMvn.BrowserFactory;
import AutomationFrameWork.PracticeProjectMvn.EbayMvnCreatAccHBegin;

public class EbayMvnCreatAccHRun {

		WebDriver driver;
	
	@Test
	
	public void run() {
		 driver = BrowserFactory.openbrowser("chrome","https://www.ebay.com/");
			EbayMvnCreatAccHBegin run = PageFactory.initElements(driver, EbayMvnCreatAccHBegin.class);
			run.createAccFromHelp("user1","userlast","emailuser@gmail.com","passuniodnew@1");
	}
	

}
