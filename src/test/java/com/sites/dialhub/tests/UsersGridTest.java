package com.sites.dialhub.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.configuration.ButtonsGridSteps;
import com.sites.dialhub.steps.configuration.UsersGridSteps;
import com.sites.dialhub.steps.dashboard.DashboardSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class UsersGridTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public DashboardSteps dashboardSteps;
	@Steps
	public UsersGridSteps usersGridSteps;
	@Steps
	public ButtonsGridSteps buttonsGridSteps;

	public String baseURL;
	public String userName;
	public String userPass;

	public String menuNavigation;

	@Before
	public void dataSetup() {

		baseURL = "https://dialhub-staging.urnbag.com";
		userName = "admin";
		userPass = "pepsicola";

		menuNavigation = "Configuration > Users";
	}

	@Test
	public void listUsers() {
		loginSteps.openDialHub(baseURL);
		loginSteps.enterUsername(userName);
		loginSteps.enterPassword(userPass);
		loginSteps.hitSignInButton();

		usersGridSteps.navigateToSiteLocation(menuNavigation);
		usersGridSteps.printUsersGrid();

	}

}
