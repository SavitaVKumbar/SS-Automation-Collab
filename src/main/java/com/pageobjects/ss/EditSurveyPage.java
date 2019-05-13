package com.pageobjects.ss;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditSurveyPage {
		
		public EditSurveyPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//div[@id='btn-add-question']")
		public WebElement addQuestionButton;
		
		@FindBy(xpath = "//input[@id='sb-question-txt-1']")
		public WebElement surveyQuestionInputTextBox;
		
		@FindBy(xpath = "//div[text()='Done'][@class='bd-q-btn-done float-left']")
		public WebElement doneButton;
		
		@FindBy(xpath = "//div[@data-id='sb-range']")
		public WebElement range1to5Tab;
		
		@FindBy(xpath = "//div[@data-id='sb-range-0to10']")
		public WebElement range1to10Tab;
		
		@FindBy(xpath = "//div[@data-id='sb-sel-desc']")
		public WebElement commentTab;
		
		@FindBy(xpath = "//div[@data-id='sb-sel-mcq']")
		public WebElement multipleChoiceTab;
		
		@FindBy(xpath = "//div[@data-id='sb-range-star']")
		public WebElement starsSmiley;
		
		@FindBy(xpath = "//div[@id='overlay-header']")
		public WebElement unsavedChangesPopupHeader;
		
		@FindBy(xpath = "//div[@id='overlay-continue']")
		public WebElement unsavedChangesPopupContinueButton;
		
		@FindBy(xpath = "//div[@id='overlay-cancel']")
		public WebElement unsavedChangesPopupCancelButton;
		
		@FindBy(xpath = "//div[@class='float-left srv-tbl-num']/span")
		public List<WebElement> questionNumbers;
		
		@FindBy(xpath = "//input[@name='sb-answers-1[]']")
		public List<WebElement> options;
		
		@FindBy(xpath = "//div[@id='nps-chkbox']/following-sibling::input")
		public WebElement npsCheckBoxValue;
		
		@FindBy(xpath = "//div[@id='nps-chkbox']")
		public WebElement npsCheckBox;
		
		@FindBy(xpath = "//input[@id='sb-nps-question-txt']")
		public WebElement npsQuestionInputField;
			
		@FindBy(xpath = "//div[@class='bd-nps-checkbox-wrapper clearfix']/div")
		public WebElement npsDoneButton;
		
		@FindBy(xpath = "//div[@id='bs-ques-wrapper']/div[2]/div[3]/div[contains(text(),'Remove')]")
		public WebElement remove2ndButton;
		
		@FindBy(xpath = "(//div[contains(text(), 'Remove')])[3]")
		public WebElement remove3rdButton;
		
		@FindBy(xpath = "(//div[contains(@class, 'bd-srv-tbl-row')])[2]")
		public WebElement question2nd;
		
		@FindBy(xpath = "//div[text()='Question 2']")
		public WebElement question2Text;
		
		@FindBy(xpath = "//div[text()='Question 3']")
		public WebElement question3Text;
		
		@FindBy(xpath = "//div[text()='Question 4']")
		public WebElement question4Text;
}
