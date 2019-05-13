package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeYourPaymentPage {

	public MakeYourPaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"account-type-selection-form\"]//td[3]/span[@class='payment-button']")
	public WebElement smallBusinessTrialButton;
	
}
