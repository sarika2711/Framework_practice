package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File fs = new File("./src/test/resources/TestData/testdata.xlsx");
			FileInputStream fin = new FileInputStream(fs);
			
			XSSFWorkbook workbook = new XSSFWorkbook(fin);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int rowcount = sheet.getLastRowNum();
			System.out.println("Row = "+rowcount);
			int colcount = sheet.getRow(rowcount).getLastCellNum();
			System.out.println("Col = "+colcount);
			
			
			
			for(int i=0;i<=sheet.getLastRowNum();i++)
			{
				XSSFRow row = sheet.getRow(i);
				
				for(int j=0;j<row.getLastCellNum();j++)
				{
					String data = row.getCell(j).toString();
					System.out.print (data+ "  ");
					
				}
				System.out.println();
			}
			
			
			
			String data00 = sheet.getRow(1).getCell(0).getStringCellValue();
			String data01 = sheet.getRow(1).getCell(1).getStringCellValue();
			//String data02 = sheet.getRow(1).getCell(2).getStringCellValue();
			//String data03 = sheet.getRow(1).getCell(3).getStringCellValue();
			
			System.out.println(data00+ "  "+data01);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
