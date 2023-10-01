package com.integration;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

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

import com.banking.genericUtils.ExcelUtility;
import com.banking.genericUtils.FileUtilities;
import com.banking.genericUtils.JavaUtility;
import com.banking.genericUtils.WebdriverUtility;

public class CreditTest {

	public static void main(String[] args) throws Throwable {
WebDriver driver=null;
		ExcelUtility elib = new ExcelUtility();
		FileUtilities flib = new FileUtilities();
		JavaUtility jlib = new JavaUtility();
		WebdriverUtility wlib = new WebdriverUtility();
		
		String BROWSER = flib.readdata("browser");
		String URL = flib.readdata("url");
		String USERNAME = flib.readdata("username");
		String PASSWORD = flib.readdata("password");
	/*	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\com.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String browser = pobj.getProperty("browser");
		String url = pobj.getProperty("url");
		String sid = pobj.getProperty("username");
		String pwd = pobj.getProperty("password");
		*/
		
	/*	FileInputStream fiss=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook book = WorkbookFactory.create(fiss);
		Sheet sh = book.getSheet("Sheet3");
		*/
		
		
		//launch the browser
		if(BROWSER.equalsIgnoreCase("chrome"))
			
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		//enter the url
		driver.get(URL);
		wlib.maximizeTheBrowser(driver);
		//driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wlib.implicitwait(driver, 10);
		
		driver.findElement(By.linkText("Staff Login")).click();
		driver.findElement(By.name("staff_id")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		
		driver.findElement(By.name("staff_login-btn")).click();
		driver.findElement(By.name("credit_cust_ac")).click();
		
		elib.getMultipleDataFromExcel("Sheet3", 0, 1, driver);
	//	int lastRowNum = sh.getLastRowNum();
		
		
	/*	HashMap<String, String> map=new HashMap<String, String>();
		for(int i=0;i<=1;i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		
		for(Entry<String, String> s:map.entrySet())
		{
		driver.findElement(By.name(s.getKey())).sendKeys(s.getValue());
		
		} */
		driver.findElement(By.name("credit_btn")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.name("logout_btn")).click();
		driver.findElement(By.linkText("Home")).click();
	
	 //Actions a=new Actions(driver);
		
		WebElement internetb = driver.findElement(By.xpath("//div[@class='ebanking']/a"));
		wlib.mouseOverOnElement(driver, internetb);
		//a.moveToElement(internetb).perform();
		driver.findElement(By.xpath("//li[.='Login ']")).click();
		
		elib.getMultipleDataFromExcel("Sheet4", 0, 1, driver);
	/*	HashMap<String, String> map1=new HashMap<String, String>();
		FileInputStream fiss1=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook book1 = WorkbookFactory.create(fiss1);
		Sheet sh1 = book1.getSheet("Sheet4");
		int rCount=sh1.getLastRowNum();
		for(int i=0;i<=rCount;i++)
		{
			String key1 = sh1.getRow(i).getCell(0).getStringCellValue();
			String value1 = sh1.getRow(i).getCell(1).getStringCellValue();
			map1.put(key1, value1);
		}
		//System.out.println(map1.size());
		for(Entry<String, String> s1:map1.entrySet())
		{
			
		driver.findElement(By.name(s1.getKey())).sendKeys(s1.getValue());
		//driver.findElement(By.name("password")).sendKeys("SJSJ9686");
		}*/
		driver.findElement(By.name("login-btn")).click();
		driver.findElement(By.xpath("//li[.='Statement']")).click();
	}

}
