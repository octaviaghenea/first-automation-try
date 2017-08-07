package com.sites.dialhub.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.configuration.RolesGridSteps;
import com.sites.dialhub.steps.configuration.UsersGridSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class RolesGridTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public LoginSteps loginSteps;
	@Steps
	public UsersGridSteps userGridSteps;
	@Steps
	public RolesGridSteps rolesGridSteps;

	public String baseURL;
	public String userName;
	public String userPass;

	public String menuNavigation;

	@Before
	public void dataSetup() {

		baseURL = "https://dialhub-staging.urnbag.com";
		userName = "admin";
		userPass = "pepsicola";

		menuNavigation = "Configuration > Roles";
	}

	@Test
	public void listRoles() {
		loginSteps.openDialHub(baseURL);
		loginSteps.enterUsername(userName);
		loginSteps.enterPassword(userPass);
		loginSteps.hitSignInButton();

		userGridSteps.navigateToSiteLocation(menuNavigation);
		rolesGridSteps.printRolesList();

		// List<RolesModel> rolesList = rolesGridSteps.printRolesList();
		//
		// for (RolesModel roleNow : rolesList) {
		//
		// System.out.println("data: " + roleNow.getRoleID() + " | " +
		// roleNow.getRoleName() + " | "
		// + roleNow.getEditAction() + " | " + roleNow.getRemoveAction());
		//
		// }

	}

}
