package com.app.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annot {
	@BeforeClass
	public static void test1(){
		System.out.println("test1");		
	}
	@Before
	public void test2() {
	System.out.println("test2");
	}
	@AfterClass
	public static void test3() {
		System.out.println("test3");
	}
	@After
	public void test4() {
		System.out.println("test4");
	}
	@Test
	public void test5() {
		System.out.println("test5");
	}

}
