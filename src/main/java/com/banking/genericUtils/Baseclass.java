package com.banking.genericUtils;

import java.sql.SQLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.banking.pom.StaffloginPage;

public class Baseclass {
    
	public DatabaseUtility dLib=new DatabaseUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public FileUtilities fLib=new FileUtilities();
	public JavaUtility jLib=new JavaUtility();
	public WebdriverUtility wLib=new WebdriverUtility();
	public  WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun=true)
	public void configBS() throws SQLException
	{
		dLib.connectToDB();
		System.out.println("--connect to DB--");
	}
//	@Parameters("BROWSER")
	@BeforeClass(alwaysRun=true)
	public void configBC() throws Throwable
	{
		String BROWSER = fLib.readdata("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
				{
			driver=new ChromeDriver();
				}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
		System.out.println("--Launch Browser--");
		sdriver=driver;
		wLib.maximizeTheBrowser(driver);
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public void configuBM() throws Throwable
	{
		String URL = fLib.readdata("url");
		
		driver.get(URL);
		wLib.implicitwait(driver, 10);
		
		System.out.println("----login to staff---");
		
	}
	
	@AfterClass(alwaysRun=true)
	public void confiAC() {
		driver.quit();
		System.out.println("---close the browser---");
	}
	
	@AfterSuite(alwaysRun = true)
	public void confiAS() throws Throwable 
	{
		dLib.closeDB();
		System.out.println("---close DB connection---");
	}
	
	
	
}
