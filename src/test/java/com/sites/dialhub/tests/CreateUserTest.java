package com.sites.dialhub.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.dashboard.CreateUserSteps;
import com.sites.dialhub.steps.dashboard.DashboardSteps;
import com.sites.dialhub.steps.dashboard.RolesGridSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class CreateUserTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public DashboardSteps dashboardSteps;
	@Steps
	public RolesGridSteps rolesGridSteps;
	@Steps
	public CreateUserSteps createUsersteps;

	@Test
	public void createUser() {
		loginSteps.openDialHub("https://dialhub-staging.urnbag.com");
		loginSteps.enterUsername("admin");
		loginSteps.enterPassword("pepsicola");
		loginSteps.hitSignInButton();

		rolesGridSteps.hoverMenuNavigation("Configuration");
		rolesGridSteps.hoverMenuNavigation("Users");
		rolesGridSteps.selectMenuItem("Create user");

		createUsersteps.enterFirstName("Octavia");
		createUsersteps.enterLastName("Ghenea Test");
		createUsersteps.enterUserName("testUserAutomation");
		createUsersteps.selectRole("Family Service Representative");
		createUsersteps.chooseDepartment();
		createUsersteps.enterEmailAddress("otaghenea@test.com");
		createUsersteps.enterPassword("pepsicola");
		createUsersteps.selectEmailInvitation();
		createUsersteps.hitSaveButton();

	}
}
