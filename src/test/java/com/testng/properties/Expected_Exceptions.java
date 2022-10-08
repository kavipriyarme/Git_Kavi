package com.testng.properties;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	@Test(expectedExceptions = ArithmeticException.class)
	
	private void calculator() {
		System.out.println(10/0);

	}
	String s;
@Test(expectedExceptions = ArithmeticException.class)

private void checkString() {
	System.out.println(s.toUpperCase());
	
}
}
