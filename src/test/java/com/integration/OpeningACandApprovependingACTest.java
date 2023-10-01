package com.integration;

import java.io.FileInputStream;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.banking.genericUtils.WebdriverUtility;
import com.banking.pom.HomePage;


public class OpeningACandApprovependingACTest {

	public static void main(String[] args) throws InterruptedException, Throwable {
		WebDriver driver=null;
	
		//fetch the common data using property file
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\com.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		
		
		//read the data from the excel sheet
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet5");
		int lastRowNum = sh.getLastRowNum();
		//String gender = sh.getRow(1).getCell(3).getStringCellValue();
		
		
		
		
		
		//launch the browser
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		WebdriverUtility wlib = new WebdriverUtility();
		wlib.maximizeTheBrowser(driver);
		driver.manage().deleteAllCookies();
		driver.get(URL);
		wlib.implicitwait(driver, 10);
		HomePage hp = new HomePage(driver);
		hp.getOpenaccount().click();
		
		
		HashedMap<String, String> map = new HashedMap<String, String>();
		for(int i=1;i<=lastRowNum;i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		for(Entry<String, String>s1:map.entrySet())
		{
			driver.findElement(By.name(s1.getKey())).sendKeys(s1.getValue());
		}
		
		
	
	
	//	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("JAGADEESH");
		String gendd = sh.getRow(1).getCell(2).getStringCellValue();
		WebElement ele = driver.findElement(By.xpath(""));
		Select s=new Select(ele);
		s.selectByVisibleText(gendd);
		
		
	//	driver.findElement(By.xpath("//input[@placeholder='Mobile no']")).sendKeys("9686881058");
	//	driver.findElement(By.xpath("//input[@placeholder='Email id']")).sendKeys("jagurk2484@gmail.com");
	//	driver.findElement(By.xpath("//input[@placeholder='Landline no']")).sendKeys("1234567890");
		Thread.sleep(2000);
		String dob1 = sh.getRow(2).getCell(3).getStringCellValue();
		WebElement DOB = driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
		DOB.click();
		DOB.sendKeys(dob1);
	//	driver.findElement(By.xpath("//input[@placeholder='PAN Number']")).sendKeys("ECZPK0709M");
	//	driver.findElement(By.xpath("//input[@placeholder='Citizenship Number']")).sendKeys("969322847800");
	//	driver.findElement(By.xpath("//input[@placeholder='Home Address']")).sendKeys("BIJAPURa");
	//	driver.findElement(By.xpath("//input[@placeholder='Office Address']")).sendKeys("KATRAGUPPE");
		
		String c2 = sh.getRow(3).getCell(2).getStringCellValue();
		WebElement State = driver.findElement(By.xpath("//select[@name='state']"));
		Select s1=new Select(State);
		s1.selectByVisibleText(c2);
		
		String c3 = sh.getRow(4).getCell(2).getStringCellValue();
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select s2=new Select(city);
		s2.selectByVisibleText(c3);
	//	driver.findElement(By.xpath("//input[@placeholder='Pin Code']")).sendKeys("586203");
	//	driver.findElement(By.xpath("//input[@placeholder='Area/Locality']")).sendKeys("VIJAYANAGR");
	//	driver.findElement(By.xpath("//input[@placeholder='Nominee Name (If any)']")).sendKeys("SJSJ2484");
	//	driver.findElement(By.xpath("//input[@placeholder='Nominee Account no']")).sendKeys("08442210027978");
	
		String ac = sh.getRow(5).getCell(2).getStringCellValue();
		WebElement actype = driver.findElement(By.xpath("//select[@name='acctype']"));
		Select s3=new Select(actype);
		s3.selectByVisibleText(ac);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		
		
		Alert a= driver.switchTo().alert();
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
		
	Alert a2=driver.switchTo().alert();
	String a2text = a2.getText();
	int length2 = a2text.length();
	String num3="";
	for(int i=0;i<length2;i++)
	{
		if(Character.isDigit(a2text.charAt(i)))
		{
			num3=num3+a2text.charAt(i);
		}
	}
		System.out.println(num3);
	

	}

}
