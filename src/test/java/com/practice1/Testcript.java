package com.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcript{
   @Test
   public void login()
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   Pomclass p1 = new Pomclass(driver);
	   p1.logintofb("Jagadeesh", "Koti");
   }
}
