package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// ithu vanthu with out objec manager
public class Myclassnew {
	public WebDriver driver;

	@FindBy(xpath ="//a[@class='login']")
	private WebElement Signin;
	
	public Myclassnew(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
			
	}
	
	public WebElement getSignin() {
		return Signin;
	}
}
