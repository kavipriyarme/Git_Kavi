package com.testng.properties;

import org.testng.annotations.Test;

public class Invocation_Demo {
	@Test
	
	private void browser() {
		System.out.println("browser");
	}
	
	@Test
	private void url() {
		System.out.println("url");
	}

	@Test(invocationCount=3,invocationTimeOut =4000)
	private void refresh() {
		System.out.println("refresh");
	}


}

