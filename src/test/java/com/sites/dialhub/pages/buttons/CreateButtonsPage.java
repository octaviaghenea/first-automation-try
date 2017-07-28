package com.sites.dialhub.pages.buttons;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CreateButtonsPage extends PageObject {

	@FindBy(id = "title")
	private WebElementFacade nameInput;

	@FindBy(css = "div.form-group:nth-child(2) div.col-md-6")
	private WebElementFacade buttonsContainer;

	@FindBy(css = "div.form-group:nth-child(3) div.col-md-6")
	private WebElementFacade propertiesContainer;

	@FindBy(css = "button.btn[name]")
	private WebElementFacade saveButton;

	@FindBy(css = "a.btn")
	private WebElementFacade cancelButton;

	public void enterButtonName(String buttonName) {
		nameInput.type(buttonName);
	}

	public void selectDependentButton(String button) {

		element(buttonsContainer.waitUntilVisible());

		List<WebElement> buttonsList = buttonsContainer.findElements(By.cssSelector("label[for]"));

		theFor: for (WebElement buttonNow : buttonsList) {

			String buttonText = buttonNow.getText();
			System.out.println("Buttons is: " + buttonText);

			if (buttonText.toLowerCase().contains(button.toLowerCase())) {
				buttonNow.click();

				break theFor;
			}

		}

	}

	public void selectProperties(String property) {

		element(propertiesContainer).waitUntilVisible();

		List<WebElement> propertyList = propertiesContainer.findElements(By.cssSelector("label[for]"));

		theFor: for (WebElement propertyNow : propertyList) {

			String propertyText = propertyNow.getText();
			System.out.println("Property is: " + propertyText);

			if (propertyText.toLowerCase().contains(property.toLowerCase())) {
				propertyNow.click();

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
}
