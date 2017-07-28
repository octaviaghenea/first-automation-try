package com.sites.dialhub.steps.dashboard;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.sites.dialhub.pages.navigation.NavigationPage;
import com.sites.dialhub.pages.scripts.ScriptsGridPage;

import net.thucydides.core.annotations.Step;

public class ScriptsGridSteps {

	NavigationPage navigationPage;
	ScriptsGridPage scriptsGridPage;

	@Step
	public void hoverMenuItems(String item) {
		navigationPage.hoverMenuItem(item);
	}

	@Step
	public void selectMenuItem(String item) {
		navigationPage.selectMenuItem(item);
	}

	@Step
	public List<WebElement> printScriptsGrid() {
		return scriptsGridPage.printScriptsGrid();
	}
}
