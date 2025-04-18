package com.app.locatorspom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotelLocatorPage extends SelectHotelPageLocator {
	
	@FindBy (id="first_name")
	private  WebElement firstname;
	
	@FindBy (xpath="//input[@id='last_name']")
	private WebElement lastname;
	
	@FindBy (id="address")
	private WebElement address;
	
	@FindBy (id="cc_num")
	private WebElement ccno;
	
	@FindBy (id="cc_type")
	private WebElement cctype;
	
	@FindBy (id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy (id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy (id="cc_cvv")
	private WebElement cvv;
	
	@FindBy (id="book_now")
	private WebElement booknow;
	
	public WebElement getbooknow() {
		return booknow;
	}
	public WebElement getcvv() {
		return cvv;
	}
	public WebElement getexpyear() {
		return expyear;
	}
	public WebElement getexpmonth() {
		return expmonth;
	}
	public WebElement getcctype() {
		return cctype;
	}
	public WebElement getccno() {
		return ccno;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}
	

	
}
