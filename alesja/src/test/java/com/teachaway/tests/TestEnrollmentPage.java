package com.teachaway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.teachaway.pages.EnrollmentPage;
import com.teachaway.utilities.BasePage;
import com.teachaway.utilities.ConfigurationReader;

public class TestEnrollmentPage {
	EnrollmentPage enrollmentPage;

	public TestEnrollmentPage() {
		enrollmentPage = new EnrollmentPage();
	}

	@Test
	public void enroll() {
		enrollmentPage.clickcoursesMenu();
		enrollmentPage.clickProfessionalDevelopmentForTeachersButton();
		enrollmentPage.clickEffectiveOnlineTeachingStrategiesCourse();
		enrollmentPage.clickEnrollNowButton();
		
		enrollmentPage.switchBetweenTabs();
		enrollmentPage.enterEmail(ConfigurationReader.getProperty("email"));
		
		enrollmentPage.enterFirstName("Alesja");
		enrollmentPage.enterLastName("Cani");
		enrollmentPage.enterAddress("Test address");
		enrollmentPage.enterCity("Test city");
		enrollmentPage.enterPhone("355683251282");
		enrollmentPage.setAddressStudentInfo("Test address","Test city");
		
		enrollmentPage.clickContinueButton();
		Assert.assertTrue(enrollmentPage.checkIfDetailsAreSameDeliverySection(ConfigurationReader.getProperty("email")));
		enrollmentPage.clickContinueButton();
		
		
	}
}
