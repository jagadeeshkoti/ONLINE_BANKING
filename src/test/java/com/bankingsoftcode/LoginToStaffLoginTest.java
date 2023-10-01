package com.bankingsoftcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.banking.genericUtils.Baseclass;
import com.banking.genericUtils.FileUtilities;
import com.banking.genericUtils.WebdriverUtility;
import com.banking.pom.HomePage;

public class LoginToStaffLoginTest extends Baseclass {

	
	@Test
	public void loginToStaff()
	{
	
	
	//public static void main(String[] args) throws Throwable {
		
		HomePage hpg = new HomePage(driver);
		hpg.stafflogin();
	


	}

}
