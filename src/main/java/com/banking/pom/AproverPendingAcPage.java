package com.banking.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AproverPendingAcPage {
     @FindBy(xpath = "//input[@placeholder='Application number']")
     private WebElement applicationnumfield;
     
     @FindBy(xpath = "search_application")
     private WebElement searchbtn;
     
     @FindBy(xpath = "//input[@name='approve_cust']")
     private WebElement approverbtn;
     
}
