package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='Welcome aboard']/ancestor::div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/descendant::div[@data-testid='round-trip-radio-button']/div[1]")).click();
       driver.findElement(By.xpath("//div[text()='From']")).click();
       driver.findElement(By.xpath("//div[text()='Ahmedabad']")).click();
       driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
       driver.findElement(By.xpath("//div[@data-testid='undefined-month-September-2023']/div[3]/div[5]/div[3]/div[1]/div")).click();
       driver.findElement(By.xpath("//div[@data-testid='undefined-month-October-2023']/div[3]/div[3]/div[4]/div")).click();
       driver.findElement(By.xpath("//div[text()='INR']")).click();
       driver.findElement(By.xpath("//div[text()='USD']")).click();
       driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
       WebElement include = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
       for(int i=0;i<4;i++)
       {
    	   include.click();
       }
    driver.findElement(By.xpath("//div[text()='Passengers']")).click();
    driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
	
	}

}
