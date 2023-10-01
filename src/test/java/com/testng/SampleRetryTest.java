package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.genericUtils.Baseclass;

public class SampleRetryTest extends Baseclass{
@Test(retryAnalyzer =com.banking.genericUtils.RetryImpl.class)
public void retrytest()
{
	Assert.assertEquals("A","B");
}
	
}
