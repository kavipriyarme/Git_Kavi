package com.automation.runner;

import org.openqa.selenium.WebDriver;

import com.pom.automation.My_Login;
import com.pom.automation.My_Store;

public class Automation_Runner2 {
	public static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		driver=get_Browser("chrome");
		
		get_url("http://automationpractice.com/index.php");
		
		My_Store store = new My_Store(driver);
		clk(store.getSignin());
		
		My_Login login = new My_Login(driver);
		sendkey(login.getEmail(), "kavihce29@gmail.com");
		sendkey(login.getPassword(), "bhava@1982");
		clk(login.getSignin());

		
		}

}
