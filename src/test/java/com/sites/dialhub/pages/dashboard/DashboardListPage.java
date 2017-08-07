package com.sites.dialhub.pages.dashboard;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sites.dialhub.tools.DashboardModel;

import net.serenitybdd.core.pages.PageObject;

public class DashboardListPage extends PageObject {

	public List<DashboardModel> printDashboardList() {

		List<WebElement> usersList = getDriver().findElements(By.cssSelector("tbody tr"));
		List<DashboardModel> results = new ArrayList<DashboardModel>();

		for (WebElement userNow : usersList) {

			DashboardModel usersResults = new DashboardModel();

			String user = userNow.findElement(By.cssSelector("td:nth-child(2) pre")).getText();

			String reason = userNow.findElement(By.cssSelector("td:nth-child(3) pre")).getText();

			String callDuration = userNow.findElement(By.cssSelector("td:nth-child(4) pre")).getText();

			String dateTime = userNow.findElement(By.cssSelector("td:nth-child(5) pre")).getText();

			usersResults.setUserName(user);
			usersResults.setCallReason(reason);
			usersResults.setCallDuration(callDuration);
			usersResults.setDateTime(dateTime);

			results.add(usersResults);

		}

		return results;

	}

}
