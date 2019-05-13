package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentProfilePage {
	
	public AgentProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='prof-image-edit']")
	public WebElement profileImage;
	
	@FindBy(xpath = "//div[@id='icn-insta']")
	public WebElement instagramIcon;
	
	@FindBy(xpath = "//div[@id='prof-header-url']/a")
	public WebElement publicPageURL;	
	
}
