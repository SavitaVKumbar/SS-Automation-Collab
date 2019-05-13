package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportingPage {

	public ReportingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='generate-survey-reports']")
	public WebElement reportSelectDropDown;
	
	@FindBy(xpath = "//input[@id='dsh-start-date']")
	public WebElement startDate;
	
	@FindBy(xpath = "//input[@id='dsh-end-date']")
	public WebElement endDate;
	
	@FindBy(xpath = "//div[@id='reports-generate-report-btn']")
	public WebElement generateReportButton;
	
	@FindBy(xpath = "//td[@class='active day']")
	public WebElement activeDay;
	
	@FindBy(xpath = "//td[@class='today day']")
	public WebElement todayDay;
	
	@FindBy(xpath = "//table[@class='v-um-tbl']")
	public WebElement reportsTable;
	
	@FindBy(xpath = "//tr[@id='recent-activity-row0']/td[6]")
	public WebElement firstRowStatusCellElement;
	
	@FindBy(xpath = "(//a[contains(@id, 'downloadLink')])[1]")
	public WebElement firstRowStatusDownloadLink;
	
	@FindBy(xpath = "//span[@id='completed-lbl-span']")
	public WebElement completedCount;

	@FindBy(xpath = "//span[@id='google-lbl-span']")
	public WebElement googleReviewsCount;
	
	@FindBy(xpath = "//span[@id='zillow-lbl-span']")
	public WebElement zillowReviewsCount;
	
	@FindBy(xpath = "//span[@id='third-party-lbl-span']")
	public WebElement thirdPartyReviewsCount;
	
	@FindBy(xpath = "//span[@id='facebook-lbl-span']")
	public WebElement facebookReviewsCount;
	
}
