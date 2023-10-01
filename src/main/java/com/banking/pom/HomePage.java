package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.genericUtils.WebdriverUtility;

public class HomePage extends WebdriverUtility {
	//declaration
	@FindBy(xpath = "//li[text()='Open Account']")
	private WebElement openaccount;
	
	@FindBy(xpath = "//li[text()='Fund Transfer']")
	private WebElement fundtransfer;
	
	@FindBy(xpath = "//div[@class='ebanking']/a")
	private WebElement internetbanking;
	
	
	@FindBy(linkText = "Staff Login")
	private WebElement stafflogin;
	
	@FindBy(linkText = "Home")
	private WebElement homebtn;
	
	@FindBy(xpath = "//li[.='Login ']")
	private WebElement loginbtn;
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getOpenaccount() {
		return openaccount;
	}

	public WebElement getFundtransfer() {
		return fundtransfer;
	}

	public WebElement getInternetbanking() {
		return internetbanking;
	}

	public WebElement getStafflogin() {
		return stafflogin;
	}
	public WebElement gethomebtn() {
		return homebtn;
	}
	public WebElement getloginbtn() {
		return loginbtn;
	}
	
	public void stafflogin()
	{
		stafflogin.click();
	}
	
	public void homebutton()
	{
		homebtn.click();
	}
	
	public void mouse(WebDriver driver)
	{
		internetbanking.click();
		
	}
	
/*	public void ebankinglogin()
	{
		loginbtn.click();
	}
*/	
	public void fundtransferbtn()
	{
		fundtransfer.click();	
	}
	
	
	public void clickopen()
	{
		openaccount.click();
	}
	
	public void movetoele(WebDriver driver)
	{
		mouseOverOnElement(driver, internetbanking);
		loginbtn.click();
	}
	
	
	
}
