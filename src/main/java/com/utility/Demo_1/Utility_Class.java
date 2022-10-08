package com.utility.Demo_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility_Class {
	public static WebDriver driver;
	public static String value;
	public static WebDriver get_Browser(String type) {
	if(type.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		//C:\Users\Kavi Priya\eclipse-workspace\Sep_Project22\driver\chromedriver.exe
		
		driver = new ChromeDriver();
	
	}
	
	else if (type.equalsIgnoreCase("edge")) {
		
	}
		driver.manage().window().maximize();
		return driver;
		
	}
	public static void sendkey(WebElement element, String value) {
		
		element.sendKeys(value);
		
		
	}
	
	public static void get_url(String url) {
		driver.get(url);
		
	
	}
	public static void clk(WebElement element) {
		element.click();
				
	}
	public static void clear(WebElement element) {
		element.clear();
	}

public static void slctvalue(WebElement element, String value) {
	Select s1 = new Select(element);
	s1.selectByValue(value);
	
	}

public static  void slcttext(WebElement element, String text) {
		Select s1 = new Select(element);
		s1.selectByVisibleText(text);		
	}

public static  void slctindex(WebElement element, int a) {
	Select s1 = new Select(element);
	s1.selectByIndex(a);
	
}



public static String particular_Cell(String path,int a,int b) throws IOException {
	
	File f = new File(path);
	
	FileInputStream fis = new FileInputStream(f);

	Workbook wb = new XSSFWorkbook(fis);
	
	
	Sheet s = wb.getSheetAt(0);
	
	Row r = s.getRow(a);
	
	Cell c = r.getCell(b);
	
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
}



	

