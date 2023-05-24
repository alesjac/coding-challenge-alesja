package com.teachaway.pages;

import java.time.Duration;

import com.teachaway.elements.CompleteProfileElements;
import com.teachaway.elements.DashboardPageElements;
import com.teachaway.elements.HomePageElements;
import com.teachaway.elements.LoginPageElements;
import com.teachaway.utilities.BasePage;
import com.teachaway.utilities.ConfigurationReader;
import com.teachaway.utilities.WebElementsUtils;

public class LoginPage {

	HomePageElements homePageElements;
	LoginPageElements loginPageElements;
	WebElementsUtils webElementUtils;
	CompleteProfileElements completeProfileElements;
	DashboardPageElements dashboardPageElements;
	
	public LoginPage() {
		homePageElements=new HomePageElements();
		loginPageElements=new LoginPageElements();
		webElementUtils = new WebElementsUtils(Duration.ofSeconds(10));
		completeProfileElements= new CompleteProfileElements();
		dashboardPageElements=new DashboardPageElements();
	}
	
	public void getURL(String url) {
		BasePage.getDriver().get(ConfigurationReader.getProperty(url));
	}
	
	public void acceptCookies() {
//		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(),Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(homePageElements.acceptCookies)).click();
		webElementUtils.waitForElementToBeClickable(homePageElements.acceptCookies).click();;
	}
	
	public void clickLoginButton() {
		webElementUtils.waitForElementToBeClickable(homePageElements.loginButton).click();
	}
	
	public void writeEmailAddress() {
		webElementUtils.waitForElementVisiblilty(loginPageElements.email).sendKeys(ConfigurationReader.getProperty("email"));
	}
	
	public void writePassword() {
		webElementUtils.waitForElementVisiblilty(loginPageElements.password).sendKeys(ConfigurationReader.getProperty("password"));
	}
	
	public void clickLoginButtonForm() {
		webElementUtils.waitForElementToBeClickable(loginPageElements.loginButtonForm).click();
	}
	
	public boolean checkInitalLogin() {
		return webElementUtils.waitForElementVisiblilty(completeProfileElements.welcomeMesage).isDisplayed();

	}
	
	public boolean checkLogin() {
		return webElementUtils.waitForElementVisiblilty(dashboardPageElements.dashboardTitle).isDisplayed();

	}
}
