package com.practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReaddatafromCMDTEST {
 @Test
 public void cmdtest() {
	 String BROWSER = System.getProperty("browser");
	 String URL = System.getProperty("url");
	 String USERNAME = System.getProperty("username");
	 String PASSWORD = System.getProperty("password");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(URL);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.id("email")).sendKeys(USERNAME);
	    driver.findElement(By.id("pass")).sendKeys(PASSWORD);
	    driver.findElement(By.name("login")).click();
		
 }
}
