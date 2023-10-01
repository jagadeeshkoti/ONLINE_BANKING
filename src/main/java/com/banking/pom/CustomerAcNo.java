package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerAcNo {
	
	@FindBy(name="customer_id")
	private WebElement cusid;
	
	@FindBy(name="password")
	private WebElement cpwd;
	
	@FindBy(name="login-btn")
	private WebElement login;
	
	
	
	public CustomerAcNo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public WebElement getCusid() {
		return cusid;
	}



	public WebElement getCpwd() {
		return cpwd;
	}



	public WebElement getLogin() {
		return login;
	}
	
	public void customerlogin(String acno,String pwd)
	{
		cusid.sendKeys(acno);
		cpwd.sendKeys(pwd);
		login.click();
	}
	
	
	

}
