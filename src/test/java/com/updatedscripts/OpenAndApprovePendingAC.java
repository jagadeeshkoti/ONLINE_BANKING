package com.updatedscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenAndApprovePendingAC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[text()='Open Account']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("JAGADEHH");
		WebElement ele = driver.findElement(By.xpath("//select[@name='gender']"));
		Select s=new Select(ele);
		s.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@placeholder='Mobile no']")).sendKeys("9686881000");
		driver.findElement(By.xpath("//input[@placeholder='Email id']")).sendKeys("jagurk2484@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Landline no']")).sendKeys("1234567890");
		WebElement DOB = driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
		DOB.click();
		DOB.sendKeys("07-08-1996");
		driver.findElement(By.xpath("//input[@placeholder='PAN Number']")).sendKeys("ECZPK0709M");
		driver.findElement(By.xpath("//input[@placeholder='Citizenship Number']")).sendKeys("969322847800");
		driver.findElement(By.xpath("//input[@placeholder='Home Address']")).sendKeys("BIJAPURa");
		driver.findElement(By.xpath("//input[@placeholder='Office Address']")).sendKeys("KATRAGUPPE");
		WebElement State = driver.findElement(By.xpath("//select[@name='state']"));
		Select s1=new Select(State);
		s1.selectByVisibleText("Washington");
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select s2=new Select(city);
		s2.selectByVisibleText("Texas City");
		driver.findElement(By.xpath("//input[@placeholder='Pin Code']")).sendKeys("586203");
		driver.findElement(By.xpath("//input[@placeholder='Area/Locality']")).sendKeys("VIJAYANAGR");
		driver.findElement(By.xpath("//input[@placeholder='Nominee Name (If any)']")).sendKeys("SJSJ2484");
		driver.findElement(By.xpath("//input[@placeholder='Nominee Account no']")).sendKeys("08442210027978");
		WebElement actype = driver.findElement(By.xpath("//select[@name='acctype']"));
		Select s3=new Select(actype);
		s3.selectByVisibleText("Saving");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		
		
		Alert a=driver.switchTo().alert();
		String t = a.getText();
	      int length = t.length();
	      String num="";
	      for(int i=0;i<length;i++)
	      {
	    	  if(Character.isDigit(t.charAt(i)))
	    	  {
	    		  num=num+t.charAt(i);
	    	  }
	      }
	      System.out.println(num);
		a.accept();
		
		driver.findElement(By.linkText("Staff Login")).click();
		driver.findElement(By.xpath("//input[@name='staff_id']")).sendKeys("210001");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='staff_login-btn']")).click();
		driver.findElement(By.xpath("//input[@value='Approve Pending Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Application number']")).sendKeys(num);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='search_application']")).click();
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='approve_cust']")).click();
		
		Thread.sleep(8000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());			
		Alert a1=driver.switchTo().alert();
		Thread.sleep(2000);
		String text1 = a1.getText();
		int length2 = text1.length();
		String num2="";
		for(int i=0;i<length2;i++)
		{
			if(Character.isDigit(text1.charAt(i)))
			{
				num2=num2+text1.charAt(i);
			}
		}
		System.out.println(num2);
	    a1.accept();
		Thread.sleep(2000);
		


	}

}
