package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Writethedataintopproopertyfile {

	public static void main(String[] args) throws Throwable {
	 Properties prop = new Properties();
	 prop.setProperty("username","admin");
	 prop.setProperty("password","admin");
	 prop.setProperty("url","http://rmgtestingserver:8888/");
	 prop.setProperty("browser","chrome");
	 
	 FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\com.properties");
	 prop.store(fout,"write data");
	 fout.close();
	 
	 //reading data
	 FileInputStream fin=new FileInputStream(".\\src\\test\\resources\\com.properties");
	 prop.load(fin);
	 
	 
	 String USERNAME = prop.getProperty("username");
	 String PASSWORD = prop.getProperty("password");
	 String URL = prop.getProperty("url");
	 String BROWSER = prop.getProperty("browser");
	 
	 
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get(URL);
	 driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	 driver.findElement(By.id("submitbutton")).click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
