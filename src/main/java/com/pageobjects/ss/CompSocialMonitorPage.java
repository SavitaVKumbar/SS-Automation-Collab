package com.pageobjects.ss;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompSocialMonitorPage {

	public CompSocialMonitorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='stream-item-count']")
	public WebElement streamCount;

	@FindBy(xpath = "//input[@id='search-post']")
	public WebElement searchInputTextBox;
	
	@FindBy(xpath = "//div[@id='soc-mon-stream-tab']")
	public WebElement streamTab;
	
	@FindBy(xpath = "//div[@id='soc-mon-alerts-tab']")
	public WebElement alertsTab;
	
	@FindBy(xpath = "//div[@id='soc-mon-escalated-tab']")
	public WebElement escalationsTab;
	
	@FindBy(xpath = "//div[@id='soc-mon-resolved-tab']")
	public WebElement resolutionsTab;
	
	@FindBy(xpath = "//div[@id='soc-mon-trusted-tab']")
	public WebElement trustedSourceTab;
	
	@FindBy(xpath = "//div[contains(@id, 'stream-post-details')]/div[2]/div[2]/div[1]")
	public List<WebElement> agentNames;
	
	@FindBy(xpath = "(//div[contains(@id, 'stream-post-details')]/div[2]/div[2]/div[1])[1]")
	public List<WebElement> firstAgentName;
	
	@FindBy(xpath = "//div[contains(@id, 'stream-post-details')]/div[2]/div[2]/div[2]")
	public List<WebElement> socialMediaTypes;
	
	@FindBy(xpath = "//div[contains(@id, 'stream-post-details')]/pre")
	public List<WebElement> reviewTexts;
	
	@FindBy(xpath = "//div[contains(@id, 'action-form-container')]/div[contains(text(),'Flag')]")
	public List<WebElement> flagButtons;
	
	@FindBy(xpath = "//div[contains(@id, 'action-form-container')]/div[contains(text(),'Escalate')]")
	public List<WebElement> escalateButtons;
	
	@FindBy(xpath = "//div[contains(@id, 'action-form-container')]/div[contains(text(),'Unflag')]")
	public List<WebElement> unFlagButtons;
	
	@FindBy(xpath = "//div[contains(@id, 'action-form-container')]/div[contains(text(),'Resolve')]")
	public List<WebElement> resolveButtons;
	
	@FindBy(xpath = "//textarea[@id='form-post-textbox']")
	public List<WebElement> messageTextBoxes;
	
	@FindBy(xpath = "//input[@id='search-post']")
	public WebElement searchTextBox;
	
	@FindBy(xpath = "//div[contains(text(), 'Edit Monitors')]")
	public WebElement editMonitorButton;
	
	@FindBy(xpath = "//div[contains(text(), 'Reports')]")
	public WebElement reportsButton;
	
	@FindBy(xpath = "//div[contains(text(), 'Macros')]")
	public WebElement macrosButton;
	
	@FindBy(xpath = "//div[contains(text(), '+ Add Monitor')]")
	public WebElement addMonitorButton;
	
	@FindBy(xpath = "//div[@class='bulk-action-hdr']")
	public WebElement addMonitorPopupHeader;
	
	@FindBy(xpath = "//textarea[@id='monitor-keyphrase']")
	public WebElement keyPhraseTextBox;
	
	@FindBy(xpath = "//div[@id='add-mon-type-sel-txt']")
	public WebElement monitorTypeDropDown;
	
	@FindBy(xpath = "//img[@id='add-keyword-mon-unchecked']")
	public WebElement keywordMonitorCheckBox;
	
	@FindBy(xpath = "//div[@id='add-mon-save-active']")
	public WebElement addMonitorPopupSaveButton;
	
	@FindBy(xpath = "//div[@id='add-mon-cancel']")
	public WebElement addMonitorPopupCancelButton;
	
	@FindBy(xpath = "(//div[@class='col-lg-8 col-md-8 col-sm-8 col-xs-8 mon-type-keyphrase'])[1]")
	public WebElement keyPhrase;
	
	@FindBy(xpath = "//div[contains(text(), 'View Stream')]")
	public WebElement viewStreamButton;
	
	@FindBy(xpath = "//span[@id='err-nw-txt']")
	public WebElement message;
	
	@FindBy(xpath = "//div[@id='soc-mon-reports-generate-report-btn']")
	public WebElement generateReportButton;

	@FindBy(xpath = "//*[@id=\"soc-mon-recent-activity-row0\"]/td[6]")
	public WebElement firstRowStatusCellEleme;
	
	@FindBy(xpath = "//input[@id='search-monitors-key']")
	public WebElement monitorSearchInputTextBox;
	
	@FindBy(xpath = "(//img[contains(@id, 'edit-mon-unchecked')])[2]")
	public WebElement editMonitorCheckBox;
	
	@FindBy(xpath = "//div[@id='monitor-bulk-actions']/div[@class='bulk-actions-select']")
	public WebElement selectActionDropDown;
	
	@FindBy(xpath = "//div[@id='monitor-bulk-action-options']/div[@id='monitor-bulk-delete']")
	public WebElement deleteSelected;

	@FindBy(xpath = "//span[text()='No monitors found']")
	public WebElement noMonitorsFoundError;
	
}
