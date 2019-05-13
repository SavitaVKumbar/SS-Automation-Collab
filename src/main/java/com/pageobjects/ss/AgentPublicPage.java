package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentPublicPage {

	public AgentPublicPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='rc-anchor-logo-portrait']")
	public WebElement captcha;
	
	@FindBy(xpath = "//span[@title='Report Abuse']")
	public WebElement reportAbuseIcon;
	
	
}
