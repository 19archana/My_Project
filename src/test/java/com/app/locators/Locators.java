package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.AdacBaseClass;

public class Locators extends AdacBaseClass {
	
	public static WebElement getUserName() {
		
		return driver.findElement(By.id("username"));		
	}
	public static WebElement getPassWord() {
		return driver.findElement(By.id("password"));
	}
	public static WebElement getLoginBtn() {
		return driver.findElement(By.id("login"));
	}
	public static WebElement getLocation() {
		return driver.findElement(By.id("location"));
	}
	public static WebElement getHotels() {
		return driver.findElement(By.id("hotels"));
	}
	public static WebElement getRoomType(){
		return driver.findElement(By.id("room_type"));
	}
	public static WebElement getRoomNo() {
		return driver.findElement(By.id("room_nos"));
	}
	public static WebElement getAdultRoom() {
		return driver.findElement(By.id("adult_room"));
	}
	public static WebElement getChildRoom() {
		return driver.findElement(By.id("child_room"));
	}
	public static WebElement getSubmit() {
		return driver.findElement(By.id("Submit"));
	}
	public static WebElement getRadio() {
		return driver.findElement(By.xpath("//input[@type='radio']"));
	}
	public static WebElement getContinue() {
		return driver.findElement(By.id("continue"));
	}
	public static WebElement getFirstName() {
		return driver.findElement(By.id("first_name"));
	}
	public static WebElement getLastName() {
		return driver.findElement(By.id("last_name"));
	}
	public static WebElement getBillingAddress() {
		return driver.findElement(By.id("address"));
	}
	public static WebElement getCardNo() {
		return driver.findElement(By.id("cc_num"));
	}
	public static WebElement getCardType() {
		return driver.findElement(By.xpath("//select[@class='select_combobox']"));
	}
	public static WebElement getExpiryMonth() {
		return driver.findElement(By.id("cc_exp_month"));
	}
	
	public static WebElement getExpiryYear() {
		return driver.findElement(By.id("cc_exp_year"));
	}
	public static WebElement getCvvNo() {
		return driver.findElement(By.id("cc_cvv"));
	}
	public static WebElement getBooknow() {
		return driver.findElement(By.id("book_now"));
	}

}
