package com.sites.dialhub.steps.dashboard;

import java.util.List;

import com.sites.dialhub.pages.navigation.NavigationPage;
import com.sites.dialhub.pages.roles.RolesGridPage;
import com.sites.dialhub.pages.users.UsersGridPage;
import com.sites.dialhub.tools.RolesModel;

import net.thucydides.core.annotations.Step;

public class RolesGridSteps {

	RolesGridPage rolesGridPage;
	NavigationPage navigationPage;
	UsersGridPage usersGridPage;

	@Step
	public void hoverMenuNavigation(String item) {
		navigationPage.hoverMenuItem(item);
	}

	@Step
	public void selectMenuItem(String item) {
		navigationPage.selectMenuItem(item);
	}

	@Step
	public List<RolesModel> printRolesList() {
		return rolesGridPage.printRolesGrid();
	}
}
