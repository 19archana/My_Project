
package com.executionpage;

import org.openqa.selenium.By;

import com.baseclass.BaseScreenShot;

public class ExecutionScreenshot extends BaseScreenShot {
public static void main(String[] args) {
	BaseScreenShot.browserLaunch();
	BaseScreenShot.getUrl("https://www.facebook.com/");
	BaseScreenShot.getScreenShot("login2.jpg");
	BaseScreenShot.sendkeys(driver.findElement(By.id("email")), "archana");
	BaseScreenShot.getScreenShot("user2.jpg");
}
}
