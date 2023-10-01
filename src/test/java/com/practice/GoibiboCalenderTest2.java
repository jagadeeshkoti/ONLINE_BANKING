package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboCalenderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String MonthAndYear="November 2023";
		int date=5;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		String actual = "//div[text()='"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']";
        String NextArrow = "//span[@aria-label='Next Month']";
        for(;;)
        {
        	try
        	{
        		driver.findElement(By.xpath(actual)).click();
        		break;
        	}
        	catch(Exception e)
        	{
        		driver.findElement(By.xpath(NextArrow)).click();
        	}
        	
        }
        driver.findElement(By.xpath("//span[.='Done']")).click();
	
	}


	}

