package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kayak1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		String from="Mumbai";
		String to="Dheli";
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.kayak.co.in/flights");
		driver.findElement(By.xpath("//div[text()='Flights']")).click();
		driver.findElement(By.xpath("//div[@class='vvTc-item-button' and @aria-label='Remove']")).click();
		//WebElement fromm=driver.findElement(By.xpath("//div[@class='zEiP-formField zEiP-origin']"));
	//	fromm.click();
		driver.findElement(By.xpath("//input[@class='k_my-input' and @placeholder='From?']")).sendKeys("delhi");
		WebElement aaaa=driver.findElement(By.xpath("//li[@aria-label='New Delhi, National Capital Territory of India, India']"));
		act.moveToElement(aaaa).click().build().perform();
		//WebElement flight=driver.findElement(By.xpath("//span[text()='New Delhi, National Capital Territory of India, India']"));
		//act.moveToElement(flight).click().build().perform();
		//driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys(from);
/*		//WebElement ele = driver.findElement(By.xpath("//span[text()='New Delhi, National Capital Territory of India, India']"));
		//act.moveToElement(ele).click().perform();
WebElement elee = driver.findElement(By.xpath("//span[text()='Mumbai, Maharashtra, India']"));
act.moveToElement(elee).click().build().perform();
driver.findElement(By.xpath("//div[text()='New Delhi (DEL)']/../../descendant::div[@class='vvTc-item-close']")).click();
*/
	}

}
