package com.sites.dialhub.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.configuration.CreateScriptSteps;
import com.sites.dialhub.steps.configuration.RolesGridSteps;
import com.sites.dialhub.steps.configuration.UsersGridSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class CreateScriptTest {

	@Managed(uniqueSession = true)
	WebDriver webDriver;

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public RolesGridSteps rolesGridSteps;
	@Steps
	public CreateScriptSteps createScriptSteps;
	@Steps
	public UsersGridSteps usersGridSteps;

	public String baseURL;
	public String userName;
	public String userPass;

	public String menuNavigation;

	@Before
	public void dataSetup() {
		baseURL = "https://dialhub-staging.urnbag.com";
		userName = "admin";
		userPass = "pepsicola";

		menuNavigation = "Configuration > Scripts > Create script";
	}

	@Test
	public void createScript() throws InterruptedException {
		loginSteps.openDialHub(baseURL);
		loginSteps.enterUsername(userName);
		loginSteps.enterPassword(userPass);
		loginSteps.hitSignInButton();

		usersGridSteps.navigateToSiteLocation(menuNavigation);
		createScriptSteps.enterScriptName("Script Test Automation");
		createScriptSteps.enterContent(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
						+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in "
						+ "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa "
						+ "qui officia deserunt mollit anim id est laborum");
		createScriptSteps.selectDisplay("Disable");
		createScriptSteps.selectButtons("Order Status / Tracking Info");
		createScriptSteps.hitSaveButton();
		createScriptSteps.verifySuccessMessage();

	}

}
