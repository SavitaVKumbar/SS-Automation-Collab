package com.pageobjects.ss;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.ss.BaseClass;

public class CompAdminDashboardPage extends BaseClass{

	public CompAdminDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//*[@id='dashboard-sel']")
	public WebElement companySelectorDropDown;

	@FindBy(xpath = ".//*[@id='da-dd-wrapper-profiles']/div[4]")
	public WebElement companySelectorLink;
	
	@FindBy(id = "dsh-btn1")
	public WebElement surveyLink;
	
	@FindBy(xpath = ".//*[@id='survey-1']/div[1]/input")
	public WebElement surveyUserName;
	
	@FindBy(xpath = "//*[@class='ui-menu-item']")
	public List<WebElement> surveyUserNameMenuItems;
	
	@FindBy(xpath = ".//*[@id='survey-1']/div[2]/input")
	public WebElement surveyFirstName;
	
	@FindBy(xpath = ".//*[@id='survey-1']/div[3]/input")
	public WebElement surveyLastName;
	
	@FindBy(xpath = ".//*[@id='survey-1']/div[4]/input")
	public WebElement surveyEmailTo;
	
	@FindBy(id = "wc-send-survey")
	public WebElement surveySend;
	
	@FindBy(xpath = "//div[@id='err-nw-wrapper']/span[2]")
	public WebElement surveySendSuccMsg;
	
	@FindBy(xpath = ".//*[@id='transaction-stats-btn']/a")
	public WebElement transactionStatsLink;
	
	@FindBy(xpath = ".//*[@id='processed-lbl-span']")
	public WebElement processedCount;
	
	@FindBy(xpath = ".//*[@id='close-summit-popup']")
	public WebElement closeSummitPopup;
	
	@FindBy(xpath = "(//div[@class='initial-dd-wrapper hide blue-arrow-bot text-normal'])/div[contains(text(),'Switch to admin')]")
	public WebElement switchToSSAdmin;
	
	@FindBy(id = "hdr-usr-img")
	public WebElement userImage;
	
	@FindBy(xpath = "//div[@id='user-logout']")
	public WebElement logoutLink;
	
	@FindBy(xpath = "//div[@id='change-password']")
	public WebElement updatePasswordLink;
	
	@FindBy(xpath = "//div[@id='name']")
	public WebElement companyName;
	
	@FindBy(xpath = "//div[@id='summit-popup-close-btn']")
	public WebElement bannerCloseButton;
	
	@FindBy(xpath = "//div[@id='summit-do-not-show']")
	public WebElement bannerDoNotShowButton;
	
	@FindBy(xpath = "//div[contains(@class, 'hdr-container')]")
	public WebElement headerContainer;
	
	@FindBy(xpath = "//div[@class='hdr-link-item']/a[text()='Manage Team']")
	public WebElement manageTeamLink;
	
	@FindBy(xpath = "//div[@id='hdr-dashboard-item']/a[@id='dashboard-link']")
	public WebElement dashBoardLink;
	
	@FindBy(xpath = "//li[@id='transaction-stats-btn']")
	public WebElement transactionStatsTab;
	
	
	//Dash board Reviews Page
	@FindBy(xpath = "//a[text()='Reviews']")
	public WebElement reviewsTab;
	
	@FindBy(xpath = "//div[@title='4.00/5.0']")
	public WebElement ratingGiven;
	
	@FindBy(xpath = "//div[@id='rating-avg-comp']/div")
	public WebElement averageRating;
	
	@FindBy(xpath = "//div[@class='hdr-link-item']/a[text()='Edit Profile']")
	public WebElement editProfileLink;
	
	@FindBy(xpath = "//div[@class='hdr-link-item']/a[text()='Edit Survey']")
	public WebElement editSurveyLink;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-config']/a")
	public WebElement configureLink;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-config']/div")
	public WebElement configureDropdown;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown']")
	public WebElement configureDropdownList;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown']/div")
	public List<WebElement> configureDropdownListItems;
	
	@FindBy(xpath = "//div[@id='hdr-dashboard-dropdown']")
	public WebElement headerDashboardDropDown;
	
	@FindBy(xpath = "//div[@id='dashboard-sel']")
	public WebElement dashboardSelectionDropDown;
	
	@FindBy(xpath = "//div[@class='da-dd-item']")
	public List<WebElement> dashboardSelectionDropDownItems;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown-dash']")
	public WebElement headerDashboardDropDownList;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown-dash']/div")
	public List<WebElement> headerDashboardDropDownListItems;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown-dash']/div[4]")
	public WebElement reportingLink;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown-dash']/div[2]")
	public WebElement reportingLinkCompAdmin;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown-dash']/div[1]")
	public WebElement dashBoardItem;
	
	@FindBy(xpath = "//div[@id='hdr-link-item-dropdown-dash']/div[2]")
	public WebElement adminDashboardLink;
	
	@FindBy(xpath = "//div[@class='hdr-link-item']/a[text()='Help']")
	public WebElement helpLink;
	
	@FindBy(xpath = "//div[@class='hdr-link-item']/a[text()='Social Monitor']")
	public WebElement socialMonitorLink;
	
	@FindBy(xpath = "//div[@id='prof-company-review-count']")
	public WebElement reviewsCount;
	
	@FindBy(xpath = "//div[@id='time-frame-sel']")
	public WebElement allTimeDropDown;
	
	@FindBy(xpath = "//div[@id='time-frame-options']")
	public WebElement allTimeDropDownOption;
	
	@FindBy(xpath = "//div[@id='time-frame-options']/div")
	public List<WebElement> allTimeDropDownOptions;
	
	@FindBy(xpath = "//span[@id='incomplete-lbl-span-sel']")
	public WebElement incompleteSurveyCount;
	
	@FindBy(xpath = "//span[@id='completed-lbl-span']")
	public WebElement completedCount;
	
	@FindBy(xpath = "//span[@id='unprocessed-lbl-span']")
	public WebElement unprocessedCount;
	
	@FindBy(xpath = "//span[@id='unassigned-lbl-span-sel']")
	public WebElement unassignedCount;
	
	@FindBy(xpath = "//span[@id='duplicate-lbl-span']")
	public WebElement duplicateCount;
	
	@FindBy(xpath = "//span[@id='corrupted-lbl-span']")
	public WebElement corruptedCount;
	
	@FindBy(xpath = "//span[@id='other-lbl-span']")
	public WebElement otherCount;
	
	@FindBy(xpath = "//span[@id='unsubscribed-lbl-span']")
	public WebElement unsubscribedCount;
	
	@FindBy(xpath = "//span[@id='social-posts-lbl-span']")
	public WebElement socialPostsCount;
	
	@FindBy(xpath = "//span[@id='zillow-lbl-span']")
	public WebElement zillowReviewsCount;
	
	@FindBy(xpath = "//span[@id='third-party-lbl-span']")
	public WebElement thirdPartyCount;
	
	@FindBy(xpath = "//span[@id='google-lbl-span']")
	public WebElement googleReviewsCount;
	
	@FindBy(xpath = "//span[@id='facebook-lbl-span']")
	public WebElement facebookReviewsCount;
	
}
