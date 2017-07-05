package com.sites.dialhub.steps;

import com.sites.dialhub.pages.account.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage loginPage; 
	
	@Step
	public void openDialHub(String url) {
		loginPage.getDriver().get(url);
	}
	
	@Step
	public void enterUsername(String username) {
		loginPage.enterUsername(username);
	}
	
	@Step
	public void enterPassword(String pass) {
		loginPage.enterPassword(pass);
	}
	
	
	@Step
	public void hitSignInButton() {
		loginPage.clickSignInButton();
	}
	
	
}
