package com.selenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prop_File {

	public static void propFile() {

		try {
			File file=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\config.properties");
			FileReader fRead=new FileReader(file);
			Properties prop=new Properties();
			prop.load(fRead);
			String username=prop.getProperty("username");
			System.out.println(username);
			String password=prop.getProperty("password");
			System.out.println(password);
			String url=prop.getProperty("url");
			System.out.println(url);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static String propFileReuse(String data) {
		String value=null;
		try {
			File file=new File("D:\\Eclipse Workspace\\SampleProject\\src\\test\\resources\\Testdata\\config.properties");

			FileReader fRead=new FileReader(file);
			Properties prop=new Properties();
			prop.load(fRead);
			value=prop.getProperty(data);
			//System.out.println(value);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	public static void main(String[] args) {
		
		String url=propFileReuse("url");
	 System.out.println(propFileReuse("url"));
	 String username=propFileReuse("username");
	 String password=propFileReuse("password");
	 
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new  ChromeDriver();
      driver.get(url);
      driver.findElement(By.id("username")).sendKeys(username);
      driver.findElement(By.id("password")).sendKeys(password);
      driver.findElement(By.id("login")).click();
	 
	 
	}


}
