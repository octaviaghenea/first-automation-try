package com.sites.dialhub.pages.users;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class UsersGridPage extends PageObject {

	public List<WebElement> printUsersGrid() {

		List<WebElement> usersGrid = getDriver().findElements(By.cssSelector("tbody tr"));

		for (WebElement userNow : usersGrid) {
			
			String userID = userNow.findElement(By.cssSelector("td:nth-child(1)")).getText();
			String userName = userNow.findElement(By.cssSelector("td:nth-child(2)")).getText();
			String roleName = userNow.findElement(By.cssSelector("td:nth-child(3)")).getText();
			String editAction = userNow.findElement(By.cssSelector("td:nth-child(4) a.edit")).getText();
			String disableAction = userNow.findElement(By.cssSelector("td:nth-child(4) a.remove")).getText();
			
			
			System.out.println("ID: " + userID);
			System.out.println("User: " + userName);
			System.out.println("Role: " + roleName);
			System.out.println("Edit: " + editAction);
			System.out.println("Disable: " + disableAction);

		}
		return usersGrid;

	}

}
