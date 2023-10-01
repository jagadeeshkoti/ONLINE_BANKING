package com.practice_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritethesingledatatoexcelTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet8");
		sh.createRow(7).createCell(0).setCellValue("MYSOOR");
		sh.getRow(7).createCell(1).setCellValue("PUNE");
		sh.createRow(10).createCell(0).setCellValue("ABC");
		sh.getRow(10).createCell(1).setCellValue("EFC");
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Testdata.xlsx");
		wb.write(fos);
	    wb.close();

	}

}
