package com.teachaway.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.teachaway.elements.CoursesAndCertificationsPageElements;
import com.teachaway.elements.DashboardPageElements;
import com.teachaway.elements.EnrollmentPageElements;
import com.teachaway.elements.HomePageElements;
import com.teachaway.utilities.BasePage;
import com.teachaway.utilities.ConfigurationReader;
import com.teachaway.utilities.WebElementsUtils;

public class EnrollmentPage {
	DashboardPageElements dashboardPageElements;
	CoursesAndCertificationsPageElements coursesAndCertificationsPageElements;
	EnrollmentPageElements enrollmentPageElements;
	WebElementsUtils webElementsUtils;

	String addressStudentInfo=null;
	public EnrollmentPage() {
		dashboardPageElements = new DashboardPageElements();
		coursesAndCertificationsPageElements = new CoursesAndCertificationsPageElements();
		enrollmentPageElements = new EnrollmentPageElements();
		webElementsUtils = new WebElementsUtils(Duration.ofSeconds(7));
	}

	public void clickcoursesMenu() {
		webElementsUtils.waitForElementToBeClickable(dashboardPageElements.coursesMenu).click();
	}

	public void clickProfessionalDevelopmentForTeachersButton() {
		webElementsUtils.waitFor(3000);
		webElementsUtils.scrollOffset(0, 25000);
//		Actions act =  new Actions(BasePage.getDriver());
//		act.moveToElement(coursesAndCertificationsPageElements.professionalDevelopmentForTeachersButton).click().perform();
		try {
			coursesAndCertificationsPageElements.professionalDevelopmentForTeachersButton.click();
		} catch (Exception e) {
			webElementsUtils.javaScriptClick(
					coursesAndCertificationsPageElements.professionalDevelopmentForTeachersButton, 3000);
		}
	}

	public void clickEffectiveOnlineTeachingStrategiesCourse() {
		webElementsUtils.javaScriptClick(coursesAndCertificationsPageElements.efffectiveOnlineTeachingStrategiesCourse,
				5000);
//		webElementsUtils.waitForElementToBeClickable(
//				coursesAndCertificationsPageElements.efffectiveOnlineTeachingStrategiesCourse).click();
	}

	public void clickEnrollNowButton() {
		webElementsUtils.javaScriptClick(coursesAndCertificationsPageElements.enrollNowButton, 5000);
	}

	public void switchBetweenTabs() {
		webElementsUtils.waitFor(7000);
		ArrayList<String> windowsHandles = new ArrayList<String>(BasePage.getDriver().getWindowHandles());
		BasePage.getDriver().switchTo().window(windowsHandles.get(1));
	}

	// STUDENT INFORMATION
	public void enterEmail(String email) {
		webElementsUtils.waitFor(2000);
		webElementsUtils.scrollToBottomOfPage();
		webElementsUtils.waitForElementVisiblilty(enrollmentPageElements.studentEmail).sendKeys(email);
	}

	public void enterFirstName(String firstname) {

		webElementsUtils.waitForElementVisiblilty(enrollmentPageElements.firstName).sendKeys(firstname);

	}

	public void enterLastName(String lastname) {
		webElementsUtils.waitForElementVisiblilty(enrollmentPageElements.lastname).sendKeys(lastname);
	}

	public void enterAddress(String address) {
		webElementsUtils.waitForElementVisiblilty(enrollmentPageElements.address).sendKeys(address);
	}

	public void enterCity(String city) {
		webElementsUtils.waitForElementVisiblilty(enrollmentPageElements.city).sendKeys(city);
	}

	public void enterPhone(String phone) {
		webElementsUtils.waitForElementVisiblilty(enrollmentPageElements.phone).sendKeys(phone);
	}

	public void clickContinueButton() {
		webElementsUtils.waitForElementToBeClickable(enrollmentPageElements.continueButton).click();
		webElementsUtils.waitFor(3000);
	}

	public void setAddressStudentInfo(String address,String city) {
		addressStudentInfo= String.format("%s, %s, %s", address, city, enrollmentPageElements.country.getText());
	}

	public boolean checkIfDetailsAreSameDeliverySection(String emailStudentInfo) {
		webElementsUtils.waitFor(3000);

		String contactDelivery = enrollmentPageElements.contactEmail.getText();
		String detailsAddressDelivery = enrollmentPageElements.detailsAddress.getText();

		return contactDelivery.equals(emailStudentInfo) && detailsAddressDelivery.equals(addressStudentInfo);
	}
}
