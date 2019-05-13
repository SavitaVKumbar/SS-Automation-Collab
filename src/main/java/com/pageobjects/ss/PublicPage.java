package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PublicPage {

	public PublicPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='prof-company-review-count']/span")
	public WebElement reviewCount;
	
	@FindBy(xpath = "//div[@id='rating-avg-comp']/div/span")
	public WebElement averageRating;
	
}
