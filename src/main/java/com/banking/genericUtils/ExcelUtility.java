package com.banking.genericUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelUtility {
	
	/**
	 * This method is used to read the data from excell
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
    public String readDataFromExcelSheet(String sheet ,int row, int cell) throws Throwable
    {
    	FileInputStream fis=new FileInputStream(path.epath);
    	Workbook book = WorkbookFactory.create(fis);
    	Sheet sh = book.getSheet(sheet);
    	Row roww = sh.getRow(row);
    	Cell cell2 = roww.getCell(cell);
    	String value = cell2.getStringCellValue();
		return value;
    	
    }
    
    
    /**
     *  This method is used to write the data into excell
     * @param sheet
     * @param row
     * @param cell
     * @param msg
     * @throws Throwable
     */
    public void writeDataFromExcelSheet(String sheet ,int row, int cell, String msg) throws Throwable
    {
    	FileInputStream fis=new FileInputStream(path.epath);
    	Workbook book = WorkbookFactory.create(fis);
    	Sheet sh = book.getSheet(sheet);
    	Row roww = sh.createRow(row);
    	Cell cell2 = roww.createCell(cell);
    	cell2.setCellValue(msg);
    	
    	FileOutputStream fos=new FileOutputStream(path.epath);
    	book.write(fos);
    	book.close();
    		
    }
    
    /**
     *  This method is used to fetch the lastrownum
     * @param sheet
     * @return
     * @throws Throwable
     */
    public int readDataFromExcelSheet(String sheet) throws Throwable
    {
    	FileInputStream fis=new FileInputStream(path.epath);
    	Workbook book = WorkbookFactory.create(fis);
    	Sheet sh = book.getSheet(sheet);
    	int lastRowNum = sh.getLastRowNum();
		return lastRowNum;
    }
    
   // public HashMap<String, String> getMultipleDataFromExcel(String sheetName,int keycolumn,int valuecolumn,WebDriver driver,JavaUtility jLib) throws Throwable
    public HashMap<String, String> getMultipleDataFromExcel(String sheetName,int keycolumn,int valuecolumn,WebDriver driver) throws Throwable
    
    {
    	//fetching the data from excel
    	FileInputStream fis = new FileInputStream(path.epath);
    	Workbook book = WorkbookFactory.create(fis);
    	Sheet sh = book.getSheet(sheetName);
    	int count = sh.getLastRowNum();
    	
    	HashMap<String, String> map = new HashMap<String, String>();
    	for(int i=1;i<=count;i++)
    	{
    		String key = sh.getRow(i).getCell(keycolumn).getStringCellValue();
    		String value = sh.getRow(i).getCell(valuecolumn).getStringCellValue();
    		map.put(key, value);
    	}
    	    return map;
    }
         
    	  public Object[][] getmultipleSetofData(String sheetName) throws EncryptedDocumentException, IOException
    	  {
    		  FileInputStream fi = new FileInputStream(path.epath);
    		  Workbook wb = WorkbookFactory.create(fi);
    		  Sheet sh = wb.getSheet(sheetName);
    		  int lastrow = sh.getLastRowNum();
    		  short lastcell = sh.getRow(0).getLastCellNum();
    		  Object[][] obj = new Object[lastrow+1][lastcell];
    		  for(int i=0;i<=lastrow;i++)
    		  {
    			  for(int j=0;j<lastcell;j++)
    			  {
    				  obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
    			  }
    	  }
      return obj;
    		
    }
    
    
    
    
    
    
    
    
    
}
