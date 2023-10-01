package com.bankingsoftcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.banking.genericUtils.Baseclass;
import com.banking.genericUtils.FileUtilities;
import com.banking.genericUtils.WebdriverUtility;
import com.banking.pom.HomePage;

public class ApplyForOpenAcTest extends Baseclass {

	@Test
	public void applyAc() throws Throwable
	{
	
		
		HomePage hpage = new HomePage(driver);
		hpage.clickopen();
	
	

	}

}
