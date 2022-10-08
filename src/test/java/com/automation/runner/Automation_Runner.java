package com.automation.runner;

import org.openqa.selenium.WebDriver;

import com.objectmanager.Page_Object;
import com.utility.Demo_1.Utility_Class;

public class Automation_Runner extends Utility_Class {
	
	
	
	
	public static WebDriver driver=Utility_Class.get_Browser("chrome");
	public static Page_Object manager = new Page_Object(driver);
	
	public static void main(String[] args) throws InterruptedException {
	driver=get_Browser("chrome");
	
	get_url("http://automationpractice.com/index.php");
	driver.manage().window().wait(5000);
	
	
	clk(manager.getStore().getSignin());
	sendkey(manager.getLogin().getEmail(), "kavihce29@gmail.com");
	sendkey(manager.getLogin().getPassword(), "bhava@1982");
	clk(manager.getLogin().getSignin());

	
	}

	}


