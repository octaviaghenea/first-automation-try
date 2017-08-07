package com.sites.dialhub.steps.configuration;

import com.sites.dialhub.pages.buttons.CreateButtonsPage;

import net.thucydides.core.annotations.Step;

public class CreateButtonsSteps {
	
	CreateButtonsPage createButtonsPage;
	
	@Step
	public void enterButtonName(String buttonName) {
		createButtonsPage.enterButtonName(buttonName);
	}
	
	@Step
	public void selectDependentButton(String buttonName) {
		createButtonsPage.selectDependentButton(buttonName);
	}

	
	//TODO be consistent in action naming
	@Step
	public void selectProperties(String propertyName) {
		createButtonsPage.selectProperties(propertyName);
	}
	
	@Step
	public void hitSaveButton() {
		createButtonsPage.hitSaveButton();
	}
	
	@Step 
	public void hitCancelButton() {
		createButtonsPage.hitCancelButton();
	}
}
