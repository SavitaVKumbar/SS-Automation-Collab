package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSAdminHomePage {
	
	public SSAdminHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='dashboard-link']")
	public WebElement dashboardLink;
	
	@FindBy(id = "invite-link")
	public WebElement sendInviteLink;
	
	@FindBy(xpath = "//a[@id='invite-link'][text()='Abuse Reports']")
	public WebElement abuseReportsLink;
	
	@FindBy(xpath = "//a[text()='User Management']")
	public WebElement userManagementLink;
	
	@FindBy(xpath = "//a[text()='Reports']")
	public WebElement reportsLink;
	
	@FindBy(xpath = "//a[text()='Transaction Monitor']")
	public WebElement transactionMonitorLink;
	
	@FindBy(id = "hdr-usr-img")
	public WebElement userImage;
	
	@FindBy(id = "change-password")
	public WebElement changePasswordItem;
	
	@FindBy(id = "save-pwd")
	public WebElement submitButton;
	
	@FindBy(xpath = "//div[@id=\"change-password\"]/following-sibling::div")
	public WebElement logoutItem;
	
}
