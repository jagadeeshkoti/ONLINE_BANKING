package com.practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMytripCalenderTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String MonthAndYear="December 2023";
		int date=27;
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.makemytrip.com/");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     Actions act=new Actions(driver);
       act.doubleClick().perform(); 
       Thread.sleep(2000);
       act.moveByOffset(0, 80).click().perform();
      // driver.navigate().refresh();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//label[@for='departure']")).click();
       act.doubleClick().perform();
       act.moveByOffset(0, 100).click().perform();
       String actual="//div[text()='"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']";
       String nextarrow="//span[@aria-label='Next Month']";
       for(;;)
       {
    	   try
    	   {
    		   driver.findElement(By.xpath(actual)).click();
    		   break;
    	   }
       catch(Exception e)
    	   {
    	   driver.findElement(By.xpath(nextarrow)).click();
    	   }
       }
       
       
	}

}
