package com.sites.dialhub.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.configuration.CreateRoleSteps;
import com.sites.dialhub.steps.configuration.RolesGridSteps;
import com.sites.dialhub.steps.configuration.UsersGridSteps;

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
	public RolesGridSteps rolesGridSteps;
	@Steps
	public CreateRoleSteps createRolesteps;
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

		menuNavigation = "Configuration > Roles > Create role";
	}

	@Test
	public void createRoles() {
		loginSteps.openDialHub(baseURL);
		loginSteps.enterUsername(userName);
		loginSteps.enterPassword(userPass);
		loginSteps.hitSignInButton();

		userGridSteps.navigateToSiteLocation(menuNavigation);
		createRolesteps.enterRoleName("Test new");
		createRolesteps.selectPermission("CREATE USER");
		createRolesteps.selectPermission("CREATE SCRIPTS");
		createRolesteps.hitSaveButton();
		createRolesteps.verifySuccessMessage();

	}
}
