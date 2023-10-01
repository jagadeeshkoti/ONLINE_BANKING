package com.banking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetBankingPage {
   @FindBy(xpath = "//li[text()='Fund Transfer']")
   private WebElement fundtransfer;
   
   @FindBy(xpath = "//li[.='Statement']")
   private WebElement statement;
   
   public InternetBankingPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   
   }

public WebElement getFundtransfer() {
	return fundtransfer;
}
public WebElement getstatement() {
	return statement;
}

  public void statement()
  {
	  statement.click();
  }
  public void ftransferbtn()
  {
	  fundtransfer.click();
  }
}
