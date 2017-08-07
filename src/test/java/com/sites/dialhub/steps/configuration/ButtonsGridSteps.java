package com.sites.dialhub.steps.configuration;

import java.util.List;

import com.sites.dialhub.pages.buttons.ButtonsGridPage;
import com.sites.dialhub.pages.navigation.NavigationPage;
import com.sites.dialhub.tools.ButtonsModel;

import net.thucydides.core.annotations.Step;

public class ButtonsGridSteps {

	ButtonsGridPage buttonsGridPage;
	NavigationPage navigationPage;

	@Step
	public void hoverMenuNavigation(String item) {
		navigationPage.hoverMenuItem(item);
	}

	@Step
	public void selectMenuItem(String item) {
		navigationPage.selectMenuItem(item);
	}

	@Step
	public List<ButtonsModel> printButtonsGrid() {
		return buttonsGridPage.printButtonsGrid();
	}
}
