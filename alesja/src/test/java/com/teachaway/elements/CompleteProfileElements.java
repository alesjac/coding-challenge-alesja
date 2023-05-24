package com.teachaway.elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teachaway.utilities.BasePage;

public class CompleteProfileElements {

	public CompleteProfileElements(){
		PageFactory.initElements(BasePage.getDriver(), this);
	}
	
	
	
	@FindBy(css="#welcome-firstName")
	public WebElement welcomeMesage;
	
	//GENERAL INFO
	@FindBy(css="div[id='welcome-job-category']>button")
	public WebElement jobTitleDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-welcome-job-category-options']>li")
	public List<WebElement> optionsJobTitle;
	
	@FindBy(css="div[data-testid='ta-web-ui-toggle-esl-option']:nth-of-type(2)")
	public WebElement eslCertificateNoButton;
	
	@FindBy(css="div[data-testid='ta-web-ui-toggle-teaching-license-option']:nth-of-type(2)")
	public WebElement teachinfLicenseNoButton;
	
	@FindBy(css="div[data-testid='ta-web-ui-wrap']")
	public WebElement getStartedButton;
	//********************************************************************************************//
	
	//What interests you?
	@FindBy(css="div[data-testid='ta-web-ui-toggle-schoolContactDirectly-option']:nth-of-type(2)")
	public WebElement allowSchoolToContactNOoption;
	
	@FindBy(css="div[data-testid='ta-web-ui-toggle-interesedOnlineTeaching-option']:nth-of-type(1)")
	public WebElement onlineTeachingYESOption;
	
	@FindBy(css="div[data-testid='ta-web-ui-toggle-interesedTEFL-option']:nth-of-type(1)")
	public WebElement TEFLCertificationYESUption;
	
	@FindBy(css="div[data-testid='ta-web-ui-toggle-interesedTeacherCertification-option']:nth-of-type(1)")
	public WebElement teacherCertificationYES;
	
	@FindBy(css="button[data-testid='ta-web-ui-button-next-to-about']")
	public WebElement moreAboutYouButton;
	
	//********************************************************************************************//
	
	//Tell us more about yourself
	@FindBy(css="input[data-testid='ta-web-ui-input-combobox-country']")
	public WebElement countryDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-country-options']>li")
	public List<WebElement> countries;
	
	@FindBy(css="button[data-testid='ta-web-ui-input-select-state-button']")
	public WebElement stateProvinceOrTerritoryDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-state-options']>li")
	public List<WebElement> stateProvinceOrTerritoryList;
	
	@FindBy(css="input[data-testid='ta-web-ui-input-multicombobox-citizenship']")
	public WebElement citizenshipDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-citizenship-options']>li")
	public List<WebElement> citizenshipList;
	
	@FindBy(css="div[class='ta-reggie__input']:nth-of-type(3) > .TA.ta-web-ui-input__container > div[role='button'] > .ta-web-ui-input-multicombobox__icons > svg#select-triangle")
	public WebElement closeCitizenship;
	
	@FindBy(css="input[data-testid='ta-web-ui-input-multicombobox-languages']")
	public WebElement fluentLanguageDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-languages-options']>li")
	public List<WebElement> fluetLanguageList;
	
	@FindBy(css="div[class='ta-reggie__input']:nth-of-type(4) > .TA.ta-web-ui-input__container > div[role='button'] > .ta-web-ui-input-multicombobox__icons > svg#select-triangle")
	public WebElement closeLanguage;
	
	@FindBy(css="button[data-testid='ta-web-ui-input-select-monthOfBirth-button']")
	public WebElement monthDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-monthOfBirth-options']>li")
	public List<WebElement> monthList;
	
	@FindBy(css="button[data-testid='ta-web-ui-input-select-dayOfBirth-button']")
	public WebElement dayDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-dayOfBirth-options']>li")
	public List<WebElement> dayList;
	
	@FindBy(css="button[data-testid='ta-web-ui-input-select-yearOfBirth-button']")
	public WebElement yearDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-yearOfBirth-options']>li")
	public List<WebElement> yearList;
	
	@FindBy(css="button[data-testid='ta-web-ui-input-select-gender-button']")
	public WebElement genderDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-gender-options']>li")
	public List<WebElement> genderList;

	@FindBy(css="input[data-testid='ta-web-ui-input-phone-phoneNumber']")
	public WebElement phoneNumber;
	
	@FindBy(css="div[data-testid='ta-web-ui-input-cta']")
	public WebElement addResumeButton;
	
	@FindBy(css="input[id='fsp-fileUpload']")
	public WebElement selectFiles;
	
	@FindBy(css="span[data-e2e='upload']")
	public WebElement uploadButton;
	
	@FindBy(css="div[class='fsp-grid__label']")
	public WebElement fileName;
	
	@FindBy(css ="input[data-testid='ta-web-ui-checkbox-checkbox-input']")
	public WebElement consentCheckbox;
	
	@FindBy(className = "ta-web-ui-button__text")
	public WebElement nextQualificationsButton;
	
	//********************************************************************************************//
	
	//Education
	@FindBy(css="button[data-testid='ta-web-ui-input-select-degree-button']")
	public WebElement degreeDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-degree-options']>li")
	public List<WebElement> degreeList;
	
	@FindBy(css="input[data-testid='ta-web-ui-input-fieldOfStudy']")
	public WebElement fieldOfStudy;
	
	@FindBy(css="input[data-testid='ta-web-ui-input-institution']")
	public WebElement collegeOrUni;
	
	@FindBy(id="start-month-selected")
	public WebElement startMonth;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-start-month-options']>li")
	public List<WebElement> startMonthList;
	
	
	@FindBy(id="start-year-selected")
	public WebElement startYear;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-start-year-options']>li")
	public List<WebElement> startYearList;
	
	@FindBy(id="end-month-selected")
	public WebElement endMonth;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-end-month-options']>li")
	public List<WebElement> endMonthList;
	
	@FindBy(id="end-year-selected")
	public WebElement endYear;
	
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-end-year-options']>li")
	public List<WebElement> endYearList;
	
	@FindBy(css="button[data-testid='ta-web-ui-button-next-step']")
	public WebElement NextExperienceButton;
	

	
	
	@FindBy(css="input[data-testid='ta-web-ui-checkbox-checkbox-no-experience-input']")
	public WebElement withoutExperienceCheckbox;
	
	@FindBy(css="button[data-testid='ta-web-ui-button-complete-next']")
	public WebElement finishUpButton;
	
	@FindBy(css="banner-content--title")
	public WebElement dashboardTitle;
	
	
	
	
}
