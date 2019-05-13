package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage {

	public TwitterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='StaticLoggedOutHomePage-buttons']/a[contains(text(), 'Log in')]")
	public WebElement loginButton;
	
	@FindBy(xpath = "//form[@class='t1-form clearfix signin js-signin']/fieldset/div[1]/input")
	public WebElement emailInput;
	
	@FindBy(xpath = "//form[@class='t1-form clearfix signin js-signin']/fieldset/div[2]/input")
	public WebElement passwordInput;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginSubmitButton;
	
	@FindBy(xpath = "//span[text()='Tweets']")
	public WebElement tweetsTextInHomeScreen;
	
	@FindBy(xpath = "//a[@data-nav='tweets']")
	public WebElement tweetsTabInProfile;
	
	@FindBy(xpath = "//div[@class='js-tweet-text-container'][1]")
	public WebElement postTextDiv;
	
	@FindBy(xpath = "//a[@id='user-dropdown-toggle']")
	public WebElement profileImage;
	
	@FindBy(xpath = "//*[@id='signout-button']")
	public WebElement logoutDropDownItem;
	
}
