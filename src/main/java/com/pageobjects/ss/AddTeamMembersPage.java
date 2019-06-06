package com.pageobjects.ss;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTeamMembersPage {

	public AddTeamMembersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='hr-individual-tab']")
	public WebElement individualTab;
	
	@FindBy(xpath = "//input[@id='assign-to-txt']")
	public WebElement assignToDropDownInput;
	
	@FindBy(xpath = "//div[@id='assign-to-droplist']")
	public WebElement assignToDropDownList;

	@FindBy(xpath = "//div[@id='assign-to-droplist']/div")
	public List<WebElement> assignToDropDownListItems;	
	
	@FindBy(xpath = "//input[@id='selected-office-txt']")
	public WebElement selectOfficeDropDownInput;
	
	@FindBy(xpath = "//input[@name='userSelectionType']")
	public WebElement userSelectionType;
	
	@FindBy(xpath = "//div[@class='float-left bd-cust-rad-item clearfix']/div")
	public WebElement singleUserRadioButton;
	
	@FindBy(xpath = "//input[@id='selected-user-txt']")
	public WebElement addUserDropDownInput;
	
	@FindBy(xpath = "//div[@id='btn-individual-save']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//div[@class='bd-hr-txt']")
	public WebElement addedUserText;
	
	@FindBy(xpath = "//span[@id='hr-region-tab']")
	public WebElement regionTab;
	
	@FindBy(xpath = "//input[@id='region-name-txt']")
	public WebElement regionName;
	
	@FindBy(xpath = "//input[@id='region-address1-txt']")
	public WebElement regionAddress1;
	
	@FindBy(xpath = "//input[@id='region-address2-txt']")
	public WebElement regionAddress2;
	
	@FindBy(xpath = "//input[@id='region-country']")
	public WebElement regionCountry;
	
	@FindBy(xpath = "//li[contains(@id, 'ui-id-')]")
	public List<WebElement> regionCountryListValues;
	
	@FindBy(xpath = "//select[@id='region-state-txt']")
	public WebElement regionState;
	
	@FindBy(xpath = "//input[@id='region-city-txt']")
	public WebElement regionCity;
	
	@FindBy(xpath = "//li[contains(@id, 'ui-id-')]")
	public List<WebElement> regionCityListValues;
	
	@FindBy(xpath = "//input[@id='region-zipcode-txt']")
	public WebElement regionZipCode;
	
	@FindBy(xpath = "//input[@id='selected-user-txt']")
	public WebElement userForRegion;
	
	@FindBy(xpath = "//div[@id='btn-region-save']")
	public WebElement regionSaveButton;
	
	@FindBy(xpath = "//span[@id= 'err-nw-txt-success']")
	public WebElement regionAddedSuccessMsg;
	
	@FindBy(xpath = "//span[@id='hr-office-tab']")
	public WebElement officeTab;
	
	@FindBy(xpath = "//input[@id='office-name-txt']")
	public WebElement officeName;
	
	@FindBy(xpath = "//input[@id='assign-to-txt']")
	public WebElement assignTo;
	
	@FindBy(xpath = "//input[@id='selected-region-txt']")
	public WebElement selectRegion;
	
	@FindBy(tagName = "li")
	public List<WebElement> selectRegionListItems;
	
	@FindBy(xpath = "//li[@class='ui-menu-item']")
	public List<WebElement> selectOfficeListItems;
	
	@FindBy(xpath = "//input[@id='office-address-txt']")
	public WebElement officeAddress1;
	
	@FindBy(xpath = "//input[@name='officeAddress2']")
	public WebElement officeAddress2;
	
	@FindBy(xpath = "//input[@id='office-country']")
	public WebElement offcieCountry;
	
	@FindBy(xpath = "//select[@id='office-state-txt']")
	public WebElement officeState;
	
	@FindBy(xpath = "//input[@id='office-city-txt']")
	public WebElement officeCity;
	
	@FindBy(tagName = "li")
	public List<WebElement> officeCityListValues;
	
	@FindBy(xpath = "//input[@name='officeZipcode']")
	public WebElement officeZipCode;
	
	@FindBy(xpath = "//input[@id='selected-user-txt']")
	public WebElement userForOffice;
	
	@FindBy(xpath = "//div[@id='btn-office-save']")
	public WebElement officeSaveButton;
	
	@FindBy(xpath = "//span[@id='err-nw-txt-success']")
	public WebElement officeAddedSuccessMsg;
	
}
