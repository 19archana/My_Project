package com.app.extentreport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne {
	
	public static final Logger logger= LogManager.getLogger(TestOne.class);

	@Test
	public void user() {
		logger.info("user");
		Assert.assertTrue(false);
		System.out.println("testone");
	}
	@Test
	public void pass() {
		logger.info("pass");
		System.out.println("testTwo");
	}
@Test
public void login() {
	logger.info("login");
	System.out.println("Testthree");
}
}
