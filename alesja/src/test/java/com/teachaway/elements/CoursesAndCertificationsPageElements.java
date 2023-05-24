package com.teachaway.elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teachaway.utilities.BasePage;

public class CoursesAndCertificationsPageElements {
	public CoursesAndCertificationsPageElements() {
		PageFactory.initElements(BasePage.getDriver(), this);
	}
	
	@FindBy(css="button[data-target='Professional-Development-for-Teachers']")
	public WebElement professionalDevelopmentForTeachersButton;
	
	@FindBy(xpath = "//div[@class='wp-block-uagb-column uagb-column__wrap uagb-column__background-undefined uagb-block-e69eeea7 left-part']//a[text()='Effective Online Teaching Strategies: Creating smarter virtual classrooms']")
	public WebElement efffectiveOnlineTeachingStrategiesCourse;
	
	@FindBy(css="div[class='wp-block-button btn btn-primary']>a[title='Enroll now']")
	public WebElement enrollNowButton;
	
	@FindBy(css="ul[id='course-filter']>li")
	public List<WebElement> coursesList;
	
	@FindBy(css="a[class='dropdown-toggle']")
	public WebElement courseDropdown;
	
}
