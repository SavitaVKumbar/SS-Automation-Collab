package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSAdminHierarchyPage {

	public SSAdminHierarchyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "hr-comp-sel")
	public WebElement companySearchBox;

	@FindBy(xpath = "//span[@id='hr-comp-icn']")
	public WebElement companySearchIcon;

	@FindBy(xpath = "//div[contains(@id,'tr-comp')]")
	public WebElement openCompanyHierarchy;

	@FindBy(xpath = "(//div[@class='clearfix v-tbl-icn-wraper'])[1]/div[@title='login as']")
	public WebElement companyAdminLoginAs;
	
	@FindBy(xpath = "(//div[@id='admin-com-list']/div/div[@class='v-tbl-name'])[1]")
	public WebElement companyName;
	
	@FindBy(xpath = "//div[@id='srchcmpnythirtydays']")
	public WebElement thirtyDaysRadioButton;
	
}
