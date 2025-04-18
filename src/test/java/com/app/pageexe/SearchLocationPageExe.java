package com.app.pageexe;

import com.app.base.BaseClassPom;
import com.app.junit.BaseClass;
import com.app.locatorspom.SearchLocationPageLocator;

public class SearchLocationPageExe extends LoginPageExe{

	public static void location() {
		BaseClassPom.dropDown(new SearchLocationPageLocator().getLocation(), BaseClassPom.excelReuse(6, 0));
	}
	public static void hotel() {
		BaseClassPom.dropDown(new SearchLocationPageLocator().getHotels(), BaseClassPom.excelReuse(15,0));
	}
	public static void roomtype() {
		BaseClassPom.dropDown(new SearchLocationPageLocator().getRoomtype(), BaseClass.excelReuse1(6, 1));
	}
	public static void roomno() {
		BaseClassPom.inputText(new SearchLocationPageLocator().getRoomnos(), BaseClassPom.excelReuse(5,2));
	}
	public static void checkin() {
		BaseClassPom.clear(new SearchLocationPageLocator().getCheckin());
		BaseClassPom.inputText(new SearchLocationPageLocator().getCheckin(), BaseClassPom.excelReuse(41, 0));
	}
	public static void checkout() {
		BaseClassPom.clear(new SearchLocationPageLocator().getCheckout());
		BaseClassPom.inputText(new SearchLocationPageLocator().getCheckout(), BaseClassPom.excelReuse(42, 0));
	}
	public static void adultroom() {
		BaseClassPom.inputText(new SearchLocationPageLocator().getAdultroom(), BaseClassPom.excelReuse(24, 1));
	}
	public static void childroom() {
		BaseClassPom.inputText(new SearchLocationPageLocator().getChildrenroom(), BaseClassPom.excelReuse(15, 1));
	}

	public static void submit() {
		BaseClassPom.buttonClick(new SearchLocationPageLocator().getSubmit());
	}
}
