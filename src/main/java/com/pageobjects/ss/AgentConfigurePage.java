package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentConfigurePage {

	public AgentConfigurePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='rating-min-post']")
	public WebElement minScoreToPost;

	@FindBy(xpath = "//div[@id='atpst-chk-box']")
	public WebElement autoPostCheckBox;
	
	@FindBy(xpath = "//input[@name='autopost']")
	public WebElement autoPostCheckBoxValue;
	
	@FindBy(xpath = "//input[@id='rating-min-reply']")
	public WebElement minScoreToReply;
	
	@FindBy(xpath = "//div[@id='allow-reply-chk-box']")
	public WebElement replyToReviewsCheckBox;
	
	@FindBy(xpath = "//input[@name='allowreply']")
	public WebElement replyToReviewsCheckBoxValue;
	
	@FindBy(xpath = "//div[@id='hide-pp-chk-box']")
	public WebElement hidePublicPageCheckBox;
	
	@FindBy(xpath = "//input[@id='hide-pp-cb']")
	public WebElement hidePublicPageCheckBoxValue;
	
}
