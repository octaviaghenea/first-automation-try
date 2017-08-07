package com.sites.dialhub.pages.users;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateUserPage extends PageObject {

	@FindBy(id = "firstname")
	private WebElementFacade firstNameInput;

	@FindBy(id = "lastname")
	private WebElementFacade lastNameInput;

	@FindBy(css = "div.col-md-6 #username")
	private WebElementFacade userNameInput;

	@FindBy(id = "email")
	private WebElementFacade emailInput;

	@FindBy(id = "password")
	private WebElementFacade passwordInput;

	@FindBy(id = "email_notification")
	private WebElementFacade sendInvitationCheckbox;

	@FindBy(css = "button.btn[name]")
	private WebElementFacade saveButton;

	@FindBy(css = "a.btn")
	private WebElementFacade cancelButton;

	@FindBy(css = "div.form-group:nth-child(4) div.col-md-6")
	private WebElementFacade rolesContainer;

	@FindBy(id = "department_id")
	private WebElementFacade departmentContainer;

	public void selectRole(String role) {

		element(rolesContainer).waitUntilVisible();
		List<WebElement> rolesList = rolesContainer.findElements(By.cssSelector("div label[for]"));

		theFor: for (WebElement roleNow : rolesList) {

			String roleText = rolesContainer.getText();
			System.out.println("Roles are: " + roleText);

			if (roleText.toLowerCase().contains(role.toLowerCase())) {

				roleNow.click();
				break theFor;
			}
		}
	}

	public void selectDepartment() {

		element(departmentContainer).click();
		List<WebElement> department = departmentContainer.findElements(By.tagName("option"));

		for (WebElement departmentNow : department) {
			if ("Family Services".equals(departmentNow.getText()))
				departmentNow.click();

		}
	}

	public void enterFirstName(String firstname) {
		firstNameInput.type(firstname);

	}

	public void enterLastName(String lastname) {
		lastNameInput.type(lastname);

	}

	public void enterUserName(String username) {
		userNameInput.type(username);

	}

	public void enterEmailAddress(String email) {
		emailInput.type(email);

	}

	public void enterPassword(String pass) {
		passwordInput.type(pass);

	}

	public void selectEMailInvitation() {
		sendInvitationCheckbox.click();
	}

	public void hitSaveButton() {
		saveButton.click();
	}

	public void hitCancelButton() {
		cancelButton.click();
	}

}
