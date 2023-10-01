package com.bankingsoftcode;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.banking.genericUtils.Baseclass;
import com.banking.genericUtils.ExcelUtility;
import com.banking.genericUtils.FileUtilities;
import com.banking.genericUtils.WebdriverUtility;
import com.banking.pom.CreditCusAmount;
import com.banking.pom.CredithomePage;
import com.banking.pom.CustomerAcNo;
import com.banking.pom.HomePage;
import com.banking.pom.InternetBankingPage;
import com.banking.pom.StaffhomePage;
import com.banking.pom.StaffloginPage;

public class CreditTest extends Baseclass{

    // public static void main(String[] args) throws Throwable 
	@Test
	public void creditTest() throws Throwable{
	{
	//	WebDriver driver=new ChromeDriver();
	//	WebdriverUtility wlib = new WebdriverUtility();
	//	ExcelUtility elib = new ExcelUtility();
	//	FileUtilities flib = new FileUtilities();
		
	//	wlib.maximizeTheBrowser(driver);
		driver.manage().deleteAllCookies();
	//	String Browser = flib.readdata("browser");
	//	String URL= flib.readdata("url");
	   String un = fLib.readdata("username");
	  String pwd = fLib.readdata("password");
		String cid = fLib.readdata("customerid");
		String cpwd = fLib.readdata("customerpwd");
	//	driver.get(URL);
		wLib.implicitwait(driver, 10);
		HomePage hp=new HomePage(driver);
		hp.stafflogin();
		
	    StaffloginPage sp=new StaffloginPage(driver);
		sp.staffloginpage(un, pwd);
		StaffhomePage shp=new StaffhomePage(driver);
		shp.creditcusbutton();
		
		CreditCusAmount creditamnt=new CreditCusAmount();
		creditamnt.amount(eLib.getMultipleDataFromExcel("Sheet3", 0, 1, driver), driver);
		
		CredithomePage chb=new CredithomePage(driver);
		chb.creditbutton();
	    
	  wLib.acceptAlertPopup(driver);  
		 hp.homebutton();
	   hp.movetoele(driver);
	    CustomerAcNo cac=new CustomerAcNo(driver);
	    cac.customerlogin(cid, cpwd);
	    
	//    FundtransferPage ft=new FundtransferPage(driver);
	//	ft.cloginbutton();
	    InternetBankingPage ib=new InternetBankingPage(driver);
		ib.statement();
	  



	}

}
}