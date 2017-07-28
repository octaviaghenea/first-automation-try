package com.sites.dialhub.pages.buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class ButtonsGridPage extends PageObject {
	
	public List<WebElement> printButtonsGrid() {
		
		List<WebElement> buttonsGrid = getDriver().findElements(By.cssSelector("tbody tr"));
		
		for (WebElement buttonNow : buttonsGrid) {
			
			String buttonID = buttonNow.findElement(By.cssSelector("td:nth-child(1)")).getText();
			String buttonName = buttonNow.findElement(By.cssSelector("td:nth-child(2)")).getText();
			String buttonDependency = buttonNow.findElement(By.cssSelector("td:nth-child(3)")).getText();
			String buttonLevel = buttonNow.findElement(By.cssSelector("td:nth-child(4)")).getText();
			String editAction = buttonNow.findElement(By.cssSelector("td:nth-child(5) a.edit")).getText();
			String removeAction = buttonNow.findElement(By.cssSelector("td:nth-child(5) a.remove")).getText();
			
			System.out.println("ID: " + buttonID);
			System.out.println("ID: " + buttonName);
			System.out.println("ID: " + buttonDependency);
			System.out.println("ID: " + buttonLevel);
			System.out.println("ID: " + editAction);
			System.out.println("ID: " + removeAction);
			
		}
		
		return buttonsGrid;
	}

}
