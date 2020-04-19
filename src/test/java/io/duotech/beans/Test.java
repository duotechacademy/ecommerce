package io.duotech.beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.github.javafaker.Faker;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
		
		FileInputStream file  = new FileInputStream("file.xlsx");
		
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		XSSFRow headerRow = sh.getRow(0);
		
		XSSFCell c = headerRow.getCell(3);
		
		System.out.println(c);
		
		int noOfColumns = headerRow.getLastCellNum();
		
		System.out.println(noOfColumns);
		
		
		//int noOfRows = sh.getLastRowNum();
		
		
		int noOfRows = sh.getPhysicalNumberOfRows();
		
		System.out.println(noOfRows);
		
		for (int i = 0; i < noOfRows; i++) {
			
			for (int j = 0; j < noOfColumns; j++) {
				
				Cell eachCell = sh.getRow(i).getCell(j);
				System.out.print(eachCell + "                   \t");
			}
			System.out.println();
			
		}
		
		
		Row r = sh.getRow(2);
		Cell ch = r.getCell(1);
		ch.setCellValue("Beck");
		
		FileOutputStream fos = new FileOutputStream("file.xlsx");
		
		wb.write(fos);
		
		fos.close();
		/*
		 * XSSFWorkbook, XSSFSheet, XSSFRow XSSFCell  --> Classes used for file format .xlsx (Excel 2007+)
		 * HSSFWorkbook, HSSFSheet, HSSFRow, HSSFCell --> Classes used for file format .xls (Excel prior to 2007)
		 */

		
		wb.close();

		
	}

}
