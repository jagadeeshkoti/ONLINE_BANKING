package com.banking.pom;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreditCusAmount {
	
	public void amount(HashMap<String, String> map, WebDriver driver){
		
		for(Entry<String, String> s:map.entrySet())
		{
		driver.findElement(By.name(s.getKey())).sendKeys(s.getValue());
		
		}
		
		
		
	}

}
