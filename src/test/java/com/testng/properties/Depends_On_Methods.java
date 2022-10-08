package com.testng.properties;

import org.testng.annotations.Test;

public class Depends_On_Methods {
	
	@Test
	private void laptop() {
		System.out.println("laptop");
		
		}
	
	@Test
	private void mobile() {
		System.out.println("mobile");
	}
@Test(priority=-3, dependsOnMethods = "mobile")
private void offer() {
	System.out.println("offer");
}





}


