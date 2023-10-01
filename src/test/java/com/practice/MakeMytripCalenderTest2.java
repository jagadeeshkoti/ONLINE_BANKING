package com.practice;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytripCalenderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		ArrayList<String> link = new ArrayList<String>();
		for(int i=0;i<links.size();i++)
		{
			WebElement we = links.get(i);
			String att = we.getAttribute("href");
			URL url=null;
			int statuscode=0;
			try
			{
				url=new URL(att);
				HttpURLConnection httpconn=(HttpURLConnection) url.openConnection();
				statuscode =httpconn.getResponseCode();
				if(statuscode>=400)
				{
					link.add(att+"---->"+statuscode);
					System.out.println(att+"---->"+statuscode);
				}
			}
		catch (Exception e) {
		link.add(att);
		}
		}

	}

}
