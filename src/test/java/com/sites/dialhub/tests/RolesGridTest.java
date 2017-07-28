package com.sites.dialhub.tests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.sites.dialhub.steps.LoginSteps;
import com.sites.dialhub.steps.dashboard.DashboardSteps;
import com.sites.dialhub.steps.dashboard.RolesGridSteps;
import com.sites.dialhub.tools.RolesModel;

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
	public DashboardSteps dashboardSteps;
	@Steps
	public RolesGridSteps rolesGridSteps;

	@Test
	public void listRoles() {
		loginSteps.openDialHub("https://dialhub-staging.urnbag.com");
		loginSteps.enterUsername("admin");
		loginSteps.enterPassword("pepsicola");
		loginSteps.hitSignInButton();

		rolesGridSteps.hoverMenuNavigation("Configuration");
		rolesGridSteps.hoverMenuNavigation("Roles");
		rolesGridSteps.selectMenuItem("Roles");

		List<RolesModel> rolesList = rolesGridSteps.printRolesList();

		for (RolesModel roleNow : rolesList) {

			System.out.println("data: " + roleNow.getRoleID() + " | " + roleNow.getRoleName() + " | "
					+ roleNow.getEditAction() + " | " + roleNow.getRemoveAction());

		}

	}

}
