package com.app.testngprgm;

import org.testng.annotations.Test;

public class MethodsDependon {
	
	
	@Test 
	public void user() {
		System.out.println("user");
	}
	@Test  (dependsOnMethods = "user")
	public void pass() {
		System.out.println("pass");
		
	}
	@Test
	public void login() {
		System.out.println("login");
	}

}
