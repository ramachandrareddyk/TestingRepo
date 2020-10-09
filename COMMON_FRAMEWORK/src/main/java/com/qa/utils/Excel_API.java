package com.qa.utils;

import java.io.FileInputStream;
import java.util.Hashtable;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_API {
	
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static Object[][] getCellData(String file,String sheetName){
		initExcelFile(file);
		sheet=book.getSheet(sheetName);
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		
		Object [][] data=new Object[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return data;		
	}
	
	public static Object[][] getTestData(String file,String sheetName){
		initExcelFile(file);
		sheet=book.getSheet(sheetName);
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		Object [][] data=new Object[rows][1];
		int rowCount=0;
		Hashtable<String, String> table = null;
		for (int i = 0; i < rows; i++) {
			table=new Hashtable<String, String>();
			for (int j = 0; j < cols; j++) {
				String key=sheet.getRow(0).getCell(j).getStringCellValue();
				String value=sheet.getRow(i+1).getCell(j).getStringCellValue();
				table.put(key, value);
			}
			data[rowCount][0]=table;
			rowCount++;
		}
		return data;
	}
	
	public static void initExcelFile(String file){
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			book=new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
