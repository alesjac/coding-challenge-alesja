package com.teachaway.tests;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.teachaway.pages.MyProfilePage;

public class TestMyProfilePage {
	MyProfilePage myProfilePage;

	public TestMyProfilePage() {
		myProfilePage = new MyProfilePage();
	}

	@Test
	public void addLicense() {
		myProfilePage.clickPorfileMenu();
		myProfilePage.clickPlusButtonCertificatesAndlicense();
		myProfilePage.writeIssuingBody("TEST Issuing Body");
		myProfilePage.chooseTeachingLicenseType("Standard");
		myProfilePage.writeCountry("Albania");
		myProfilePage.chooseState("Tirana County");
		myProfilePage.chooseGradesLicensedToTeach(Arrays.asList("Gr. 11", "Gr. 12", "Gr. 13"));
		myProfilePage.chooseSubjectsLicensedToTeach(Arrays.asList("Informational Technology", "Math - Algebra"));
		myProfilePage.selectValidPeriod("Mar", "2021");
		myProfilePage.checkNoExpirationDate();
		myProfilePage.clickSaveLicense();
		Assert.assertTrue(
				myProfilePage.checkSavedInfo(Arrays.asList("Mar", "2021"), Arrays.asList("Gr. 11", "Gr. 12", "Gr. 13"),
						Arrays.asList("Informational Technology", "Math - Algebra"), Arrays.asList("Albania","Tirana County")));
	}
	
	@Test
	public void changePassword() {
		myProfilePage.clickProfileSubment("SETTINGS");
		myProfilePage.writePasswords("!alesja123test");
		myProfilePage.clickUpdateButton();
		//Assert.assertTrue(myProfilePage.checkIfPasswordSuccessfullyChanged("!alesja123test"));
	}
}
