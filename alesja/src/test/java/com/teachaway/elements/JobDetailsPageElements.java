package com.teachaway.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teachaway.utilities.BasePage;

public class JobDetailsPageElements {

	public JobDetailsPageElements() {
		PageFactory.initElements(BasePage.getDriver(), this);
	}
	
	@FindBy(xpath="//div[@class='row second-short-description']//button[text()='Save']")
	public WebElement saveButton;
	
	@FindBy(xpath="//div[@class='row second-short-description']//button[text()='Apply Now']")
	public WebElement applyButton;
	
}
