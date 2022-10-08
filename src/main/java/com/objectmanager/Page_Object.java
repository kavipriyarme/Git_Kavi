package com.objectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.automation.My_Login;
import com.pom.automation.My_Store;

public class Page_Object {
	public  WebDriver driver;
	private My_Store store ;
	private My_Login login;
	
	public Page_Object(WebDriver driver2) {
		this.driver = driver2;
	}


	public My_Store getStore() {
		if(store == null) {
			store = new My_Store(driver);
		}
		return store;
	}
		
		
	public My_Login getLogin() {
		if(login == null) {
			login = new My_Login(driver);
		}
		return login;
	
	}
	
	
}
