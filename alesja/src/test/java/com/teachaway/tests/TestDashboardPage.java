package com.teachaway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.teachaway.pages.DashboardPage;
import com.teachaway.pages.JobDetailsPage;

public class TestDashboardPage {

	DashboardPage dashboardPage;
	
	public TestDashboardPage() {
		dashboardPage=new DashboardPage();
		
	}
	
	
	@Test
	public void printEligibleCandidates() {
		dashboardPage.dismissCompleteProfile();
		dashboardPage.chooseFilterByCountry("Online Teaching Jobs");
		dashboardPage.clickViewJobDetailsByEligibleCandidates("University Graduate, Certified Teacher");
		dashboardPage.clickSaveButtonForOpenedJobs();
		dashboardPage.goToSavedJobSection();
		dashboardPage.chechkIfJobsAreSaved();
		Assert.assertTrue(dashboardPage.chechkIfJobsAreSaved());
	}
	
}
