package com.sites.dialhub.steps.dashboard;

import com.sites.dialhub.pages.scripts.CreateScriptsPage;

import net.thucydides.core.annotations.Step;

public class CreateScriptSteps {
	
	CreateScriptsPage createScriptsPage;
	
	@Step
	public void enterScriptName(String scriptName) {
		createScriptsPage.enterScriptName(scriptName);
	}

	@Step
	public void enterContent(String contentText) {
		createScriptsPage.enterContent(contentText);
	}
	
	@Step
	public void selectDisplay(String label) {
		createScriptsPage.selectDisplay(label);
	}
	
	@Step
	public void selectButtons(String buttonText) {
		createScriptsPage.selectButton(buttonText);
	}
	
	@Step
	public void hitSaveButton() {
		createScriptsPage.hitSaveButton();
	}
	
	@Step
	public void hitCancelButton() {
		createScriptsPage.hitCancelButton();
	}
	
	
}
