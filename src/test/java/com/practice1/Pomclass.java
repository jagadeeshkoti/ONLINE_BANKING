package com.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass {
   @FindBy(name = "email")
   private WebElement emailfield;
   
   @FindBy(name = "pass")
   private WebElement passfield;
   
   @FindBy(name = "login")
   private WebElement loginbtn;
   
   public Pomclass(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void logintofb(String un,String pwd)
   {
	   emailfield.sendKeys(un);
	   passfield.sendKeys(pwd);
	   loginbtn.click();
   }
   
   
}
