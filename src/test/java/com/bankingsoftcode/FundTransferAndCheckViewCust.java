package com.bankingsoftcode;


import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.banking.genericUtils.Baseclass;
import com.banking.genericUtils.ExcelUtility;
import com.banking.genericUtils.FileUtilities;
import com.banking.genericUtils.WebdriverUtility;
import com.banking.pom.AccouuntNuumPage;
import com.banking.pom.FundTansferhomepage;
import com.banking.pom.FundtransferPage;
import com.banking.pom.HomePage;
import com.banking.pom.InternetBankingPage;
import com.banking.pom.StaffhomePage;
import com.banking.pom.StaffloginPage;
//@Listeners(com.banking.genericUtils.ListenerImpClass.class)
public class FundTransferAndCheckViewCust extends Baseclass {
	
	@Test(groups = {"system"})
	public void fundTransfer() throws Throwable
	{

	
		String un = fLib.readdata("username");
		String pwd = fLib.readdata("password");
		String cid = fLib.readdata("customerid");
		String cpwd = fLib.readdata("customerpwd");
	
		
	
		
		wLib.implicitwait(driver, 10);
		
		HomePage hp = new HomePage(driver);
		hp.fundtransferbtn();
	

	    FundtransferPage ftp = new FundtransferPage(driver);
	    ftp.fundtransferloginpage(cid, cpwd);
	    Assert.fail();
		
		ftp.cloginbutton();
		
	
		
		InternetBankingPage ip = new InternetBankingPage(driver);
		ip.ftransferbtn();
	
		
		FundTansferhomepage fpg = new FundTansferhomepage(driver);
		fpg.clickviewbeni();
		
	
		
		String text = fpg.benitext();
		
		hp.stafflogin();
		
	
		
		StaffloginPage spg = new StaffloginPage(driver);
		spg.staffloginpage(un, pwd);
		
		StaffhomePage spg1 = new StaffhomePage(driver);
		spg1.viewcustbyacnum();
	
		
		AccouuntNuumPage acp = new AccouuntNuumPage(driver);
		acp.accnum(text);
	



	}

}
