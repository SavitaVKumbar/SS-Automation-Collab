package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendInvitePage {
	
	public SendInvitePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-fnmae")
	public WebElement customerFirstName;
	
	@FindBy(id = "user-lname")
	public WebElement customerLastName;
	
	@FindBy(id = "user-email")
	public WebElement customerEmail;
	
	@FindBy(id = "custom-email")
	public WebElement customerCustomEmail;
	
	@FindBy(id = "send-invite-form-submit")
	public WebElement doneButton;

}
