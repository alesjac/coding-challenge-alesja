package com.teachaway.pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.teachaway.elements.MyProfilePageElements;
import com.teachaway.utilities.BasePage;
import com.teachaway.utilities.ConfigurationReader;
import com.teachaway.utilities.WebElementsUtils;

public class MyProfilePage {
	MyProfilePageElements myProfilePageElements;
	WebElementsUtils webElementsUtils;

	public MyProfilePage() {
		myProfilePageElements = new MyProfilePageElements();
		webElementsUtils = new WebElementsUtils(Duration.ofSeconds(7));
	}

	public void clickPorfileMenu() {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.profileMenu).click();
	}

	public void clickPlusButtonCertificatesAndlicense() {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.addLicenseButtom).click();
	}

	public void writeIssuingBody(String issuingBody) {
		webElementsUtils.waitForElementVisiblilty(myProfilePageElements.issuingBodyField).sendKeys(issuingBody);
	}

	public void chooseTeachingLicenseType(String techingLicenseType) {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.teachingLicenseTypeDropdown).click();
		List<WebElement> teachingLicenseTypeList = myProfilePageElements.teachingLicenseTypeList;
		webElementsUtils.clickFromList(teachingLicenseTypeList, techingLicenseType);
	}

	public void writeCountry(String country) {
		webElementsUtils.waitForElementVisiblilty(myProfilePageElements.country).sendKeys(country);
		List<WebElement> countries = myProfilePageElements.countryList;
		for (WebElement option : countries) {
			if (option.getText().contains(country)) {
				webElementsUtils.waitForElementToBeClickable(option).click();
				break;
			}
		}
	}

	public void chooseState(String state) {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.stateDropdown).click();
		List<WebElement> stateList = myProfilePageElements.stateList;
		webElementsUtils.clickFromList(stateList, state);
	}

	public void chooseGradesLicensedToTeach(List<String> grades) {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.gradesDropdown).click();

		List<WebElement> gradesList = myProfilePageElements.gradesList;
		webElementsUtils.waitFor(3000);
		for (String grade : grades) {
			webElementsUtils.clickFromList(gradesList, grade);
		}
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.formTitle).click();

	}

	public void chooseSubjectsLicensedToTeach(List<String> subjects) {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.subjectsDropdown).click();

		List<WebElement> subjectsList = myProfilePageElements.subjectsLists;
		webElementsUtils.waitFor(3000);
		for (String subject : subjects) {
			webElementsUtils.clickFromList(subjectsList, subject);
		}
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.formTitle).click();

	}

	public void selectValidPeriod(String month, String year) {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.validFromMonthDropdown).click();
		List<WebElement> months = myProfilePageElements.validFromMonthList;
		webElementsUtils.clickFromList(months, month);

		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.validFromYearDropdown).click();
		List<WebElement> years = myProfilePageElements.validFromYearList;
		webElementsUtils.clickFromList(years, year);
	}

	public void checkNoExpirationDate() {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.checkBoxExpiry).click();
	}

	public void clickSaveLicense() {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.saveButton).click();
	}

//	myProfilePage.writeIssuingBody("TEST Issuing Body");
//	myProfilePage.chooseTeachingLicenseType("Standard");
//	myProfilePage.writeCountry("Albania");
//	myProfilePage.chooseGradesLicensedToTeach(Arrays.asList("Gr. 11", "Gr. 12","Gr. 13"));
//	myProfilePage.chooseSubjectsLicensedToTeach(Arrays.asList("Informational Technology", "Math - Algebra"));
//	myProfilePage.selectValidPeriod("Mar", "2021");
	public boolean checkSavedInfo(List<String> validPeriods, List<String> grades, List<String> subjects,
			List<String> countryStates) {
		webElementsUtils.waitFor(5000);
		String validPeriod = myProfilePageElements.validFrom.getText();
		String countryAndCity = myProfilePageElements.countryAndCity.getText();
		String subject = myProfilePageElements.subjectsSaved.getText();
		String grade = myProfilePageElements.gradeLevelSaved.getText();

		String validPeriodSaved = String.format("Valid from: %s %s - Ongoing", validPeriods.get(0),
				validPeriods.get(1));
		String countryAndCitySaved = String.format("%s, %s", countryStates.get(0), countryStates.get(1));

		String subjectSaved = "Subjects: ";
		
		for (String s : subjects) {
			if (subjects.size() == 1) {
				subjectSaved = String.format("%s", s);
			}
			subjectSaved += String.format("%s, ", s);
		}

		String gradeSaved = "Grade level: ";
		for (String g : grades) {
			if (grades.size() == 1) {
				gradeSaved = String.format("%s", g);
			}
			gradeSaved += String.format("%s, ", g);
		}

		boolean checkIfSame = validPeriod.equals(validPeriodSaved) && countryAndCity.equals(countryAndCitySaved)
				&& subject.equals(subjectSaved.substring(0, subjectSaved.length() - 2))
				&& grade.equals(gradeSaved.substring(0, gradeSaved.length() - 2));
		return checkIfSame;
	}
	//*********************************************************************************************//
	
	public void clickProfileSubment(String submenuName) {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.profileName).click();
		webElementsUtils.waitFor(2000);
		List<WebElement> submenuList = myProfilePageElements.profileSubMentList;
		webElementsUtils.clickFromList(submenuList, submenuName);
	}
	public void writePasswords(String newPassword) {
		String oldPassword=ConfigurationReader.getProperty("password");
		webElementsUtils.waitForElementVisiblilty(myProfilePageElements.oldPassword).sendKeys(oldPassword);
		webElementsUtils.waitForElementVisiblilty(myProfilePageElements.newPassword).sendKeys(newPassword);
		webElementsUtils.waitForElementVisiblilty(myProfilePageElements.newPasswordRetype).sendKeys(newPassword);
		
		ConfigurationReader.setProperty(oldPassword, newPassword);

	}
	public void clickUpdateButton() {
		webElementsUtils.waitForElementToBeClickable(myProfilePageElements.updatePasswordButton).click();
	}

	public boolean checkIfPasswordSuccessfullyChanged(String newPassword) {
		webElementsUtils.waitFor(5000);
		String n=ConfigurationReader.getProperty("password");
		//need to refresh the config.properties file to get the changes
		return newPassword.equals(ConfigurationReader.getProperty("password"));
	}
}
