package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInPage {
	
	public LinkedInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-checkmark']")
	public WebElement securityCheckBox;
	
	@FindBy(xpath = "//span[@id='notifications-tab-icon']")
	public WebElement notificationBellIcon;
	
	@FindBy(xpath = "//span[text()='View your post']")
	public WebElement viewYourPostButton;
	
	@FindBy(xpath = "//div[@dir='ltr'][1]")
	public WebElement postTextDiv;
	
	@FindBy(xpath = "//button[@id='nav-settings__dropdown-trigger']")
	public WebElement myProfileDropDown;
	
	@FindBy(xpath = "//a[text()='Posts & Activity']")
	public WebElement postsAndActivityDropDownItem;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	public WebElement signOutDropDownItem;
	
	@FindBy(xpath = "//span[@class='recent-activity-control'][text()='All activity']")
	public WebElement allActivityTab;
	
	@FindBy(xpath = "//input[@id='login-email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='login-password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='login-submit']")
	public WebElement signInButton;
	
}
