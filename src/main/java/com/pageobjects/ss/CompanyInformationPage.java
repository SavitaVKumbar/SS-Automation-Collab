package com.pageobjects.ss;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyInformationPage {
	
	public CompanyInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='com-company']")
	public WebElement companyName;
	
	@FindBy(xpath = "//input[@id='com-logo']")
	public WebElement companyLogo;

	@FindBy(xpath = "//input[@id='com-address1']")
	public WebElement companyAddress1;
	
	@FindBy(xpath = "//input[@id='com-address2']")
	public WebElement companyAddress2;
	
	@FindBy(xpath = "//input[@id='com-country']")
	public WebElement companyCountry;
	
	@FindBy(xpath = "//li[contains(id,'ui-id-')]")
	public List<WebElement> companyCountryListItems;
	
	@FindBy(xpath = "//input[@id='com-zipcode']")
	public WebElement companyZipCode;
	
	@FindBy(xpath = "//select[@id='com-state']")
	public WebElement companyState;
	
	@FindBy(xpath = "//ul[@id='com-city']")
	public WebElement companyCity;
	
	@FindBy(xpath = "//li[contains(id,'ui-id-')]")
	public List<WebElement> companyCityListItems;
	
	@FindBy(xpath = "//input[@id= 'com-contactno']")
	public WebElement companyContactNumber;
	
	@FindBy(xpath = "//select[@id='select-vertical']")
	public WebElement companyBusinessType;
	
	@FindBy(xpath = "//div[@id='company-info-submit']")
	public WebElement doneButton;
	
}
