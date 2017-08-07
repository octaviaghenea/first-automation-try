package com.sites.dialhub.pages.scripts;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateScriptsPage extends PageObject {

	@FindBy(id = "name")
	private WebElementFacade nameInput;

	@FindBy(css = "body")
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

		waitABit(3000);
		WebElement iframeElement = getDriver().findElement(By.cssSelector("iframe"));
		getDriver().switchTo().frame(iframeElement);

		contentInput.type(content);
		getDriver().switchTo().defaultContent();
	}

	public void selectDisplay(String labelValue) {

		element(By.cssSelector("div.Dropdown-placeholder")).click();

		List<WebElement> optionsList = getDriver().findElements(By.cssSelector(".Dropdown-option"));

		for (WebElement webElement : optionsList) {
			if (webElement.getText().contains(labelValue)) {
				webElement.click();
				break;
			}
			System.out.println(webElement.getText());
		}
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

	public void verifySuccessMessage() throws InterruptedException {
		String actual_message = getDriver().findElement(By.cssSelector(".messagesReact p.message-text")).getText();
		Thread.sleep(2000);
		System.out.println("message is:" + actual_message);
		String expected_message = "The script was created with success.";
		// System.out.println("Error is: " + expected_message);
		Assert.assertEquals(actual_message, expected_message);

	}
}
