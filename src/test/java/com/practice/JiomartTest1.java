package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JiomartTest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//a[text()='Groceries']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		List<WebElement> all = driver.findElements(By.xpath("//a[text()='Fruits & Vegetables']/../../../ul/li"));
        for (WebElement we: all) {
			act.moveToElement(we).perform();
			List<WebElement> fr = driver.findElements(By.xpath("//a[text()='Fresh Vegetables']/../../li"));
			
			
			
			
		}
	}

}
