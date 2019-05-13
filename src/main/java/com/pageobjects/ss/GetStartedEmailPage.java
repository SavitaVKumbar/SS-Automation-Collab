package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedEmailPage {
	
	public GetStartedEmailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='reg-fname']")
	public WebElement firstName;
		
	@FindBy(xpath = "//input[@id='reg-lname']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='reg-email']")
	public WebElement email;	
	
	@FindBy(xpath = "//input[@id='reg-pwd']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='reg-conf-pwd']")
	public WebElement passwordToConfirm;
	
	@FindBy(xpath = "//div[@id='reg-submit']")
	public WebElement submitButton;
	
}
