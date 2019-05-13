package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewHierarchyPage {

		public ViewHierarchyPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//table[@class='v-hr-tbl']")
		public WebElement hierarchyTable;
	
}
