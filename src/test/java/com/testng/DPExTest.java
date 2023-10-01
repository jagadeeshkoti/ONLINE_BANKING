package com.testng;

import org.testng.annotations.Test;

public class DPExTest {
	@Test (dataProviderClass = dataproviderTest.class,dataProvider = "tv")
	public void getdata(String pname,int price,String size)
	{
		System.out.println(pname+"---->"+price+"---->"+size);
	}

}
