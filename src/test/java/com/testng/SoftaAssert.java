package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftaAssert {
   @Test
   public void softassertTest() {
	   String expected="Online Banking";
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
	   String actual = driver.getTitle();
	   System.out.println(actual);
	   SoftAssert sa = new SoftAssert();
	   sa.assertEquals(actual, expected);
	   System.out.println("---Application Launched---");
	   sa.assertAll();
	   
   }
}
