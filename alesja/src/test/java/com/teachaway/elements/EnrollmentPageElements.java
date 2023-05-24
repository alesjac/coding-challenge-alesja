package com.teachaway.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teachaway.utilities.BasePage;

public class EnrollmentPageElements {
	public EnrollmentPageElements() {
		PageFactory.initElements(BasePage.getDriver(), this);
	}
	//STUDENT INFORMATION SECTION
	@FindBy(css="input[id='checkout_email']")
	public WebElement studentEmail;
	
	@FindBy(css="input[id='checkout_shipping_address_first_name']")
	public WebElement firstName ;
	
	@FindBy(css="input[id='checkout_shipping_address_last_name']")
	public WebElement lastname;
	
	@FindBy(css="input[id='checkout_shipping_address_address1']")
	public WebElement address;
	
	@FindBy(css="input[id='checkout_shipping_address_city']")
	public WebElement city;
	
	@FindBy(css="input[id='checkout_shipping_address_phone']")
	public WebElement phone ;
	
	@FindBy(css="button[id='continue_button']")
	public WebElement continueButton;
	
	@FindBy(css="bdo[dir='ltr']")
	public WebElement contactEmail;
	
	@FindBy(css="address[class='address address--tight']")
	public WebElement detailsAddress;
	
	@FindBy(css="select[id='checkout_shipping_address_country']>option[selected]")
	public WebElement country;
	
	
}
