package com.pageobjects.ss;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class GmailPage {
	
	public GmailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement gmailUsername;
	
	@FindBy(id = "identifierNext")
	public WebElement identifierNext;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement gmailPassword;
	
	@FindBy(id = "passwordNext")
	public WebElement passwordNext;
	
	@FindBy(xpath = "//a[@href='https://mail.google.com']")
	public WebElement gmailIcon;
	
	@FindBy(xpath = "(//span[contains(text(),'More')])[1]")
	public WebElement mreIcon;
	
	@FindBy(xpath = ".//*[@id=':yc']/div/div[1]")
	public WebElement allMail;
	
	@FindBy(xpath = "//input[@aria-label = 'Search mail']")
	public WebElement searchInputField;
	
	@FindBy(xpath = "//div[@class = 'Cp']/div[1]/table[1]")
	public WebElement searchResultsTable;
	
	@FindBy(xpath = "//*[@class='bog']/span")
	public List<WebElement> emails;
	
	@FindBy(xpath = "//*[@class='bA4']/span")
	public List<WebElement> emails1;
	
	@FindBy(xpath = "//span[@style='display:inline-block;border-radius:4px;background:#009fe3']/a[text() = 'Get Started']")
	public WebElement getStartedButton;
	
	@FindBys({@FindBy(xpath = "//a[text() = 'Get Started']"),
	           @FindBy(linkText = "Get Started")})
	public WebElement getStartedButton1;
	
	@FindBy(xpath = "//td[contains(@class,'xW xY')]/span")
	public List<WebElement> timeOfEmailElement;
	
	@FindBy(xpath = "(//div[@class = 'G-Ni J-J5-Ji']/div/div[@class='asa'])[7]")
	public WebElement refreshButton;
	
	@FindBy(xpath = "//span[@class='y2']")
	public List<WebElement> spanSubject;
	
	@FindBy(xpath = "//div[@class='y6']/span/span")
	public List<WebElement> spanSubjectClickable;
	
	@FindBy(xpath = "//span[@class='adx']")
	public WebElement olderMessagesInEmailChain;
	
	@FindBy(xpath = "//td/div[@class='iA g6'][@role='gridcell']")
	public List<WebElement> emailGridCells;
	
	@FindBy(xpath = "//span[@style='display:inline-block;border-radius:4px;background:#2f69aa']/a[text() = 'Take Survey']")
	public WebElement takeSurveyButton;
	
	@FindBy(xpath = "//*[@class='hb']/span")
	public WebElement toEmail;
	
	@FindBy(xpath = "//img[@class='hB T-I-J3 ']")
	public WebElement replyButtonForEmailOpened;
	
	@FindBy(xpath = "(//img[@class='hB T-I-J3 '])[4]")
	public WebElement replyButtonFor4thEmail;
	
	@FindBy(xpath = "//div[contains(@aria-label, 'Send')][@role='button']")
	public WebElement sendButtonForEmailOpened;
	
	@FindBy(xpath = "//div[@aria-label='Message Body']")
	public WebElement messageBodyTextBox;
	
	@FindBy(xpath = "//span[@class='gb_xa gbii']")
	public WebElement userImage;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	public WebElement signOutLink;

	@FindBy(xpath = "(//td/div/span[@class='im']/following-sibling::div[1])")
	public List<WebElement> subjectContent;
	
	@FindBy(xpath = "//div[@class='gb_Ob']")
	public List<WebElement> accounts ;
	
	@FindBy(xpath = "//li[@class='h-c-header__nav-li g-mail-nav-links']/a[contains(text(), 'Sign in')]")
	public WebElement signIn;
	
}


