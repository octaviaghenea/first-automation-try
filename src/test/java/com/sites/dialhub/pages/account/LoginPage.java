package com.sites.dialhub.pages.account;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

	@FindBy(id = "username")
	private WebElementFacade usernameInput;

	@FindBy(id = "password")
	private WebElementFacade passwordInput;

	@FindBy(css = "button[type]")
	private WebElementFacade signinButton;

	public void enterUsername(String username) {
		usernameInput.type(username);
	}

	public void enterPassword(String password) {
		passwordInput.type(password);
	}

	public void clickSignInButton() {
		signinButton.click();
	}

}
