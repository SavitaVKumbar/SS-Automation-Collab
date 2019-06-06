package com.pageobjects.ss;

import java.util.List;

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
	
		@FindBy(xpath = "//table[@class='v-hr-tbl']/tbody/tr[contains(@id, 'tr-region-')]")
		public List<WebElement> regionRows;
		
		@FindBy(xpath = "//table[@class='v-hr-tbl']/tbody/tr[contains(@id, 'tr-region-')]/td[@class='v-tbl-name']")
		public List<WebElement> regionNames;
		
		@FindBy(xpath = "//table[@class='v-hr-tbl']/tbody/tr[contains(@id, 'tr-region-')]/td[@class='v-tbl-line']")
		public List<WebElement> regionRightArrows;
		
		@FindBy(xpath = "//table[@class='v-hr-tbl']/tbody/tr[contains(@id, 'tr-branch-row')]")
		public List<WebElement> branchRows;
		
		@FindBy(xpath = "//table[@class='v-hr-tbl']/tbody/tr[contains(@id, 'tr-branch-row')]/td[@class = 'v-tbl-name']")
		public List<WebElement> branchNames;

		@FindBy(xpath = "//table[@class='v-hr-tbl']/tbody/tr[contains(@id, 'tr-branch-row')]/td[@class = 'v-tbl-line']")
		public List<WebElement> branchRightArrows;
		
		@FindBy(xpath = "//table[@class='v-hr-tbl']/tbody/tr[contains(@id, 'user-row-')]/td[@class = 'v-tbl-name']")
		public List<WebElement> agentNames;
		
		@FindBy(xpath = "//table[@class='v-hr-tbl']/tbody/tr[contains(@id, 'user-row-')]/td[@class = 'v-tbl-btns v-tbl-btns-hr']/div/div[6]")
		public List<WebElement> agentsLoginAs;
		
		@FindBy(xpath = "//table[@class='v-hr-tbl']/tbody/tr[contains(@id, 'user-row-')]/td[@class = 'v-tbl-btns v-tbl-btns-hr']/div/div[5]")
		public List<WebElement> agentQuickEditButtons;
		
		@FindBy(xpath = "//table[@class='v-hr-tbl']/tbody/tr[contains(@id, 'user-row-')]/td[@class = 'v-tbl-btns v-tbl-btns-hr']/div/div[4]")
		public List<WebElement> agentDeleteButtons;
		
		@FindBy(xpath = "//div[@id='overlay-continue']")
		public WebElement deleteButton;
		
		@FindBy(xpath = "//div[@id='overlay-cancel']")
		public WebElement canceButton;

		@FindBy(xpath = "//div[@id='overlay-header']")
		public WebElement popupHeader;
		
		@FindBy(xpath = "//span[@id='err-nw-txt']")
		public WebElement successMessage;
		
}
