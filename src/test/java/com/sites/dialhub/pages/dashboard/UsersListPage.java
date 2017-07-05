package com.sites.dialhub.pages.dashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class UsersListPage extends PageObject {

	public void printDashboardList() {

		List<WebElement> usersList = getDriver().findElements(By.cssSelector("tbody tr"));

		for (WebElement userNow : usersList) {

			String users = userNow.findElement(By.cssSelector("td:nth-child(2) pre")).getText();

			String reason = userNow.findElement(By.cssSelector("td:nth-child(3) pre")).getText();

			String callDuration = userNow.findElement(By.cssSelector("td:nth-child(4) pre")).getText();

			String dateTime = userNow.findElement(By.cssSelector("td:nth-child(5) pre")).getText();

			System.out.println("name: " + users);
			
			System.out.println("reason: " + reason);
			
			System.out.println("call duration: " + callDuration);
			
			System.out.println("timeFrame: " + dateTime);
		}

	}

}
