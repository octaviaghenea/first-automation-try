package com.sites.dialhub.steps.dashboard;

import java.util.List;

import com.sites.dialhub.pages.dashboard.DashboardListPage;
import com.sites.dialhub.tools.DashboardModel;

import net.thucydides.core.annotations.Step;

public class DashboardSteps {
	
	DashboardListPage dashboardListPage;
	
	//TODO rename page action and use print utils here
	@Step
	public List<DashboardModel> printList() {
		return dashboardListPage.printDashboardList();
	}

}
