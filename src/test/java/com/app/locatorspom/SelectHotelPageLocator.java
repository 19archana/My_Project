package com.app.locatorspom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelPageLocator extends SearchLocationPageLocator {
	
		@FindBy (id="radiobutton_0")
		private WebElement selecthotel;
		
		@FindBy (id="continue")
		private WebElement continuebtn;

		public WebElement getSelecthotel() {
			return selecthotel;
		}

		public WebElement getContinuebtn() {
			return continuebtn;
		}
	}

