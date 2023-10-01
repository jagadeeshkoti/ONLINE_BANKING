package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderTest {
	@Test(dataProvider = "tv")
	public void getData(String product,int price,String size)
	{
		System.out.println(product+"------>"+price+"------>"+size);
	}
	@DataProvider
	public Object[][] mobiles()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="Samsung";
		obj[0][1]=5000;
		
		obj[1][0]="Relame";
		obj[1][1]=15000;
		
		return obj;
	}
	@DataProvider
    public Object[][] tv()
    {
    	Object[][] obj = new Object[2][3];
    	
    	obj[0][0]="Sony";
    	obj[0][1]=45000;
    	obj[0][2]="45 Inch";
    	
    	obj[1][0]="LG";
    	obj[1][1]=80000;
    	obj[1][2]="47 Inch";
    	return obj;
    	
    }
}
