package com.sites.dialhub.steps.dashboard;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.sites.dialhub.pages.navigation.NavigationPage;
import com.sites.dialhub.pages.users.UsersGridPage;

import net.thucydides.core.annotations.Step;

public class UsersGridSteps {

	NavigationPage navigationPage;
	UsersGridPage usersGridPage;

	@Step
	public List<WebElement> printUsersGrid() {
		return usersGridPage.printUsersGrid();
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
