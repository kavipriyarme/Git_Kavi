package com.adactin.runner;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.objectmanager.Adactin_Pageobject;
import com.testdata.properties.Testdatamanager;
import com.utility.Demo_1.Utility_Class;

public class Adactin_Runner_Testdataproperties extends Utility_Class{
	public static WebDriver driver=Utility_Class.get_Browser("chrome");
	public static Adactin_Pageobject manager = new Adactin_Pageobject(driver);
	public static Logger log = Logger.getLogger(Adactin_Runnertestdata_Excel .class);
	public static void main(String[] args) throws IOException  {
		BasicConfigurator.configure();
		//data reterive from properties	testdata
		String url = Testdatamanager.get_InstanceTDM().get_InstanceTDR().get_Url();
		get_url(url);
		driver.manage().window().maximize();
		log.info("login");
		String email = particular_Cell("C:\\Users\\Kavi Priya\\eclipse-workspace\\Sep_Project22\\adactintestcase.xlsx",1,5);
		sendkey(manager.getPage().getUser(),email);
		String pwd = particular_Cell("C:\\Users\\Kavi Priya\\eclipse-workspace\\Sep_Project22\\adactintestcase.xlsx",2,5);
		sendkey(manager.getPage().getPwd(),Testdatamanager.get_InstanceTDM().get_InstanceTDR().get_pwd());
		log.info("successfully login");
		clk(manager.getPage().getLogin());
		
		slcttext(manager.getHotel().getLoaction(),"Brisbane");
		slcttext(manager.getHotel().getHotels(),"Hotel Creek");
		slcttext(manager.getHotel().getRoomtype(),"Standard");
		slctvalue(manager.getHotel().getNoofrooms(),"1");
		sendkey(manager.getHotel().getCheckin(),"11/10/2022");
		sendkey(manager.getHotel().getCheckout(),"11/11/2022");
		slctvalue(manager.getHotel().getNoofadults(),"2");
		slctindex(manager.getHotel().getNoofchild(),2);
		clk(manager.getHotel().getSearch());	
	}
	}

}
