package com.practice_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteMultipledatatoexcelTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Organization");
		sh.createRow(7).createCell(0).setCellValue("QSPIDER");
		sh.getRow(7).createCell(1).setCellValue("BANGLORE");
		sh.createRow(8).createCell(0).setCellValue("JSPIDER");
		sh.getRow(8).createCell(1).setCellValue("BANGLORE");
		sh.createRow(9).createCell(0).setCellValue("MILETECH");
		sh.getRow(9).createCell(1).setCellValue("PUNE");
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Testdata.xlsx");
		wb.write(fos);
		

	}

}
