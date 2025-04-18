package com.app.pageexe;

import com.app.base.BaseClassPom;
import com.app.junit.BaseClass;

import com.app.locatorspom.SelectHotelPageLocator;

public class SelectHotelPageExe extends SearchLocationPageExe {
	
	public static void selecthotl() {
		BaseClass.click(new SelectHotelPageLocator().getSelecthotel() );
	}
	public static void continuebtn() {
		BaseClassPom.buttonClick(new SelectHotelPageLocator().getContinuebtn());
	}

}
