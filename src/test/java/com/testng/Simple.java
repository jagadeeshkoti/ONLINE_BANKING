package com.testng;

import org.testng.annotations.Test;

import com.banking.genericUtils.Baseclass;

public class Simple extends Baseclass {
@Test(groups = "smoke")
public void simpletest()
{
	System.out.println("---simple---");
}
}
