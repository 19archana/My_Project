package com.app.testngprgm;

import org.testng.annotations.Test;

public class Invocation_Test {

	@Test (invocationCount = 10)
	public void user() {
		System.out.println("hi");
	}
}
