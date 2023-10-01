package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Organization");
		int count = sh.getLastRowNum();
	   
	    for(int i=1;i<=count;i++)
	    {
	    	 short lastcell = sh.getRow(i).getLastCellNum();
	    	for(int j=0;j<lastcell;j++)
	    	{
	    		String value = sh.getRow(i).getCell(j).getStringCellValue();
	    		System.out.print(value+" ");
	    		
	    	}
	    	System.out.println();
	    }
		

	}

}
