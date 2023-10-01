package com.testng;

import org.testng.annotations.Test;

import com.banking.genericUtils.Baseclass;

public class Sample extends Baseclass {
	@Test(groups = "regression")
	public void sampletest()
	{
		System.out.println("---sample---");
	}

}
