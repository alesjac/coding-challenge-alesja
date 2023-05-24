package com.teachaway.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.teachaway.elements.DashboardPageElements;
import com.teachaway.elements.JobsAbroadPageElements;
import com.teachaway.utilities.BasePage;
import com.teachaway.utilities.WebElementsUtils;

public class JobsAbroadPage {
	JobsAbroadPageElements jobsAbroadPageElements;
	DashboardPageElements dashboardPageElements;
	WebElementsUtils webElementsUtils;

	public JobsAbroadPage() {
		jobsAbroadPageElements = new JobsAbroadPageElements();
		dashboardPageElements = new DashboardPageElements();
		webElementsUtils = new WebElementsUtils(Duration.ofSeconds(7));
	}

	public void clickJobBoardSubMenu() {
		Actions action = new Actions(BasePage.getDriver());
		action.moveToElement(dashboardPageElements.jobsMenu).perform();
		webElementsUtils.waitForElementToBeClickable(dashboardPageElements.jobBoardSubmenu).click();
	}
	public void selectCountry(String country) {
		jobsAbroadPageElements.allCountriesField.sendKeys(country);
		webElementsUtils.waitForElementToBeClickable(jobsAbroadPageElements.suggestedCountry).click();
	}
	public void selectPosition(String position) {
		webElementsUtils.waitForElementToBeClickable(jobsAbroadPageElements.allPositionsDropdown).click();
		List<WebElement> allPositionsList= jobsAbroadPageElements.allPositionsList;
		webElementsUtils.clickFromList(allPositionsList, position);
	}
	public void clickSearchJobsButton() {
		webElementsUtils.waitForElementToBeClickable(jobsAbroadPageElements.searchJobsButton).click();
	}
	
	///*****************************************************************************************//
	public void clickCountryOnDestionationsSubment() {
		webElementsUtils.waitFor(3000);
		Actions action = new Actions(BasePage.getDriver());
		action.moveToElement(jobsAbroadPageElements.jobsMenu).perform();
		action.moveToElement(jobsAbroadPageElements.desitinationsSubMenu).perform();
		webElementsUtils.waitForElementToBeClickable(jobsAbroadPageElements.dubaiCountry).click();
	}
	public void clickViewAllJobs() {
		webElementsUtils.waitForElementToBeClickable(jobsAbroadPageElements.viewAllJobsButton).click();
	}
}
