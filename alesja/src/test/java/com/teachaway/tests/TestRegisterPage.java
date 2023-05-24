package com.teachaway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.teachaway.pages.RegisterPage;
import com.teachaway.utilities.ConfigurationReader;

public class TestRegisterPage {
	RegisterPage registerPage;

	public TestRegisterPage() {
		registerPage = new RegisterPage();
	}
	
	@Test
	public void signin() {
		registerPage.getURL("url");
		registerPage.acceptCookies();
		registerPage.clickRegisterButton();
		registerPage.setFirstName("Alesja");
		registerPage.setLastName("Cani");
		registerPage.setEmail(ConfigurationReader.getProperty("email"));
		registerPage.setPassword(ConfigurationReader.getProperty("password"));
		registerPage.clickSigninButtonForm();
		Assert.assertTrue(registerPage.checkRegister());
	}
}
