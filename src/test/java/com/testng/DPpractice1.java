package com.testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking.genericUtils.ExcelUtility;

public class DPpractice1 {
	@Test(dataProvider = "datafromexcel")
	public void getdata(String pName,String Price,String size)
	{
		System.out.println(pName+"--->"+Price+"--->"+"--->"+size);
	}
	
	@DataProvider
  public Object[][] datafromexcel() throws EncryptedDocumentException, IOException
  {
	  ExcelUtility elib = new ExcelUtility();
	  Object[][] value = elib.getmultipleSetofData("DP");
	  return value;
  }
}
