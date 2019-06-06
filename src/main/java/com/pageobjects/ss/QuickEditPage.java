package com.pageobjects.ss;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickEditPage {

	public QuickEditPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@id='selected-user-prof-img']")
	public WebElement profileImage;
	
	@FindBy(xpath = "//div[@id='selected-user-prof-img-edit']")
	public WebElement profileImageEditIcon;
	
	@FindBy(xpath = "//input[@id='selected-user-first-name']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='selected-user-last-name']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='selected-user-email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='selected-user-title']")
	public WebElement title;
	
	@FindBy(xpath = "//input[@id='selected-user-autopost-enabled']")
	public WebElement autoPostEnabledCheckBoxValue;
	
	@FindBy(xpath = "//input[@id='selected-user-autopost-enabled']/preceding-sibling::div")
	public WebElement autoPostEnabledCheckBox;
	
	@FindBy(xpath = "//input[@id='selected-user-autopost']")
	public WebElement selectedUserAutoPostDropDown;

	@FindBy(xpath = "//div[@id='selected-user-logo-edit']")
	public WebElement companyLogoEditIcon;
	
	@FindBy(xpath = "//input[@id='selected-user-profileurl']")
	public WebElement profileURLInputTextBox;
	
	@FindBy(xpath = "//div[@id='v-ed-app-base-url']")
	public WebElement baseURL;
	
	@FindBy(xpath = "//input[@id='selected-user-address1']")
	public WebElement address1;
	
	@FindBy(xpath = "//input[@id='selected-user-address2']")
	public WebElement address2;
	
	@FindBy(xpath = "//div[@id='v-ed-hide-pp-chk-box']")
	public WebElement hidePublicPageCheckBox;
	
	@FindBy(xpath = "//input[@id='v-ed-hide-public-page']")
	public WebElement hidePublicPageCheckBoxValue;

	@FindBy(xpath = "//input[@id='selected-user-country']")
	public WebElement country;

	@FindBy(tagName = "li")
	public List<WebElement> countryListItems;
	
	@FindBy(xpath = "//select[@id='selected-user-state']")
	public WebElement state;
	
	@FindBy(xpath = "//input[@id='selected-user-city']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@id='selected-user-zip']")
	public WebElement zipCode;
	
	@FindBy(xpath = "//input[@id='selected-user-phone']")
	public WebElement phone;
	
	@FindBy(xpath = "//input[@id='selected-user-website']")
	public WebElement website;
	
	@FindBy(xpath = "//textarea[@id='selected-user-aboutme']")
	public WebElement aboutMe;
	
	@FindBy(xpath = "//div[@id='user-edit-btn']")
	public WebElement editButton;
	
	@FindBy(xpath = "//div[@id='user-assign-btn']")
	public WebElement assignButton;
	
	@FindBy(xpath = "//div[@id='v-ed-allow-rr-chk-box']")
	public WebElement replyToReviewsCheckBox;
	
	@FindBy(xpath = "//input[@id='v-ed-allow-review-reply']")
	public WebElement replyToReviewsCheckBoxValue;

	@FindBy(xpath = "//input[@id='is-soc-mon-admin-chk']")
	public WebElement adminPrivilegesCheckBoxValue;
	
	@FindBy(xpath = "//div[@id='v-ed-hide-ps-chk-box']")
	public WebElement adminPrivilegesCheckBox;
	
	@FindBy(xpath = "//td[@class='v-edt-tbl-assign-to'][1]")
	public WebElement assignedTo;
	
	@FindBy(xpath = "//div[@id='user-edit-save']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//div[@id='user-edit-cancel']")
	public WebElement cancelButton;
	
	@FindBy(xpath = "//div[@id='overlay-continue']")
	public WebElement uploadButton;
	
	@FindBy(xpath = "//div[@id='overlay-cancel']")
	public WebElement cancelButtonInUpload;
	
	@FindBy(xpath = "//img[@id='selected-user-logo']")
	public WebElement companyLogoImage;
	
	@FindBy(xpath = "//img[@id='qe-default-user-logo']")
	public WebElement defaultCompanyLogoImage;
	
	@FindBy(xpath = "//img[@id='qe-default-prof-img']")
	public WebElement defaultProfileImage;
	
	@FindBy(xpath = "//textarea[@id='selected-user-disclaimer']")
	public WebElement disclaimer;
	
	@FindBy(xpath = "//input[@id='selected-user-autopost']")
	public WebElement minimumScoreToAutoPost;
	
	@FindBy(xpath = "//div[@class='v-ed-rat-drop-item']")
	public List<WebElement> minimumScoreToAutoPostItems;
	
	@FindBy(xpath = "//input[@id='min-score-reply']")
	public WebElement minimumScoreToReply;
	
	@FindBy(xpath = "//input[@id='min-score-reply']/following-sibling::div/div")
	public List<WebElement> minimumScoreToReplyItems;
	
	@FindBy(xpath = "//input[@id='at-pst-cb']")
	public WebElement allowPartnerSurveyCheckBoxValue;
	
	@FindBy(xpath = "//input[@id='at-pst-cb']/preceding-sibling::div")
	public WebElement allowPartnerSurveyCheckBox;
	
}
