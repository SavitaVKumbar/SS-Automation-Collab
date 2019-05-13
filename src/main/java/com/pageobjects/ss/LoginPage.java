package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//*[@id='nav-link-yourAccount']/span[1]")
	public WebElement loginLink;
	
	@FindBy(id = "login-user-id")
	public WebElement SSAdminUserId;
	
	@FindBy(id = "login-pwd")
	public WebElement SSAdminPassword;
	
	@FindBy(id = "login-submit")
	public WebElement mainLoginButton;

}
