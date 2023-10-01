package com.testng;

import org.testng.annotations.Test;

public class Dpexcel2Test {
	@Test (dataProviderClass = Dpexcel.class,dataProvider = "dataFromExcel")
	public void getdata(String pname,String price,String size)
	{
		System.out.println(pname+"---->"+price+"---->"+size);
	}
}
