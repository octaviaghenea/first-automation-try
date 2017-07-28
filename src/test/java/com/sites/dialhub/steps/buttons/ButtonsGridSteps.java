package com.sites.dialhub.steps.buttons;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.sites.dialhub.pages.buttons.ButtonsGridPage;
import com.sites.dialhub.pages.navigation.NavigationPage;

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
	public List<WebElement> printButtonsGrid() {
		return buttonsGridPage.printButtonsGrid();
	}
}
