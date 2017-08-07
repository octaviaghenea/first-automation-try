package com.sites.dialhub.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.configuration.CreateButtonsSteps;
import com.sites.dialhub.steps.configuration.RolesGridSteps;
import com.sites.dialhub.steps.configuration.UsersGridSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class CreateButtonTest {

	@Managed(uniqueSession = true)
	public WebDriver webDriver;

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public RolesGridSteps rolesGridSteps;
	@Steps
	public CreateButtonsSteps createButtonSteps;
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

		menuNavigation = "Configuration > Buttons > Create button";
	}

	@Test
	public void createButtons() {
		loginSteps.openDialHub(baseURL);
		loginSteps.enterUsername(userName);
		loginSteps.enterPassword(userPass);
		loginSteps.hitSignInButton();

		userGridSteps.navigateToSiteLocation(menuNavigation);
		createButtonSteps.enterButtonName("Test new");
		createButtonSteps.selectDependentButton("6. Product Damaged");
		createButtonSteps.selectProperties("Order No.");
		createButtonSteps.selectProperties("PM No.");
		createButtonSteps.hitSaveButton();
	}

}
