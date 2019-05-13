package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptWidgetPage {

	public JavaScriptWidgetPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='ss-widget-prof-pic-cont']/img")
	public WebElement personImage;
	
	@FindBy(xpath = "//input[@id='btn-one-opc']")
	public WebElement buttonOneOpacity;
	
	@FindBy(xpath = "//input[@id='btn-two-opc']")
	public WebElement buttonTwoOpacity;
	
	@FindBy(xpath = "//input[@id='rvw-ldr-opc']")
	public WebElement reviewLoaderOpacity;
	
	@FindBy(xpath = "//input[@id='init-rvw-cnt']")
	public WebElement initialReviewCount;
	
	@FindBy(xpath = "//input[@id='onld-rvw-cnt']")
	public WebElement onLoadReviewCount;
	
	@FindBy(xpath = "//input[@id='onld-btn-size']")
	public WebElement onLoadButtonSize;
	
	@FindBy(xpath = "//input[@id='button-one-link']")
	public WebElement buttonOneLink;
	
	@FindBy(xpath = "//input[@id='button-two-link']")
	public WebElement buttonTwoLink;
	
	@FindBy(xpath = "//div[@id='flt-ss-chk-box']")
	public WebElement filterSocialSurveyCheckBox;
	
	@FindBy(xpath = "//div[@id='flt-ssv-chk-box']")
	public WebElement filterSocialSurveyVerifiedCheckBox;
	
	@FindBy(xpath = "//div[@id='flt-zw-chk-box']")
	public WebElement filterZillowCheckBox;
	
	@FindBy(xpath = "//div[@id='widget-filter-select-all']")
	public WebElement selectAllButton;
	
	@FindBy(xpath = "(//div[@class='sp-preview-inner'])[1]")
	public WebElement backgroundColorBox;

	@FindBy(xpath = "//div[@id='widget-conf-save']")
	public WebElement saveOrOverrideButton;
	
	@FindBy(xpath = "//div[@id='widget-conf-reset']")
	public WebElement loadDefaultsButton;
	
	@FindBy(xpath = "//div[@id='overlay-header']")
	public WebElement saveWidgetConfigPopupHeader;

	@FindBy(xpath = "//div[@id='overlay-text']/input")
	public WebElement messageTextBoxInSaveWidgetConfigPopup;
	
	@FindBy(xpath = "//div[@id='ovrde-save-chk-box']")
	public WebElement overrideAndSaveCheckBoxInSaveWidgetConfigPopup;
	
	@FindBy(xpath = "//div[@id='lock-save-chk-box']")
	public WebElement overrideAndLockCheckBoxInSaveWidgetConfigPopup;
	
	@FindBy(xpath = "//div[@id='overlay-continue']")
	public WebElement continueInSaveWidgetConfigPopup;
	
	@FindBy(xpath = "//div[@id='overlay-cancel']")
	public WebElement cancelInSaveWidgetConfigPopup;
	
	@FindBy(xpath = "//div[@id='hide-bg-initly-chk-box']")
	public WebElement hideBarGraphCheckBox;
	
	@FindBy(xpath = "//div[@id='hide-ot-initly-chk-box']")
	public WebElement hideOptionsTabCheckBox;
	
	@FindBy(xpath = "//div[@id='hide-con-btn-chk-box']")
	public WebElement hideContactButtonCheckBox;
	
	@FindBy(xpath = "//div[@id='hide-rev-btn-chk-box']")
	public WebElement hideWriteReviewButtonCheckBox;
	
	@FindBy(xpath = "//div[@id='allw-mdst-brndng-chk-box']")
	public WebElement allowModestRatingCheckBox;
	
	@FindBy(xpath = "//div[@id='widget-reload-conf']")
	public WebElement reloadConfigButton;
	
	@FindBy(xpath = "//div[@id='widget-conf-reset']")
	public WebElement resetConfigButton;
	
}

