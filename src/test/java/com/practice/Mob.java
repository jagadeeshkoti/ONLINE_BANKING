package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mob {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement mob = driver.findElement(By.name("q"));
		mob.sendKeys("realme");
		mob.submit();
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for (WebElement single: all) {
			String li = single.getText();	
		//	if(li.contains("realme C55 (Rainy Night, 128 GB)"))
			System.out.println(li);
			
		}
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (WebElement sp: price) {
			String s = sp.getText();
			System.out.println(s);
			
		}
		//driver.close();
		

	}

}
