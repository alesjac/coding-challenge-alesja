package com.teachaway.elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teachaway.utilities.BasePage;

public class DashboardPageElements {

	public DashboardPageElements() {
		PageFactory.initElements(BasePage.getDriver(), this);
	}
	
	@FindBy(css="button[data-testid='ta-web-ui-button-profile-complete-modal-cancel-button']")
	public WebElement dismissButton;
	
//	@FindBy(css="button[data-testid='ta-web-ui-button-profile-complete-modal-save-button']")
//	public WebElement updateProfileButton;

	@FindBy(className ="banner-content--title")
	public WebElement dashboardTitle;
	
	@FindBy(css="input[data-testid='ta-web-ui-input-combobox-suggested-jobs-country']")
	public WebElement filterByCountryDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-suggested-jobs-country-options']>li")
	public List<WebElement> filterByCountryList;
	
	@FindBy(xpath ="//p[text()='Eligible Candidates: ']/span")
	public List<WebElement> eligibleCandidatesList;
	
	@FindBy(xpath="//a[text()='View Job Details']")
	public List<WebElement> viewJobDetailsLink; 
	
	@FindBy(xpath ="//div[@class='dashboard-panel-content']//div[@class='ta-web-ui-list__item-text--title']/a")
	public List<WebElement> jobTitles;
	
	@FindBy(css="div#saved-jobs-panel > .dashboard-panel-content > .dashboard-panel-view > .ta-web-ui-list > div > .tile a[target='_blank']")
	public List<WebElement> savedJobTitles;
	
	@FindBy(linkText = "Saved Jobs")
	public WebElement savedJobSection;
	
	@FindBy(css="a[href='https://www.teachaway.com/courses-and-certifications']")
	public WebElement coursesMenu;
	
	@FindBy(xpath="//div[text()='JOBS']")
	public WebElement jobsMenu;
	
	@FindBy(css="a[href='https://www.teachaway.com/teaching-jobs-abroad']")
	public WebElement jobBoardSubmenu;
	
	@FindBy(xpath = "//div[text()='Destinations']")
	public WebElement desitinationsSubMenu;
	
	@FindBy(css="a[href='https://www.teachaway.com/teach-in-dubai-uae']")
	public WebElement dubaiCountry;
	

}
