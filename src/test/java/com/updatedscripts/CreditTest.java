package com.updatedscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreditTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Staff Login")).click();
		driver.findElement(By.xpath("//input[@name='staff_id']")).sendKeys("210001");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='staff_login-btn']")).click();
	    driver.findElement(By.name("credit_cust_ac")).click();
	    driver.findElement(By.name("customer_account_no")).sendKeys("1011251011316");
	    driver.findElement(By.name("credit_amount")).sendKeys("2000");
	    driver.findElement(By.name("credit_btn")).click();
	    Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
	     driver.findElement(By.name("logout_btn")).click();
	    driver.findElement(By.linkText("Home")).click();
	    WebElement ele = driver.findElement(By.xpath("//div[@class='ebanking']/a"));
	    Actions act=new Actions(driver);
	    act.moveToElement(ele).perform();
	    driver.findElement(By.xpath("//li[.='Login ']")).click();
	    driver.findElement(By.name("customer_id")).sendKeys("1011762");
	    driver.findElement(By.name("password")).sendKeys("SJSJ9686");
	    driver.findElement(By.name("login-btn")).click();
	    driver.findElement(By.xpath("//li[.='Statement']")).click();

	}

}
