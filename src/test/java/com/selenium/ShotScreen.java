package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ShotScreen {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("Archana1992");
		File source=user.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("E:\\Archana\\Archana_Java_2024\\Screenshot\\fb.jpg");
		FileHandler.copy(source, destinationFile);	
	}

}
