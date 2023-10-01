package com.practice_DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritemultipledataintoexcelTest {

	public static void main(String[] args) throws Throwable {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row number");
		int row_count = sc.nextInt();
		System.out.println("Enter the Column number");
        int col_count = sc.nextInt();
        String path = ".\\src\\test\\resources\\Testdata.xlsx";
        
        FileInputStream fis=new FileInputStream(path);
        
        Workbook wb = WorkbookFactory.create(fis);
        
        
        
	}

}
