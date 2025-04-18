package com.app.junit;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestClass extends BaseClass {
	@Test
		public void pass() {
		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.findElement(By.name("location")).sendKeys(excelReuse1(5,0));
			driver.findElement(By.name("hotels")).sendKeys(excelReuse1(14,0));
			driver.findElement(By.name("room_type")).sendKeys(excelReuse1(4,1));
			driver.findElement(By.name("room_nos")).sendKeys(excelReuse1(5,2));
			driver.findElement(By.name("datepick_in")).sendKeys(excelReuse1(3,4));
			
	        }
	}

