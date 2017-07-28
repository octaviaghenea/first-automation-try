package com.sites.dialhub.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.dashboard.CreateScriptSteps;
import com.sites.dialhub.steps.dashboard.RolesGridSteps;

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

	@Test
	public void createScript() {
		loginSteps.openDialHub("https://dialhub-staging.urnbag.com");
		loginSteps.enterUsername("admin");
		loginSteps.enterPassword("pepsicola");
		loginSteps.hitSignInButton();

		rolesGridSteps.hoverMenuNavigation("Configuration");
		rolesGridSteps.hoverMenuNavigation("Scripts");
		rolesGridSteps.selectMenuItem("Create script");

		createScriptSteps.enterScriptName("Script Test Automation");
		createScriptSteps.enterContent(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
						+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in "
						+ "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa "
						+ "qui officia deserunt mollit anim id est laborum");
		createScriptSteps.selectDisplay("Disable");
		createScriptSteps.selectButtons("Order Status / Tracking Info");
		createScriptSteps.hitSaveButton();

	}

}
