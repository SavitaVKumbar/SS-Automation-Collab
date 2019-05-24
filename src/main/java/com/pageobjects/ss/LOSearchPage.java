package com.pageobjects.ss;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOSearchPage {
	
	public LOSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='srch-eng-prof-cont']/div[2]")
	public WebElement professionalsLink;
	
	@FindBy(xpath = "//div[@id='srch-eng-prof-cont']/div[3]")
	public WebElement loanOfficesLink;
	
	@FindBy(xpath = "//div[@id='srch-eng-prof-cont']/div[4]")
	public WebElement companiesLink;
	
	@FindBy(xpath = "//div[@id='srch-eng-sort-by-cont']/div[3]")
	public WebElement highestRatedLink;
	
	@FindBy(xpath = "//div[@id='srch-eng-rat-cont']/div[2]")
	public WebElement star5Link;
	
	@FindBy(xpath = "//div[@id='srch-eng-rat-cont']/div[3]")
	public WebElement star4Link;
	
	@FindBy(xpath = "//div[@id='srch-eng-rat-cont']/div[4]")
	public WebElement star3Link;
	
	@FindBy(xpath = "//div[@id='srch-eng-rev-cont']/div[2]")
	public WebElement reviews100Link;
	
	@FindBy(xpath = "//div[@id='srch-eng-rev-cont']/div[3]")
	public WebElement reviews50Link;
	
	@FindBy(xpath = "//div[@id='srch-eng-rev-cont']/div[4]")
	public WebElement reviews5Link;
	
	@FindBy(xpath = "//div[@class='srch-eng-result-cont']/div")
	public WebElement textArea;
	
	@FindBy(xpath = "//div[@class='srch-eng-result-rev-count srch-eng-result-rat-txt']")
	public List<WebElement> countOfReviews;
	
	@FindBy(xpath = "//div[@class='srch-eng-result-rat srch-eng-result-rat-txt']")
	public List<WebElement> ratings;
	
	@FindBy(xpath = "//div[@class='srch-eng-page-no']")
	public WebElement pageNumber;

	@FindBy(xpath = "//div[@class='srch-eng-page-no']/following-sibling::div")
	public WebElement nextButton;
	
}