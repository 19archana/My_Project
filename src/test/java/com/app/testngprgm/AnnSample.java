package com.app.testngprgm;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnSample {

	@BeforeSuite
	public void befofresuite() {
		System.out.println("before suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("after Suite");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before Class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	@AfterMethod
	public void aftermetho() {
		System.out.println("after Method");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
@Test
public void test() {
	System.out.println("test");
}
}
