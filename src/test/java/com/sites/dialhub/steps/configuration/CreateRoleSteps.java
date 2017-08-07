package com.sites.dialhub.steps.configuration;

import com.sites.dialhub.pages.roles.CreateRolePage;

import net.thucydides.core.annotations.Step;

public class CreateRoleSteps {

	CreateRolePage createRolePage;

	@Step
	public void enterRoleName(String name) {
		createRolePage.enterRoleName(name);
	}

	@Step
	public void selectPermission(String permission) {
		createRolePage.selectAccessPermission(permission);
	}

	@Step
	public void hitSaveButton() {
		createRolePage.hitSaveButton();
	}

	@Step
	public void hitCancelButton() {
		createRolePage.hitCancelButton();
	}
	
	@Step
	public void verifySuccessMessage() {
		createRolePage.verifySuccessMessage();
	}
}
