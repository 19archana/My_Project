package com.app.pageexe;

import com.app.base.BaseClassPom;
import com.app.locatorspom.LoginPageLocator;

public class LoginPageExe extends LoginPageLocator {

	public static void username() {
		BaseClassPom.inputText(new LoginPageLocator().getUsername(), BaseClassPom.excelReuse(0, 0));
		}
	public static void password() {
		BaseClassPom.inputText(new LoginPageLocator().getPassword(), BaseClassPom.excelReuse(1, 0));
		
	}
	public static void login() {
		BaseClassPom.buttonClick(new LoginPageLocator().getLogin());
	}
	
}
