package com.testng.properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utility.Demo_1.Utility_Class;

public class Invocation_Count_Demo extends Utility_Class{
public WebDriver driver;
@Test
private void browser_Launch() {
	driver=get_Browser("chrome");
}
@Test
private void url() {
	get_url("https://www.google.com/");
	
	}
@Test(priority=1,invocationCount=3,invocationTimeOut =4000)
private void refresh() {
	driver.navigate().refresh();

}
	
}

