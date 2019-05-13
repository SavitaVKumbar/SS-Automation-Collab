package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentDashboardPage {

	public AgentDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='prof-image-edit']")
	public WebElement profileImageOfAgent;
	
	@FindBy(xpath = "//div[@id='lead-prof-image-edit']")
	public WebElement leadProfileImage;
	
	@FindBy(xpath = "//div[@id='hdr-dashboard-dropdown']")
	public WebElement dashboardDropDown;
	
	@FindBy(xpath = "//a[@id='dashboard-link']")
	public WebElement dashboardLink;

	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown-dash']/div[2]")
	public WebElement reportingDropDownItem;
	
	@FindBy(xpath = "//a[text()='Edit Profile']")
	public WebElement editProfileLink;
	
	@FindBy(xpath = "//a[text()='Help']")
	public WebElement helpLink;
	
	@FindBy(xpath = "//a[text()='Configure']")
	public WebElement configureLink;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown']/div[2]")
	public WebElement javascriptWidgetLink;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown']/div[3]")
	public WebElement appsLink;
	
	@FindBy(xpath = "//div[@id='hdr-usr-img']")
	public WebElement userImage;
	
	@FindBy(xpath = "//div[@id='change-password']")
	public WebElement changePasswordItem;
	
	@FindBy(xpath = "//div[@id='change-password']/following-sibling::div")
	public WebElement switchToAdminItem;
	
	@FindBy(xpath = "//div[@id='user-logout']")
	public WebElement logoutItem;

}
