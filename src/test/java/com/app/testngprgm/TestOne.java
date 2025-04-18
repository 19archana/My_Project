package com.app.testngprgm;

import org.testng.annotations.Test;

public class TestOne {
	
	@Test (priority = 2)
	public void user() {
		System.out.println("user");
	}
	@Test(priority = 3)
	public void pass() {
		System.out.println("pass");
	}
	@Test (priority = 1)
	public void login() {
		System.out.println("login");
	}


}
