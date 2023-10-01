package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KayakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  Actions act=new Actions(driver);
  driver.manage().window().maximize();
  driver.get("https://www.kayak.co.in/flights");
  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
  WebElement ele = driver.findElement(By.xpath("//div[text()='Bengaluru (BLR)']/../div[2]"));
  act.moveToElement(ele).perform();
  ele.click();
  driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys("Delhi");
 // driver.findElement(By.xpath("//span[text()='New Delhi, National Capital Territory of India, India']")).click();
  WebElement ele1 = driver.findElement(By.xpath("//span[text()='New Delhi, National Capital Territory of India, India']/../../../div[3]"));
  act.moveToElement(ele1).click().perform();
  driver.findElement(By.xpath("//input[@placeholder='TO?']")).sendKeys("Mumbai");
	
	
	}

}
