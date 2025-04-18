package com.app.junit;

import org.junit.Ignore;
import org.junit.Test;

public class TestOne {
	@Ignore
	@Test
	public void user() {
		System.out.println("user");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void pass() {
		System.out.println("pass");
	}
	
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}

}
