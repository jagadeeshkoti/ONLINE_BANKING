package com.testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.banking.genericUtils.path;

public class Dpexcel {
@DataProvider
public Object[][] dataFromExcel() throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream(path.epath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("DP");
	int lastrow = sh.getLastRowNum();
	short lastCellNum = sh.getRow(0).getLastCellNum();
	
	
	Object[][] obj = new Object[lastrow+1][lastCellNum];
	for(int i=0;i<=lastrow;i++)
	{
		for(int j=0;j<lastCellNum;j++)
		{
			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return obj;
	
	
}
}
