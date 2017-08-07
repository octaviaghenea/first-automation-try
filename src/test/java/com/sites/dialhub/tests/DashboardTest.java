package com.sites.dialhub.tests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.configuration.UsersGridSteps;
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
	@Steps
	public UsersGridSteps userGridSteps;

	public String baseURL;
	public String userName;
	public String userPass;

	public String menuNavigation;

	@Before
	public void dataSetup() {
		baseURL = "https://dialhub-staging.urnbag.com";
		userName = "admin";
		userPass = "pepsicola";

		menuNavigation = "Dashboard";
	}

	@Test
	public void listDashboardInfo() {
		loginSteps.openDialHub(baseURL);
		loginSteps.enterUsername(userName);
		loginSteps.enterPassword(userPass);
		loginSteps.hitSignInButton();

		userGridSteps.navigateToSiteLocation(menuNavigation);
		List<DashboardModel> userList = dashboardSteps.printList();

		for (DashboardModel userNow : userList) {

			System.out.println("data: " + userNow.getUserName() + " | " + userNow.getCallReason() + " | "
					+ userNow.getCallDuration() + " | " + userNow.getDateTime());

		}
	}

}
