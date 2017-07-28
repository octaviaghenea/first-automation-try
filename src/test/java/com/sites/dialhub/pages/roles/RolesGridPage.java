package com.sites.dialhub.pages.roles;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sites.dialhub.tools.RolesModel;

import net.serenitybdd.core.pages.PageObject;

public class RolesGridPage extends PageObject {

	public List<RolesModel> printRolesGrid() {

		List<WebElement> rolesGrid = getDriver().findElements(By.cssSelector("tbody tr"));

		List<RolesModel> results = new ArrayList<RolesModel>();

		for (WebElement roleNow : rolesGrid) {

			RolesModel rolesResults = new RolesModel();

			String roleID = roleNow.findElement(By.cssSelector("td:nth-child(1)")).getText();
			String roleName = roleNow.findElement(By.cssSelector("td:nth-child(2)")).getText();
			String editAction = roleNow.findElement(By.cssSelector("td:nth-child(3) a.edit")).getText();
			String removeAction = roleNow.findElement(By.cssSelector("td:nth-child(3) a.remove")).getText();

			rolesResults.setRoleID(roleID);
			rolesResults.setRoleName(roleName);
			rolesResults.setEditAction(editAction);
			rolesResults.setRemoveAction(removeAction);

			// System.out.println("print id: " + roleID);
			// System.out.println("print role: " + roleName);
			// System.out.println("print actions: " + editAction);
			// System.out.println("print actions: " + removeAction);

			results.add(rolesResults);

		}

		return results;

	}
}
