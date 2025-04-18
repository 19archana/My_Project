package com.normalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement singleDD=driver.findElement(By.xpath("//select[@id='fruits']"));		
		Select dd=new Select(singleDD);
		dd.selectByVisibleText("Mango");
		
	}

}
