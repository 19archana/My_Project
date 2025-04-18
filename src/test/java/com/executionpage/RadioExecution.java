package com.executionpage;

import org.openqa.selenium.By;

import com.baseclass.RadioBaseCls;

public class RadioExecution extends RadioBaseCls {
	
	public static void main(String[] args) {
		
		//excelReuse(1, 0);
		//RadioBaseCls.browserLaunch(excelReuse(8,0));
        RadioBaseCls.getUrl("https://letcode.in/radio");
        RadioBaseCls.checkMethod(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")));
        RadioBaseCls.clickBtn(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")));
		
	}
}
