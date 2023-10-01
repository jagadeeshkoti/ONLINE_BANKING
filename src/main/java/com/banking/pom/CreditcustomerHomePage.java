package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditcustomerHomePage {
    @FindBy(name = "customer_account_no")
    private WebElement custacnumfield;
    
    @FindBy(name = "credit_amount")
    private WebElement creditamtfield;
    
    @FindBy(name = "credit_btn")
    private WebElement creditbtn;
    
    public CreditcustomerHomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }

	public WebElement getCustacnumfield() {
		return custacnumfield;
	}

	public WebElement getCreditamtfield() {
		return creditamtfield;
	}

	public WebElement getCreditbtn() {
		return creditbtn;
	}
}
