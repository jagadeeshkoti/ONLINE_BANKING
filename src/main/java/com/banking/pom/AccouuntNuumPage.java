package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccouuntNuumPage {

	@FindBy(name="account_no")
	private WebElement accountnofield;
	
	@FindBy(name = "submit_view")
	private WebElement suubmitbtn;
	
	public AccouuntNuumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccountnofield() {
		return accountnofield;
	}

	public WebElement getSuubmitbtn() {
		return suubmitbtn;
	}
	public void accnum(String msg)
	{
		accountnofield.sendKeys(msg);
		suubmitbtn.click();
	}
	
}
