package com.sites.dialhub.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.configuration.ScriptsGridSteps;
import com.sites.dialhub.steps.configuration.UsersGridSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class ScriptsGridTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;

	@Steps
	public UsersGridSteps userGridSteps;

	@Steps
	public ScriptsGridSteps sciptsGridSteps;

	public String baseURL;
	public String userName;
	public String userPass;

	public String menuNavigation;

	@Before
	public void dataSetup() {

		baseURL = "https://dialhub-staging.urnbag.com";
		userName = "admin";
		userPass = "pepsicola";

		menuNavigation = "Configuration > Scripts > Scripts";
	}

	@Test
	public void listScripts() {

		loginSteps.openDialHub(baseURL);
		loginSteps.enterUsername(userName);
		loginSteps.enterPassword(userPass);
		loginSteps.hitSignInButton();

		userGridSteps.navigateToSiteLocation(menuNavigation);
		sciptsGridSteps.printScriptsGrid();

	}

}
