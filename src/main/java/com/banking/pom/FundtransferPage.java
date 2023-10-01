package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundtransferPage {
     @FindBy(name = "customer_id")
     private WebElement custid;
     
     @FindBy(name = "password")
     private WebElement password;
     
     @FindBy(name = "login-btn")
     private WebElement loginbtn;
     
     public FundtransferPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }

	public WebElement getCustid() {
		return custid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void cloginbutton()
	{
		loginbtn.click();
	}
   public void fundtransferloginpage(String un,String pwd)
   {
	   custid.sendKeys(un);
	   password.sendKeys(pwd);
   }

}
