package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DPpractice {

	@DataProvider
	public Object[][] tv()
	{
		Object[][] obj = new Object[2][3];
		obj[0][0]="SONY";
		obj[0][1]=45000;
		obj[0][2]="45inch";
		
		obj[1][0]="LG";
		obj[1][1]=50000;
		obj[1][2]="50inch";
		return obj;
	}
	
/*	@Test(dataProvider = "tv")
	public void getdata(String pname,int price,String size)
	{
		System.out.println(pname+" "+price+" "+size);
	}*/
}
