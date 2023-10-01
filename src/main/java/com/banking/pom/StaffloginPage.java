package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffloginPage {
	@FindBy(name = "staff_id")
	private WebElement staffid;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "staff_login-btn")
	private WebElement staffloginbtn;
	
	@FindBy(name = "logout_btn")
	private WebElement logoutbtn;
	
	public StaffloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getStaffid() {
		return staffid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getStaffloginbtn() {
		return staffloginbtn;
	}
	public WebElement getlogoutbtn() {
		return logoutbtn;
	}
	
	//Business library
	
	public void staffloginpage(String id, String passwrd )
	{
		staffid.sendKeys(id);
		password.sendKeys(passwrd);
		staffloginbtn.click();
	}
	

}
