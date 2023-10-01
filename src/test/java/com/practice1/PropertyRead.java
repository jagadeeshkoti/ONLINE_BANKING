package com.practice1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileInputStream fis = new FileInputStream("src\\test\\resources\\b.properties");
     Properties pobj = new Properties();
     pobj.load(fis);
     String URL = pobj.getProperty("url");
     String USERNAME = pobj.getProperty("username");
     String PASSWORD = pobj.getProperty("password");
     String BROWSER= pobj.getProperty("browser");
     
     
     System.out.println(URL);
     System.out.println(USERNAME);
     System.out.println(PASSWORD);
     System.out.println(BROWSER);
	}

}
