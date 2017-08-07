package com.sites.dialhub.steps.configuration;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.sites.dialhub.pages.navigation.NavigationPage;
import com.sites.dialhub.pages.users.UsersGridPage;
import com.sites.dialhub.tools.Constants;

import net.thucydides.core.annotations.Step;

public class UsersGridSteps {

	NavigationPage navigationPage;
	UsersGridPage usersGridPage;

	@Step
	public List<WebElement> printUsersGrid() {
		return usersGridPage.printUsersGrid();
	}

	@Step
	public void navigateToSiteLocation(String menuNavigation) {
		String[] menuItems = menuNavigation.split(Constants.PATH_SEPARATOR);
		int index = 0;

		for (String currentMenuItem : menuItems) {
			
			System.out.println("index: " + index + "  -- length: " + menuItems.length);
			if (index < menuItems.length-1) {
				hoverMenuNavigation(currentMenuItem);
			} else {
				selectMenuItem(currentMenuItem);
			}
			index++;
		}
	}

	@Step
	public void hoverMenuNavigation(String item) {
		navigationPage.hoverMenuItem(item);
	}

	@Step
	public void selectMenuItem(String item) {
		navigationPage.selectMenuItem(item);
	}

}
