package com.testng.properties;

import org.testng.annotations.Test;

public class Always_Run {
	@Test
	private void laptop() {
		System.out.println("laptop");
		
		}
	
	@Test
	private void mobile() {
		System.out.println("mobile");
		System.out.println(10/0);
	}
@Test(priority=-3, dependsOnMethods = "mobile",alwaysRun=true)
private void offer() {
	System.out.println("offer");
}


}
