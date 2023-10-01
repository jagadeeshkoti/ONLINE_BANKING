package com.integration;

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

import com.banking.genericUtils.ExcelUtility;
import com.banking.genericUtils.FileUtilities;
import com.banking.genericUtils.WebdriverUtility;
import com.banking.pom.HomePage;


public class OpenACandApproverPengingACTest {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		WebdriverUtility wlib = new WebdriverUtility();
		wlib.maximizeTheBrowser(driver);
		//driver.manage().window().maximize();
		
		FileUtilities flib = new FileUtilities();
		String URL = flib.readdata("url");
		driver.get(URL);
		
		wlib.implicitwait(driver, 10);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage hpg = new HomePage(driver);
		hpg.clickopen();
		
		//driver.findElement(By.xpath("//li[text()='Open Account']")).click();
		
	//	OpenAcAlldetails all = new OpenAcAlldetails(driver);
		ExcelUtility elib = new ExcelUtility();
	//	all.getdatafromexcel(elib.getMultipleDataFromExcel("Sheet5", 1, 0, driver), driver,elib.readDataFromExcelSheet("Sheet5", 1, 2));
		
		
	    
		WebElement DOB = driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
		DOB.click();
		DOB.sendKeys("07-08-1996");
		WebElement State = driver.findElement(By.xpath("//select[@name='state']"));
		Select s1=new Select(State);
		s1.selectByVisibleText("Washington");
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select s2=new Select(city);
		s2.selectByVisibleText("Texas City");
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
