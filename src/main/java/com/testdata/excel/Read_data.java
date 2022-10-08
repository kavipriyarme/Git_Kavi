package com.testdata.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read_data {
	public static String value;
	public static Workbook wb
	
	public  Read_data() throws IOException {
		File f = new File("C:\\Users\\Kavi Priya\\eclipse-workspace\\Sep_Project22\\test.xlsx");
		
		FileInputStream fis = new FileInputStream(f);

		wb = new XSSFWorkbook(fis);
		

	}
	
	
public String particular_Cell() throws IOException {
	
	
	
	
	Sheet s = wb.getSheetAt(0);
	
	Row r = s.getRow(2);
	
	Cell c = r.getCell(1);
	
	CellType type = c.getCellType();
	
	if  (type.equals(CellType.STRING))
{
		value =c.getStringCellValue();
		}
	else if (type.equals(CellType.NUMERIC)) {
		double d = c.getNumericCellValue();
		int e = (int)d;
		
		value = String.valueOf(e);
	}
	
	wb.close();
	return value;
	}
	
public void particular_Row() throws IOException {

	Sheet s = wb.getSheetAt(0);
	
	Row r = s.getRow(2);
	
	
	for (int i = 0; i <r.getPhysicalNumberOfCells(); i++) {
		
		Cell c1 =r.getCell(i);
		CellType type = c1.getCellType();
		
		if  (type.equals(CellType.STRING))
	{
		String value =c1.getStringCellValue();
			System.out.println(value);
		
	}
		else if (type.equals(CellType.NUMERIC)) {
			double d = c1.getNumericCellValue();
			int a = (int)d;
			String value = String.valueOf(a);
			System.out.println(value);
			
		}
		
		}
	wb.close();
			
	}

public  void all_data() throws IOException{

	Sheet s = wb.getSheetAt(0);
	
	
      int numberOfRows = s.getPhysicalNumberOfRows();
      for (int i = 0; i < numberOfRows; i++) {
    	  
    	Row r = s.getRow(i);
    			int numberOfCells = r.getPhysicalNumberOfCells();
    	for(int j=0;j<numberOfCells;j++) {
    		Cell c = r.getCell(j);
    		CellType type = c.getCellType();
    		if  (type.equals(CellType.STRING))
    		{
    			String value =c.getStringCellValue();
    				System.out.println(value);
    			
    		}
    			else if (type.equals(CellType.NUMERIC)) {
    				double d = c.getNumericCellValue();
    				int a = (int)d;
    				String value = String.valueOf(a);
    				System.out.println(value);
    				
    			}
    		  		
    	}
    			
    	
		
	}
      
}
	
	public static void main(String[] args) throws IOException {
		Read_data data = new Read_data();
		System.out.println(data.particular_Cell());
		System.out.println(data);
		data.particular_Row();
		data.all_data();

}
}
