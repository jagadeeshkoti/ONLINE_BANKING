package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffhomePage {
	@FindBy(xpath = "//input[@value='Approve Pending Account']")
	private WebElement approverpendingbtn;
	
	@FindBy(name = "credit_cust_ac")
	private WebElement creditcustbtn;
	
	@FindBy(name = "viewdet")
	private WebElement viewactivecustbtn;
	
	@FindBy(name = "view_cust_by_ac")
	private WebElement viewcustbyacnum;
	
	@FindBy(name = "del_cust")
	private WebElement delcustbtn;
	
	public StaffhomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getApproverpendingbtn() {
		return approverpendingbtn;
	}

	public WebElement getCreditcustbtn() {
		return creditcustbtn;
	}

	public WebElement getViewactivecustbtn() {
		return viewactivecustbtn;
	}

	public WebElement getViewcustbyacnum() {
		return viewcustbyacnum;
	}

	public WebElement getDelcustbtn() {
		return delcustbtn;
	}
	
	//Business library
	public void creditcusbutton()
	{
		creditcustbtn.click();
	}
  public void viewcust()
  {
	  viewactivecustbtn.click();
  }
  public void viewcustbyacnum()
  {
	  viewcustbyacnum.click();
  }
}
