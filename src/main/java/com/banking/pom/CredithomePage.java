package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CredithomePage {
	
	@FindBy(name="credit_btn")
	private WebElement creditbutton;
	
	public CredithomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreditbutton() {
		return creditbutton;
	}
	
	public void creditbutton()
	{
		creditbutton.click();
	}

}
