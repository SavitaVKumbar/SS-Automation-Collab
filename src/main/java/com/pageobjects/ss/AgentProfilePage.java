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
	
	@FindBy(xpath = "//input[@id='prof-logo']")
	public WebElement companyLogo;	
	
	@FindBy(xpath = "//div[@id='prof-logo-edit']")
	public WebElement profileImage1;
	
	@FindBy(xpath = "//input[@id='prof-name']")
	public WebElement profileName;
	
	@FindBy(xpath = "//input[@id='prof-title']")
	public WebElement title;
	
	@FindBy(xpath = "//div[@id='prof-address-container']")
	public WebElement addressContainer;
	
	@FindBy(xpath = "//input[@id='prof-address1']")
	public WebElement address1;
	
	@FindBy(xpath = "//input[@id='prof-address2']")
	public WebElement address2;
	
	@FindBy(xpath = "//input[@id='prof-country']")
	public WebElement country;
	
	@FindBy(xpath = "//select[@id='prof-state']")
	public WebElement state;
	
	@FindBy(xpath = "//input[@id='prof-city']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@id='prof-zipcode']")
	public WebElement zipCode;
	
	@FindBy(xpath = "//div[@id='overlay-continue']")
	public WebElement buttonOKInForm;

	@FindBy(xpath = "//div[@id='overlay-cancel']")
	public WebElement cancelButton;
	
	@FindBy(xpath = "//input[@id='email-id-work']")
	public WebElement emailId;
	
	@FindBy(xpath = "//input[@id='web-address-work']")
	public WebElement website;
	
	@FindBy(xpath = "//input[@id='phone-number-work']")
	public WebElement phone;

	@FindBy(xpath = "//div[@id='intro-body-text']")
	public WebElement aboutMe;
	
	@FindBy(xpath = "//textarea[@id='disclaimer-text']")
	public WebElement disclaimer;
	
}
