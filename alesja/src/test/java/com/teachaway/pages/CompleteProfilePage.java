package com.teachaway.pages;

import static org.testng.Assert.expectThrows;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.teachaway.elements.CompleteProfileElements;
import com.teachaway.utilities.BasePage;
import com.teachaway.utilities.WebElementsUtils;

public class CompleteProfilePage {
	CompleteProfileElements completeProfileElements;
	WebElementsUtils webElementUtils;
	/*
	 * List<WebElement> options = dropdown.findElements(By.tagName("li")); for
	 * (WebElement option : options) { if (option.getText().equals(searchText)) {
	 * option.click(); // click the desired option break; } }
	 */

	public CompleteProfilePage() {
		completeProfileElements = new CompleteProfileElements();
		webElementUtils = new WebElementsUtils(Duration.ofSeconds(10));
	}

//	public void clickFromList(List<WebElement> options, String text) {
//		for (WebElement option : options) {
//			if (option.getText().equals(text)) {
//				webElementUtils.waitForElementToBeClickable(option).click();
//				break;
//			}
//		}
//	}

	// ***************************************************************************************************//
	// GENERAL info
	public void chooseJobTitleOption(String jobTitle) {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.jobTitleDropdown).click();
		List<WebElement> options = completeProfileElements.optionsJobTitle;
		webElementUtils.clickFromList(options, jobTitle);
	}

	public void chooseNoESLteachingCertificateOption() {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.eslCertificateNoButton).click();
	}

	public void chooseNoTeachingLicenseOption() {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.teachinfLicenseNoButton).click();
	}

	public void clickGetStartedButton() {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.getStartedButton).click();
	}

	public void enterGeneralInfoData(String option) {
		chooseJobTitleOption(option);
		chooseNoESLteachingCertificateOption();
		chooseNoTeachingLicenseOption();
		clickGetStartedButton();
	}
	// ***************************************************************************************************//

	// What interests you?

	public void chooseNoSchoolsContactYou() {
		webElementUtils.waitFor(5000);
		completeProfileElements.allowSchoolToContactNOoption.click();
	}

	public void chooseYesOnlineTeaching() {
		completeProfileElements.onlineTeachingYESOption.click();
	}

	public void chooseYesTEFLCertification() {
		completeProfileElements.TEFLCertificationYESUption.click();
	}

	public void chooseYesTeacherCertification() {
		completeProfileElements.teacherCertificationYES.click();
	}

	public void clickMoreAboutYou() {
		completeProfileElements.moreAboutYouButton.click();
	}

	

	// ***************************************************************************************************//

	// Tell us more about yourself

	public void chooseCountryYouLive(String country) {
		webElementUtils.waitFor(3000);
		webElementUtils.waitForElementToBeClickable(completeProfileElements.countryDropdown).click();
		List<WebElement> countries = completeProfileElements.countries;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(countries, country);
	}

	public void chooseStateProvince(String state) {
		System.out.println("inside state");
		webElementUtils.waitForElementToBeClickable(completeProfileElements.stateProvinceOrTerritoryDropdown).click();
		List<WebElement> states = completeProfileElements.stateProvinceOrTerritoryList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(states, state);
	}

	public void chooseCitizenship(String citizenship) {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.citizenshipDropdown).click();
		List<WebElement> citizenships = completeProfileElements.citizenshipList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(citizenships, citizenship);
		webElementUtils.waitForElementToBeClickable(completeProfileElements.closeCitizenship).click();
	}

	public void selectFluentLanguages(List<String> languages) {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.fluentLanguageDropdown).click();
		List<WebElement> options = completeProfileElements.fluetLanguageList;
		webElementUtils.waitFor(3000);
		for (String language : languages) {
			webElementUtils.clickFromList(options, language);
		}
		webElementUtils.waitForElementToBeClickable(completeProfileElements.closeLanguage).click();
	}

	public void enterBirthday(String month, String day, String year) {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.monthDropdown).click();
		List<WebElement> months = completeProfileElements.monthList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(months, month);

		webElementUtils.waitForElementToBeClickable(completeProfileElements.dayDropdown).click();
		List<WebElement> days = completeProfileElements.dayList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(days, day);

		webElementUtils.waitForElementToBeClickable(completeProfileElements.yearDropdown).click();
		List<WebElement> years = completeProfileElements.yearList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(years, year);
	}

	public void selectGender(String gender) {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.genderDropdown).click();
		List<WebElement> genders = completeProfileElements.genderList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(genders, gender);
	}

	public void writePhoneNumber(String phoneNumber) {
		webElementUtils.waitForElementVisiblilty(completeProfileElements.phoneNumber).sendKeys(phoneNumber);
	}

	public void uploadResume(String path) throws InterruptedException {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.addResumeButton).click();
		BasePage.getDriver().findElement(By.id("fsp-fileUpload")).sendKeys(path);
