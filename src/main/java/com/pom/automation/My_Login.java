package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Login {
	public WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(name = "passwd")
	private WebElement Password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement signin;
	
	
	public My_Login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getSignin() {
		return signin;
	}

	
}
