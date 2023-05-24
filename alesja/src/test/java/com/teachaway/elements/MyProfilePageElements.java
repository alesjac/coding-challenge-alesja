package com.teachaway.elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teachaway.utilities.BasePage;

public class MyProfilePageElements {

	public MyProfilePageElements() {
		PageFactory.initElements(BasePage.getDriver(), this);
	}
	
	@FindBy(linkText = "PROFILE")
	public WebElement profileMenu;
	
	@FindBy(css="button[data-testid='ta-web-ui-button-add-license-button']")
	public WebElement addLicenseButtom;
	
	@FindBy(css="input[data-testid='ta-web-ui-input-issuing-body']")
	public WebElement issuingBodyField;
	
	@FindBy(css="button[data-testid='ta-web-ui-input-select-teacher-qualification-type-button']")
	public WebElement teachingLicenseTypeDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-teacher-qualification-type-options']>li")
	public List<WebElement> teachingLicenseTypeList;
	
	@FindBy(css="input[data-testid='ta-web-ui-input-combobox-country']")
	public WebElement country;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-country-options']>li")
	public List<WebElement> countryList;
	
	@FindBy(css="button[data-testid='ta-web-ui-input-select-state-button']")
	public WebElement stateDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-state-options']>li")
	public List<WebElement> stateList;
	
	//ta-web-ui-input-multiselect-grades-button
	@FindBy(css="button[data-testid='ta-web-ui-input-multiselect-grades-button']")
	public WebElement gradesDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-grades-options']>li")
	public List<WebElement> gradesList;
	
	@FindBy(className = "ta-web-ui-modal__header-text")
	public WebElement formTitle;
	
	@FindBy(css="button[data-testid='ta-web-ui-input-multiselect-subjects-button']")
	public WebElement subjectsDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-subjects-options']>li")
	public List<WebElement> subjectsLists;
	
	

	@FindBy(css="button[data-testid='ta-web-ui-input-select-valid-month-button']")
	public WebElement validFromMonthDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-valid-month-options']>li")
	public List<WebElement> validFromMonthList;
	

	@FindBy(css="button[data-testid='ta-web-ui-input-select-valid-year-button']")
	public WebElement validFromYearDropdown;
	
	@FindBy(css="ul[data-testid='ta-web-ui-input-dropdown-valid-year-options']>li")
	public List<WebElement> validFromYearList;
	
	@FindBy(className ="ta-web-ui-checkbox__input-wrapper")
	public WebElement checkBoxExpiry;
	
	@FindBy(id="add-license-modal-save-button")
	public WebElement saveButton;
	
	@FindBy(css=".license-details > div:nth-of-type(1)  .ta-web-ui-list__item-text--description > span")
	public WebElement subjectsSaved;
	
	@FindBy(css=".license-details > div:nth-of-type(2)  .ta-web-ui-list__item-text--description > span")
	public WebElement gradeLevelSaved;
	
	@FindBy(xpath="//div[@class='license-item']/div[@class='ta-web-ui-list__item']/div[@class='ta-web-ui-list__item-text']/div[@class='ta-web-ui-list__item-text--description']")
	public WebElement countryAndCity;
	
	@FindBy(xpath = "//div[@class='license-item']/div[@class='ta-web-ui-list__item']/div[@class='ta-web-ui-list__item-text']/div[@class='ta-web-ui-list__item-text--title']")
	public WebElement licenseName;
	
	@FindBy(xpath = "//div[@class='license-item']/div[@class='ta-web-ui-list__item']/div[@class='ta-web-ui-list__item-text']/div[@class='ta-web-ui-list__item-text--subheader']")
	public WebElement validFrom;
	
	//******************************************************************************************************************//
	@FindBy(xpath ="//div[@class='user-menu']//div[@class='item-title']")
	public WebElement profileName;
	
	@FindBy(css="ul[data-testid='ta-web-ui-menu-menu']>li")
	public List<WebElement> profileSubMentList;
	
	@FindBy(css="input[data-testid='ta-web-ui-input-oldPassword']")
	public WebElement oldPassword;
	
	@FindBy(css="input[data-testid='ta-web-ui-input-password']")
	public WebElement newPassword;
	
	@FindBy(css="input[data-testid='ta-web-ui-input-confirmation_password']")
	public WebElement newPasswordRetype;
	
	@FindBy(css="button[data-testid='ta-web-ui-button-update_password_settings_page']")
	public WebElement updatePasswordButton;
}
