package com.objectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.adactin.Login_page;
import com.pom.adactin.Search_Hotel;

public class Adactin_Pageobject {
	public WebDriver driver;
	private Login_page page;
	private Search_Hotel hotel;
	
	public Adactin_Pageobject(WebDriver driver2) {
		this.driver=driver2;
			}
	
	
	public Login_page getPage() {
		if(page== null) {
		page = new Login_page(driver);
		}
		return page;
	}
	
	public Search_Hotel getHotel() {
		if(hotel== null) {
			hotel = new Search_Hotel(driver);
			}
		return hotel;
	}
	
	
	

}
