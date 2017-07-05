package com.sites.dialhub.steps.dashboard;

import com.sites.dialhub.pages.dashboard.UsersListPage;

import net.thucydides.core.annotations.Step;

public class DashboardSteps {
	
	UsersListPage usersListPage;
	
	@Step
	public void printList() {
		usersListPage.printDashboardList();
	}

}
