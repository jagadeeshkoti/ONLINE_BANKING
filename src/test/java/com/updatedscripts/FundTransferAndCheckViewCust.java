package com.updatedscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FundTransferAndCheckViewCust {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[text()='Fund Transfer']")).click();
		driver.findElement(By.name("customer_id")).sendKeys("1011181");
		driver.findElement(By.name("password")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//li[text()='Fund Transfer']")).click();
		driver.findElement(By.name("view_beneficiary")).click();
		WebElement ele = driver.findElement(By.xpath("//tbody/tr[2]/td[3]"));
		String text = ele.getText();
		System.out.println(text);
		driver.findElement(By.linkText("Staff Login")).click();
		driver.findElement(By.xpath("//input[@name='staff_id']")).sendKeys("210001");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='staff_login-btn']")).click();
		driver.findElement(By.name("view_cust_by_ac")).click();
		driver.findElement(By.name("account_no")).sendKeys(text);
		driver.findElement(By.name("submit_view")).click();
	

	}

}
