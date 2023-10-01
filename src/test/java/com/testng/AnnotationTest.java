package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationTest {
	@BeforeSuite
	public void Bs() 
	{
		System.out.println("----Connect to DB----");
		
	}
	
	@BeforeClass
	public void Bc()
	{
		System.out.println("----Launch the browser----");
	}
	
	@BeforeMethod
	public void Bm()
	{
		System.out.println("---Loginto the application---");
	}
	
	@Test
	public void sample()
	{
		System.out.println("----TestScript1-----");
	}
	
	@Test
	public void test2()
	{
		System.out.println("-----TestScript2-----");
	}
	
   @AfterMethod
   public void Am()
   {
	   System.out.println("----Logout the application----");
   }
   
   @AfterClass
   public void ac()
   {
	   System.out.println("----Close the browser----");
   }
   
   @AfterSuite
   public void as()
   {
	   System.out.println("----Close database connection----");
   }
}
