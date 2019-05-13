package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageTeamPage {
	
	public ManageTeamPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='hm-header-row hm-header-row-main clearfix']/div[contains(text(), 'Add Team Members')]")
	public WebElement addTeamMembersButton;
	
	@FindBy(xpath = "//div[@class='hm-header-row hm-header-row-main clearfix']/div[contains(text(), 'View Hierarchy')]")
	public WebElement viewHierarchyButton;
	
	@FindBy(xpath = "//table[@class='v-um-tbl']")
	public WebElement usersTable;

	@FindBy(xpath = "//div[text()='Login']")
	public WebElement loginAsUserButton;
	
	@FindBy(xpath = "//input[@id = 'ms-search-users-key']")
	public WebElement searchInputTextBox;
	
	@FindBy(xpath = "//span[@id='um-search-icn']")
	public WebElement searchIcon;
	
	@FindBy(xpath = "//table[@class='v-um-tbl ms-tbl-margin']/tbody/tr[2]/td[2]")
	public WebElement agentName;
	
	@FindBy(xpath = "//table[@class='v-um-tbl ms-tbl-margin']/tbody/tr[2]/td[9]/div[2]/div[text() = 'Login']")
	public WebElement agentLoginAs;
	
}
