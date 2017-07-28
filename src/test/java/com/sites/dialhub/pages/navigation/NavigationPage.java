package com.sites.dialhub.pages.navigation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class NavigationPage extends PageObject {

	@FindBy(css = "ul.menu-items")
	private WebElement menuItemsContainer;

	public void hoverMenuItem(String item) {

		element(menuItemsContainer).waitUntilVisible();

		List<WebElement> itemsList = menuItemsContainer.findElements(By.cssSelector("li > a"));

		theFor: for (WebElement itemNow : itemsList) {

			String itemText = itemNow.getText();
			System.out.println("Category: " + itemText);
			if (itemText.toLowerCase().contains(item.toLowerCase())) {
				Actions action = new Actions(getDriver());
				action.moveToElement(itemNow).build().perform();
				break theFor;
			}
		}
	}
	
	public void selectMenuItem(String item) {
		
		element(menuItemsContainer).waitUntilVisible();
		
		List<WebElement> itemsList = menuItemsContainer.findElements(By.cssSelector("li > a"));
		
		theFor: for (WebElement itemNow : itemsList) {
			
			String itemText = itemNow.getText();
			System.out.println("Category:" + itemText);
			if (itemText.toLowerCase().contains(item.toLowerCase())) {
				itemNow.click();
				break theFor;
			}
		}
	}

}
