package com.vittech.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook workbbok;
	XSSFSheet sheet;

	public ExcelDataProvider(String fname,String sheetName)

	{

		try {
			File fs = new File("./src/test/resources/TestData/testdata.xlsx");
			FileInputStream fin = new FileInputStream(fs);
			workbbok = new XSSFWorkbook(fin);
			sheet = workbbok.getSheet(sheetName);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public int rowCount()
	{
		return sheet.getLastRowNum();
	}

	public int colCount()
	{
		return sheet.getRow(0).getLastCellNum();
	}
	
	public String getStringCellData(int row,int col)
	{
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}
	
	public int getNumericCellData(int row,int col)
	{
		return (int)sheet.getRow(row).getCell(col).getNumericCellValue();
	}
	
	
	public String [] []  getTestData()
	{
		int row=rowCount();
		int col=colCount();
		
		
		String[][] data = new String[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				data [i] [j]= sheet.getRow(i+1).getCell(j).toString();
				
			}
		}
		return data;
	}
	
	
	/*public static void main(String[] args) {
		
		 ExcelDataProvider e = new ExcelDataProvider("Sheet1");
		System.out.println( e.rowCount());
		System.out.println(e.colCount());
		System.out.println(e.getStringCellData(1, 2));
		System.out.println(e.getNumericCellData(1, 0));
		String[][] dada = e.getTestData();
		
		for(String []d:dada)
		{
			for(String ss:d)
			{
				System.out.print(ss+" ");
			
			}
			System.out.println();
		}

		
		
		
		
	}*/
}
