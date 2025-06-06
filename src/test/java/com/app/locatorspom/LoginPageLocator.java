package com.app.locatorspom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClassPom;

public class LoginPageLocator extends BaseClassPom{
	
	public LoginPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="username")
	private WebElement username;
	@FindBy (id="password")
	private WebElement password;
	@FindBy (id="login")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}

	

}
