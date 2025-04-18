package com.executionpage;
import java.io.File;
import java.io.IOException;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.app.locators.Locators;
import com.baseclass.AdacBaseClass;

public class ExecutionLogin extends Locators {	
	@BeforeClass
    public static void beforeClass() {
		AdacBaseClass.setProperty();
		AdacBaseClass.maximizeWin();
		String url=propFileReuse("url");
		AdacBaseClass.getUrl(url);		
	}	
	@Test
	public void test() {	
		AdacBaseClass.sendKeys(Locators.getUserName(),propFileReuse("username"));
		AdacBaseClass.sendKeys(Locators.getPassWord(), propFileReuse("password"));
		AdacBaseClass.click(Locators.getLoginBtn());
		AdacBaseClass.selectByValue(Locators.getLocation(), excelReuse(5, 0));
		AdacBaseClass.selectByValue(Locators.getHotels(), excelReuse(16,0));
		AdacBaseClass.selectByValue(Locators.getRoomType(),excelReuse(5,1));
		AdacBaseClass.sendKeys(Locators.getRoomNo(), AdacBaseClass.excelReuse(6, 2));
		AdacBaseClass.sendKeys(Locators.getAdultRoom(), excelReuse(5,3));
		AdacBaseClass.sendKeys(Locators.getChildRoom(), excelReuse(15,1));
		AdacBaseClass.click(Locators.getSubmit());
		AdacBaseClass.click(Locators.getRadio());
		AdacBaseClass.click(Locators.getContinue());
		AdacBaseClass.sendKeys(Locators.getFirstName(), excelReuse(19,0));
		AdacBaseClass.sendKeys(Locators.getLastName(), excelReuse(20,0));
		AdacBaseClass.sendKeys(Locators.getBillingAddress(), excelReuse(21,0));
		AdacBaseClass.sendKeys(Locators.getCardNo(), excelReuse(22,0));
	    AdacBaseClass.sendKeys(Locators.getCardType(),excelReuse(23,0));
		AdacBaseClass.sendKeys(Locators.getExpiryMonth(),excelReuse(32,0));
	    AdacBaseClass.sendKeys(Locators.getExpiryYear(),excelReuse(36,0));
		AdacBaseClass.sendKeys(Locators.getCvvNo(), excelReuse(39,0));
		AdacBaseClass.click(Locators.getBooknow());
		String s=AdacBaseClass.getAttribute();
		AdacBaseClass.excelWrite(s);	
	}
	@AfterClass
	public static void afterClass() throws IOException {
		WebElement orderno = driver.findElement(By.xpath("//input[@name='order_no']"));
		File screenshot = orderno.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Archana\\Archana_Java_2024\\Screenshot\\order.jpg");
		FileHandler.copy(screenshot, destination);
		driver.quit();
	}
		
		
		
		
	
		

}
