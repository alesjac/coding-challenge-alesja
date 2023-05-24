package com.teachaway.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.teachaway.pages.LoginPage;
import com.teachaway.utilities.BasePage;

public class TestLoginPage {

	LoginPage loginPage;
	
	public TestLoginPage() {
		loginPage=new LoginPage();
	}
	
//	@BeforeTest
//	public void initialLogin() {
//		loginPage.getURL("url");
//		loginPage.acceptCookies();
//		loginPage.clickLoginButton();
//		loginPage.writeEmailAddress();
//		loginPage.writePassword();
//		loginPage.clickLoginButtonForm();
//		Assert.assertTrue(loginPage.checkInitalLogin());
//		
//	}
	
	@BeforeTest
	public void login() {
		loginPage.getURL("url");
		loginPage.acceptCookies();
		loginPage.clickLoginButton();
		loginPage.writeEmailAddress();
		loginPage.writePassword();
		loginPage.clickLoginButtonForm();
		Assert.assertTrue(loginPage.checkLogin());
	}
}
