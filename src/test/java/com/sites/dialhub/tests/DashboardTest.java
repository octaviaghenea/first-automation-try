package com.sites.dialhub.tests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.dashboard.DashboardSteps;
import com.sites.dialhub.tools.DashboardModel;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class DashboardTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public DashboardSteps dashboardSteps;

	@Test
	public void listDashboardInfo() {
		loginSteps.openDialHub("https://dialhub-staging.urnbag.com");
		loginSteps.enterUsername("admin");
		loginSteps.enterPassword("pepsicola");
		loginSteps.hitSignInButton();

		List<DashboardModel> userList = dashboardSteps.printList();

		for (DashboardModel userNow : userList) {

			System.out.println("data: " + userNow.getUserName() + " | " + userNow.getCallReason() + " | "
					+ userNow.getCallDuration() + " | " + userNow.getDateTime());

		}
	}

}
