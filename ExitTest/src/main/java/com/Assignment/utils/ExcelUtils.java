package com.Assignment.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook wb ;
	
	public static void main(String[] args) throws IOException {
		getUserCredential();
		getvalidPassword();
		getValidSearch();
		getData();
		
	}
	
	
	public static String getUserCredential() throws IOException {
		
		wb = new XSSFWorkbook(".\\Resources1\\Data.xlsx");
		double data =  wb.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		long l = (long) data;
		String s = String.valueOf(l);
		System.out.println(s);
		return s;
		
	}
	
public static String getvalidPassword() throws IOException {
		
		wb = new XSSFWorkbook(".\\Resources1\\Data.xlsx");
		String data1 =  wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data1);
		return data1;
		
	}

public static String getValidSearch() throws IOException {
	
	wb = new XSSFWorkbook(".\\Resources1\\Data.xlsx");
	String data2 =  wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	System.out.println(data2);
	return data2;
	
}

public static String getData() throws IOException {
	
	wb = new XSSFWorkbook(".\\Resources1\\Data.xlsx");
	String data3 =  wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(data3);
	return data3;
	
}
	
	
	

}
