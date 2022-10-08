package com.testdata.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test_Data_Reader {
	public static Properties p;
	
	public Test_Data_Reader() throws IOException  {
		File f = new File("C:\\Users\\Kavi Priya\\eclipse-workspace\\Sep_Project22\\src\\main\\java\\com\\properties\\files\\Test_Data.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String get_Browser() {
		String browser = p.getProperty("browser");
		return browser;

	}
	public String get_Url() {
		String url = p.getProperty("url");
		return url;
			}
	
	public String get_pwd() {
		String pwd = p.getProperty("password");
		return pwd;

	}
	
		
	
}
