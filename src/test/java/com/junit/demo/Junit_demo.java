package com.junit.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit_demo {
	@Before
	public void login() {
		System.out.println("login");
		}
@Test
public void causal_Dresses() {
	System.out.println("CD");
	}

@Test
public void apron_Dresses() {
	System.out.println("AP");
	}
@Test
public void evening_Dresses() {
	System.out.println("ED");
	}

@After
public void logout() {
	System.out.println("logout");

}
}
