package com.teachaway.pages;

import java.time.Duration;

import com.teachaway.elements.JobDetailsPageElements;
import com.teachaway.utilities.WebElementsUtils;

public class JobDetailsPage {
	
	JobDetailsPageElements jobDetailsPageElements;
	WebElementsUtils webElementUtils;
	
	public JobDetailsPage() {
		jobDetailsPageElements=new JobDetailsPageElements();
		webElementUtils=new WebElementsUtils(Duration.ofSeconds(10));
	}
	
	public void clickSaveButton() {
		webElementUtils.scrollToBottomOfPage();
		//webElementUtils.waitForElementToBeClickable(jobDetailsPageElements.saveButton).click();
		//jobDetailsPageElements.saveButton.click();
		webElementUtils.javaScriptClick(jobDetailsPageElements.saveButton, 5000);
	}
	
}
