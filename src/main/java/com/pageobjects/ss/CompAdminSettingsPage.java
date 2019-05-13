package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompAdminSettingsPage {

	public CompAdminSettingsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='survey-mail-thrhld-chk-box']")
	public WebElement surveyMailThresholdCheckBox;
	
	@FindBy(xpath = "//div[@id='atpst-chk-box']")
	public WebElement autoPostCheckBox;
	
	@FindBy(xpath = "//input[@id='at-pst-cb']")
	public WebElement autoPostCheckBoxValue;
	
	@FindBy(xpath = "//div[@id='social-media-token-cont']")
	public WebElement socialMediaContainer;
	
	@FindBy(xpath = "//div[@id='social-media-token-cont']/div[1]/div[1]")
	public WebElement facebookDisconnectButton;
	
	@FindBy(xpath = "//div[@id='social-media-token-cont']/div[1]/div[2]")
	public WebElement facebookButton;
	
	@FindBy(xpath = "//div[@id='social-media-token-cont']/div[2]/div[2]")
	public WebElement twitterButton;
	
	@FindBy(xpath = "//div[@id='social-media-token-cont']/div[2]/div[1]")
	public WebElement twitterDisconnectButton;
	
	@FindBy(xpath = "//div[@id='social-media-token-cont']/div[3]/div[2]")
	public WebElement linkedInButton;
	
	@FindBy(xpath = "//div[@id='social-media-token-cont']/div[3]/div[1]")
	public WebElement linkedInDisconnectButton;
	
	@FindBy(xpath = "//div[@id='social-media-token-cont']/div[4]/div[2]")
	public WebElement googlePlusButton;
	
	@FindBy(xpath = "//div[@id='social-media-token-cont']/div[5]/div[2]")
	public WebElement zillowButton;
	
	@FindBy(xpath = "//div[@id='social-media-token-cont']/div[4]/div[2]")
	public WebElement instaButton;
	
	@FindBy(xpath = "//div[@id='overlay-header']")
	public WebElement popupHeader;
	
	@FindBy(xpath = "//div[@id='overlay-continue']")
	public WebElement popupContinueButton;
	
	@FindBy(xpath = "//div[@id='overlay-cancel']")
	public WebElement popupCancelButton;
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement signInButton;
	
	@FindBy(xpath = "//div[@id='soc-mon-access-chk-box']")
	public WebElement enableSocialMonitorCheckBox;
	
	@FindBy(xpath = "//input[@id='soc-mon-access-cb']")
	public WebElement enableSocialMonitorCheckBoxValue;
	
	@FindBy(xpath = "//div[@id='hidden-section-chk-box']")
	public WebElement hidePublicPageOfAllAgentsCheckBox;
	
	@FindBy(xpath = "//input[@id='hidden-section-cb']")
	public WebElement hidePublicPageOfAllAgentsCheckBoxValue;
	
	@FindBy(xpath = "//div[@id='hide-pp-chk-box']")
	public WebElement hidePublicPageCheckBox;
	
	@FindBy(xpath = "//input[@id='hide-pp-cb']")
	public WebElement hidePublicPageCheckBoxValue;
	
	@FindBy(xpath = "//a[text()='Cancel']")
	public WebElement cancelButton;
	
	@FindBy(xpath = "//h1[@class='header__logo']")
	public WebElement headerLogo;
	
	@FindBy(xpath = "//button[@id='oauth__auth-form__submit-btn']")
	public WebElement allowButton;
	
	@FindBy(xpath = "//a[@id='oauth__auth-form__cancel-btn']")
	public WebElement cancelButtonInAuthorizePage;
	
	@FindBy(xpath = "//div[@id='linked-in-prof-url-popup-header']")
	public WebElement linkedInURLPopupHeader;
	
	@FindBy(xpath = "//div[@id='linked-in-prof-url-popup-continue']")
	public WebElement linkedInURLPopupContinueButton;
	
	@FindBy(xpath = "//div[@id='linked-in-prof-url-popup-cancel']")
	public WebElement linkedInURLPopupCancelButton;
	
	@FindBy(xpath = "//input[@id='allow']")
	public WebElement allowButtonInTwitter;
	
	@FindBy(xpath = "//input[@id='username_or_email']")
	public WebElement twitterUserName;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement twitterPassword;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement facebookEmail;

	@FindBy(xpath = "//input[@id='pass']")
	public WebElement facebookPassword;
	
	@FindBy(xpath = "//button[@id='loginbutton']")
	public WebElement facebookLoginButton;
	
	@FindBy(xpath = "//button[@name='__CONFIRM__']")
	public WebElement facebookConfirmButton;
	
	@FindBy(xpath = "//button[@name='__CONFIRM__'][text()='OK']")
	public WebElement facebookOKButton;
	
	@FindBy(xpath = "//input[@name='pageselection']")
	public WebElement facebookRadioButton;
	
	@FindBy(xpath = "//div[@class='reg_btn'][text()='save']")
	public WebElement facebookSaveButton;
	
}
