package com.sites.dialhub.pages.roles;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateRolePage extends PageObject {

	@FindBy(id = "name")
	private WebElementFacade roleNameInput;

	@FindBy(css = "div.form-group:nth-child(2) div.col-md-6")
	private WebElement accessPermissionsContainer;

	@FindBy(css = "a.btn")
	private WebElementFacade cancelButton;

	@FindBy(css = "button.btn[name]")
	private WebElementFacade saveButton;

	public void enterRoleName(String roleName) {
		roleNameInput.type(roleName);
	}

	public void selectAccessPermission(String persmission) {

		element(accessPermissionsContainer).waitUntilVisible();

		List<WebElement> permissionsList = accessPermissionsContainer.findElements(By.cssSelector("label[for]"));

		theFor: for (WebElement permissionNow : permissionsList) {

			String permissionText = permissionNow.getText();
			System.out.println("Permission is:" + permissionText);

			if (permissionText.toLowerCase().contains(persmission.toLowerCase())) {
				permissionNow.click();

				break theFor;
			}

		}

	}

	public void hitSaveButton() {
		saveButton.click();
	}

	public void hitCancelButton() {
		cancelButton.click();
	}

	public void verifySuccessMessage() {
		element(".messages.success .message-text").waitUntilVisible();
		String actual_message = getDriver().findElement(By.cssSelector(".messages.success .message-text")).getText();
		System.out.println("message is:" + actual_message);
		String expected_message = "The role was created with success.";
		Assert.assertEquals(actual_message, expected_message);

	}
}
