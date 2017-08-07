package com.sites.dialhub.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.configuration.ButtonsGridSteps;
import com.sites.dialhub.steps.configuration.UsersGridSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class ButtonsGridTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;
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

		menuNavigation = "Configuration > Buttons > Buttons";
	}

	@Test
	public void listButons() {
		loginSteps.openDialHub(baseURL);
		loginSteps.enterUsername(userName);
		loginSteps.enterPassword(userPass);
		loginSteps.hitSignInButton();

		usersGridSteps.navigateToSiteLocation(menuNavigation);
		buttonsGridSteps.printButtonsGrid();

	}

}
