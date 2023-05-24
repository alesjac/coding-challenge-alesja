package com.teachaway.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.teachaway.elements.CompleteProfileElements;
import com.teachaway.elements.HomePageElements;
import com.teachaway.elements.RegisterPageElements;
import com.teachaway.utilities.BasePage;
import com.teachaway.utilities.ConfigurationReader;
import com.teachaway.utilities.WebElementsUtils;

public class RegisterPage {
	
	HomePageElements homePageElements;
	RegisterPageElements registerPageElements;
	CompleteProfileElements completeProfileElements;
	WebElementsUtils webElementUtils;
	
	
	public RegisterPage(){
		homePageElements=new HomePageElements();
		registerPageElements = new RegisterPageElements();
		completeProfileElements=new CompleteProfileElements();
		webElementUtils = new WebElementsUtils(Duration.ofSeconds(10));
	}
	
	public void getURL(String url) {
		BasePage.getDriver().get(ConfigurationReader.getProperty(url));
	}
	
	public void acceptCookies() {
//		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(),Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(homePageElements.acceptCookies)).click();
		webElementUtils.waitForElementToBeClickable(homePageElements.acceptCookies).click();;
	}
	
	public void clickRegisterButton() {
		webElementUtils.waitForElementToBeClickable(homePageElements.registerButton).click();;
	}
	
	public void setFirstName(String firstname) {
		webElementUtils.waitForElementVisiblilty(registerPageElements.firstName).sendKeys(firstname);;
	}
	
	public void setLastName(String lastname) {
		webElementUtils.waitForElementVisiblilty(registerPageElements.lastName).sendKeys(lastname);;
	}
	
	public void setEmail(String email) {
		webElementUtils.waitForElementVisiblilty(registerPageElements.email).sendKeys(email);;
	}
	
	public void setPassword(String password) {
		webElementUtils.waitForElementVisiblilty(registerPageElements.password).sendKeys(password);;
	}
	
	public void clickSigninButtonForm() {
		webElementUtils.waitForElementToBeClickable(registerPageElements.signInButton).click();
	}
	
	public boolean checkRegister() {
		return webElementUtils.waitForElementVisiblilty(completeProfileElements.welcomeMesage).isDisplayed();
	}
}
