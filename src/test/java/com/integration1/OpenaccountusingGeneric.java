package com.integration1;

import java.io.FileInputStream;
import java.util.Map.Entry;

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

import com.banking.genericUtils.ExcelUtility;
import com.banking.genericUtils.FileUtilities;
import com.banking.genericUtils.JavaUtility;
import com.banking.genericUtils.WebdriverUtility;
import com.banking.pom.HomePage;
import com.banking.pom.OpenACdetails;

public class OpenaccountusingGeneric {

	public static void main(String[] args) throws Throwable {
		FileUtilities flib = new FileUtilities();
		ExcelUtility elib = new ExcelUtility();
		JavaUtility jlib = new JavaUtility();
		WebdriverUtility wlib = new WebdriverUtility();
		WebDriver driver=null;
		
		//fetch the common data using property file
		
		/*FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\com.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");*/
		
	     String Browser = flib.readdata("browser");
	     String URL = flib.readdata("url");
	     String un = flib.readdata("username");
	     String pwd = flib.readdata("password");
		
		
		//read the data from the excel sheet
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet5");
		int lastRowNum = sh.getLastRowNum();
		//String gender = sh.getRow(1).getCell(3).getStringCellValue();
		
		
		
		
		
		//launch the browser
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		//driver.manage().window().maximize();
		wlib.maximizeTheBrowser(driver);
		driver.manage().deleteAllCookies();
		driver.get(URL);
		wlib.implicitwait(driver, 10);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage hpg = new HomePage(driver);
		hpg.clickopen();
		// driver.findElement(By.xpath("//li[text()='Open Account']")).click();
		
		
	//	elib.getMultipleDataFromExcel("Sheet5", 0, 1, driver);
		Thread.sleep(2000);
		
		
	//	opd.openacdetais(elib.getMultipleDataFromExcel("Sheet5",0, 1, driver), driver);
	/*	HashedMap<String, String> map = new HashedMap<String, String>();
		for(int i=1;i<=lastRowNum;i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		
		
		for(Entry<String, String>s1:map.entrySet())
		{
			driver.findElement(By.name(s1.getKey())).sendKeys(s1.getValue());
		}*/
	
		String gendd = elib.readDataFromExcelSheet("Sheet5", 1, 2);
		//String gendd = sh.getRow(1).getCell(2).getStringCellValue();
		WebElement ele = driver.findElement(By.xpath("//select[@name='gender']"));
		wlib.selectDropDown(gendd, ele);
		//Select s=new Select(ele);
		//s.selectByVisibleText(gendd);
		
		String dob1 = elib.readDataFromExcelSheet("Sheet5", 2, 3);
		//String dob1 = sh.getRow(2).getCell(3).getStringCellValue();
		WebElement DOB = driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
		DOB.click();
		DOB.sendKeys(dob1);
		
		String c2 = elib.readDataFromExcelSheet("Sheet5", 3, 2);
		//String c2 = sh.getRow(3).getCell(2).getStringCellValue();
		WebElement State = driver.findElement(By.xpath("//select[@name='state']"));
		wlib.selectDropDown(c2, State);
		//Select s1=new Select(State);
		//s1.selectByVisibleText(c2);
		
		 String c3 = elib.readDataFromExcelSheet("Sheet5", 4, 2);
		//String c3 = sh.getRow(4).getCell(2).getStringCellValue();
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		wlib.selectDropDown(c3, city);
		//Select s2=new Select(city);
		//s2.selectByVisibleText(c3);
	
		
		 String ac = elib.readDataFromExcelSheet("Sheet5", 5, 2);
		//String ac = sh.getRow(5).getCell(2).getStringCellValue();
		WebElement actype = driver.findElement(By.xpath("//select[@name='acctype']"));
		wlib.selectDropDown(ac, actype);
		//Select s3=new Select(actype);
	//	s3.selectByVisibleText(ac);
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
		driver.findElement(By.xpath("//input[@name='staff_id']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
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
		
		
		
	}

}
