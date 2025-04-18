package com.normalmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HeadlessBrow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		//op.addArguments("--headless");
		op.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(op);
		driver.get("http://adactinhotelapp.com/");
System.out.println(driver.getTitle());	
	}

}
