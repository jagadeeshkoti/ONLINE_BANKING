package com.banking.pom;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.genericUtils.WebdriverUtility;

public class OpenACdetails extends WebdriverUtility {
	  @FindBy(xpath = "//select[@name='gender']")
	    private WebElement gender;
	    
	  @FindBy(xpath = "//select[@name='state']")
	   private WebElement statedd;
	   
	   @FindBy(xpath = "//select[@name='city']")
	   private WebElement citydd;
	   
	   @FindBy(xpath = "//select[@name='acctype']")
	   private WebElement actype;
	
	
	public OpenACdetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    public void openacdetais(HashMap<String, String> map,WebDriver driver) {
	for(Entry<String, String>s1:map.entrySet())
	{
		driver.findElement(By.name(s1.getKey())).sendKeys(s1.getValue());
	}
	
	
	

}
}
