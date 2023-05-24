package com.teachaway.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teachaway.utilities.BasePage;

public class LoginPageElements {
	
	public LoginPageElements() {
		PageFactory.initElements(BasePage.getDriver(), this);
	}
	
	@FindBy(css="input[id='username']")
	public WebElement email;
	
	@FindBy(css="input[id='password']")
	public WebElement password;
	
	@FindBy(css="button[id='login_action']")
	public WebElement loginButtonForm;
}
