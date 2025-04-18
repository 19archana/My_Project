package com.app.testngprgm;

import org.testng.annotations.Test;

public class Parallel_class2 {

	
	@Test
	public void user() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test1");
	}
	
	@Test 
	public void pass() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test2");
	}
	
	@Test
	public void login() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test3");
	}
	
}
