package com.app.locatorspom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchLocationPageLocator extends LoginPageLocator {

	@FindBy (id="location")
	private WebElement location;

	@FindBy (id="hotels")
	private WebElement hotels;

	@FindBy (id="room_type")
	private WebElement roomtype;

	@FindBy (id="room_nos")
	private WebElement roomnos;

	@FindBy (id="datepick_in")
	private WebElement checkin;
	
	@FindBy (id="datepick_out")
	private WebElement checkout;
	
	@FindBy (id="adult_room")
	public WebElement adultroom;
	
	@FindBy (id="child_room")
	private WebElement childrenroom;
	
	@FindBy (id="Submit")
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildrenroom() {
		return childrenroom;
	}

	public WebElement getSubmit() {
		return submit;
	}



}
