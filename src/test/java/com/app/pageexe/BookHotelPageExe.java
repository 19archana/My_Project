package com.app.pageexe;

import com.app.base.BaseClassPom;
import com.app.locatorspom.BookHotelLocatorPage;

public class BookHotelPageExe extends SelectHotelPageExe{

	public static void firstname() {
		BaseClassPom.inputText(new BookHotelLocatorPage().getFirstname(), BaseClassPom.excelReuse(19, 0));
	}
	public static void lastname() {
		BaseClassPom.inputText(new BookHotelLocatorPage().getLastname(), BaseClassPom.excelReuse(20, 0));
	}
	public static void address() {
		BaseClassPom.inputText(new BookHotelLocatorPage().getAddress(), BaseClassPom.excelReuse(21, 0));
	}
	public static void ccno() {
		BaseClassPom.inputText(new BookHotelLocatorPage().getccno(), BaseClassPom.excelReuse(22, 0));
	}
	public static void cctype() {
		BaseClassPom.inputText(new BookHotelLocatorPage().getcctype(), BaseClassPom.excelReuse(23, 0));
	}
	public static void expmonth() {
		BaseClassPom.inputText(new BookHotelLocatorPage().getexpmonth(), BaseClassPom.excelReuse(25, 0));
	}
	public static void expyear() {
		BaseClassPom.inputText(new BookHotelLocatorPage().getexpyear(), BaseClassPom.excelReuse(36, 0));
	}
	public static void cvv() {
		BaseClassPom.inputText(new BookHotelLocatorPage().getcvv(), BaseClassPom.excelReuse(39, 0));
	}
	public static void booknow() {
		BaseClassPom.buttonClick(new BookHotelLocatorPage().getbooknow());
	}


}
