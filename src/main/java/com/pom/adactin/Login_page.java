package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public WebDriver driver;
	
	@FindBy(id= "username")   
	private WebElement user;
	
	@FindBy(id = "password")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement login;
	
	public Login_page(WebDriver driver2) {
		this.driver=driver2;
				PageFactory.initElements(driver, this);
	}

	
	
	public WebElement getLogin() {
		return login;
	}

	
	public WebElement getUser() {
		return user;
	}
	
	public WebElement getPwd() {
		return pwd;
	}
	
	
}
