package com.teachaway.tests;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import com.teachaway.pages.CompleteProfilePage;

public class TestCompleteProfilePage {
	CompleteProfilePage completeProfilePage;

	public TestCompleteProfilePage() {
		completeProfilePage = new CompleteProfilePage();
	}

	@Test(priority = 1)
	public void enterGeneralInfoData() {
		completeProfilePage.chooseJobTitleOption("University Graduate - Not Licensed");
		completeProfilePage.chooseNoESLteachingCertificateOption();
		completeProfilePage.chooseNoTeachingLicenseOption();
		completeProfilePage.clickGetStartedButton();
	}
	
	@Test(priority = 2)
	public void enterWhatInterestsYouDetails() {
		
		completeProfilePage.chooseNoSchoolsContactYou();
		completeProfilePage.chooseYesOnlineTeaching();
		completeProfilePage.chooseYesTEFLCertification();
		completeProfilePage.chooseYesTeacherCertification();
		completeProfilePage.clickMoreAboutYou();
	}
	
	@Test(priority = 3)
	public void enterPersonalInfo() throws InterruptedException {
		completeProfilePage.chooseCountryYouLive("Albania");
		completeProfilePage.chooseStateProvince("Tirana County");
		completeProfilePage.chooseCitizenship("Albania");
		completeProfilePage.selectFluentLanguages(Arrays.asList("Albanian", "English"));
		completeProfilePage.enterBirthday("Nov", "5", "1999");
		completeProfilePage.selectGender("Female");
		completeProfilePage.writePhoneNumber("683251282");
		completeProfilePage.uploadResume("C:\\Users\\user\\Documents\\Resume sample.pdf");
		Thread.sleep(3000);
		completeProfilePage.clickConsentCheckbox();
		completeProfilePage.clickNextQualificationButton();
	}
	
	@Test(priority = 4)
	public void enterEducationInfo() {
		
		completeProfilePage.chooseDegreeLevel("Bachelor");
		completeProfilePage.enterFieldOfStudy("Englisht Secondary Teaching - Test");
		completeProfilePage.enterCollegeOrUni("Test College");
		completeProfilePage.enterStartPeriod("Oct", "2018");
		completeProfilePage.enterEndPeriod("Jul", "2021");
		completeProfilePage.clickNextExperienceButton();
	}
	
	@Test(priority = 5)
	public void enterExperience() {
		
		completeProfilePage.clickWithoutExperience();
		completeProfilePage.clickFinishUpButton();
	}


}