//		webElementUtils.waitForElementVisiblilty(completeProfileElements.selectFiles).sendKeys(path);
		if (webElementUtils.waitForElementVisiblilty(completeProfileElements.fileName).isDisplayed()) {
			webElementUtils.waitForElementToBeClickable(completeProfileElements.uploadButton).click();
		}
	}

	public void clickConsentCheckbox() {
		//webElementUtils.javaScriptClick(completeProfileElements.consentCheckbox, 3000);
		completeProfileElements.consentCheckbox.click();
		//System.out.println(completeProfileElements.consentCheckbox.isSelected());
		//webElementUtils.waitForElementToBeClickable(completeProfileElements.consentCheckbox).click();
	}

	public void clickNextQualificationButton() {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.nextQualificationsButton).click();
	}
	
	
	// ***************************************************************************************************//
	
	public void chooseDegreeLevel(String degree) {
		webElementUtils.waitFor(3000);
		webElementUtils.waitForElementToBeClickable(completeProfileElements.degreeDropdown).click();
		List<WebElement> degreeList = completeProfileElements.degreeList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(degreeList, degree);
	}
	
	public void enterFieldOfStudy(String field) {
		webElementUtils.waitForElementVisiblilty(completeProfileElements.fieldOfStudy).sendKeys(field);
	}
	
	public void enterCollegeOrUni(String college) {
		webElementUtils.waitForElementVisiblilty(completeProfileElements.collegeOrUni).sendKeys(college);
	}

	public void enterStartPeriod(String startMonth,String startYear) {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.startMonth).click();
		List<WebElement> startMonthList = completeProfileElements.startMonthList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(startMonthList, startMonth);
		
		webElementUtils.waitForElementToBeClickable(completeProfileElements.startYear).click();
		List<WebElement> startYearList = completeProfileElements.startYearList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(startYearList, startYear);
	}
	
	public void enterEndPeriod(String endMonth,String endYear) {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.endMonth).click();
		List<WebElement> endMonthList = completeProfileElements.endMonthList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(endMonthList, endMonth);
		
		webElementUtils.waitForElementToBeClickable(completeProfileElements.endYear).click();
		List<WebElement> endYearList = completeProfileElements.endYearList;
		webElementUtils.waitFor(3000);
		webElementUtils.clickFromList(endYearList, endYear);
	}
	public void clickNextExperienceButton() {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.NextExperienceButton).click();
	}
//	public void clickDashboard() {
//		webElementUtils.waitForElementToBeClickable(completeProfileElements.userIcon).click();
//		webElementUtils.waitForElementToBeClickable(completeProfileElements.dashboardSubMenu).click();
//	}
//	public void clickUpdateProfile() {
//		webElementUtils.waitForElementToBeClickable(completeProfileElements.updateProfileButton).click();
//	}
	
	// ***************************************************************************************************//
	
	//EXPERIENCE
	
	public void clickWithoutExperience() {
		webElementUtils.waitFor(3000);
		completeProfileElements.withoutExperienceCheckbox.click();
	}
	public void clickFinishUpButton() {
		webElementUtils.waitForElementToBeClickable(completeProfileElements.finishUpButton).click();

	}
	
}
