package com.banking.pom;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.xml.xpath.XPath;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.genericUtils.ExcelUtility;

public class OpenaccountPage {
    @FindBy(name = "name")
    private WebElement name;
    
    @FindBy(xpath = "//select[@name='gender']")
    private WebElement gender;
    
    @FindBy(name = "mobile")
    private WebElement mobilenumber;
    
    @FindBy(name = "email")
    private WebElement email;
    
    @FindBy(name = "landline")
    private WebElement landlinenum;
    
   @FindBy(xpath = "//input[@placeholder='Date of Birth']")
   private WebElement dob;
   
   @FindBy(name = "pan_no")
   private WebElement pan;
   
   @FindBy(name = "citizenship")
   private WebElement citizennum;
   
   @FindBy(name = "homeaddrs")
   private WebElement homeadrees;
   
   @FindBy(name = "officeaddrs")
   private WebElement officeadress;
   
   @FindBy(xpath = "//select[@name='state']")
   private WebElement statedd;
   
   @FindBy(xpath = "//select[@name='city']")
   private WebElement citydd;
   
   @FindBy(name = "pin")
   private WebElement pinnum;
   
   @FindBy(name = "arealoc")
   private WebElement area;
   
   
   @FindBy(name = "nominee_name")
   private WebElement nomini;
   
   @FindBy(name = "nominee_ac_no")
   private WebElement nominiacnum;
   
   
   @FindBy(xpath = "//select[@name='acctype']")
   private WebElement actype;
   
   @FindBy(xpath = "//input[@name='submit']")
   private WebElement submitbtn;
   
   
   public OpenaccountPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }


public WebElement getName() {
	return name;
}


public WebElement getGender() {
	return gender;
}


public WebElement getMobilenumber() {
	return mobilenumber;
}


public WebElement getEmail() {
	return email;
}


public WebElement getLandlinenum() {
	return landlinenum;
}


public WebElement getDob() {
	return dob;
}


public WebElement getPan() {
	return pan;
}


public WebElement getCitizennum() {
	return citizennum;
}


public WebElement getHomeadrees() {
	return homeadrees;
}


public WebElement getOfficeadress() {
	return officeadress;
}


public WebElement getStatedd() {
	return statedd;
}


public WebElement getCitydd() {
	return citydd;
}


public WebElement getPinnum() {
	return pinnum;
}


public WebElement getArea() {
	return area;
}


public WebElement getNomini() {
	return nomini;
}


public WebElement getNominiacnum() {
	return nominiacnum;
}


public WebElement getActype() {
	return actype;
}


public WebElement getSubmitbtn() {
	return submitbtn;
}


   

  /**public void openAccoutnProcess(WebDriver driver,String sheet,int keyColumn,int valueColumn) throws Throwable
{
	ExcelUtility eLib = new ExcelUtility();
	HashMap<String, String> map = eLib.getMultipleDataFromExcel(sheet, keyColumn, valueColumn, driver);
	for(Entry<String, String>s1:map.entrySet())
	{
		driver.findElement(By.name(s1.getKey())).sendKeys(s1.getValue());
	}

}*/
   
   
}
