package com.teachaway.tests;

import org.testng.annotations.Test;

import com.teachaway.pages.JobsAbroadPage;

public class TestJobsAbroadPage {
	JobsAbroadPage jobsAbroadPage;
	public TestJobsAbroadPage() {
		jobsAbroadPage=new JobsAbroadPage();
	}
	
	@Test(priority = 1)
	public void searchJobsForSpecificCountryAndPosition() {
		jobsAbroadPage.clickJobBoardSubMenu();
		jobsAbroadPage.selectCountry("United Arab");
		jobsAbroadPage.selectPosition("Preschool & Early Childhood");
		jobsAbroadPage.clickSearchJobsButton();
	}
	
	@Test(priority = 2)
	public void searchJobsForSpecificCountryAndAllPositions() {
		jobsAbroadPage.clickCountryOnDestionationsSubment();
		jobsAbroadPage.clickViewAllJobs();
	}
}
