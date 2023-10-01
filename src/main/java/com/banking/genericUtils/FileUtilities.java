package com.banking.genericUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtilities {
	
	/**
	 * This method is used to fetch the data from properties file
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readdata(String key) throws Throwable
	{
	FileInputStream fis=new FileInputStream(path.ppath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String value = pobj.getProperty(key);
	return value;
	
	
	}

}
