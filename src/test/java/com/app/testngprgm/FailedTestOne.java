package com.app.testngprgm;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FailedTestOne {
	
	@Test (retryAnalyzer = FailedRetry_logic.class)
	public void test1() {
		String s="Aiite";
	Assert.assertEquals(s, "Aiit");
		System.out.println("Test1");
	}
	
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
