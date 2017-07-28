package com.sites.dialhub.pages.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateScriptsPage extends PageObject {

	@FindBy(id = "name")
	private WebElementFacade nameInput;

	@FindBy(css = "html #c76dee6e-aaee-43a6-90f5-5023e69db8b4_ifr")
	private WebElementFacade contentInput;

	@FindBy(css = ".Dropdown-root")
	private WebElementFacade displayContainer;

	@FindBy(css = "div.buttons")
	private WebElementFacade buttonsContainer;

	@FindBy(css = ".col-sm-12 button.btn")
	private WebElementFacade saveButton;

	@FindBy(css = "a.btn")
	private WebElementFacade cancelButton;

	public void enterScriptName(String name) {
		nameInput.type(name);
	}

	public void enterContent(String content) {
		
		
		
		
		
		contentInput.type(content);
	}

	public void selectDisplay() {
		//element(displayContainer).isEnabled();
		element(displayContainer).submit();
		
		List<WebElement> displayOptions = displayContainer.findElements(By.tagName("class"));
		for (WebElement displayOptionNow : displayOptions) {
			
			String displayOptionText = displayContainer.getText();
			System.out.println("Display options are: " + displayOptionText);
			
			if("Enable".equals(displayOptionNow.getText())) 
				displayOptionNow.click();
			
		}
		
		//element(displayContainer).selectByVisibleText("Enable");
	}

	public void selectButton(String button) {

		element(buttonsContainer).waitUntilVisible();

		List<WebElement> buttonsList = buttonsContainer.findElements(By.cssSelector("label[for]"));

		theFor: for (WebElement buttonNow : buttonsList) {

			String buttonText = buttonNow.getText();
			System.out.println("Buttons are: " + buttonText);

			if (buttonText.toLowerCase().contains(button.toLowerCase())) {
				buttonNow.click();
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
