package com.practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSingledata {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("\\src\\test\\resources\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Organization");
		int lastrow = sh.getLastRowNum();
		for(int i=1;i<=lastrow;i++)
		{
			short lastcell = sh.getRow(i).getLastCellNum();
			for(int j=0;i<lastcell;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
      System.out.println();
		}

	}

}
