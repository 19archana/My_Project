package com.app.testngprgm;

import org.testng.annotations.Test;

public class Parallel_Methods {
	
	
	
	@Test
	public void user() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("user");
	}
	@Test 
	public void pass() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("pass");
	}
	@Test
	public void login() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("login");
	}
	

}
