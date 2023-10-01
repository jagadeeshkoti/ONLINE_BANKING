package com.practice_DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteAlllinks {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet7");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=0;i<links.size();i++)
		{
			Cell c = sh.createRow(i).createCell(0);
			WebElement single = links.get(i);
			String url = single.getAttribute("href");
			c.setCellValue(url);
		}
		FileOutputStream fos=new FileOutputStream(".\\\\src\\\\test\\\\resources\\\\Testdata.xlsx");
		wb.write(fos);

	}

}
