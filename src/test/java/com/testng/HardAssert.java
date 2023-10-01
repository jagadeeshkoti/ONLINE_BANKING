package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void hardassert()
	{
		System.out.println("---step1---");
		System.out.println("---step2----");
		Assert.assertNotEquals("Jagadeesh", "Koti");
		Assert.fail();
		System.out.println("---step3---");
		System.out.println("---step4---");
		
	}
	
	@Test
	public void hardassert1()
	{
		System.out.println("---step5---");
		System.out.println("---step6----");
		Assert.assertEquals("Jagadeesh", "Koti");
		System.out.println("---step8---");
		System.out.println("---step9---");
	}
	
	@Test
	public void hardassert2()
	{
	int j=27;
	Assert.assertNull(j);
	System.out.println("---step10---");
	
	}
	
	@Test
	public void hardassert3()
	{
	int j=27;
	Assert.assertNotNull(j);
	System.out.println("---step10---");
	
	}

}
