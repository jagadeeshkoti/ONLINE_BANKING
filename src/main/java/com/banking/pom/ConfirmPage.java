package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage {
@FindBy(xpath = "//input[@value='Confirm']")
private WebElement confirm;

public ConfirmPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public WebElement getConfirm() {
	return confirm;
}

}
