package com.sites.dialhub.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.dashboard.ScriptsGridSteps;

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
	public ScriptsGridSteps sciptsGridSteps;

	@Test
	public void listScripts() {

		loginSteps.openDialHub("https://dialhub-staging.urnbag.com");
		loginSteps.enterUsername("admin");
		loginSteps.enterPassword("pepsicola");
		loginSteps.hitSignInButton();

		sciptsGridSteps.hoverMenuItems("Configuration");
		sciptsGridSteps.hoverMenuItems("Scripts");
		sciptsGridSteps.selectMenuItem("Scripts");
		sciptsGridSteps.printScriptsGrid();

	}

}
