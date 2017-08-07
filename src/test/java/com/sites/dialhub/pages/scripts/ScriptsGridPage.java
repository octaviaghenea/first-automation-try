package com.sites.dialhub.pages.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.sites.dialhub.tools.ScriptsModel;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class ScriptsGridPage extends PageObject {

	// TODO extract data from page and print somewhere else
	public List<ScriptsModel> printScriptsGrid() {

		List<WebElement> scriptsGrid = getDriver().findElements(By.cssSelector("tbody tr"));

		List<ScriptsModel> results = new ArrayList<ScriptsModel>();

		for (WebElement scriptNow : scriptsGrid) {

			ScriptsModel scriptsResults = new ScriptsModel();

			String scriptName = scriptNow.findElement(By.cssSelector("td:nth-child(2)")).getText();
			String scriptStatus = scriptNow.findElement(By.cssSelector("td:nth-child(3)")).getText();
			String editAction = scriptNow.findElement(By.cssSelector("td:nth-child(4) a.edit")).getText();
			String removeAction = scriptNow.findElement(By.cssSelector("td:nth-child(4) a.remove")).getText();

			System.out.println("Name " + scriptName);
			System.out.println("Status " + scriptStatus);
			System.out.println("Edit: " + editAction);
			System.out.println("Remove " + removeAction);

			results.add(scriptsResults);

		}

		return results;
	}
}
