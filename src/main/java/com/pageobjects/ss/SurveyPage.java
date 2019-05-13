package com.pageobjects.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveyPage {

	public SurveyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class, 'sq-smile sq-smile-4')]")
	public WebElement smileFour;
	
	@FindBy(xpath = "//div[@id='sq-stars']/div[4]")
	public WebElement starFour;
	
	@FindBy(xpath = "//div[@id='next-smile']")
	public WebElement nextSmileButton;
	
	@FindBy(xpath = "//div[@id='next-star']")
	public WebElement nextStarButton;
	
	@FindBy(xpath = "//span[@id='ques-text-smiley']")
	public WebElement surveySmileQuestion;
	
	@FindBy(xpath = "//span[@id='ques-text']")
	public WebElement surveyStarQuestion;
	
	@FindBy(xpath = "//span[@id='mcq-ques-text']")
	public WebElement surveyMCQQuestionText;
	
	@FindBy(xpath = "//span[@id='ques-text-1to10-nps']")
	public WebElement surveyNPSQuestionText;
	
	@FindBy(xpath = "//span[@id='ques-text-textarea']")
	public WebElement surveyOverAllExpText;
	
	@FindBy(xpath = "//div[@id='happy-smile']")
	public WebElement greatSmile;
	
	@FindBy(xpath = "//*[@id='sq-happy-smile']/div[2]")
	public WebElement greatButton;
	
	@FindBy(xpath = "//div[@id='neutral-smile']")
	public WebElement justOkSmile;
	
	@FindBy(xpath = "//div[@id='neutral-smile']/following-sibling::div")
	public WebElement  justOkButton;
	
	@FindBy(xpath = "//div[@id='sad-smile']")
	public WebElement unpleasantSmile;
	
	@FindBy(xpath = "//div[@id='sad-smile']/following-sibling::div")
	public WebElement unpleasantButton;
	
	@FindBy(xpath = "//div[@id='next-textarea-smiley']")
	public WebElement overallExperienceNext;
	
	@FindBy(xpath = "//textarea[@id='text-area']")
	public WebElement textArea;
		
	@FindBy(xpath = "//div[@id='shr-post-chk-box']")
	public WebElement sharePostCheckBox;
	
	@FindBy(xpath = "//div[@id='content-head']")
	public WebElement headerContent;
	
	@FindBy(xpath = "//div[text()='Option2']")
	public WebElement Option3RadioButton;
	
	@FindBy(xpath = "//div[@id='next-mcq']")
	public WebElement nextMCQButton;
	
	@FindBy(xpath = "//div[@id='radio-nps-9']")
	public WebElement radio9Button;
	
	@FindBy(xpath = "//div[@id='next-radio-nps']")
	public WebElement nextRadioButton;
	
}
