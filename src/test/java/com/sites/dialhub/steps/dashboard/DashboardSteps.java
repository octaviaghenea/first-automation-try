package com.sites.dialhub.steps.dashboard;

import java.util.List;

import com.sites.dialhub.pages.dashboard.UsersListPage;
import com.sites.dialhub.tools.DashboardModel;

import net.thucydides.core.annotations.Step;

public class DashboardSteps {
	
	UsersListPage usersListPage;
	
	@Step
	public List<DashboardModel> printList() {
		return usersListPage.printDashboardList();
	}

}
