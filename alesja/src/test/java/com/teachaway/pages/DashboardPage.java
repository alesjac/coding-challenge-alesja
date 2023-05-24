package com.teachaway.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import com.teachaway.elements.DashboardPageElements;
import com.teachaway.utilities.BasePage;
import com.teachaway.utilities.WebElementsUtils;

public class DashboardPage {
	DashboardPageElements dashboardPageElements;
	JobDetailsPage jobDetailsPage;
	WebElementsUtils webElementUtils;
	List<String> openedJobTitles = new ArrayList<String>();

	public DashboardPage() {
		dashboardPageElements = new DashboardPageElements();
		webElementUtils = new WebElementsUtils(Duration.ofSeconds(10));
		jobDetailsPage= new JobDetailsPage();
	}

//	public void clickFromList(List<WebElement> options, String text) {
//		for (WebElement option : options) {
//			if (option.getText().equals(text)) {
//				webElementUtils.waitForElementToBeClickable(option).click();
//				break;
//			}
//		}
//	}

	public void dismissCompleteProfile() {
		
		try {

			dashboardPageElements.dismissButton.click();

		} catch (NoSuchElementException e) {
			System.out.println("Continue on dashboard");
		}

	}

	public void chooseFilterByCountry(String country) {
		webElementUtils.waitForElementToBeClickable(dashboardPageElements.filterByCountryDropdown).click();
		List<WebElement> countries = dashboardPageElements.filterByCountryList;
		webElementUtils.clickFromList(countries, country);
	}

	public void clickViewJobDetailsByEligibleCandidates(String eligibleCandidate) {
		
		List<WebElement> eligibleCandidatesList = dashboardPageElements.eligibleCandidatesList;
		List<WebElement> viewJobLinks = dashboardPageElements.viewJobDetailsLink;
		List<WebElement> jobTitlesList = dashboardPageElements.jobTitles;
		//List<String> openedJobTitles = new ArrayList<String>();
		int i = -1;//get(0) first element in list (0-9: total 10)
		for (WebElement option : eligibleCandidatesList) {
				i++;
				if (option.getText().equals(eligibleCandidate)) {
					// viewJobLinks.get(i).click();
//					webElementUtils.waitFor(5000);
//					System.out.println(i + option.getText() + " clicked");
					openedJobTitles.add(jobTitlesList.get(i).getText());
					viewJobLinks.get(i).click();
					System.out.printf("%s at position %d on web page is clicked\n",option.getText(),i+1);

					webElementUtils.waitFor(5000);					
				}
		}
		for(String value:openedJobTitles) {
			System.out.println("Title: "+value);
		}
	}
	
	public void clickSaveButtonForOpenedJobs() {
		ArrayList<String> windowsHandles = new ArrayList<String>(BasePage.getDriver().getWindowHandles());
		for(int i=1;i<windowsHandles.size();i++){
		//for(String item:windowsHandles) {
			//webElementUtils.waitFor(7000);
			BasePage.getDriver().switchTo().window(windowsHandles.get(i));
			
			jobDetailsPage.clickSaveButton();
			System.out.println("Save button clicked");
		}
		BasePage.getDriver().switchTo().window(windowsHandles.get(0));
	}
	
	public void goToSavedJobSection() {
		webElementUtils.refreshPage();
		webElementUtils.waitForElementToBeClickable(dashboardPageElements.savedJobSection).click();
		System.out.println("saved jobs clicked");
	}
	
	public boolean chechkIfJobsAreSaved() {
		webElementUtils.waitFor(3000);
		List<WebElement> savedJobTitles = dashboardPageElements.savedJobTitles;
		boolean isSaved=false;
		for(WebElement value:savedJobTitles) {
			System.out.println("Title of saved jobs (section): "+value.getText());
			isSaved=openedJobTitles.contains(value.getText());
		}
		System.out.println(isSaved);
		return isSaved;

	}
}
