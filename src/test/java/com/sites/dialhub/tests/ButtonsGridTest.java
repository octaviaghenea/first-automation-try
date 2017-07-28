package com.sites.dialhub.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.buttons.ButtonsGridSteps;
import com.sites.dialhub.steps.dashboard.UsersGridSteps;

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

	@Test
	public void listButons() {
		loginSteps.openDialHub("https://dialhub-staging.urnbag.com");
		loginSteps.enterUsername("admin");
		loginSteps.enterPassword("pepsicola");
		loginSteps.hitSignInButton();

		usersGridSteps.hoverMenuNavigation("Configuration");
		usersGridSteps.hoverMenuNavigation("Buttons");
		usersGridSteps.selectMenuItem("Buttons");
		buttonsGridSteps.printButtonsGrid();

	}

}
