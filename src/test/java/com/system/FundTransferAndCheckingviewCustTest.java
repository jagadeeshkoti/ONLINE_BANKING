package com.system;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.banking.genericUtils.path;

public class FundTransferAndCheckingviewCustTest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		FileInputStream fis=new FileInputStream(path.ppath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String URL = pobj.getProperty("url");
		String un = pobj.getProperty("username");
		String pwd = pobj.getProperty("password");
		String cid = pobj.getProperty("customerid");
		String cpwd = pobj.getProperty("customerpwd");
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[text()='Fund Transfer']")).click();
		driver.findElement(By.name("customer_id")).sendKeys(cid);
		driver.findElement(By.name("password")).sendKeys(cpwd);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//li[text()='Fund Transfer']")).click();
		driver.findElement(By.name("view_beneficiary")).click();
		WebElement ele = driver.findElement(By.xpath("//tbody/tr[2]/td[3]"));
		String text = ele.getText();
		System.out.println(text);
		driver.findElement(By.linkText("Staff Login")).click();
		driver.findElement(By.xpath("//input[@name='staff_id']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='staff_login-btn']")).click();
		driver.findElement(By.name("view_cust_by_ac")).click();
		driver.findElement(By.name("account_no")).sendKeys(text);
		driver.findElement(By.name("submit_view")).click();
	}

}
