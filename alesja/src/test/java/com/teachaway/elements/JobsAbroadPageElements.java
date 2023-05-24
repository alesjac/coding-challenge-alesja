package com.teachaway.elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teachaway.utilities.BasePage;

public class JobsAbroadPageElements {
	public JobsAbroadPageElements() {
		PageFactory.initElements(BasePage.getDriver(), this);
	}
	
	@FindBy(css="input[id='edit-location']")
	public WebElement allCountriesField;
	
	@FindBy(className ="tt-selectable")
	public WebElement suggestedCountry;
	
	@FindBy(css="button[data-id='edit-position']")
	public WebElement allPositionsDropdown;
	
	@FindBy(css="ul[class='dropdown-menu inner show']>li")
	public List<WebElement> allPositionsList;
	
	@FindBy(css="input[id='edit-submit']")
	public WebElement searchJobsButton;
	
	//
	
	
	@FindBy(css="div[class='ta-job__apply_all']>a")
	public WebElement viewAllJobsButton;
	
	@FindBy(css="span[title='Jobs']")
	public WebElement jobsMenu;
	
	
	@FindBy(css = "span[title='Destinations']")
	public WebElement desitinationsSubMenu;
	
	@FindBy(css="a[href='/teach-in-dubai-uae']")
	public WebElement dubaiCountry;
}
