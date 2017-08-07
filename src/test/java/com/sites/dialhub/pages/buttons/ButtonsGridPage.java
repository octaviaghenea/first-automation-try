package com.sites.dialhub.pages.buttons;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sites.dialhub.tools.ButtonsModel;

import net.serenitybdd.core.pages.PageObject;

public class ButtonsGridPage extends PageObject {
	
	public List<ButtonsModel> printButtonsGrid() {
		
		List<WebElement> buttonsGrid = getDriver().findElements(By.cssSelector("tbody tr"));
		List<ButtonsModel> results = new ArrayList<ButtonsModel>();
		
		for (WebElement buttonNow : buttonsGrid) {
			ButtonsModel itemNow = new ButtonsModel();
			
			String buttonID = buttonNow.findElement(By.cssSelector("td:nth-child(1)")).getText();
			String buttonName = buttonNow.findElement(By.cssSelector("td:nth-child(2)")).getText();
			String buttonDependency = buttonNow.findElement(By.cssSelector("td:nth-child(3)")).getText();
			String buttonLevel = buttonNow.findElement(By.cssSelector("td:nth-child(4)")).getText();
			String editAction = buttonNow.findElement(By.cssSelector("td:nth-child(5) a.edit")).getText();
			String removeAction = buttonNow.findElement(By.cssSelector("td:nth-child(5) a.remove")).getText();
			
			//populate itemNow
			System.out.println("ID: " + buttonID);
			System.out.println("Name: " + buttonName);
			System.out.println("Dependency: " + buttonDependency);
			System.out.println("Level: " + buttonLevel);
			System.out.println("Edit: " + editAction);
			System.out.println("Remove: " + removeAction);
			results.add(itemNow);
		}
		
		return results;
	}

}
