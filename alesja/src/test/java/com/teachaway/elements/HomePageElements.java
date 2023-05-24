package com.teachaway.elements;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teachaway.utilities.BasePage;

public class HomePageElements {

	public HomePageElements(){
		PageFactory.initElements(BasePage.getDriver(), this);
	}
	
	//Home Page Web Elements
	
	@FindBy(css="a[id='hs-eu-confirmation-button']")
	public WebElement acceptCookies;
	
	@FindBy(css="a[id='register']")
	public WebElement registerButton;
	
	@FindBy(css="a[id='login']")
	public WebElement loginButton;
	

	@FindBy(css="a[title='Courses']")
	public WebElement coursesMenu;
	

//	
//	@FindBy(id="ddUserMenu")
//	public WebElement userIcon;
	//
//	@FindBy(css="a[href='https://app.teachaway.com/dashboard']")
//	public WebElement dashboardSubMenu;
	
}
