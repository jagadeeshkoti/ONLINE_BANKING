package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritethemultipledataexcelTest {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Organization");
		sh.createRow(11).createCell(0).setCellValue("ALUFIT");
		sh.getRow(11).createCell(1).setCellValue("BANGLORE");
		
				FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Testdata.xlsx");
				wb.write(fos);
				wb.close();
	}
}
