package com.sites.dialhub.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.dashboard.CreateButtonsSteps;
import com.sites.dialhub.steps.dashboard.RolesGridSteps;

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

	@Test
	public void createButtons() {
		loginSteps.openDialHub("https://dialhub-staging.urnbag.com");
		loginSteps.enterUsername("admin");
		loginSteps.enterPassword("pepsicola");
		loginSteps.hitSignInButton();

		rolesGridSteps.hoverMenuNavigation("Configuration");
		rolesGridSteps.hoverMenuNavigation("Buttons");
		rolesGridSteps.selectMenuItem("Create button");

		createButtonSteps.enterButtonName("Test button");
		createButtonSteps.selectDependentButton("5. Order Cancellation");
		createButtonSteps.selectDependentButton("6. Product Damaged");
		createButtonSteps.selectProperty("Order No.");
		createButtonSteps.selectProperty("PM No.");
		createButtonSteps.hitSaveButton();
	}

}
