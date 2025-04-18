package com.app.testngprgm;

import org.testng.annotations.Test;

public class Ignore_Test {

	@Test
	public void user() {
		System.out.println("user");
	}
	
	@Test 
	public void pass() {
		System.out.println("pass");
	}
	
	@Test
	public void login() {
		System.out.println("login");
	}
}
