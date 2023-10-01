package com.practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gobibo4 {

	public static void main(String[] args) {
		String MonthAndYear="December 2023";
		int date=17;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		String actaul="//div[text()='"+MonthAndYear+"']/../../descendant::p[text()='"+date+"']";
		String nextarrow="//span[@aria-label='Next Month']";
		
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath(actaul)).click();
				break;
			}
			catch (Exception e) {
				driver.findElement(By.xpath(nextarrow)).click();
			}
		}
		driver.findElement(By.xpath("//span[text()='Done']")).click();
			}

   
		

	}


