package com.sites.dialhub.steps.configuration;

import java.util.List;

import com.sites.dialhub.pages.navigation.NavigationPage;
import com.sites.dialhub.pages.scripts.ScriptsGridPage;
import com.sites.dialhub.tools.ScriptsModel;

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
	public List<ScriptsModel> printScriptsGrid() {
		return scriptsGridPage.printScriptsGrid();
	}
}
