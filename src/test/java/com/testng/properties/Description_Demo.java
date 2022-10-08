package com.testng.properties;

import org.testng.annotations.Test;


public class Description_Demo {
	@Test(description = "Launch the browser")
	private void browser_Launch() {
		System.out.println("Browser Launch");

	}
	@Test(description = "Open url")
	private void url() {
		System.out.println("url");

			}
	}
	
	


