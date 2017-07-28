package com.sites.dialhub.steps.dashboard;

import com.sites.dialhub.pages.users.CreateUserPage;

import net.thucydides.core.annotations.Step;

public class CreateUserSteps {

	CreateUserPage createUserPage;

	@Step
	public void enterFirstName(String firstname) {
		createUserPage.enterFirstName(firstname);

	}

	@Step
	public void enterLastName(String lastname) {
		createUserPage.enterLastName(lastname);

	}

	@Step
	public void enterUserName(String username) {
		createUserPage.enterUserName(username);

	}

	@Step
	public void selectRole(String role) {
		createUserPage.selectRole(role);
	}

	@Step
	public void chooseDepartment() {
		createUserPage.selectDepartment();
	}

	@Step
	public void enterEmailAddress(String email) {
		createUserPage.enterEmailAddress(email);

	}

	@Step
	public void enterPassword(String password) {
		createUserPage.enterPassword(password);

	}

	@Step
	public void selectEmailInvitation() {
		createUserPage.selectEMailInvitation();

	}

	@Step
	public void hitSaveButton() {
		createUserPage.hitSaveButton();

	}

	@Step
	public void hitCancelButton() {
		createUserPage.hitCancelButton();

	}

}
