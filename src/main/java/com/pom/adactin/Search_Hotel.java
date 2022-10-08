package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement loaction;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement noofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
		
	@FindBy(id="adult_room")
	private WebElement noofadults;
	
	@FindBy(id="child_room")
	private WebElement noofchild;
	
	@FindBy(id="Submit")
	private WebElement search;

	
	

	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);		
	}

	public WebElement getLoaction() {
		return loaction;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getNoofadults() {
		return noofadults;
	}

	public WebElement getNoofchild() {
		return noofchild;
	}

	public WebElement getSearch() {
		return search;
	}
	
}
