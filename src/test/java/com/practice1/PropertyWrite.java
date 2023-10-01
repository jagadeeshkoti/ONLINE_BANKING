package com.practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyWrite {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.setProperty("username","9686881058SJ");
		prop.setProperty("password","SJSJ9686");
		prop.setProperty("url","https://www.facebook.com/");
		prop.setProperty("browser","chrome");
		
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\b.properties");
		prop.store(fos,"s");
		
		FileInputStream fis = new FileInputStream(".\\\\src\\\\test\\\\resources\\\\b.properties");
		prop.load(fis);
		String un = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		String b = prop.getProperty("browser");
		String u = prop.getProperty("url");
		
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(b);
		System.out.println(u);

	}

}
