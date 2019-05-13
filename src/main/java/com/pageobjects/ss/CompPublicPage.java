package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompPublicPage {

	public CompPublicPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@title='Report Abuse']")
	public WebElement reportAbuseIcon;
	
	@FindBy(xpath = "//div[@id='rating-avg-comp']")
	public WebElement starAverageRating;
	
	@FindBy(xpath = "//div[@id='prof-company-review-count']")
	public WebElement reviewCount;
	
	@FindBy(xpath = "//div[@id='prof-company-logo']")
	public WebElement companyLogo;
	
	@FindBy(xpath = "//div[@id='prof-header-url']")
	public WebElement publicPageURL;
	
	@FindBy(xpath = "//div[text()='404']")
	public WebElement error404;
	
	
}
