package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTansferhomepage {
   @FindBy(name = "beneficiary")
   private WebElement beneficiary;
   
   @FindBy(xpath = "//input[@placeholder='Amount']")
   private WebElement amountfield;
   
   @FindBy(xpath = "//input[@placeholder='Remark']")
   private WebElement remarkfield;
   
   @FindBy(xpath = "//input[@value='Send']")
   private WebElement sendbtn;
   
   @FindBy(name = "view_beneficiary")
   private WebElement viewbenificiary;
   
   @FindBy(xpath = "//tbody/tr[2]/td[3]")
   private WebElement beniname;
   
   
   public FundTansferhomepage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }


public WebElement getBeneficiary() {
	return beneficiary;
}


public WebElement getAmountfield() {
	return amountfield;
}


public WebElement getRemarkfield() {
	return remarkfield;
}


public WebElement getSendbtn() {
	return sendbtn;
}
public WebElement getviewbeni() {
	return viewbenificiary;
}
public WebElement getbenintext() {
	return beniname;
}


public void clickviewbeni()
{
	viewbenificiary.click();
}

public String benitext()
{
	return beniname.getText();
}


}
