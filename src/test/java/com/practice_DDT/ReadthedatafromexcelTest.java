package com.practice_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadthedatafromexcelTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Organization");
		String value = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.print(value);
		String value1 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.print(value1);

	}

}
