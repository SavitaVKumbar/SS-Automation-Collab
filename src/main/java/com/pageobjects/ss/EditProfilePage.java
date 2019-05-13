package com.pageobjects.ss;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage {

	public EditProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='hdr-link-item'])[4]/a[@onclick='showOverlay();']")
	public WebElement EditProfileLink;
	
	@FindBy(xpath = ".//*[@id='prof-img-edit-cont']/div[1]")
	public WebElement EditImageLink;
	
	@FindBy(xpath = ".//*[@id='overlay-continue']")
	public WebElement SSUploadLink; 
	
	@FindBy(id = "dashboard-link")
	public WebElement DashboardLink;
	
	@FindBy(xpath = "//div[@id='rating-avg-comp']/div[2]")
	public WebElement averageRating;
	
	@FindBy(xpath = "//div[@id='prof-company-review-count']")
	public WebElement countOfReviews;
	
	@FindBy(xpath = "//div[@id='prof-header-url']/a")
	public WebElement publicPageURL;
	
	@FindBy(xpath = "//div[@id='icn-gplus']")
	public WebElement googlePlusIcon;
	
	@FindBy(xpath = "//div[@id='icn-insta']")
	public WebElement instagramIcon;
	
	@FindBy(xpath = "//div[@id = 'rating-avg-comp']")
	public WebElement averageRatingComponent;

	@FindBy(xpath = "//div[@id = 'dashboard-sel']")
	public WebElement dashboardSelectionDropDown;
	
	@FindBy(xpath = "//div[@id = 'da-dd-wrapper-profiles']")
	public WebElement dashboardSelectionDropDownBox;
	
	@FindBy(xpath = "//div[@class = 'da-dd-item']")
	public List<WebElement> dashboardSelectionDropDownItems;
	
	@FindBy(xpath = "//input[@id = 'prof-name']")
	public WebElement name;
	
	@FindBy(xpath = "//div[@class='da-dd-item']")
	public WebElement dashboardSelectionDropDownItem;
	
}
