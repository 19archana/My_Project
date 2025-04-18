package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseScreenShot {
	public static TakesScreenshot ts;

	public static WebDriver driver;
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void sendkeys(WebElement element,String value) {
		element.sendKeys(value);
	}
		public static void getScreenShot(String name) {
			try {
			ts=(TakesScreenshot) driver;
			File ScreenshotAs=ts.getScreenshotAs(OutputType.FILE);
			File Destination=new File("E:\\Archana\\Archana_Java_2024\\Screenshot\\"+name);
			FileHandler.copy(ScreenshotAs, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
}
