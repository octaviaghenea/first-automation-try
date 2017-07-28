package com.sites.dialhub.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.dashboard.CreateRoleSteps;
import com.sites.dialhub.steps.dashboard.DashboardSteps;
import com.sites.dialhub.steps.dashboard.RolesGridSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class CreateRoleTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public DashboardSteps dashboardSteps;
	@Steps
	public RolesGridSteps rolesGridSteps;
	@Steps
	public CreateRoleSteps createRolesteps;

	@Test
	public void createRoles() {
		loginSteps.openDialHub("https://dialhub-staging.urnbag.com");
		loginSteps.enterUsername("admin");
		loginSteps.enterPassword("pepsicola");
		loginSteps.hitSignInButton();

		rolesGridSteps.hoverMenuNavigation("Configuration");
		rolesGridSteps.hoverMenuNavigation("Roles");
		rolesGridSteps.selectMenuItem("Create role");

		createRolesteps.enterRoleName("TEST ROLE");
		createRolesteps.selectPermission("CREATE USER");
		createRolesteps.selectPermission("CREATE SCRIPTS");
		createRolesteps.hitSaveButton();

	}
}
