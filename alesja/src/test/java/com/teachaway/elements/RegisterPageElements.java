package com.teachaway.elements;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teachaway.utilities.BasePage;

public class RegisterPageElements {

	public RegisterPageElements() {
		PageFactory.initElements(BasePage.getDriver(), this);
	}
	
	@FindBy(css="input[id='first_name']")
	public WebElement firstName;
	
	@FindBy(css="input[id='last_name']")
	public WebElement lastName;
	
	@FindBy(css="input[id='email']")
	public WebElement email;
	
	@FindBy(css="input[id='password']")
	public WebElement password;
	
	@FindBy(css="button[id='create_account_action']")
	public WebElement signInButton;
}
