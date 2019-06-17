package com.stepdefinitions.ss;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.base.ss.BaseClass;
import com.google.common.base.Verify;
import com.mysql.cj.exceptions.RSAException;
import com.pageobjects.ss.AbuseReportsPage;
import com.pageobjects.ss.AddTeamMembersPage;
import com.pageobjects.ss.AgentAppsPage;
import com.pageobjects.ss.AgentConfigurePage;
import com.pageobjects.ss.AgentDashboardPage;
import com.pageobjects.ss.AgentHelpPage;
import com.pageobjects.ss.AgentProfilePage;
import com.pageobjects.ss.AgentPublicPage;
import com.pageobjects.ss.AgentReportingPage;
import com.pageobjects.ss.AgentUpdatePasswordPage;
import com.pageobjects.ss.AgentWidgetPage;
import com.pageobjects.ss.AppsPage;
import com.pageobjects.ss.CompAdminDashboardPage;
import com.pageobjects.ss.CompAdminSettingsPage;
import com.pageobjects.ss.CompPublicPage;
import com.pageobjects.ss.CompSocialMonitorPage;
import com.pageobjects.ss.CompanyInformationPage;
import com.pageobjects.ss.ComplaintResolutionPage;
import com.pageobjects.ss.ConfigureEmailsPage;
import com.pageobjects.ss.EditProfilePage;
import com.pageobjects.ss.EditSurveyPage;
import com.pageobjects.ss.GetStartedEmailPage;
import com.pageobjects.ss.GmailPage;
import com.pageobjects.ss.JavaScriptWidgetPage;
import com.pageobjects.ss.LOSearchPage;
import com.pageobjects.ss.LinkedInPage;
import com.pageobjects.ss.LoginPage;
import com.pageobjects.ss.LogoutPage;
import com.pageobjects.ss.MakeYourPaymentPage;
import com.pageobjects.ss.ManageTeamPage;
import com.pageobjects.ss.PublicPage;
import com.pageobjects.ss.QuickEditPage;
import com.pageobjects.ss.RankingSettingsPage;
import com.pageobjects.ss.ReportingPage;
import com.pageobjects.ss.ReportsPage;
import com.pageobjects.ss.SSAdminDashboardPage;
import com.pageobjects.ss.SSAdminHierarchyPage;
import com.pageobjects.ss.SSAdminHomePage;
import com.pageobjects.ss.SendInvitePage;
import com.pageobjects.ss.SurveyPage;
import com.pageobjects.ss.TransactionMonitorPage;
import com.pageobjects.ss.TwitterPage;
import com.pageobjects.ss.UpdatePasswordPage;
import com.pageobjects.ss.UserManagementPage;
import com.pageobjects.ss.ViewHierarchyPage;
import com.util.ss.CommonFunctions;
import com.util.ss.ExcelUtil;
import com.util.ss.Reporting;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCompany extends BaseClass {

	static LoginPage loginPageObject = new LoginPage(driver);
	SendInvitePage sendInvitePageObject = new SendInvitePage(driver);
	SSAdminHomePage ssAdminHomePageObject = new SSAdminHomePage(driver);
	LogoutPage logoutPageObject = new LogoutPage(driver);
	GmailPage gmailPageObject = new GmailPage(driver);
	GetStartedEmailPage getStartedEmailPageObject = new GetStartedEmailPage(driver);
	CompanyInformationPage companyInformationPageObject = new CompanyInformationPage(driver);
	MakeYourPaymentPage makeYourPaymentPageObject = new MakeYourPaymentPage(driver);
	CompAdminDashboardPage compAdminDashboardPageObject = new CompAdminDashboardPage(driver);
	ManageTeamPage manageTeamPageObject = new ManageTeamPage(driver);
	AddTeamMembersPage addTeamMembersPageObject = new AddTeamMembersPage(driver);
	SurveyPage surveyPageObject = new SurveyPage(driver);
	EditProfilePage editProfilePageObject = new EditProfilePage(driver);
	PublicPage publicPageObject = new PublicPage(driver);
	ViewHierarchyPage viewHierarchyPageObject = new ViewHierarchyPage(driver);
	ReportingPage reportingPageObject = new ReportingPage(driver);
	EditSurveyPage editSurveyPageObject = new EditSurveyPage(driver);
	CompAdminSettingsPage compAdminSettingsPageObject = new CompAdminSettingsPage(driver);
	ComplaintResolutionPage complaintResolutionPageObject = new ComplaintResolutionPage(driver);
	ConfigureEmailsPage configureEmailsPageObject = new ConfigureEmailsPage(driver);
	JavaScriptWidgetPage javaScriptWidgetPageObject = new JavaScriptWidgetPage(driver);
	AppsPage appsPageObject = new AppsPage(driver);
	RankingSettingsPage rankingSettingsPageObject = new RankingSettingsPage(driver);
	UpdatePasswordPage updatePasswordPageObject = new UpdatePasswordPage(driver);
	SSAdminDashboardPage ssAdminDashboardPageObject = new SSAdminDashboardPage(driver);
	SSAdminHierarchyPage ssAdminHierarchyPageObject = new SSAdminHierarchyPage(driver);
	AbuseReportsPage abuseReportsPageObject = new AbuseReportsPage(driver);
	UserManagementPage userManagementPageObject = new UserManagementPage(driver);
	ReportsPage reportsPageObject = new ReportsPage(driver);
	TransactionMonitorPage transactionMonitorPageObject = new TransactionMonitorPage(driver);
	AgentDashboardPage agentDashboardPageObject = new AgentDashboardPage(driver);
	AgentReportingPage agentReportingPageObject = new AgentReportingPage(driver);
	AgentProfilePage agentProfilePageObject = new AgentProfilePage(driver);
	AgentHelpPage agentHelpPageObject = new AgentHelpPage(driver);
	AgentConfigurePage agentConfigurePageObject = new AgentConfigurePage(driver);
	AgentWidgetPage agentWidgetPageObject = new AgentWidgetPage(driver);
	AgentAppsPage agentAppsPageObject = new AgentAppsPage(driver);
	AgentUpdatePasswordPage agentUpdatePasswordPageObject = new AgentUpdatePasswordPage(driver);
	CompPublicPage compPublicPageObject = new CompPublicPage(driver);
	AgentPublicPage agentPublicPageObject = new AgentPublicPage(driver);
	LinkedInPage linkedInPageObject = new LinkedInPage(driver);
	TwitterPage twitterPageObject = new TwitterPage(driver);
	CompSocialMonitorPage compSocialMonitorPageObject = new CompSocialMonitorPage(driver);
	LOSearchPage LOSearchPageObject = new LOSearchPage(driver);
	QuickEditPage quickEditPageObject = new QuickEditPage(driver);

	String firstName, customerEmail, companyName, userForRegion, userForCompany, scriptStartTime, agentName, mediaType,
			reviewText, dirPath, surveyResultsFileName, regionName, branchName, publicPageURL;
	int runInstance, reviewAtIndex, numberOfRows;
	Date startDateFinal, endDateFinal;
	List<String> surveySources;
	String buttonOneOpacityToEnter, buttonTwoOpacityToEnter, reviewLoaderOpacityToEnter, initialReviewCountToEnter,
			onLoadReviewCountToEnter, onLoadButtonSizeToEnter, buttonOneLinkToEnter, buttonTwoLinkToEnter,
			socialSurveyFilterToEnter, socialSurveyVerifiedFilterToEnter, zillowFilterToEnter, hideBarGraphValueToEnter,
			hideOptionsValueToEnter, hideContactBtnValueToEnter, hideWriteReviewButtonValueToEnter,
			allowModestRatingValueToEnter;
	String buttonOneOpacity, buttonTwoOpacity, reviewLoaderOpacity, initialReviewCount, onLoadReviewCount,
			onLoadButtonSize, buttonOneLink, buttonTwoLink, socialSurveyFilter, socialSurveyVerifiedFilter,
			zillowFilter, hideBarGraphValue, hideOptionsValue, hideContactBtnValue, hideWriteReviewButtonValue,
			allowModestRatingValue;
	SoftAssert softAssert = new SoftAssert();
	String reviewTextToEnterFinal;
	String currentDir = System.getProperty("user.dir");
	String resourcesPath = currentDir + "//resources";
	Connection connection;
	Statement statement;
	String query;
	ResultSet resultSet;

	@Given("^Login as Social Survey Admin$")
	public void login_as_social_survey_admin() throws Throwable {

		// Run instance creation
		runInstance = (int) CommonFunctions.fn_GenerateRandomNumber(System.currentTimeMillis());
		System.out.println("Runinstace used is : " + runInstance);

		// Script starting time
		scriptStartTime = CommonFunctions.fn_getCurrentDateTime();

		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));

		// Navigate to Send Invite
		CommonFunctions.fn_NavigateToPage(ssAdminHomePageObject.sendInviteLink, "Send Invite",
				"Send Invite for Invoiced Account");

	}

	@And("^Send Invite by entering all the details and logout$")
	public void send_invite_by_entering_all_the_details_and_logout() throws Throwable {

		// Get the values from excel file
		firstName = ExcelUtil.getCellValueByColumnName("Send Invite", "First Name") + runInstance;
		System.out.println(firstName);

		String lastName = ExcelUtil.getCellValueByColumnName("Send Invite", "Last Name") + runInstance;
		System.out.println(lastName);

		String[] splitCustEmail = ExcelUtil.getCellValueByColumnName("Send Invite", "Customer Email").split("@");
		customerEmail = splitCustEmail[0] + "+" + runInstance + "@" + splitCustEmail[1];
		System.out.println(customerEmail);

		String inviteEmail = ExcelUtil.getCellValueByColumnName("Send Invite", "Invite Email");
		System.out.println(inviteEmail);

		// Enter all the fields, send the invite and logout
		CommonFunctions.fn_SendInvite(sendInvitePageObject, firstName, lastName, customerEmail, inviteEmail);
		CommonFunctions.fn_LogOutAsSSAdmin(ssAdminHomePageObject);

	}

	@And("^Login to gmail account of the customer$")
	public void login_to_gmail_account_of_the_customer() throws Throwable {

		// Login to Email account
		CommonFunctions.fn_OpenURL(prop.getProperty("GMAILURL"));
		Thread.sleep(2000);
		CommonFunctions.fn_LoginToGmail(gmailPageObject, ExcelUtil.getCellData("Login Details", 2, 1),
				ExcelUtil.getCellData("Login Details", 2, 2));
		Thread.sleep(3000);

		// Navigate to staging test account
		/*
		 * gmailPageObject.userImage.click(); Thread.sleep(2000); for(int i=0;
		 * i<gmailPageObject.accounts.size(); i++) {
		 * if(gmailPageObject.accounts.get(i).getText().contains(ExcelUtil.
		 * getCellData("Login Details", 2, 3))){
		 * gmailPageObject.accounts.get(i).click(); Thread.sleep(5000); } }
		 * 
		 * CommonFunctions.fn_SwitchToNewWindow(); Thread.sleep(2000);
		 */

	}

	@And("^Click on link in the email and enter all company details$")
	public void click_on_link_in_the_email_and_enter_all_company_details() throws Throwable {

		// Get the number of windows before clicking on Get Started
		final int windowsBefore = driver.getWindowHandles().size();

		// Search and click on email
		CommonFunctions.fn_SearchAndClickOnGmail(gmailPageObject, firstName, scriptStartTime);
		Thread.sleep(2000);

		// Click on Get Started Button
		gmailPageObject.getStartedButton = driver.findElement(By.xpath(
				"//span[@style='display:inline-block;border-radius:4px;background:#009fe3']/a[text() = 'Get Started']"));
		CommonFunctions.fn_WaitForAnElementToBeVisible(gmailPageObject.getStartedButton);
		gmailPageObject.getStartedButton = driver.findElement(By.xpath(
				"//span[@style='display:inline-block;border-radius:4px;background:#009fe3']/a[text() = 'Get Started']"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(gmailPageObject.getStartedButton);
		gmailPageObject.getStartedButton.click();

		// Wait for the new window and switch to it
		CommonFunctions.fn_WaitForNewWindow(windowsBefore);
		Thread.sleep(4000);
		String parentWindow = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();

		// Verify for the values
		Verify.verify(true, "firstName is not proper", getStartedEmailPageObject.firstName.getAttribute("value"),
				"QASVKTEST" + runInstance);
		Verify.verify(true, "lastName is not proper", getStartedEmailPageObject.lastName.getAttribute("value"),
				"QASVKTEST" + runInstance);
		Verify.verify(true, "Email is not proper", getStartedEmailPageObject.email.getAttribute("value"),
				"savita+" + runInstance + "@infrrd.ai");

		// Enter the values in company admin info page and submit
		getStartedEmailPageObject.firstName.clear();
		getStartedEmailPageObject.firstName
				.sendKeys(ExcelUtil.getCellValueByColumnName("Company Admin Basic Info", "First Name"));
		getStartedEmailPageObject.lastName.clear();
		getStartedEmailPageObject.lastName
				.sendKeys(ExcelUtil.getCellValueByColumnName("Company Admin Basic Info", "Last Name"));
		getStartedEmailPageObject.password
				.sendKeys(ExcelUtil.getCellValueByColumnName("Company Admin Basic Info", "Password"));
		getStartedEmailPageObject.passwordToConfirm
				.sendKeys(ExcelUtil.getCellValueByColumnName("Company Admin Basic Info", "Confirm Password"));
		getStartedEmailPageObject.submitButton.click();

		// Enter the values in company information page
		CommonFunctions.fn_WaitTillPageLoads("Company Information");
		companyName = ExcelUtil.getCellValueByColumnName("Company Information", "Company Name") + runInstance;
		companyInformationPageObject.companyName.sendKeys(companyName);
		companyInformationPageObject.companyAddress1
				.sendKeys(ExcelUtil.getCellValueByColumnName("Company Information", "Address 1"));
		companyInformationPageObject.companyAddress2
				.sendKeys(ExcelUtil.getCellValueByColumnName("Company Information", "Address 2"));
		String compCountry = ExcelUtil.getCellValueByColumnName("Company Information", "Country");
		if (!(compCountry.equalsIgnoreCase(companyInformationPageObject.companyCountry.getAttribute("value")))) {
			companyInformationPageObject.companyCountry.clear();
			companyInformationPageObject.companyCountry.sendKeys(compCountry);
			CommonFunctions.fn_ClickOnItemInDropDown(companyInformationPageObject.companyCountryListItems, compCountry);
		}
		String zipCodeToEnter = Integer.toString(
				(int) Double.parseDouble(ExcelUtil.getCellValueByColumnName("Company Information", "Zip Code")));
		companyInformationPageObject.companyZipCode.sendKeys(zipCodeToEnter);
		CommonFunctions.fn_SelectByVisibleText(companyInformationPageObject.companyState,
				ExcelUtil.getCellValueByColumnName("Company Information", "State"));
		companyInformationPageObject.companyContactNumber
				.sendKeys(ExcelUtil.getCellValueByColumnName("Company Information", "Contact Number"));
		CommonFunctions.fn_SelectByVisibleText(companyInformationPageObject.companyBusinessType,
				ExcelUtil.getCellValueByColumnName("Company Information", "Business Type"));
		companyInformationPageObject.doneButton.click();

		// Select small business in make your payment page
		CommonFunctions.fn_WaitTillPageLoads("Make Your Payment");
		makeYourPaymentPageObject.smallBusinessTrialButton.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitTillPageLoads("Dashboard");

		// Close the banner, verify if the company name is proper and logout
		Verify.verify(true, "Company name is not correct", compAdminDashboardPageObject.companyName.getText(),
				companyName);
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

		// Switch back to parent window
		driver.close();
		driver.switchTo().window(parentWindow);

	}

	@When("^Login with Company credentials entered$")
	public void login_with_company_credentials_entered() throws Throwable {

		// Login to the newly created company admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, customerEmail, "test12");

	}

	@Then("^Company admin should be able to login to the company$")
	public void company_admin_should_be_able_to_login_to_the_company() throws Throwable {

		// Verify for the company name
		Verify.verify(true, "Company name is not correct", compAdminDashboardPageObject.companyName.getText(),
				companyName);

		// Put the company email and password into excel
		ExcelUtil.setCellData("Login Details", customerEmail, 3, 1);
		ExcelUtil.setCellData("Login Details", companyName, 3, 3);
		ExcelUtil.setCellData("Login Details",
				ExcelUtil.getCellValueByColumnName("Company Admin Basic Info", "Password"), 3, 2);
	}

	@And("^Company admin should be able to add region, office and user$")
	public void company_admin_should_be_able_to_add_region_office_and_user() throws Throwable {

		// Navigate to Manage Team - Add Team Members
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.addTeamMembersButton);
		CommonFunctions.fn_NavigateToPage(manageTeamPageObject.addTeamMembersButton, "Add Team Members",
				"Build Hierarchy");

		// Navigate to Region Tab
		addTeamMembersPageObject.regionTab.click();
		Thread.sleep(2000);

		// Enter all fields and create a region
		CommonFunctions.fn_WaitForAnElementToBeVisible(addTeamMembersPageObject.regionName);
		Thread.sleep(2000);
		addTeamMembersPageObject.regionName
				.sendKeys(ExcelUtil.getCellValueByColumnName("Region Details", "Region Name"));
		addTeamMembersPageObject.regionAddress1
				.sendKeys(ExcelUtil.getCellValueByColumnName("Region Details", "Address 1"));
		addTeamMembersPageObject.regionAddress2
				.sendKeys(ExcelUtil.getCellValueByColumnName("Region Details", "Address 2"));
		String regionCountry = ExcelUtil.getCellValueByColumnName("Region Details", "Country");
		if (!(regionCountry.equalsIgnoreCase(addTeamMembersPageObject.regionCountry.getAttribute("value")))) {
			addTeamMembersPageObject.regionCountry.clear();
			addTeamMembersPageObject.regionCountry.sendKeys(regionCountry);
			CommonFunctions.fn_ClickOnItemInDropDown(addTeamMembersPageObject.regionCountryListValues, regionCountry);
		}
		Thread.sleep(2000);
		CommonFunctions.fn_SelectByVisibleText(addTeamMembersPageObject.regionState,
				ExcelUtil.getCellValueByColumnName("Region Details", "State"));
		Thread.sleep(4000);
		String regionCity = ExcelUtil.getCellValueByColumnName("Region Details", "City");
		addTeamMembersPageObject.regionCity.click();
		addTeamMembersPageObject.regionCity.sendKeys(regionCity);
		;
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(addTeamMembersPageObject.regionCityListValues, regionCity);
		addTeamMembersPageObject.regionZipCode.sendKeys(Integer
				.toString((int) Double.parseDouble(ExcelUtil.getCellValueByColumnName("Region Details", "Zip Code"))));
		String[] user = ExcelUtil.getCellValueByColumnName("Region Details", "User For Region").split("@");
		userForRegion = user[0] + "+" + runInstance + "1@" + user[1];
		addTeamMembersPageObject.userForRegion.sendKeys(userForRegion);
		addTeamMembersPageObject.regionSaveButton.click();
		Verify.verify(true, "Success Message is not proper.", addTeamMembersPageObject.regionAddedSuccessMsg.getText(),
				"Region has been added successfully ");

		// Enter all the fields to create a office
		addTeamMembersPageObject.officeTab.click();
		CommonFunctions.fn_WaitForAnElementToBeVisible(addTeamMembersPageObject.officeName);
		addTeamMembersPageObject.officeName
				.sendKeys(ExcelUtil.getCellValueByColumnName("Office Details", "Office Name"));
		addTeamMembersPageObject.assignTo.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeVisible(addTeamMembersPageObject.assignToDropDownList);
		CommonFunctions.fn_ClickOnItemInDropDown(addTeamMembersPageObject.assignToDropDownListItems,
				ExcelUtil.getCellValueByColumnName("Office Details", "Assign To"));
		Thread.sleep(2000);
		addTeamMembersPageObject.selectRegion.click();
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(addTeamMembersPageObject.selectRegionListItems,
				ExcelUtil.getCellValueByColumnName("Office Details", "Select Region"));
		addTeamMembersPageObject.officeAddress1
				.sendKeys(ExcelUtil.getCellValueByColumnName("Office Details", "Address 1"));
		addTeamMembersPageObject.officeAddress2
				.sendKeys(ExcelUtil.getCellValueByColumnName("Office Details", "Address 2"));

		String officeCountry = ExcelUtil.getCellValueByColumnName("Region Details", "Country");
		if (!(officeCountry.equalsIgnoreCase(addTeamMembersPageObject.offcieCountry.getAttribute("value")))) {
			addTeamMembersPageObject.offcieCountry.clear();
			addTeamMembersPageObject.offcieCountry.sendKeys(officeCountry);
			CommonFunctions.fn_ClickOnItemInDropDown(addTeamMembersPageObject.officeCityListValues, officeCountry);
		}

		Thread.sleep(2000);
		CommonFunctions.fn_SelectByVisibleText(addTeamMembersPageObject.officeState,
				ExcelUtil.getCellValueByColumnName("Office Details", "State"));
		Thread.sleep(3000);
		addTeamMembersPageObject.officeCity.click();
		addTeamMembersPageObject.officeCity.sendKeys(ExcelUtil.getCellValueByColumnName("Office Details", "City"));
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(addTeamMembersPageObject.officeCityListValues,
				ExcelUtil.getCellValueByColumnName("Office Details", "City"));
		addTeamMembersPageObject.officeZipCode.sendKeys(Integer
				.toString((int) Double.parseDouble(ExcelUtil.getCellValueByColumnName("Office Details", "Zip Code"))));
		String[] userForOfc = ExcelUtil.getCellValueByColumnName("Office Details", "User For Office").split("@");
		String userForOffice = userForOfc[0] + "+" + runInstance + "1@" + userForOfc[1];
		addTeamMembersPageObject.userForOffice.sendKeys(userForOffice);
		Thread.sleep(2000);
		addTeamMembersPageObject.officeSaveButton.click();
		Thread.sleep(2000);
		Verify.verify(true, "Success Message is not proper.", addTeamMembersPageObject.regionAddedSuccessMsg.getText(),
				"Office has been added successfully");

		// Enter all the fields to create User to Company
		addTeamMembersPageObject.individualTab.click();
		CommonFunctions.fn_WaitForAnElementToBeVisible(addTeamMembersPageObject.assignToDropDownInput);
		Thread.sleep(2000);
		addTeamMembersPageObject.assignToDropDownInput.click();
		CommonFunctions.fn_WaitForAnElementToBeVisible(addTeamMembersPageObject.assignToDropDownList);
		CommonFunctions.fn_ClickOnItemInDropDown(addTeamMembersPageObject.assignToDropDownListItems,
				ExcelUtil.getCellValueByColumnName("User Details", "Assign To"));
		CommonFunctions.fn_WaitForAnElementToBeInvisible(addTeamMembersPageObject.selectOfficeDropDownInput);
		Thread.sleep(2000);
		addTeamMembersPageObject.addUserDropDownInput.clear();
		String[] userForComp = ExcelUtil.getCellValueByColumnName("User Details", "User For Company").split("@");
		userForCompany = userForComp[0] + "+" + runInstance + "1@" + userForComp[1];
		addTeamMembersPageObject.addUserDropDownInput.sendKeys(userForCompany);
		Thread.sleep(2000);
		addTeamMembersPageObject.saveButton.click();
		Thread.sleep(2000);

		// Verify the user created and logout
		Verify.verify(true, "User name is not correct", addTeamMembersPageObject.addedUserText.getText(),
				userForComp[0]);
		ExcelUtil.setCellData("Login Details", userForCompany, 4, 1);
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);
	}

	@Given("^Login as Company Admin$")
	public void login_as_company_admin() throws Throwable {

		// Login to the newly created company admin
		// Generate run instance and script start time
		runInstance = (int) CommonFunctions.fn_GenerateRandomNumber(System.currentTimeMillis());
		scriptStartTime = CommonFunctions.fn_getCurrentDateTime();

		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Select past 30 days radio button
		// ssAdminHierarchyPageObject.thirtyDaysRadioButton.click();

		// Search the new company created
		companyName = ExcelUtil.getCellData("Login Details", 3, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		Thread.sleep(2000);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(Keys.ENTER);
		// ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(5000);

		// Click on login as if the company searched is found
		System.out.println(companyName);
		if (ssAdminHierarchyPageObject.companyName.getText().contains(companyName)) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

	}

	@And("^Social monitor is enabled in company admin$")
	public void social_monitor_is_enabled_in_company_admin() throws Throwable {

		// Navigate to Settings page
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.configureLink, "Settings", "Edit Settings");

		// Enable social monitor if not enabled
		if (compAdminSettingsPageObject.enableSocialMonitorCheckBoxValue.getAttribute("value")
				.equalsIgnoreCase("false")) {
			compAdminSettingsPageObject.enableSocialMonitorCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already checked and the value is true");
		}

		// Refresh and check if the social monitor link is displayed
		driver.navigate().refresh();
		CommonFunctions.fn_WaitTillPageLoads("Edit Settings");
		Verify.verify(compAdminDashboardPageObject.socialMonitorLink.isDisplayed());

	}

	@And("^User is added in manage team$")
	public void user_is_added_in_manage_team() throws Throwable {

		// Navigate to Manage Team - View Hierarchy
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		Thread.sleep(3000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.addTeamMembersButton);
		manageTeamPageObject.viewHierarchyButton.click();
		Thread.sleep(3000);

	}

	@And("^Edit the survey with all type of questions$")
	public void edit_the_survey_with_all_type_of_questions() throws Throwable {

		// Navigate to Edit Survey
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.editSurveyLink, "Edit Survey", "Build Survey");
		Assert.assertEquals(editSurveyPageObject.questionNumbers.size(), 3);

		// Delete two questions
		CommonFunctions.fn_MouseHover(editSurveyPageObject.question2nd);
		Thread.sleep(2000);
		editSurveyPageObject.remove2ndButton.click();
		Thread.sleep(2000);
		if (editSurveyPageObject.unsavedChangesPopupHeader.isDisplayed()) {
			Assert.assertEquals(editSurveyPageObject.unsavedChangesPopupHeader.getText(), "Delete Question");
			editSurveyPageObject.unsavedChangesPopupContinueButton.click();
		}
		Thread.sleep(2000);
		System.out.println(editSurveyPageObject.questionNumbers.size());
		Assert.assertEquals(editSurveyPageObject.questionNumbers.size(), 2);

		CommonFunctions.fn_MouseHover(editSurveyPageObject.question2nd);
		Thread.sleep(2000);
		editSurveyPageObject.remove2ndButton.click();
		Thread.sleep(2000);
		if (editSurveyPageObject.unsavedChangesPopupHeader.isDisplayed()) {
			Assert.assertEquals(editSurveyPageObject.unsavedChangesPopupHeader.getText(), "Delete Question");
			editSurveyPageObject.unsavedChangesPopupContinueButton.click();
		}
		Thread.sleep(2000);
		System.out.println(editSurveyPageObject.questionNumbers.size());
		Assert.assertEquals(editSurveyPageObject.questionNumbers.size(), 1);

		// Add 3 other different questions
		editSurveyPageObject.addQuestionButton.click();
		Thread.sleep(2000);
		// Star Smiley
		editSurveyPageObject.surveyQuestionInputTextBox
				.sendKeys(ExcelUtil.getCellValueByColumnName("Survey Questions", "Question 2"));
		if (!editSurveyPageObject.starsSmiley.isDisplayed()) {
			editSurveyPageObject.range1to5Tab.click();
		}
		editSurveyPageObject.starsSmiley.click();
		editSurveyPageObject.doneButton.click();
		if (editSurveyPageObject.unsavedChangesPopupHeader.isDisplayed()) {
			Assert.assertEquals(editSurveyPageObject.unsavedChangesPopupHeader.getText(), "Unsaved changes detected");
			editSurveyPageObject.unsavedChangesPopupContinueButton.click();
		}
		System.out.println(editSurveyPageObject.questionNumbers.size());
		CommonFunctions.fn_WaitForAnElementToBeVisible(editSurveyPageObject.question2Text);
		Assert.assertEquals(editSurveyPageObject.questionNumbers.size(), 2);

		// Comment
		CommonFunctions.fn_WaitForAnElementToBeClickable(editSurveyPageObject.addQuestionButton);
		Thread.sleep(2000);
		editSurveyPageObject.addQuestionButton.click();
		editSurveyPageObject.surveyQuestionInputTextBox
				.sendKeys(ExcelUtil.getCellValueByColumnName("Survey Questions", "Question 3"));
		editSurveyPageObject.commentTab.click();
		editSurveyPageObject.doneButton.click();
		if (editSurveyPageObject.unsavedChangesPopupHeader.isDisplayed()) {
			Assert.assertEquals(editSurveyPageObject.unsavedChangesPopupHeader.getText(), "Unsaved changes detected");
			editSurveyPageObject.unsavedChangesPopupContinueButton.click();
		}
		CommonFunctions.fn_WaitForAnElementToBeVisible(editSurveyPageObject.question3Text);
		Assert.assertEquals(editSurveyPageObject.questionNumbers.size(), 3);

		// Multiple Choice Question
		editSurveyPageObject.addQuestionButton.click();
		editSurveyPageObject.surveyQuestionInputTextBox
				.sendKeys(ExcelUtil.getCellValueByColumnName("Survey Questions", "Question 4"));
		editSurveyPageObject.multipleChoiceTab.click();
		for (int i = 0; i < editSurveyPageObject.options.size(); i++) {
			editSurveyPageObject.options.get(i).sendKeys("Option" + i);
		}
		CommonFunctions.fn_WaitForAnElementToBeClickable(editSurveyPageObject.doneButton);
		editSurveyPageObject.doneButton.click();
		editSurveyPageObject.doneButton.click();
		if (editSurveyPageObject.unsavedChangesPopupHeader.isDisplayed()) {
			Assert.assertEquals(editSurveyPageObject.unsavedChangesPopupHeader.getText(), "Unsaved changes detected");
			editSurveyPageObject.unsavedChangesPopupContinueButton.click();
		}
		CommonFunctions.fn_WaitForAnElementToBeVisible(editSurveyPageObject.question4Text);
		Assert.assertEquals(editSurveyPageObject.questionNumbers.size(), 4);

		// NPS Question Enabling
		System.out.println(editSurveyPageObject.npsCheckBoxValue.getAttribute("value"));
		if (editSurveyPageObject.npsCheckBoxValue.getAttribute("value").equalsIgnoreCase("false")) {
			editSurveyPageObject.npsCheckBox.click();
			System.out.println(editSurveyPageObject.npsCheckBoxValue.getAttribute("value"));
		}
		System.out.println(editSurveyPageObject.npsCheckBoxValue.getAttribute("value"));
		Thread.sleep(2000);
		Assert.assertEquals(editSurveyPageObject.npsQuestionInputField.isDisplayed(), true);
		editSurveyPageObject.npsDoneButton.click();
		if (editSurveyPageObject.unsavedChangesPopupHeader.isDisplayed()) {
			Assert.assertEquals(editSurveyPageObject.unsavedChangesPopupHeader.getText(), "Unsaved changes detected");
			editSurveyPageObject.unsavedChangesPopupContinueButton.click();
		}

	}

	@And("^Social medias are connected in settings page$")
	public void social_medias_are_connected_in_settings_page() throws Throwable {

		// Navigate to Settings page
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.configureLink, "Settings", "Edit Settings");

		// Check the auto post check box if not checked
		if (compAdminSettingsPageObject.autoPostCheckBoxValue.getAttribute("value").equalsIgnoreCase("false")) {
			compAdminSettingsPageObject.autoPostCheckBox.click();
		}

		// Click on linked in button
		/*
		 * compAdminSettingsPageObject.linkedInButton.click(); final int windowsBefore =
		 * driver.getWindowHandles().size();
		 * 
		 * // Click on continue button in confirm user authentication popup if
		 * (compAdminSettingsPageObject.popupHeader.isDisplayed()) {
		 * Assert.assertEquals(compAdminSettingsPageObject.popupHeader.getText(),
		 * "Confirm user Authentication");
		 * compAdminSettingsPageObject.popupContinueButton.click(); } else {
		 * System.out.println("Popup is not displayed"); }
		 * 
		 * // Wait for new window and switch to it
		 * CommonFunctions.fn_WaitForNewWindow(windowsBefore); Thread.sleep(4000);
		 * String parentWindow = driver.getWindowHandle();
		 * CommonFunctions.fn_SwitchToNewWindow();
		 * 
		 * // Enter the values and sign in compAdminSettingsPageObject.userName.clear();
		 * compAdminSettingsPageObject.userName.sendKeys(ExcelUtil.
		 * getCellValueByColumnName("Social Media", "User Name"));
		 * compAdminSettingsPageObject.password.clear();
		 * compAdminSettingsPageObject.password.sendKeys(ExcelUtil.
		 * getCellValueByColumnName("Social Media", "Password"));
		 * compAdminSettingsPageObject.signInButton.click(); Thread.sleep(2000);
		 * 
		 * // Click on allow button if permission page is displayed and wait
		 * Thread.sleep(4000);
		 * 
		 * // Close this window and switch to parent window
		 * driver.switchTo().window(parentWindow);
		 * 
		 * // Click on cancel button in Linked In URL popup if
		 * (compAdminSettingsPageObject.linkedInURLPopupHeader.isDisplayed()) {
		 * Assert.assertEquals(compAdminSettingsPageObject.linkedInURLPopupHeader.
		 * getText(), "LinkedIn Url Confirmation");
		 * compAdminSettingsPageObject.linkedInURLPopupCancelButton.click(); } else {
		 * System.out.println("Popup is not displayed"); }
		 * 
		 * // Verify if it is connected Thread.sleep(2000);
		 */ // Assert.assertEquals(compAdminSettingsPageObject.linkedInDisconnectButton.getAttribute("title"),
		// "Disconnect" );

		// Twitter
		compAdminSettingsPageObject.twitterButton.click();
		final int windowsBefore1 = driver.getWindowHandles().size();

		// Click on continue button in confirm user authentication pop up
		if (compAdminSettingsPageObject.popupHeader.isDisplayed()) {
			Assert.assertEquals(compAdminSettingsPageObject.popupHeader.getText(), "Confirm user Authentication");
			compAdminSettingsPageObject.popupContinueButton.click();
		} else {
			System.out.println("Popup is not displayed");
		}

		// Wait for new window and switch to it
		CommonFunctions.fn_WaitForNewWindow(windowsBefore1);
		Thread.sleep(4000);
		String parentWindow1 = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();

		// Enter the values and sign in
		compAdminSettingsPageObject.twitterUserName.clear();
		compAdminSettingsPageObject.twitterUserName
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Media", "User Name"));
		compAdminSettingsPageObject.twitterPassword.clear();
		compAdminSettingsPageObject.twitterPassword
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Media", "Password"));
		compAdminSettingsPageObject.allowButtonInTwitter.click();
		Thread.sleep(4000);

		// Close this window and switch to parent window
		driver.switchTo().window(parentWindow1);

		// Verify if it is connected
		Thread.sleep(4000);
		Assert.assertEquals(compAdminSettingsPageObject.twitterDisconnectButton.getAttribute("title"), "Disconnect");

		// Logout
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

		// Facebook Connection
		// Login to company using different url with the same new company

		/*
		 * CommonFunctions.fn_OpenURL(prop.getProperty("URLFORFACEBOOK"));
		 * CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject,
		 * ExcelUtil.getCellData("Login Details", 3, 1),
		 * ExcelUtil.getCellData("Login Details", 3, 2)); Thread.sleep(2000);
		 * 
		 * // Navigate to Settings page
		 * CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.configureLink,
		 * "Settings", "Edit Settings");
		 * 
		 * // Check the auto post check box if not checked if
		 * (compAdminSettingsPageObject.autoPostCheckBoxValue.getAttribute("value").
		 * equalsIgnoreCase("false")) {
		 * compAdminSettingsPageObject.autoPostCheckBox.click(); }
		 * 
		 * // Click on facebook button
		 * compAdminSettingsPageObject.facebookButton.click(); final int windowsBefore2
		 * = driver.getWindowHandles().size();
		 * 
		 * // Click on continue button in confirm user authentication popup if
		 * (compAdminSettingsPageObject.popupHeader.isDisplayed()) {
		 * Assert.assertEquals(compAdminSettingsPageObject.popupHeader.getText(),
		 * "Confirm user Authentication");
		 * compAdminSettingsPageObject.popupContinueButton.click(); } else {
		 * System.out.println("Popup is not displayed"); }
		 * 
		 * // Wait for new window and switch to it
		 * CommonFunctions.fn_WaitForNewWindow(windowsBefore2); Thread.sleep(4000);
		 * String parentWindow2 = driver.getWindowHandle();
		 * CommonFunctions.fn_SwitchToNewWindow();
		 * 
		 * // Enter the values and sign in
		 * compAdminSettingsPageObject.facebookEmail.clear();
		 * compAdminSettingsPageObject.facebookEmail
		 * .sendKeys(ExcelUtil.getCellValueByColumnName("Social Media", "User Name"));
		 * compAdminSettingsPageObject.facebookPassword.clear();
		 * compAdminSettingsPageObject.facebookPassword
		 * .sendKeys(ExcelUtil.getCellValueByColumnName("Social Media", "Password"));
		 * compAdminSettingsPageObject.facebookLoginButton.click(); Thread.sleep(2000);
		 * 
		 * if (!(compAdminSettingsPageObject.facebookRadioButton.getSize().toString().
		 * contains("(0,0)"))) {
		 * compAdminSettingsPageObject.facebookRadioButton.click();
		 * compAdminSettingsPageObject.facebookSaveButton.click(); } else
		 * System.out.println("Confirm button not displayed");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * // Close this window and switch to parent window
		 * driver.switchTo().window(parentWindow2); Thread.sleep(1000);
		 * 
		 * // Verify if it is connected
		 * Assert.assertEquals(compAdminSettingsPageObject.facebookDisconnectButton.
		 * getAttribute("title"), "Disconnect");
		 */
		// Logout
		// CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

	}

	@And("^Survey is sent to the user navigating to dashboard and logout$")
	public void survey_is_sent_to_the_user_navigating_to_dashboard_and_logout() throws Throwable {

		// Login to Company Admin
		Thread.sleep(2000);
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 3, 1),
				ExcelUtil.getCellData("Login Details", 3, 2));
		Thread.sleep(2000);

		// Click on Send Survey
		CommonFunctions.fn_WaitForAnElementToBeVisible(compAdminDashboardPageObject.surveyLink);
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.surveyLink);
		compAdminDashboardPageObject.surveyLink.click();

		// Enter all the fields and send the survey
		CommonFunctions.fn_WaitForAnElementToBeVisible(compAdminDashboardPageObject.surveyUserName);
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.surveyUserName);
		compAdminDashboardPageObject.surveyUserName.clear();
		System.out.println(ExcelUtil.getCellValueByColumnName("User Details", "User For Company").split("@"));
		System.out.println(ExcelUtil.getCellValueByColumnName("User Details", "User For Company").split("@")[0]);
		compAdminDashboardPageObject.surveyUserName
				.sendKeys(ExcelUtil.getCellValueByColumnName("User Details", "User For Company").split("@")[0]);
		Thread.sleep(1000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.surveyUserNameMenuItems,
				ExcelUtil.getCellValueByColumnName("User Details", "User For Company").split("@")[0]);
		compAdminDashboardPageObject.surveyFirstName
				.sendKeys(ExcelUtil.getCellValueByColumnName("Send Survey", "First Name"));
		compAdminDashboardPageObject.surveyLastName
				.sendKeys(ExcelUtil.getCellValueByColumnName("Send Survey", "Last Name"));
		String[] emailToSplit = ExcelUtil.getCellValueByColumnName("Send Survey", "Email To").split("@");
		compAdminDashboardPageObject.surveyEmailTo
				.sendKeys(emailToSplit[0] + "+" + runInstance + "@" + emailToSplit[1]);
		compAdminDashboardPageObject.surveySend.click();

		// Verifying the success message and logout
		Verify.verify(true, "Survey send success message is not proper",
				compAdminDashboardPageObject.surveySendSuccMsg.getText(), "1 Survey Request Sent Successfully!");
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

	}

	@When("^User submits the survey from the email sent$")
	public void user_submits_the_survey_from_the_email_sent() throws Throwable {

		// Navigate to Gmail
		CommonFunctions.fn_OpenURL(prop.getProperty("GMAILURL"));
		Thread.sleep(3000);
		/*
		 * if(driver.getTitle().contains("Free Storage and Email from Google")) {
		 * gmailPageObject.signIn.click(); Thread.sleep(3000);
		 * CommonFunctions.fn_SwitchToNewWindow(); Thread.sleep(3000);
		 * CommonFunctions.fn_LoginToGmail(gmailPageObject,
		 * ExcelUtil.getCellData("Login Details", 2, 1),
		 * ExcelUtil.getCellData("Login Details", 2, 2)); Thread.sleep(3000); }
		 * CommonFunctions.fn_LoginToGmail(gmailPageObject,
		 * ExcelUtil.getCellData("Login Details", 2, 1),
		 * ExcelUtil.getCellData("Login Details", 2, 2)); Thread.sleep(3000);
		 */

		// Navigate to staging test account
		/*
		 * gmailPageObject.userImage.click(); Thread.sleep(2000); for(int i=0;
		 * i<gmailPageObject.accounts.size(); i++) {
		 * if(gmailPageObject.accounts.get(i).getText().contains(ExcelUtil.
		 * getCellData("Login Details", 2, 3))){
		 * gmailPageObject.accounts.get(i).click(); Thread.sleep(5000); } }
		 * 
		 * CommonFunctions.fn_SwitchToNewWindow(); Thread.sleep(2000);
		 */

		// Get number of windows before clicking on take survey
		final int windowsBefore = driver.getWindowHandles().size();

		// Search the take survey email and click on it
		CommonFunctions.fn_SearchAndClickOnGmail(gmailPageObject,
				"Dear " + (ExcelUtil.getCellValueByColumnName("User Details", "User For Company").split("@"))[0]
						+ ", Thank you so much for your business. ",
				scriptStartTime);
		Thread.sleep(2000);

		// Click on Take Survey button
		gmailPageObject.takeSurveyButton = driver.findElement(By.xpath(
				"//span[@style='display:inline-block;border-radius:4px;background:#2f69aa']/a[text() = 'Take Survey']"));
		CommonFunctions.fn_WaitForAnElementToBeVisible(gmailPageObject.takeSurveyButton);
		gmailPageObject.takeSurveyButton = driver.findElement(By.xpath(
				"//span[@style='display:inline-block;border-radius:4px;background:#2f69aa']/a[text() = 'Take Survey']"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(gmailPageObject.takeSurveyButton);
		gmailPageObject.takeSurveyButton.click();
		System.out.println("clicked on Take Survey button");

		// Wait till the new window opens and switch to it
		CommonFunctions.fn_WaitForNewWindow(windowsBefore);
		Thread.sleep(4000);
		String parentWindow = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();

		// Answer the first survey question
		CommonFunctions.fn_WaitTillTextIsPresentInElement(surveyPageObject.surveySmileQuestion,
				"How would you rate the service and support you received?");
		CommonFunctions.fn_WaitForAnElementToBeVisible(surveyPageObject.smileFour);
		CommonFunctions.fn_WaitForAnElementToBeClickable(surveyPageObject.smileFour);
		Actions action = new Actions(driver);
		action.moveToElement(surveyPageObject.smileFour).click(surveyPageObject.smileFour).build().perform();
		CommonFunctions.fn_WaitForAnElementToBeVisible(surveyPageObject.nextSmileButton);
		CommonFunctions.fn_WaitForAnElementToBeClickable(surveyPageObject.nextSmileButton);
		Thread.sleep(2000);
		surveyPageObject.nextSmileButton.click();
		Thread.sleep(2000);

		// Answer the second survey question
		CommonFunctions.fn_WaitTillTextIsPresentInElement(surveyPageObject.surveyStarQuestion, "Question 2");
		CommonFunctions.fn_WaitForAnElementToBeVisible(surveyPageObject.starFour);
		CommonFunctions.fn_WaitForAnElementToBeClickable(surveyPageObject.starFour);
		action.moveToElement(surveyPageObject.smileFour).click(surveyPageObject.starFour).build().perform();
		CommonFunctions.fn_WaitForAnElementToBeVisible(surveyPageObject.nextStarButton);
		CommonFunctions.fn_WaitForAnElementToBeClickable(surveyPageObject.nextStarButton);
		Thread.sleep(2000);
		surveyPageObject.nextStarButton.click();
		Thread.sleep(2000);

		// Answer the third survey question
		try {

			CommonFunctions.fn_WaitTillTextIsPresentInElement(surveyPageObject.surveyOverAllExpText, "Question 3");
			CommonFunctions.fn_WaitForAnElementToBeVisible(surveyPageObject.textArea);
			CommonFunctions.fn_WaitForAnElementToBeClickable(surveyPageObject.textArea);
			surveyPageObject.textArea.sendKeys("I had great experience.");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
		surveyPageObject.overallExperienceNext.click();
		Thread.sleep(2000);

		// Answer the fourth survey question
		CommonFunctions.fn_WaitTillTextIsPresentInElement(surveyPageObject.surveyMCQQuestionText, "Question 4");
		CommonFunctions.fn_WaitForAnElementToBeVisible(surveyPageObject.Option3RadioButton);
		CommonFunctions.fn_WaitForAnElementToBeClickable(surveyPageObject.Option3RadioButton);
		surveyPageObject.Option3RadioButton.click();
		Thread.sleep(2000);
		surveyPageObject.nextMCQButton.click();
		Thread.sleep(2000);

		// Answer the NPS survey question
		CommonFunctions.fn_WaitTillTextIsPresentInElement(surveyPageObject.surveyNPSQuestionText,
				"How likely are you to refer friends and family to");
		CommonFunctions.fn_WaitForAnElementToBeVisible(surveyPageObject.radio9Button);
		CommonFunctions.fn_WaitForAnElementToBeClickable(surveyPageObject.radio9Button);
		surveyPageObject.radio9Button.click();
		Thread.sleep(2000);
		surveyPageObject.nextRadioButton.click();
		Thread.sleep(2000);

		// Answer the overall experience survey question
		CommonFunctions.fn_WaitTillTextIsPresentInElement(surveyPageObject.surveyOverAllExpText,
				"How would you rate your overall experience?");
		CommonFunctions.fn_WaitForAnElementToBeVisible(surveyPageObject.greatSmile);
		CommonFunctions.fn_WaitForAnElementToBeClickable(surveyPageObject.greatSmile);
		action.moveToElement(surveyPageObject.greatSmile).click(surveyPageObject.greatSmile).build().perform();
		Thread.sleep(3000);
		surveyPageObject.overallExperienceNext.click();
		Thread.sleep(2000);

		// Answer the last survey question
		CommonFunctions.fn_WaitTillTextIsPresentInElement(surveyPageObject.surveyOverAllExpText,
				"We are glad you had a GREAT experience. Would you tell us what made it GREAT?");
		CommonFunctions.fn_WaitForAnElementToBeVisible(surveyPageObject.textArea);
		CommonFunctions.fn_WaitForAnElementToBeClickable(surveyPageObject.textArea);
		surveyPageObject.textArea.sendKeys("I had great experience.");
		Thread.sleep(2000);
		surveyPageObject.overallExperienceNext.click();
		Thread.sleep(2000);
		Verify.verify(true, "Survey not completed", surveyPageObject.headerContent.getText(), "Survey Completed");

		driver.close();
		driver.switchTo().window(parentWindow);

	}

	@Then("^Review should be displayed under reviews section in dashboard$")
	public void review_should_be_displayed_under_reviews_section_in_dashboard() throws Throwable {

		// Login to company admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 3, 1),
				ExcelUtil.getCellData("Login Details", 3, 2));

		// In dashboard, rating does not get reflected until ETL is run

	}

	@And("^Review should also be displayed in Edit profile page$")
	public void review_should_also_be_displayed_in_edit_profile_page() throws Throwable {

		// Navigate to Edit Profile and verify the review
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.editProfileLink, "Edit Profile",
				"Profile Settings");
		System.out.println(editProfilePageObject.averageRating.getText());
		System.out.println(editProfilePageObject.countOfReviews.getText());
		Verify.verify(true, "Average rating is not correct", editProfilePageObject.averageRating.getText(), "4.00 - ");
		Verify.verify(true, "Count of reviews is not correct", editProfilePageObject.countOfReviews.getText(),
				"1 Review(s)");

	}

	@And("^Review should also be displayed in Public page$")
	public void review_should_also_be_displayed_in_public_page() throws Throwable {

		// Navigate to Public Page and verify the review
		final int windowsBefore = driver.getWindowHandles().size();
		editProfilePageObject.publicPageURL.click();
		CommonFunctions.fn_WaitForNewWindow(windowsBefore);
		Thread.sleep(4000);
		String parentWindow = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();
		System.out.println(publicPageObject.averageRating.getText());
		System.out.println(publicPageObject.reviewCount.getText());
		Verify.verify(true, "Average rating is not correct", publicPageObject.averageRating.getText(), "4.00");
		Verify.verify(true, "Count of reviews is not correct", publicPageObject.reviewCount.getText(), "1");

		// Close the driver
		driver.close();

		// Switch to parent window and logout
		driver.switchTo().window(parentWindow);
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);
	}

	@And("^Review should be auto posted in linked in$")
	public void review_should_be_auto_posted_in_linked_in() throws Throwable {

		// Navigate to linked in and login if not
		CommonFunctions.fn_OpenURL(prop.getProperty("LINKEDINURL"));
		Thread.sleep(2000);
		if (driver.getTitle().equalsIgnoreCase("LinkedIn: Log In or Sign Up")) {
			linkedInPageObject.email.clear();
			linkedInPageObject.email.sendKeys(ExcelUtil.getCellValueByColumnName("Social Media", "User Name"));
			linkedInPageObject.password.clear();
			linkedInPageObject.password.sendKeys(ExcelUtil.getCellValueByColumnName("Social Media", "Password"));
			linkedInPageObject.signInButton.click();
		}

		// Click on security if displayed
		if (driver.getTitle().contains("Security Verification")) {
			linkedInPageObject.securityCheckBox.click();
			linkedInPageObject.signInButton.click();
		}

		// Navigate to all activity and verify if it is posted
		CommonFunctions.fn_WaitTillPageLoads("LinkedIn");
		linkedInPageObject.myProfileDropDown.click();
		linkedInPageObject.postsAndActivityDropDownItem.click();
		linkedInPageObject.allActivityTab.click();
		Verify.verify(true, "Post is not displayed or text is wrong", linkedInPageObject.postTextDiv.getText(),
				"4.17 Star Review on SocialSurvey — I had a great experience.");

		// Sign out
		linkedInPageObject.myProfileDropDown.click();
		linkedInPageObject.signOutDropDownItem.click();
		CommonFunctions.fn_WaitForAnElementToBeVisible(linkedInPageObject.email);
	}

	@And("^Review should be auto posted in twitter$")
	public void review_should_be_auto_posted_in_twitter() throws Throwable {

		// Navigate to twitter and login if not
		CommonFunctions.fn_OpenURL(prop.getProperty("TWITTERURL"));
		Thread.sleep(2000);
		if (driver.getTitle().equalsIgnoreCase("Login on Twitter")) {
			twitterPageObject.emailInput.clear();
			twitterPageObject.emailInput.sendKeys(ExcelUtil.getCellValueByColumnName("Social Media", "User Name"));
			twitterPageObject.passwordInput.clear();
			twitterPageObject.passwordInput.sendKeys(ExcelUtil.getCellValueByColumnName("Social Media", "Password"));
			twitterPageObject.loginSubmitButton.click();
		}

		// Click on tweets in home screen
		CommonFunctions.fn_WaitTillPageLoads("Twitter");
		twitterPageObject.tweetsTextInHomeScreen.click();

		// Verify if the post is displayed
		CommonFunctions.fn_WaitForAnElementToBeVisible(twitterPageObject.tweetsTabInProfile);
		Verify.verify(true, "Post text is not proper or post is not there", twitterPageObject.postTextDiv.getText(),
				"4.17 Star Review on #SocialSurvey");

		// Logout
		twitterPageObject.profileImage.click();
		twitterPageObject.logoutDropDownItem.click();
		Verify.verify(twitterPageObject.loginButton.isDisplayed());
	}

	@And("^Survey completed email should be delivered$")
	public void survey_completed_email_should_be_delivered() throws Throwable {

		// Navigate to GMAIL
		CommonFunctions.fn_OpenURL(prop.getProperty("GMAILURL"));
		Thread.sleep(3000);

		// Navigate to stging test account
		/*
		 * gmailPageObject.userImage.click(); Thread.sleep(2000); for(int i=0;
		 * i<gmailPageObject.accounts.size(); i++) {
		 * if(gmailPageObject.accounts.get(i).getText().contains(ExcelUtil.
		 * getCellData("Login Details", 2, 3))){
		 * gmailPageObject.accounts.get(i).click(); Thread.sleep(5000); } }
		 * 
		 * CommonFunctions.fn_SwitchToNewWindow(); Thread.sleep(2000);
		 */

		// Search and click on the survey completed email
		CommonFunctions.fn_SearchAndClickOnGmail(gmailPageObject, "Get the most out of this review! SHARE ON FACEBOOK",
				scriptStartTime);
		Thread.sleep(2000);

		// Verify if the recipient is agent
		if (gmailPageObject.toEmail.getText().contains(ExcelUtil.getCellData("Login Details", 3, 1))) {

			System.out.println("Survey Completed Email is sent successfully to the Agent");
		}
	}

	@Given("^Login as SS Admin or Company Admin or Agent$")
	public void login_as_ss_admin_company_admin_or_agent() throws Throwable {

		// SS Admin
		// Launh the URL and login to SS admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));

		// Verify that page hierarchy is loaded
		Verify.verify(true, "Page title is not correct", driver.getTitle(), "Hierarchy");
		Verify.verify(ssAdminHierarchyPageObject.companyAdminLoginAs.isDisplayed());
		Reporting.syncWait();

		// Verify that page dashboard is loaded
		CommonFunctions.fn_NavigateToPage(ssAdminHomePageObject.dashboardLink, "Dashboard", "Admin Dashboard");
		Verify.verify(ssAdminDashboardPageObject.emailInputForReport.isDisplayed());

		// Verify that page Send Invite is loaded
		CommonFunctions.fn_NavigateToPage(ssAdminHomePageObject.sendInviteLink, "Send Invite",
				"Send Invite for Invoiced Account");
		Verify.verify(sendInvitePageObject.doneButton.isDisplayed());

		// Verify that page Abuse Reports is loaded
		CommonFunctions.fn_NavigateToPage(ssAdminHomePageObject.abuseReportsLink, "Abuse Reports", null);
		Verify.verify(abuseReportsPageObject.unmarkAbusiveIcon.isDisplayed());

		// Verify that page User Management is loaded
		CommonFunctions.fn_NavigateToPage(ssAdminHomePageObject.userManagementLink, "User Management", null);
		Verify.verify(userManagementPageObject.addSocialSurveyAdminButton.isDisplayed());

		// Verify that page Reports is loaded
		CommonFunctions.fn_NavigateToPage(ssAdminHomePageObject.reportsLink, "Reports", null);
		Verify.verify(reportsPageObject.downloadReportLink.isDisplayed());

		// Verify that page Transaction Monitor is loaded
		CommonFunctions.fn_NavigateToPage(ssAdminHomePageObject.transactionMonitorLink, "Transaction Monitor", null);
		Thread.sleep(20000);
		CommonFunctions.fn_WaitForAnElementToBeVisible(transactionMonitorPageObject.headerTextInTransactionMonitorPage);

		// Verify that page Update Password is loaded
		ssAdminHomePageObject.userImage.click();
		CommonFunctions.fn_NavigateToPage(ssAdminHomePageObject.changePasswordItem, "Update Password", null);
		Verify.verify(ssAdminHomePageObject.submitButton.isDisplayed());

		// Logout and verify if the logout page is loaded
		CommonFunctions.fn_LogOutAsSSAdmin(ssAdminHomePageObject);
		Verify.verify(logoutPageObject.headerTextInLogoutPage.isDisplayed());

	}

	@When("^Company Admin clicks on any link or tab$")
	public void company_admin_clicks_on_any_link_or_tab() throws Throwable {

		// Company Admin
		// Launch the URL and login to company admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 3, 1),
				ExcelUtil.getCellData("Login Details", 3, 2));

		// Close the banner and Verify that page dashboard is loaded
		CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		Verify.verify(compAdminDashboardPageObject.averageRating.isDisplayed());

		// Verify for the header tabs
		// Verify that page Reporting is loaded
		Thread.sleep(2000);
		compAdminDashboardPageObject.dashBoardLink.click();
		Thread.sleep(4000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.reportingLinkCompAdmin, "Reporting",
				"Reporting");
		Verify.verify(reportingPageObject.reportSelectDropDown.isDisplayed());

		// Verify that page User Management is loaded
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		Verify.verify(manageTeamPageObject.usersTable.isDisplayed());

		// Verify that page Build Survey is loaded
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.editSurveyLink, "Edit Survey", "Build Survey");
		Verify.verify(editSurveyPageObject.addQuestionButton.isDisplayed());

		// Verify that page Edit Settings is loaded
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.configureLink, "Settings", "Edit Settings");
		Verify.verify(compAdminSettingsPageObject.surveyMailThresholdCheckBox.isDisplayed());

		// Verify that page Complaint Resolution is loaded
		compAdminDashboardPageObject.configureLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.configureDropdownListItems,
				"Complaint Resolution");
		Verify.verify(true, "Page title for complaint resolution is not correct.", driver.getTitle(),
				"Complaint Resolution Settings");
		Verify.verify(complaintResolutionPageObject.ratingInput.isDisplayed());

		// Verify that page Email is loaded
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.configureLink);
		compAdminDashboardPageObject.configureLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.configureDropdownListItems, "Emails");
		Verify.verify(true, "Page title for Emails is not correct.", driver.getTitle(), "Email Settings");
		Verify.verify(configureEmailsPageObject.dynamicFieldLegend.isDisplayed());

		// Verify that page Javascript widget is loaded
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.configureLink);
		CommonFunctions.fn_MouseHover(compAdminDashboardPageObject.configureLink);
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.configureDropdownListItems,
				"Javascript Widget");
		Verify.verify(true, "Page title for Javascript widget is not correct.", driver.getTitle(), "Widgets");
		Verify.verify(javaScriptWidgetPageObject.personImage.isDisplayed());

		// Verify that page Apps is loaded
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.configureLink);
		compAdminDashboardPageObject.configureLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.configureDropdownListItems, "Apps");
		Verify.verify(true, "Page title for Apps is not correct.", driver.getTitle(), "Apps");
		Verify.verify(appsPageObject.downloadReportLink.isDisplayed());

		// Verify that page Ranking Settings is loaded
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.configureLink);
		compAdminDashboardPageObject.configureLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.configureDropdownListItems,
				"Ranking Settings");
		Verify.verify(rankingSettingsPageObject.minimumRequirementsContainer.isDisplayed());

		// Verify that page Profile Settings is loaded
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.editProfileLink, "Profile Settings",
				"Profile Settings");
		Verify.verify(editProfilePageObject.instagramIcon.isDisplayed());

		// Verify that page Public is loaded
		final int windowsBefore = driver.getWindowHandles().size();
		editProfilePageObject.publicPageURL.click();
		CommonFunctions.fn_WaitForNewWindow(windowsBefore);
		Thread.sleep(4000);
		String parentWindow = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();
		Verify.verify(true, "Page title is not correct", driver.getTitle(), "Mortgage Reviews");
		Verify.verify(compPublicPageObject.reportAbuseIcon.isDisplayed());
		driver.close();
		driver.switchTo().window(parentWindow);

		// Verify that page Update Password is loaded
		compAdminDashboardPageObject.userImage.click();
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.updatePasswordLink, "Update Password", null);
		Verify.verify(updatePasswordPageObject.submitButton.isDisplayed());

		// Verify that page User Management is loaded
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		Verify.verify(manageTeamPageObject.usersTable.isDisplayed());

		// Login as Agent
		manageTeamPageObject.loginAsUserButton.click();
		CommonFunctions.fn_WaitTillPageLoads("Dashboard");

	}

	@Then("^Screens should load properly$")
	public void screens_should_load_properly() throws Throwable {

		// Verify that page Dashboard is loaded
		Thread.sleep(2000);
		CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		CommonFunctions.fn_WaitForAnElementToBeVisible(agentDashboardPageObject.profileImageOfAgent);
		Verify.verify(agentDashboardPageObject.profileImageOfAgent.isDisplayed());

		// Verify that page Reporting is loaded
		agentDashboardPageObject.dashboardLink.click();
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.reportingDropDownItem, "Reporting", "Reporting");
		Verify.verify(agentReportingPageObject.reportDropDown.isDisplayed());

		// Verify that page Edit Settings is loaded
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.configureLink, "Configure", "Edit Settings");
		Verify.verify(agentConfigurePageObject.minScoreToPost.isDisplayed());

		// Verify that page Widgets is loaded
		agentDashboardPageObject.configureLink.click();
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.javascriptWidgetLink, "Javascript Widget",
				"Widgets");
		Verify.verify(agentWidgetPageObject.backgroundColorSelector.isDisplayed());

		// Verify that page Apps is loaded
		agentDashboardPageObject.configureLink.click();
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.appsLink, "Apps", "Apps");
		Verify.verify(agentAppsPageObject.appsHeaderText.isDisplayed());

		// Verify that page Profile Settings is loaded
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.editProfileLink, "Edit Profile", "Profile Settings");
		Verify.verify(agentProfilePageObject.instagramIcon.isDisplayed());

		// Verify that page Public is loaded
		final int windowsBefore = driver.getWindowHandles().size();
		agentProfilePageObject.publicPageURL.click();
		CommonFunctions.fn_WaitForNewWindow(windowsBefore);
		Thread.sleep(4000);
		String parentWindow = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();
		Verify.verify(true, "Page title is not correct", driver.getTitle(), "Mortgage Reviews");
		Verify.verify(agentPublicPageObject.reportAbuseIcon.isDisplayed());
		driver.close();
		driver.switchTo().window(parentWindow);

		// Verify that page Help is loaded
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.helpLink, "Help", null);
		Verify.verify(agentHelpPageObject.sendMessageButton.isDisplayed());

		// Verify that page Update Password is loaded
		agentDashboardPageObject.userImage.click();
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.changePasswordItem, "Update Password", null);
		Verify.verify(agentUpdatePasswordPageObject.submitButton.isDisplayed());

		// Verify that page Switch to Admin is loaded
		agentDashboardPageObject.userImage.click();
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.switchToAdminItem, "Switch to Admin", "Dashboard");
		Verify.verify(compAdminDashboardPageObject.averageRating.isDisplayed());

		// Verify that page Dashboard of Comp Admin is loaded
		CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		Verify.verify(compAdminDashboardPageObject.averageRating.isDisplayed());

		// Logout and verify if the logout page is loaded
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);
		Verify.verify(logoutPageObject.headerTextInLogoutPage.isDisplayed());

	}

	@Given("^Login to existing company admin$")
	public void login_to_existing_company_admin() throws Throwable {

		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Search the
		companyName = ExcelUtil.getCellData("Login Details", 5, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		Thread.sleep(2000);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().contains(companyName)) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}
	}

	@When("^SS Admin performs actions on the reviews in Social Monitor$")
	public void ss_admin_performs_actions_on_the_reviews_in_social_monitor() throws Throwable {

		// Navigate to Social Monitor
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.socialMonitorLink, "Social Monitor",
				"Social Monitor");
		Thread.sleep(2000);

		// Wait till stream tab is clickable
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.streamTab);

		// Get the stream count in stream tab and alerts tab and flag one review
		int streamCountInStreamTab = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());

		// Navigate to alerts tab and get stream count
		compSocialMonitorPageObject.alertsTab.click();
		Thread.sleep(2000);
		int streamCountInAlertsTab = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());

		// Navigate back to stream tab and get stream count
		compSocialMonitorPageObject.streamTab.click();
		Thread.sleep(2000);

		// Get the values of agent , type of social media and text in first review
		agentName = compSocialMonitorPageObject.agentNames.get(0).getText();
		mediaType = compSocialMonitorPageObject.socialMediaTypes.get(0).getText();
		reviewText = compSocialMonitorPageObject.reviewTexts.get(0).getText();

		// Flag the first review and verify the count is reduced by 1
		compSocialMonitorPageObject.messageTextBoxes.get(1)
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Message for Flagging"));
		compSocialMonitorPageObject.flagButtons.get(1).click();
		Thread.sleep(3000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		int streamCountInStreamTabAfterFlaggingOneReview = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not reduced by 1", streamCountInStreamTab - 1,
				streamCountInStreamTabAfterFlaggingOneReview);

		// Click the alerts tab, verify if the count is increased and check if the
		// review is found in the alerts tab
		compSocialMonitorPageObject.alertsTab.click();
		Thread.sleep(2000);
		int streamCountInAlertsTabAfterFlaggingOneReview = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not increased by 1", streamCountInAlertsTab + 1,
				streamCountInAlertsTabAfterFlaggingOneReview);
		String reviewTextToEnter = "";
		String str;
		List<String> list = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new StringReader(reviewText));

		try {
			while ((str = reader.readLine()) != null) {
				list.add(str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("First:" + list.get(i));
			reviewTextToEnter = reviewTextToEnter + list.get(i) + "\\n";
		}
		System.out.println(reviewTextToEnter);
		reviewTextToEnterFinal = reviewTextToEnter.substring(0, reviewTextToEnter.length() - 2);

		Thread.sleep(4000);
		compSocialMonitorPageObject.searchTextBox.clear();
		compSocialMonitorPageObject.searchTextBox.sendKeys(reviewTextToEnterFinal);
		compSocialMonitorPageObject.searchTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

		reviewAtIndex = CommonFunctions.fn_SearchReview(compSocialMonitorPageObject, agentName, mediaType, reviewText);
		System.out.println(reviewAtIndex);
		if (reviewAtIndex != -1) {
			System.out.println("Review is present ");
		} else {
			System.out.println("Review is not present");
		}

		// Unflag the same review and verify the count is reduced by 1 and back to
		// before count
		compSocialMonitorPageObject.messageTextBoxes.get(reviewAtIndex + 1)
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Message for Unflagging"));
		compSocialMonitorPageObject.unFlagButtons.get(reviewAtIndex + 1).click();
		Thread.sleep(3000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		int streamCountInStreamTabAfterUnFlaggingOneReview = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not reduced by 1", streamCountInAlertsTabAfterFlaggingOneReview - 1,
				streamCountInStreamTabAfterUnFlaggingOneReview);

		// Click the stream tab, verify if the count is increased and check if the
		// review is found and flag it again
		compSocialMonitorPageObject.streamTab.click();
		Thread.sleep(2000);
		int streamCountInAlertsTabAfterUnFlaggingOneReview = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not increased by 1", streamCountInStreamTabAfterFlaggingOneReview,
				streamCountInAlertsTabAfterUnFlaggingOneReview);
		compSocialMonitorPageObject.searchTextBox.clear();
		compSocialMonitorPageObject.searchTextBox.sendKeys(reviewTextToEnterFinal);
		compSocialMonitorPageObject.searchTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		reviewAtIndex = CommonFunctions.fn_SearchReview(compSocialMonitorPageObject, agentName, mediaType, reviewText);
		System.out.println(reviewAtIndex);
		if (reviewAtIndex != -1) {
			System.out.println("Review is present ");
		} else {
			System.out.println("Review is not present");
		}

		// Flag the same review again
		compSocialMonitorPageObject.messageTextBoxes.get(1)
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Message for Flagging"));
		compSocialMonitorPageObject.flagButtons.get(1).click();
		Thread.sleep(3000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		streamCountInStreamTabAfterFlaggingOneReview = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not reduced by 1", streamCountInStreamTab - 1,
				streamCountInStreamTabAfterFlaggingOneReview);

		// Click the alerts tab, verify if the count is increased and check if the
		// review is found in the alerts tab
		compSocialMonitorPageObject.alertsTab.click();
		Thread.sleep(2000);
		streamCountInAlertsTabAfterFlaggingOneReview = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not increased by 1", streamCountInAlertsTab + 1,
				streamCountInAlertsTabAfterFlaggingOneReview);
		compSocialMonitorPageObject.searchTextBox.clear();
		compSocialMonitorPageObject.searchTextBox.sendKeys(reviewTextToEnterFinal);
		compSocialMonitorPageObject.searchTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		reviewAtIndex = CommonFunctions.fn_SearchReview(compSocialMonitorPageObject, agentName, mediaType, reviewText);
		System.out.println(reviewAtIndex);
		if (reviewAtIndex != -1) {
			System.out.println("Review is present ");
		} else {
			System.out.println("Review is not present");
		}

		// Escalate the same review
		// Navigate to escalations tab and get stream count
		compSocialMonitorPageObject.escalationsTab.click();
		Thread.sleep(2000);
		int streamCountInEscalationsBeforeEscalating = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());

		// Navigate back to alerts tab, find the review, escalate and verify the count
		// in alerts if reduced by 1
		compSocialMonitorPageObject.alertsTab.click();
		Thread.sleep(2000);
		compSocialMonitorPageObject.messageTextBoxes.get(reviewAtIndex + 1)
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Message for Escalting"));
		compSocialMonitorPageObject.escalateButtons.get(reviewAtIndex + 1).click();
		Thread.sleep(3000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.escalationsTab);
		int streamCountInAlertsTabAfterEscalating = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not reduced by 1", streamCountInAlertsTabAfterFlaggingOneReview - 1,
				streamCountInAlertsTabAfterEscalating);

		// Navigate to escalations tab, Verify the count if increased by 1 and search
		// the review
		compSocialMonitorPageObject.escalationsTab.click();
		Thread.sleep(2000);
		int streamCountInEscalationsTabAfterEscalating = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not increased by 1", streamCountInEscalationsBeforeEscalating + 1,
				streamCountInEscalationsTabAfterEscalating);
		compSocialMonitorPageObject.searchTextBox.clear();
		compSocialMonitorPageObject.searchTextBox.sendKeys(reviewTextToEnterFinal);
		compSocialMonitorPageObject.searchTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		reviewAtIndex = CommonFunctions.fn_SearchReview(compSocialMonitorPageObject, agentName, mediaType, reviewText);
		if (reviewAtIndex != -1) {
			System.out.println("Review is present ");
		} else {
			System.out.println("Review is not present");
		}

	}

	@Then("^Review is moved to resolutions$")
	public void review_is_moved_to_resolutions() throws Throwable {

		// Resolve the same
		int streamCountInEscalationsTabAfterEscalating = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		// Navigate to resolutions tab and get the stream count
		compSocialMonitorPageObject.resolutionsTab.click();
		Thread.sleep(2000);
		int streamCountInResolutionsBeforeEscalating = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());

		// Navigate back to escalations tab, find the review, resolve and verify the
		// count in alerts if reduced by 1
		compSocialMonitorPageObject.escalationsTab.click();
		Thread.sleep(2000);
		compSocialMonitorPageObject.messageTextBoxes.get(reviewAtIndex + 1)
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Message for Resolving"));
		compSocialMonitorPageObject.resolveButtons.get(reviewAtIndex + 1).click();
		Thread.sleep(3000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.resolutionsTab);
		int streamCountInEscalationsTabAfterResolving = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not reduced by 1", streamCountInEscalationsTabAfterEscalating - 1,
				streamCountInEscalationsTabAfterResolving);

		// Navigate to resolutions tab, Verify the count if increased by 1 and search
		// the review
		compSocialMonitorPageObject.resolutionsTab.click();
		Thread.sleep(2000);
		int streamCountInResolutionsTabAfterEscalating = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not increased by 1", streamCountInResolutionsBeforeEscalating + 1,
				streamCountInResolutionsTabAfterEscalating);
		compSocialMonitorPageObject.searchTextBox.clear();
		compSocialMonitorPageObject.searchTextBox.sendKeys(reviewTextToEnterFinal);
		compSocialMonitorPageObject.searchTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		reviewAtIndex = CommonFunctions.fn_SearchReview(compSocialMonitorPageObject, agentName, mediaType, reviewText);
		if (reviewAtIndex != -1) {
			System.out.println("Review is present ");
		} else {
			System.out.println("Review is not present");
		}

		// Escalate the resolved post
		Thread.sleep(2000);
		compSocialMonitorPageObject.messageTextBoxes.get(reviewAtIndex + 1)
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Message for Escalating"));
		compSocialMonitorPageObject.escalateButtons.get(reviewAtIndex + 1).click();
		Thread.sleep(3000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.escalationsTab);
		int streamCountInResolutoinsTabAfterEscalatingAgain = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not reduced by 1", streamCountInResolutionsTabAfterEscalating - 1,
				streamCountInResolutoinsTabAfterEscalatingAgain);

		// Navigate to escalations tab again, Verify the count if increased by 1 and
		// search the review
		compSocialMonitorPageObject.escalationsTab.click();
		Thread.sleep(2000);
		int streamCountInEscalationsTabAfterEscalatingAgain = Integer
				.parseInt(compSocialMonitorPageObject.streamCount.getText());
		Verify.verify(true, "Stream count is not increased by 1", streamCountInEscalationsTabAfterEscalating + 1,
				streamCountInEscalationsTabAfterEscalatingAgain);
		compSocialMonitorPageObject.searchTextBox.clear();
		compSocialMonitorPageObject.searchTextBox.sendKeys(reviewTextToEnterFinal);
		compSocialMonitorPageObject.searchTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		reviewAtIndex = CommonFunctions.fn_SearchReview(compSocialMonitorPageObject, agentName, mediaType, reviewText);
		if (reviewAtIndex != -1) {
			System.out.println("Review is present ");
		} else {
			System.out.println("Review is not present");
		}

		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);
	}

	@And("^Emails should be received and user should be able to reply$")
	public void emails_should_be_received_and_user_should_be_able_to_reply() throws Throwable {

		// Script starting time
		// scriptStartTime = CommonFunctions.fn_getCurrentDateTime();

		// Login to Email account
		CommonFunctions.fn_OpenURL(prop.getProperty("GMAILURL"));
		Thread.sleep(3000);

		if (driver.getTitle().contains("Free Storage and Email from Google")) {
			gmailPageObject.signIn.click();
			Thread.sleep(3000);
		}
		CommonFunctions.fn_SwitchToNewWindow();

		Thread.sleep(2000);
		CommonFunctions.fn_LoginToGmail(gmailPageObject, ExcelUtil.getCellData("Login Details", 2, 1),
				ExcelUtil.getCellData("Login Details", 2, 2));
		Thread.sleep(3000);

		// Navigate to test staging account
		/*
		 * gmailPageObject.userImage.click(); Thread.sleep(2000); for(int i=0;
		 * i<gmailPageObject.accounts.size(); i++) {
		 * if(gmailPageObject.accounts.get(i).getText().contains(ExcelUtil.
		 * getCellData("Login Details", 2, 3))){
		 * gmailPageObject.accounts.get(i).click(); Thread.sleep(5000); } }
		 * 
		 * CommonFunctions.fn_SwitchToNewWindow(); Thread.sleep(2000);
		 */

		// Get the number of windows before clicking on Get Started
		//final int windowsBefore = driver.getWindowHandles().size();

		// Search and click on email
		CommonFunctions.fn_SearchAndClickOnGmail(gmailPageObject, "You got a reply on your review on SocialSurvey.",
				scriptStartTime);
		Thread.sleep(2000);

		// Click on reply button
		CommonFunctions.fn_ClickOnElementUsingActions(gmailPageObject.replyButtonForEmailOpened);
		CommonFunctions.fn_WaitForAnElementToBeClickable(gmailPageObject.sendButtonForEmailOpened);
		CommonFunctions.fn_WaitForAnElementToBeClickable(gmailPageObject.messageBodyTextBox);
		// Assert.assertEquals(gmailPageObject.subjectContent.get(0).getText(),
		// ExcelUtil.getCellValueByColumnName("Social Monitor", "Reply Text for
		// Flagging"));
		gmailPageObject.messageBodyTextBox
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Reply Text for Flagging"));
		CommonFunctions.fn_ClickOnElementUsingActions(gmailPageObject.sendButtonForEmailOpened);
		Thread.sleep(2000);

		// Click on reply button
		CommonFunctions.fn_ClickOnElementUsingActions(gmailPageObject.replyButtonFor4thEmail);
		CommonFunctions.fn_WaitForAnElementToBeClickable(gmailPageObject.sendButtonForEmailOpened);
		CommonFunctions.fn_WaitForAnElementToBeClickable(gmailPageObject.messageBodyTextBox);
		// Assert.assertEquals(gmailPageObject.subjectContent.get(0).getText(),
		// ExcelUtil.getCellValueByColumnName("Social Monitor", "Reply Text for
		// Escalating"));
		gmailPageObject.messageBodyTextBox
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Reply Text for Escalating"));
		CommonFunctions.fn_ClickOnElementUsingActions(gmailPageObject.sendButtonForEmailOpened);
		Thread.sleep(2000);

		// Sign Out
		CommonFunctions.fn_LogoutFromGmail(gmailPageObject);

	}

	@And("^Company admin should be able to see the reviews in social monitor$")
	public void company_admin_should_be_able_to_see_the_reviews_in_social_monitor() throws Throwable {

	}

	@When("^Comp Admin adds a monitor and verifies reports$")
	public void comp_admin_adds_a_monitor_and_verifies_reports() throws Throwable {
		// Navigate to Social Monitor
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.socialMonitorLink, "Social Monitor",
				"Social Monitor");
		Thread.sleep(2000);

		// Navigate to Edit Monitors
		compSocialMonitorPageObject.editMonitorButton.click();
		Thread.sleep(2000);
		compSocialMonitorPageObject.addMonitorButton.click();
		Thread.sleep(2000);

		// Enter details in the popup
		if (compSocialMonitorPageObject.addMonitorPopupHeader.getText().contains("Add Monitor")) {
			compSocialMonitorPageObject.keyPhraseTextBox.clear();
			compSocialMonitorPageObject.keyPhraseTextBox
					.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Key Phrase"));
			Thread.sleep(2000);
		} else {
			Assert.fail("Popup header text was wrong or popup not displayed");
		}

		// Select monitor if not
		if (!(compSocialMonitorPageObject.monitorTypeDropDown.getText().contains("Keyword Monitor"))) {
			compSocialMonitorPageObject.keywordMonitorCheckBox.click();
			Thread.sleep(2000);
		}

		// Save
		compSocialMonitorPageObject.addMonitorPopupSaveButton.click();
		Thread.sleep(2000);

	}

	@Then("^Monitor added should be displayed$")
	public void monitor_added_should_be_displayed() throws Throwable {
		// Verify if added key is displayed in table
		softAssert.assertEquals(compSocialMonitorPageObject.keyPhrase.getText(),
				ExcelUtil.getCellValueByColumnName("Social Monitor", "Key Phrase"), "Key is not saved and displayed");

		// Navigate to Stream section
		compSocialMonitorPageObject.viewStreamButton.click();
		Thread.sleep(2000);

		// Count the posts with the key phrase by searching
		compSocialMonitorPageObject.searchInputTextBox.clear();
		Thread.sleep(2000);
		compSocialMonitorPageObject.searchInputTextBox
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Key Phrase"));
		Thread.sleep(2000);
		compSocialMonitorPageObject.searchInputTextBox.sendKeys(Keys.ENTER);

		// Count the posts in stream tab
		Thread.sleep(4000);
		int countInStream = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		System.out.println(countInStream);
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		compSocialMonitorPageObject.alertsTab.click();
		Thread.sleep(4000);
		int countInAlerts = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		System.out.println(countInAlerts);
		compSocialMonitorPageObject.escalationsTab.click();
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		Thread.sleep(4000);
		int countInEscalations = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		System.out.println(countInEscalations);
		compSocialMonitorPageObject.resolutionsTab.click();
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		Thread.sleep(4000);
		int countInResolutions = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		System.out.println(countInResolutions);
		compSocialMonitorPageObject.trustedSourceTab.click();
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		Thread.sleep(4000);
		int countIntrustedSourceTab = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		System.out.println(countIntrustedSourceTab);
		compSocialMonitorPageObject.streamTab.click();
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		Thread.sleep(4000);

		// Compare the count with expected
		int totalCount = countInStream + countInAlerts + countInEscalations + countInResolutions
				+ countIntrustedSourceTab;
		int expectedCount = (int) (Double.parseDouble(ExcelUtil.getCellValueByColumnName("Social Monitor", "Count")));
		if (totalCount == expectedCount) {
			System.out.println("Count of posts is correct.");
		} else {
			softAssert.fail(
					"Count of posts searched is not correct. Expected: " + expectedCount + " Actual: " + totalCount);
		}
	}

	@And("^Count should be correct with the count of posts$")
	public void count_should_be_correct_with_the_count_of_posts() throws Throwable {

		// Navigate to reports
		compSocialMonitorPageObject.reportsButton.click();
		CommonFunctions.fn_WaitTillPageLoads("Social Monitor Reporting");
		Thread.sleep(2000);
		compSocialMonitorPageObject.generateReportButton.click();
		Thread.sleep(2000);

		// Download report
		driver.navigate().refresh();
		Thread.sleep(60000);
		// CommonFunctions.fn_FluentWaitTillTextIsPresent(compSocialMonitorPageObject.firstRowStatusCellEleme,
		// "Download");
		compSocialMonitorPageObject.firstRowStatusCellEleme = driver
				.findElement(By.xpath("//*[@id=\"soc-mon-recent-activity-row0\"]/td[6]"));
		compSocialMonitorPageObject.firstRowStatusCellEleme.findElement(By.tagName("a")).click();
		Thread.sleep(3000);
		dirPath = "C:\\Users\\savita\\Downloads\\";

		// Gegt file and file name
		File socialMonitorFile = CommonFunctions.fn_GetLatestFilefromDir(dirPath);
		String socialMonitorFileName = socialMonitorFile.getName();
		System.out.println(socialMonitorFileName);

		// Get the count of rows in report
		int numberOfRowsInReport = ExcelUtil.getNumberOfRows(socialMonitorFileName, "Sheet0", dirPath);
		System.out.println(numberOfRowsInReport);
		List<String> postContentsList = ExcelUtil.getAllCellValuesByColumnName(socialMonitorFileName, "Sheet0", dirPath,
				"Post content");
		Set<String> postContentsSet = new HashSet<String>();
		for (String x : postContentsList) {
			if (x != null) {
				postContentsSet.add(x);
			}
		}

		numberOfRowsInReport = postContentsSet.size() - 1;
		System.out.println(numberOfRowsInReport);
		// Navigate to Stream section
		compSocialMonitorPageObject.viewStreamButton.click();
		Thread.sleep(2000);

		// Count the posts in stream tab
		Thread.sleep(4000);
		int countInStream = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		System.out.println(countInStream);
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		compSocialMonitorPageObject.alertsTab.click();
		Thread.sleep(4000);
		int countInAlerts = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		System.out.println(countInAlerts);
		compSocialMonitorPageObject.escalationsTab.click();
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		Thread.sleep(4000);
		int countInEscalations = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		System.out.println(countInEscalations);
		compSocialMonitorPageObject.resolutionsTab.click();
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		Thread.sleep(4000);
		int countInResolutions = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		System.out.println(countInResolutions);
		compSocialMonitorPageObject.trustedSourceTab.click();
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		Thread.sleep(4000);
		int countIntrustedSourceTab = Integer.parseInt(compSocialMonitorPageObject.streamCount.getText());
		System.out.println(countIntrustedSourceTab);
		compSocialMonitorPageObject.streamTab.click();
		CommonFunctions.fn_WaitForAnElementToBeClickable(compSocialMonitorPageObject.alertsTab);
		Thread.sleep(4000);

		// Compare the count with expected
		int totalCount = countInStream + countInAlerts + countInEscalations + countInResolutions
				+ countIntrustedSourceTab;
		if (totalCount == numberOfRowsInReport) {
			System.out.println("Count of posts is correct.");
		} else {
			softAssert.fail("Count of total posts is not correct. Expected: " + numberOfRowsInReport + " Actual: "
					+ totalCount);
		}

		// Delete the Key added
		compSocialMonitorPageObject.editMonitorButton.click();
		Thread.sleep(2000);
		compSocialMonitorPageObject.monitorSearchInputTextBox.clear();
		compSocialMonitorPageObject.monitorSearchInputTextBox
				.sendKeys(ExcelUtil.getCellValueByColumnName("Social Monitor", "Key Phrase"));
		compSocialMonitorPageObject.monitorSearchInputTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		if (compSocialMonitorPageObject.keyPhrase.getText()
				.contains(ExcelUtil.getCellValueByColumnName("Social Monitor", "Key Phrase"))) {
			compSocialMonitorPageObject.editMonitorCheckBox.click();
			Thread.sleep(2000);
			compSocialMonitorPageObject.selectActionDropDown.click();
			Thread.sleep(2000);
			compSocialMonitorPageObject.deleteSelected.click();
			Thread.sleep(2000);
		}

		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);
		softAssert.assertAll();
	}

	@Given("^Login to existing company admin for survey reports$")
	public void login_to_existing_company_admin_for_survey_reports() throws Throwable {

		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Search the new company created
		companyName = ExcelUtil.getCellData("Login Details", 6, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(2000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}
	}

	@When("^Company admin selects date range and generates the survey result report$")
	public void company_admin_selects_date_range_and_generates_the_survey_result_report() throws Throwable {

		// Navigate to Reporting page
		Thread.sleep(2000);
		compAdminDashboardPageObject.dashBoardLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.reportingLink, "Reporting", "Reporting");
		Thread.sleep(2000);
		Verify.verify(reportingPageObject.reportSelectDropDown.isDisplayed());

		// Select the Survey Results Report
		CommonFunctions.fn_SelectByVisibleText(reportingPageObject.reportSelectDropDown, "Survey Results Report");
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeVisible(reportingPageObject.startDate);

		String startDate = ExcelUtil.getCellValueByColumnName("Survey Result Reports", "Start Date");
		String endDate = ExcelUtil.getCellValueByColumnName("Survey Result Reports", "End Date");

		DateFormat formatter = new SimpleDateFormat("EEE MMM dd hh:mm:ss Z yyyy");
		String strMnth = CommonFunctions.fn_GetMonth(startDate.substring(4, 7));
		String day = startDate.substring(8, 10);
		String year = startDate.substring(24, 28);

		String startDateFinalString = strMnth + "/" + day + "/" + year;
		System.out.println("Start: " + startDateFinalString);

		String strMnth1 = CommonFunctions.fn_GetMonth(endDate.substring(4, 7));
		String day1 = endDate.substring(8, 10);
		String year1 = endDate.substring(24, 28);
		String endDateFinalString = strMnth1 + "/" + day1 + "/" + year1;
		System.out.println("End: " + startDateFinalString);

		startDateFinal = formatter.parse(startDate);
		endDateFinal = formatter.parse(endDate);

		reportingPageObject.startDate.sendKeys(startDateFinalString);
		Thread.sleep(2000);
		reportingPageObject.activeDay.click();
		Thread.sleep(2000);
		reportingPageObject.endDate.sendKeys(endDateFinalString);
		Thread.sleep(2000);
		reportingPageObject.activeDay.click();
		Thread.sleep(3000);
		reportingPageObject.generateReportButton.click();
		Thread.sleep(2000);

		CommonFunctions.fn_FluentWaitTillTextIsPresent(reportingPageObject.firstRowStatusCellElement, "Download");
		reportingPageObject.firstRowStatusCellElement = driver
				.findElement(By.xpath("//tr[@id='recent-activity-row0']/td[6]"));
		reportingPageObject.firstRowStatusCellElement.findElement(By.tagName("a")).click();
		Thread.sleep(3000);
		dirPath = "C:\\Users\\savita\\Downloads\\";

	}

	@Then("^Date ranges should not be less than start date and greater than end date$")
	public void date_ranges_should_not_be_less_than_start_date_and_greater_than_end_date() throws Throwable {

		File surveyResultsFile = CommonFunctions.fn_GetLatestFilefromDir(dirPath);
		surveyResultsFileName = surveyResultsFile.getName();
		System.out.println(surveyResultsFileName);

		List<String> surveySentDates = ExcelUtil.getAllCellValuesByColumnName(surveyResultsFileName, "Sheet0", dirPath,
				"Survey Sent Date");
		surveySentDates.removeAll(Arrays.asList("", null));
		for (int i = 0; i < surveySentDates.size(); i++) {
			Date sentDate = null;
			System.out.println("Entered for loop");
			sentDate = new SimpleDateFormat("E MMM dd hh:mm:ss Z yyyy").parse(surveySentDates.get(i));

			if (sentDate.compareTo(startDateFinal) >= 0 && (sentDate).compareTo(endDateFinal) <= 0) {
				System.out.println(
						"Correct : Survey sent dates are always greater than the start date and lesser than the end date");
			} else {
				Assert.fail("Fail: Survey sent dates are less than the start date or greater than the end date");
			}
		}

		List<String> surveyCompletedDates = ExcelUtil.getAllCellValuesByColumnName(surveyResultsFileName, "Sheet0",
				dirPath, "Survey Completed Date");
		surveyCompletedDates.removeAll(Arrays.asList("", null));
		for (int i = 0; i < surveyCompletedDates.size(); i++) {
			Date completedDate = null;
			completedDate = new SimpleDateFormat("E MMM dd hh:mm:ss Z yyyy").parse(surveyCompletedDates.get(i));

			if (completedDate.compareTo(startDateFinal) >= 0 && (completedDate.compareTo(endDateFinal) <= 0)) {
				System.out.println(
						"Correct : Survey completed dates are always greater than the start date and lesser than the end date");
			} else {
				Assert.fail("Fail: Survey completed dates are less than the start date or greater than the end date");
			}
		}

	}

	@And("^Survey score count should be equal in dashboard$")
	public void survey_score_count_should_be_equal_in_dashboard() throws Throwable {

		List<String> surveySources = ExcelUtil.getAllCellValuesByColumnName(surveyResultsFileName, "Sheet0", dirPath,
				"Survey Source");
		int ssReviewsCount = 0;
		int googleReviewsCount = 0;
		int zillowReviewsCount = 0;
		int thirdPartyReviewsCount = 0;
		int fbReviewsCount = 0;
		numberOfRows = surveySources.size();
		for (int i = 0; i < surveySources.size(); i++) {
			System.out.println(surveySources.get(i));

			if (surveySources.get(i).contains("agent") || surveySources.get(i).contains("admin")) {
				ssReviewsCount = ssReviewsCount + 1;
			}

			if (surveySources.get(i).contains("google")) {
				googleReviewsCount = googleReviewsCount + 1;
			}

			if (surveySources.get(i).contains("Zillow")) {
				zillowReviewsCount = zillowReviewsCount + 1;
			}

			if (surveySources.get(i).contains("3rd Party Review")) {
				thirdPartyReviewsCount = thirdPartyReviewsCount + 1;
			}

			if (surveySources.get(i).contains("facebook")) {
				fbReviewsCount = fbReviewsCount + 1;
			}
		}
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.dashBoardLink, "Dashboard", "Dashboard");
		Thread.sleep(2000);
		compAdminDashboardPageObject.transactionStatsTab.click();
		Thread.sleep(3000);
		compAdminDashboardPageObject.allTimeDropDown.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeVisible(compAdminDashboardPageObject.allTimeDropDownOption);
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.allTimeDropDownOptions, "Last Year");
		Thread.sleep(3000);

		String reviewsCount = (compAdminDashboardPageObject.reviewsCount.getText().split(" "))[0];
		int reviewCount = Integer.parseInt(reviewsCount);
		softAssert.assertEquals(numberOfRows, reviewCount,
				"Total count of review is incorrect. Excel: " + numberOfRows + " and UI: " + reviewCount);

		int ssReviewCountInUI = Integer.parseInt((reportingPageObject.completedCount.getText().split(" "))[0]);
		softAssert.assertEquals(ssReviewsCount, ssReviewCountInUI, "Total count ss of reviews is correct.");

		int googleReviewsCountInUI = Integer.parseInt(reportingPageObject.googleReviewsCount.getText());
		softAssert.assertEquals(googleReviewsCount, googleReviewsCountInUI,
				"\"Total count of google reviews is incorrect. Excel: \" + googleReviewsCount + \" and UI: \"\r\n"
						+ "					+ googleReviewsCountInUI");

		int zillowReviewsCountInUI = Integer.parseInt(reportingPageObject.zillowReviewsCount.getText());
		softAssert.assertEquals(zillowReviewsCount, zillowReviewsCountInUI,
				"Total count of zillow reviews is incorrect. Excel: " + zillowReviewsCount + " and UI: "
						+ zillowReviewsCountInUI);

		int thirdPartyReviewsCountInUI = Integer.parseInt(reportingPageObject.thirdPartyReviewsCount.getText());
		softAssert.assertEquals(thirdPartyReviewsCount, thirdPartyReviewsCountInUI,
				"Total count of third party reviews is incorrect. Excel: " + thirdPartyReviewsCount + " and UI: "
						+ thirdPartyReviewsCountInUI);

		int fbReviewsCountInUI = Integer.parseInt(reportingPageObject.facebookReviewsCount.getText());
		softAssert.assertEquals(fbReviewsCount, fbReviewsCountInUI,
				"Total count of fb reviews is incorrect. Excel: " + fbReviewsCount + " and UI: " + fbReviewsCountInUI);

		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

		softAssert.assertAll();
	}

	@Given("^Login to existing company admin for public pages verification$")
	public void login_to_existing_company_admin_for_public_pages_verification() throws Throwable {

		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Search the existing company created
		companyName = ExcelUtil.getCellData("Login Details", 7, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(2000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			Assert.fail("Company is not searched and displayed  in first row.");
		}

	}

	@When("^Option Hide Public Page is enabled$")
	public void option_hide_public_page_is_enabled() throws Throwable {

		// Navigate to Settings page
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.configureLink, "Settings", "Edit Settings");

		// Check for the 'Hide public pages of all agents'
		if (compAdminSettingsPageObject.hidePublicPageOfAllAgentsCheckBoxValue.getAttribute("value")
				.equalsIgnoreCase("true")) {
			compAdminSettingsPageObject.hidePublicPageOfAllAgentsCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already unchecked and the value is false");
		}

		// Check for the 'Hide public page'
		if (compAdminSettingsPageObject.hidePublicPageCheckBoxValue.getAttribute("value").equalsIgnoreCase("true")) {
			compAdminSettingsPageObject.hidePublicPageCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already unchecked and the value is false");
		}

		// Navigate to Edit Profile Page and check for the public pages of Company,
		// Region and Office
		// Navigate to edit profile
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.editProfileLink, "Edit Profile",
				"Profile Settings");

		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDown(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Public Pages Verification", "Company"));
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.name);
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.publicPageURL);
		Assert.assertTrue(editProfilePageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");

		// Navigate to Public Page URL for Company
		final int windowsBefore = driver.getWindowHandles().size();
		Thread.sleep(2000);
		editProfilePageObject.publicPageURL.click();
		Thread.sleep(5000);
		CommonFunctions.fn_WaitForNewWindow(windowsBefore);
		Thread.sleep(4000);
		String parentWindow = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();
		Verify.verify(true, "Page title is not correct", driver.getTitle(), "Mortgage Reviews");
		Assert.assertTrue(compPublicPageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");
		Assert.assertTrue(compPublicPageObject.starAverageRating.isDisplayed(),
				"Average rating at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.reviewCount.isDisplayed(), "Review count at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.companyLogo.isDisplayed(),
				"Company logo at the right top corner is not displayed");
		driver.close();
		driver.switchTo().window(parentWindow);

		// Change to R egion
		editProfilePageObject.dashboardSelectionDropDown.click();
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDown(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Public Pages Verification", "Region"));
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.name);
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.publicPageURL);

		// Verify for the public page URL
		Assert.assertTrue(editProfilePageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");

		// Navigate to Public Page URL for Region
		final int windowsBefore1 = driver.getWindowHandles().size();
		Thread.sleep(3000);
		editProfilePageObject.publicPageURL.click();
		Thread.sleep(5000);
		CommonFunctions.fn_WaitForNewWindow(windowsBefore1);
		Thread.sleep(4000);
		String parentWindow1 = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();
		Verify.verify(true, "Page title is not correct", driver.getTitle(), "Mortgage Reviews");
		Assert.assertTrue(compPublicPageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");
		Assert.assertTrue(compPublicPageObject.starAverageRating.isDisplayed(),
				"Average rating at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.reviewCount.isDisplayed(), "Review count at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.companyLogo.isDisplayed(),
				"Company logo at the right top corner is not displayed");
		driver.close();
		driver.switchTo().window(parentWindow1);

		// Change to Office
		editProfilePageObject.dashboardSelectionDropDown.click();
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDown(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Public Pages Verification", "Office"));
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.name);
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.publicPageURL);

		// Verify for the public page URL
		Assert.assertTrue(editProfilePageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");

		// Navigate to Public Page URL for Office
		final int windowsBefore2 = driver.getWindowHandles().size();
		Thread.sleep(3000);
		editProfilePageObject.publicPageURL.click();
		Thread.sleep(5000);
		CommonFunctions.fn_WaitForNewWindow(windowsBefore2);
		Thread.sleep(4000);
		String parentWindow2 = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();
		Verify.verify(true, "Page title is not correct", driver.getTitle(), "Mortgage Reviews");
		Assert.assertTrue(compPublicPageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");
		Assert.assertTrue(compPublicPageObject.starAverageRating.isDisplayed(),
				"Average rating at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.reviewCount.isDisplayed(), "Review count at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.companyLogo.isDisplayed(),
				"Company logo at the right top corner is not displayed");
		driver.close();
		driver.switchTo().window(parentWindow2);

		// Select the company again
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(3000);
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDown(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Public Pages Verification", "Company"));
		Thread.sleep(3000);
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.name);

		// Navigate to Manage Team
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.addTeamMembersButton);

		// Search the agent
		companyName = ExcelUtil.getCellValueByColumnName("Public Pages Verification", "Agent");
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.searchInputTextBox);
		System.out.println(companyName);
		manageTeamPageObject.searchInputTextBox.sendKeys(companyName);
		Thread.sleep(2000);
		manageTeamPageObject.searchInputTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		// Click on login as if the company searched is found
		if (manageTeamPageObject.agentName.getText().contains(companyName)) {
			manageTeamPageObject.agentLoginAs.click();
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			Assert.fail("Company is not searched and displayed  in first row.");
		}

		// Navigate to Edit Profile
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.editProfileLink, "Edit Profile", "Profile Settings");
		CommonFunctions.fn_WaitForAnElementToBeVisible(agentProfilePageObject.instagramIcon);
		Assert.assertTrue(agentProfilePageObject.publicPageURL.isDisplayed(), "Public page URL is not displayed");

		// Navigate to Public Page URL for Region
		final int windowsBefore3 = driver.getWindowHandles().size();
		Thread.sleep(3000);
		agentProfilePageObject.publicPageURL.click();
		CommonFunctions.fn_WaitForNewWindow(windowsBefore3);
		Thread.sleep(4000);
		String parentWindow3 = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();
		Thread.sleep(2000);
		Verify.verify(true, "Page title is not correct", driver.getTitle(), "Mortgage Reviews");
		Assert.assertTrue(compPublicPageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");
		Assert.assertTrue(compPublicPageObject.starAverageRating.isDisplayed(),
				"Average rating at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.reviewCount.isDisplayed(), "Review count at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.companyLogo.isDisplayed(),
				"Agent logo at the right top corner is not displayed");
		driver.close();
		driver.switchTo().window(parentWindow3);

		// Switch to admin
		agentDashboardPageObject.userImage.click();
		agentDashboardPageObject.switchToAdminItem.click();
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Search for the company again
		companyName = ExcelUtil.getCellData("Login Details", 7, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(2000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			Assert.fail("Company is not searched and displayed  in first row.");
		}

		// Navigate to Settings page
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.configureLink, "Settings", "Edit Settings");

		// Check for the 'Hide public pages of all agents'
		if (compAdminSettingsPageObject.hidePublicPageOfAllAgentsCheckBoxValue.getAttribute("value")
				.equalsIgnoreCase("false")) {
			compAdminSettingsPageObject.hidePublicPageOfAllAgentsCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already checked and the value is true");
		}

		// Check for the 'Hide public page'
		if (compAdminSettingsPageObject.hidePublicPageCheckBoxValue.getAttribute("value").equalsIgnoreCase("false")) {
			compAdminSettingsPageObject.hidePublicPageCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already checked and the value is true");
		}
	}

	@Then("^Public pages for all should be hidden$")
	public void public_pages_for_all_should_be_hidden() throws Throwable {

		// Navigate to Edit Profile Page and check for the public pages of Company,
		// Region and Office
		// Navigate to edit profile
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.editProfileLink, "Edit Profile",
				"Profile Settings");

		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDown(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Public Pages Verification", "Company"));
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.name);
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.publicPageURL);
		Assert.assertTrue(editProfilePageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");

		// Navigate to Public Page URL for Company
		final int windowsBefore = driver.getWindowHandles().size();
		Thread.sleep(2000);
		editProfilePageObject.publicPageURL.click();
		Thread.sleep(5000);
		CommonFunctions.fn_WaitForNewWindow(windowsBefore);
		Thread.sleep(4000);
		String parentWindow = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();
		Assert.assertTrue(compPublicPageObject.error404.isDisplayed(),
				"Public page URL is displayed although the hide public page is cheked");
		driver.close();
		driver.switchTo().window(parentWindow);

		// Navigate to Manage Team
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.addTeamMembersButton);

		// Search the agent
		companyName = ExcelUtil.getCellValueByColumnName("Public Pages Verification", "Agent");
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.searchInputTextBox);
		System.out.println(companyName);
		manageTeamPageObject.searchInputTextBox.sendKeys(companyName);
		Thread.sleep(2000);
		manageTeamPageObject.searchInputTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		// Click on login as if the company searched is found
		if (manageTeamPageObject.agentName.getText().contains(companyName)) {
			manageTeamPageObject.agentLoginAs.click();
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			Assert.fail("Company is not searched and displayed  in first row.");
		}

		// Navigate to Edit Profile
		Thread.sleep(2000);
		Assert.assertFalse(CommonFunctions.isElementPresent(By.xpath("//a[text()='Edit Profile']")));

		// Switch to admin
		agentDashboardPageObject.userImage.click();
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.switchToAdminItem, "Hierarchy", "Hierarchy");
		Thread.sleep(2000);

		// Search for the company again
		companyName = ExcelUtil.getCellData("Login Details", 7, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(2000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			Assert.fail("Company is not searched and displayed  in first row.");
		}

	}

	@And("^Public pages are dispalyed when unchecked$")
	public void public_pages_are_dispalyed_when_unchecked() throws Throwable {

		// Navigate to Settings page
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.configureLink, "Settings", "Edit Settings");

		// Check for the 'Hide public pages of all agents'
		if (compAdminSettingsPageObject.hidePublicPageOfAllAgentsCheckBoxValue.getAttribute("value")
				.equalsIgnoreCase("true")) {
			compAdminSettingsPageObject.hidePublicPageOfAllAgentsCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already unchecked and the value is false");
		}

		// Check for the 'Hide public page'
		if (compAdminSettingsPageObject.hidePublicPageCheckBoxValue.getAttribute("value").equalsIgnoreCase("true")) {
			compAdminSettingsPageObject.hidePublicPageCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already unchecked and the value is false");
		}

		// Navigate to Edit Profile Page and check for the public pages of Company,
		// Region and Office
		// Navigate to edit profile
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.editProfileLink, "Edit Profile",
				"Profile Settings");

		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDown(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Public Pages Verification", "Company"));
		CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.name);
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.publicPageURL);
		Assert.assertTrue(editProfilePageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");

		// Navigate to Public Page URL for Company
		final int windowsBefore = driver.getWindowHandles().size();
		Thread.sleep(2000);
		editProfilePageObject.publicPageURL.click();
		Thread.sleep(5000);
		CommonFunctions.fn_WaitForNewWindow(windowsBefore);
		Thread.sleep(4000);
		String parentWindow = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();
		Verify.verify(true, "Page title is not correct", driver.getTitle(), "Mortgage Reviews");
		Assert.assertTrue(compPublicPageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");
		Assert.assertTrue(compPublicPageObject.starAverageRating.isDisplayed(),
				"Average rating at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.reviewCount.isDisplayed(), "Review count at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.companyLogo.isDisplayed(),
				"Company logo at the right top corner is not displayed");
		driver.close();
		driver.switchTo().window(parentWindow);

		// Navigate to Manage Team
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.addTeamMembersButton);

		// Search the agent
		companyName = ExcelUtil.getCellValueByColumnName("Public Pages Verification", "Agent");
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.searchInputTextBox);
		System.out.println(companyName);
		manageTeamPageObject.searchInputTextBox.sendKeys(companyName);
		Thread.sleep(2000);
		manageTeamPageObject.searchInputTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		// Click on login as if the company searched is found
		if (manageTeamPageObject.agentName.getText().contains(companyName)) {
			manageTeamPageObject.agentLoginAs.click();
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			Assert.fail("Company is not searched and displayed  in first row.");
		}

		// Navigate to Edit Profile
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.editProfileLink, "Edit Profile", "Profile Settings");
		CommonFunctions.fn_WaitForAnElementToBeVisible(agentProfilePageObject.instagramIcon);
		Assert.assertTrue(agentProfilePageObject.publicPageURL.isDisplayed(), "Public page URL is not displayed");

		// Navigate to Public Page URL for Agent
		final int windowsBefore3 = driver.getWindowHandles().size();
		Thread.sleep(3000);
		agentProfilePageObject.publicPageURL.click();
		CommonFunctions.fn_WaitForNewWindow(windowsBefore3);
		Thread.sleep(4000);
		String parentWindow3 = driver.getWindowHandle();
		CommonFunctions.fn_SwitchToNewWindow();
		Verify.verify(true, "Page title is not correct", driver.getTitle(), "Mortgage Reviews");
		Assert.assertTrue(compPublicPageObject.publicPageURL.isDisplayed(),
				"Public page URL is not displayed although the hide public page is uncheked");
		Assert.assertTrue(compPublicPageObject.starAverageRating.isDisplayed(),
				"Average rating at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.reviewCount.isDisplayed(), "Review count at the top is not displayed");
		Assert.assertTrue(compPublicPageObject.companyLogo.isDisplayed(),
				"Agent logo at the right top corner is not displayed");
		driver.close();
		driver.switchTo().window(parentWindow3);

		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);
	}

	@Given("^Login to existing company admin for javascript pages verification$")
	public void login_to_existing_company_admin_for_javascript_pages_verification() throws Throwable {

		// Login to the existing company admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 8, 1),
				ExcelUtil.getCellData("Login Details", 8, 2));

	}

	@When("^Company admin makes changes in java script widget and save by overriding$")
	public void company_admin_makes_changes_in_java_script_widget_and_save_by_overriding() throws Throwable {

		// Navigate to JavaScript Widget
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.configureLink);
		CommonFunctions.fn_MouseHover(compAdminDashboardPageObject.configureLink);
		Thread.sleep(3000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.configureDropdownListItems,
				"Javascript Widget");
		CommonFunctions.fn_WaitTillPageLoads("Widgets");

		// Select the company admin in dashboard selection dropdown
		Thread.sleep(3000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(3000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(4000);
		//CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDown(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Company"));
		Thread.sleep(5000);

		// Get the default values in strings
		buttonOneOpacity = javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value");
		buttonTwoOpacity = javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value");
		reviewLoaderOpacity = javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value");
		initialReviewCount = javaScriptWidgetPageObject.initialReviewCount.getAttribute("value");
		onLoadReviewCount = javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value");
		onLoadButtonSize = javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value");
		buttonOneLink = javaScriptWidgetPageObject.buttonOneLink.getAttribute("value");
		buttonTwoLink = javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value");
		socialSurveyFilter = CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox);
		socialSurveyVerifiedFilter = CommonFunctions
				.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox);
		zillowFilter = CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox);
		hideBarGraphValue = CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox);
		hideOptionsValue = CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox);
		hideContactBtnValue = CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox);
		hideWriteReviewButtonValue = CommonFunctions
				.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox);
		allowModestRatingValue = CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox);

		System.out.println(hideBarGraphValue + hideOptionsValue + hideContactBtnValue + hideWriteReviewButtonValue
				+ allowModestRatingValue);

		// Values to enter
		buttonOneOpacityToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"Button One Opacity");
		buttonTwoOpacityToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"Button Two Opacity");
		reviewLoaderOpacityToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"Review Loader Opacity");
		initialReviewCountToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"Initial Review Count");
		onLoadReviewCountToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"On Load Review Count");
		onLoadButtonSizeToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"Maximum Button Width");
		buttonOneLinkToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript", "Button One Link");
		buttonTwoLinkToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript", "Button Two Link");
		socialSurveyFilterToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript", "SocialSurvey");
		socialSurveyVerifiedFilterToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"SocialSurvey Verified");
		zillowFilterToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript", "Zillow");
		hideBarGraphValueToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"Hide Bar Graph Initially");
		hideOptionsValueToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"Hide Options Tab Initially");
		hideContactBtnValueToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"Hide Contact Button");
		hideWriteReviewButtonValueToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"Hide Write Review Button");
		allowModestRatingValueToEnter = ExcelUtil.getCellValueByColumnName("Values To Enter in JavaScript",
				"Allow Modest Branding");

		System.out.println(hideBarGraphValueToEnter + hideOptionsValueToEnter + hideContactBtnValueToEnter
				+ hideWriteReviewButtonValueToEnter + allowModestRatingValueToEnter);

		// Enter the values in fields
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonOneOpacity.clear();
		javaScriptWidgetPageObject.buttonOneOpacity.sendKeys(buttonOneOpacityToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonTwoOpacity.clear();
		javaScriptWidgetPageObject.buttonTwoOpacity.sendKeys(buttonTwoOpacityToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.reviewLoaderOpacity.clear();
		javaScriptWidgetPageObject.reviewLoaderOpacity.sendKeys(reviewLoaderOpacityToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.initialReviewCount.clear();
		javaScriptWidgetPageObject.initialReviewCount.sendKeys(initialReviewCountToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.onLoadReviewCount.clear();
		javaScriptWidgetPageObject.onLoadReviewCount.sendKeys(onLoadReviewCountToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.onLoadButtonSize.clear();
		javaScriptWidgetPageObject.onLoadButtonSize.sendKeys(onLoadButtonSizeToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonOneLink.clear();
		javaScriptWidgetPageObject.buttonOneLink.sendKeys(buttonOneLinkToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonTwoLink.clear();
		javaScriptWidgetPageObject.buttonTwoLink.sendKeys(buttonTwoLinkToEnter);
		Thread.sleep(2000);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.filterSocialSurveyCheckBox, socialSurveyFilterToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox,
				socialSurveyVerifiedFilterToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.filterZillowCheckBox, zillowFilterToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideBarGraphCheckBox, hideBarGraphValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideOptionsTabCheckBox, hideOptionsValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideContactButtonCheckBox, hideContactBtnValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox,
				hideWriteReviewButtonValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.allowModestRatingCheckBox,
				allowModestRatingValueToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.saveOrOverrideButton.click();
		Thread.sleep(2000);

		// Override and save
		if (javaScriptWidgetPageObject.saveWidgetConfigPopupHeader.getText().contains("Save Widget Configuration")) {
			javaScriptWidgetPageObject.messageTextBoxInSaveWidgetConfigPopup.sendKeys("Modified by company admin");
			Thread.sleep(2000);
			javaScriptWidgetPageObject.overrideAndSaveCheckBoxInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
			javaScriptWidgetPageObject.continueInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
		}

		// Verify for the values in company admin java script widget after saving
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacityToEnter,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacityToEnter,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacityToEnter,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCountToEnter,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCountToEnter,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSizeToEnter,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLinkToEnter,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLinkToEnter,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Select the region admin in dashboard selection dropdown
		Thread.sleep(5000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(3000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(4000);
		//CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Region"));
		Thread.sleep(5000);

		System.out.println("Value of filter check box "
				+ CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox));
		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacityToEnter,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacityToEnter,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacityToEnter,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCountToEnter,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCountToEnter,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSizeToEnter,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLinkToEnter,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLinkToEnter,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox),
				"Social survey filter value is not correct.");
		softAssert.assertEquals(socialSurveyVerifiedFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Select the Office admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(5000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Office"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(5000);

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacityToEnter,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacityToEnter,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacityToEnter,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCountToEnter,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCountToEnter,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSizeToEnter,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLinkToEnter,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLinkToEnter,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Select the comp admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(4000);
		//CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Company"));
		
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(5000);

		// Navigate to Manage Team
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.addTeamMembersButton);

		// Search the agent
		companyName = ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Agent");
		Thread.sleep(2000);
		System.out.println(companyName);
		manageTeamPageObject.searchInputTextBox.sendKeys(companyName);
		Thread.sleep(2000);
		manageTeamPageObject.searchInputTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		// Click on login as if the agent searched is found
		if (manageTeamPageObject.agentName.getText().contains(companyName)) {
			manageTeamPageObject.agentLoginAs.click();
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			Assert.fail("Company is not searched and displayed  in first row.");
		}

		// Navigate to Widgets page
		Thread.sleep(4000);
		agentDashboardPageObject.configureLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.javascriptWidgetLink, "Widgets", "Widgets");
		Thread.sleep(2000);

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacityToEnter,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacityToEnter,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacityToEnter,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCountToEnter,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCountToEnter,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSizeToEnter,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLinkToEnter,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLinkToEnter,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

	}

	@Then("^Values of the fields should be overridden for lower hierarchy$")
	public void values_of_the_fields_should_be_overridden_for_lower_hierarchy() throws Throwable {

		// Switch to admin for verifying the values when region admin changes the values
		Thread.sleep(3000);
		agentDashboardPageObject.userImage.click();
		Thread.sleep(2000);
		agentDashboardPageObject.switchToAdminItem.click();
		Thread.sleep(2000);

		// Navigate to JavaScript Widget
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.configureLink);
		CommonFunctions.fn_MouseHover(compAdminDashboardPageObject.configureLink);
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.configureDropdownListItems,
				"Javascript Widget");
		CommonFunctions.fn_WaitTillPageLoads("Widgets");

		// Select the region admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(4000);
		//CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Region"));
		Thread.sleep(5000);

		// Reset it to default values
		javaScriptWidgetPageObject.resetConfigButton.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		javaScriptWidgetPageObject.saveOrOverrideButton.click();
		Thread.sleep(2000);

		// Override and save
		if (javaScriptWidgetPageObject.saveWidgetConfigPopupHeader.getText().contains("Save Widget Configuration")) {
			javaScriptWidgetPageObject.messageTextBoxInSaveWidgetConfigPopup.sendKeys("Modified by company admin");
			Thread.sleep(2000);
			javaScriptWidgetPageObject.overrideAndSaveCheckBoxInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
			javaScriptWidgetPageObject.continueInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
		}

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacity,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacity,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacity,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCount,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCount,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSize,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLink,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLink,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Select the Office admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(5000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Office"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(5000);

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacity,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacity,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacity,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCount,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCount,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSize,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLink,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLink,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Select the comp admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(5000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Company"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(5000);

		// Navigate to Manage Team
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.addTeamMembersButton);

		// Search the agent
		companyName = ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Agent");
		Thread.sleep(2000);
		System.out.println(companyName);
		manageTeamPageObject.searchInputTextBox.sendKeys(companyName);
		Thread.sleep(2000);
		manageTeamPageObject.searchInputTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		// Click on login as if the agent searched is found
		if (manageTeamPageObject.agentName.getText().contains(companyName)) {
			manageTeamPageObject.agentLoginAs.click();
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			Assert.fail("Company is not searched and displayed  in first row.");
		}

		// Navigate to Widgets page
		Thread.sleep(4000);
		agentDashboardPageObject.configureLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.javascriptWidgetLink, "Widgets", "Widgets");
		Thread.sleep(2000);

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacity,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacity,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacity,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCount,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCount,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSize,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLink,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLink,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Switch to admin for verifying the values when region admin changes the values
		Thread.sleep(3000);
		agentDashboardPageObject.userImage.click();
		Thread.sleep(2000);
		agentDashboardPageObject.switchToAdminItem.click();
		Thread.sleep(2000);

		// Navigate to JavaScript Widget
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.configureLink);
		CommonFunctions.fn_MouseHover(compAdminDashboardPageObject.configureLink);
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.configureDropdownListItems,
				"Javascript Widget");
		Thread.sleep(2000);
		CommonFunctions.fn_WaitTillPageLoads("Widgets");

		// Select the Office admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(5000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Office"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.dashboardSelectionDropDown);Thread.sleep(5000);

		// Enter the values in fields
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonOneOpacity.clear();
		javaScriptWidgetPageObject.buttonOneOpacity.sendKeys(buttonOneOpacityToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonTwoOpacity.clear();
		javaScriptWidgetPageObject.buttonTwoOpacity.sendKeys(buttonTwoOpacityToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.reviewLoaderOpacity.clear();
		javaScriptWidgetPageObject.reviewLoaderOpacity.sendKeys(reviewLoaderOpacityToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.initialReviewCount.clear();
		javaScriptWidgetPageObject.initialReviewCount.sendKeys(initialReviewCountToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.onLoadReviewCount.clear();
		javaScriptWidgetPageObject.onLoadReviewCount.sendKeys(onLoadReviewCountToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.onLoadButtonSize.clear();
		javaScriptWidgetPageObject.onLoadButtonSize.sendKeys(onLoadButtonSizeToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonOneLink.clear();
		javaScriptWidgetPageObject.buttonOneLink.sendKeys(buttonOneLinkToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonTwoLink.clear();
		javaScriptWidgetPageObject.buttonTwoLink.sendKeys(buttonTwoLinkToEnter);
		Thread.sleep(2000);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.filterSocialSurveyCheckBox, socialSurveyFilterToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox,
				socialSurveyVerifiedFilterToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.filterZillowCheckBox, zillowFilterToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideBarGraphCheckBox, hideBarGraphValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideOptionsTabCheckBox, hideOptionsValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideContactButtonCheckBox, hideContactBtnValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox,
				hideWriteReviewButtonValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.allowModestRatingCheckBox,
				allowModestRatingValueToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.saveOrOverrideButton.click();
		Thread.sleep(2000);

		// Override and save
		if (javaScriptWidgetPageObject.saveWidgetConfigPopupHeader.getText().contains("Save Widget Configuration")) {
			javaScriptWidgetPageObject.messageTextBoxInSaveWidgetConfigPopup.sendKeys("Modified by company admin");
			Thread.sleep(2000);
			javaScriptWidgetPageObject.overrideAndSaveCheckBoxInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
			javaScriptWidgetPageObject.continueInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
		}

		// Verify for the values in company admin java script widget after saving
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacityToEnter,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacityToEnter,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacityToEnter,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCountToEnter,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCountToEnter,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSizeToEnter,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLinkToEnter,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLinkToEnter,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Select the comp admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(5000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Company"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.dashboardSelectionDropDown);Thread.sleep(5000);

		// Navigate to Manage Team
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.manageTeamLink);
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.addTeamMembersButton);

		// Search the agent
		companyName = ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Agent");
		Thread.sleep(2000);
		System.out.println(companyName);
		manageTeamPageObject.searchInputTextBox.sendKeys(companyName);
		Thread.sleep(2000);
		manageTeamPageObject.searchInputTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		// Click on login as if the agent searched is found
		if (manageTeamPageObject.agentName.getText().contains(companyName)) {
			manageTeamPageObject.agentLoginAs.click();
			Thread.sleep(2000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			Assert.fail("Company is not searched and displayed  in first row.");
		}

		// Navigate to Widgets page
		Thread.sleep(2000);
		agentDashboardPageObject.configureLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.javascriptWidgetLink, "Widgets", "Widgets");
		Thread.sleep(2000);

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacityToEnter,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacityToEnter,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacityToEnter,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCountToEnter,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCountToEnter,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSizeToEnter,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLinkToEnter,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLinkToEnter,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Reset it to default values
		javaScriptWidgetPageObject.resetConfigButton.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		javaScriptWidgetPageObject.saveOrOverrideButton.click();
		Thread.sleep(2000);

		// Override and save
		if (javaScriptWidgetPageObject.saveWidgetConfigPopupHeader.getText().contains("Save Widget Configuration")) {
			javaScriptWidgetPageObject.messageTextBoxInSaveWidgetConfigPopup.sendKeys("Modified by company admin");
			Thread.sleep(2000);
			Thread.sleep(2000);
			javaScriptWidgetPageObject.continueInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
		}

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacity,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacity,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacity,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCount,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCount,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSize,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLink,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLink,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValue,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

	}

	@And("^Javascript widget should be locked when comp admin saves by overriding and locking$")
	public void javascript_widget_should_be_locked_when_comp_admin_saves_by_overriding_and_locking() throws Throwable {

		// Switch to admin for verifying the values when comp admin changes the values
		// and save by locking
		Thread.sleep(3000);
		agentDashboardPageObject.userImage.click();
		Thread.sleep(2000);
		agentDashboardPageObject.switchToAdminItem.click();
		Thread.sleep(2000);

		// Navigate to JavaScript Widget
		CommonFunctions.fn_WaitForAnElementToBeClickable(compAdminDashboardPageObject.configureLink);
		CommonFunctions.fn_MouseHover(compAdminDashboardPageObject.configureLink);
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.configureDropdownListItems,
				"Javascript Widget");
		Thread.sleep(2000);
		CommonFunctions.fn_WaitTillPageLoads("Widgets");

		// Select the company admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(5000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Company"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.dashboardSelectionDropDown);Thread.sleep(5000);

		// Enter the values in fields
		// Enter values
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonOneOpacity.clear();
		javaScriptWidgetPageObject.buttonOneOpacity.sendKeys(buttonOneOpacityToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonTwoOpacity.clear();
		javaScriptWidgetPageObject.buttonTwoOpacity.sendKeys(buttonTwoOpacityToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.reviewLoaderOpacity.clear();
		javaScriptWidgetPageObject.reviewLoaderOpacity.sendKeys(reviewLoaderOpacityToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.initialReviewCount.clear();
		javaScriptWidgetPageObject.initialReviewCount.sendKeys(initialReviewCountToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.onLoadReviewCount.clear();
		javaScriptWidgetPageObject.onLoadReviewCount.sendKeys(onLoadReviewCountToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.onLoadButtonSize.clear();
		javaScriptWidgetPageObject.onLoadButtonSize.sendKeys(onLoadButtonSizeToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonOneLink.clear();
		javaScriptWidgetPageObject.buttonOneLink.sendKeys(buttonOneLinkToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.buttonTwoLink.clear();
		javaScriptWidgetPageObject.buttonTwoLink.sendKeys(buttonTwoLinkToEnter);
		Thread.sleep(2000);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.filterSocialSurveyCheckBox, socialSurveyFilterToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox,
				socialSurveyVerifiedFilterToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.filterZillowCheckBox, zillowFilterToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideBarGraphCheckBox, hideBarGraphValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideOptionsTabCheckBox, hideOptionsValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideContactButtonCheckBox, hideContactBtnValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox,
				hideWriteReviewButtonValueToEnter);
		CommonFunctions.checkCheckBox(javaScriptWidgetPageObject.allowModestRatingCheckBox,
				allowModestRatingValueToEnter);
		Thread.sleep(2000);
		javaScriptWidgetPageObject.saveOrOverrideButton.click();
		Thread.sleep(2000);

		// Override and lock
		if (javaScriptWidgetPageObject.saveWidgetConfigPopupHeader.getText().contains("Save Widget Configuration")) {
			javaScriptWidgetPageObject.messageTextBoxInSaveWidgetConfigPopup.sendKeys("Modified by company admin");
			Thread.sleep(2000);
			javaScriptWidgetPageObject.overrideAndLockCheckBoxInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
			javaScriptWidgetPageObject.continueInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
		}

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacityToEnter,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacityToEnter,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacityToEnter,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCountToEnter,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCountToEnter,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSizeToEnter,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLinkToEnter,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLinkToEnter,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Select the region admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(5000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Region"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.dashboardSelectionDropDown);Thread.sleep(5000);

		// Reset it to default values
		javaScriptWidgetPageObject.resetConfigButton.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		javaScriptWidgetPageObject.saveOrOverrideButton.click();
		Thread.sleep(2000);

		// Override and save
		if (javaScriptWidgetPageObject.saveWidgetConfigPopupHeader.getText().contains("Save Widget Configuration")) {
			javaScriptWidgetPageObject.messageTextBoxInSaveWidgetConfigPopup.sendKeys("Modified by company admin");
			Thread.sleep(2000);
			javaScriptWidgetPageObject.overrideAndSaveCheckBoxInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
			javaScriptWidgetPageObject.continueInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
		}

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacityToEnter,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacityToEnter,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacityToEnter,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCountToEnter,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCountToEnter,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSizeToEnter,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLinkToEnter,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLinkToEnter,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Select the Office admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(5000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Office"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.dashboardSelectionDropDown);Thread.sleep(5000);

		// Reset it to default values
		javaScriptWidgetPageObject.resetConfigButton.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		javaScriptWidgetPageObject.saveOrOverrideButton.click();
		Thread.sleep(2000);

		// Override and save
		if (javaScriptWidgetPageObject.saveWidgetConfigPopupHeader.getText().contains("Save Widget Configuration")) {
			javaScriptWidgetPageObject.messageTextBoxInSaveWidgetConfigPopup.sendKeys("Modified by company admin");
			Thread.sleep(2000);
			javaScriptWidgetPageObject.overrideAndSaveCheckBoxInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
			javaScriptWidgetPageObject.continueInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
		}

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacityToEnter,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacityToEnter,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacityToEnter,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCountToEnter,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCountToEnter,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSizeToEnter,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLinkToEnter,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLinkToEnter,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Select the comp admin in dashboard selection dropdown
		Thread.sleep(2000);
		CommonFunctions.fn_MouseHover(editProfilePageObject.dashboardSelectionDropDown);
		Thread.sleep(2000);
		editProfilePageObject.dashboardSelectionDropDown.click();
		Thread.sleep(4000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(editProfilePageObject.dashboardSelectionDropDownBox);
		CommonFunctions.fn_ClickOnItemInDropDownUsingActions(editProfilePageObject.dashboardSelectionDropDownItems,
				ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Company"));
		CommonFunctions.fn_WaitForAnElementToBeClickable(editProfilePageObject.dashboardSelectionDropDown);Thread.sleep(5000);

		// Navigate to Manage Team
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "Manage Team",
				"User Management");
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.addTeamMembersButton);

		// Search the agent
		companyName = ExcelUtil.getCellValueByColumnName("Java Script Pages Verification", "Agent");
		Thread.sleep(2000);
		System.out.println(companyName);
		manageTeamPageObject.searchInputTextBox.sendKeys(companyName);
		Thread.sleep(2000);
		manageTeamPageObject.searchInputTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		// Click on login as if the agent searched is found
		if (manageTeamPageObject.agentName.getText().contains(companyName)) {
			manageTeamPageObject.agentLoginAs.click();
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			Assert.fail("Company is not searched and displayed  in first row.");
		}

		// Navigate to Widgets page
		Thread.sleep(4000);
		agentDashboardPageObject.configureLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(agentDashboardPageObject.javascriptWidgetLink, "Widgets", "Widgets");
		Thread.sleep(2000);

		// Reset it to default values
		javaScriptWidgetPageObject.resetConfigButton.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		javaScriptWidgetPageObject.saveOrOverrideButton.click();
		Thread.sleep(2000);

		// Override and save
		if (javaScriptWidgetPageObject.saveWidgetConfigPopupHeader.getText().contains("Save Widget Configuration")) {
			javaScriptWidgetPageObject.messageTextBoxInSaveWidgetConfigPopup.sendKeys("Modified by company admin");
			Thread.sleep(2000);
			Thread.sleep(2000);
			javaScriptWidgetPageObject.continueInSaveWidgetConfigPopup.click();
			Thread.sleep(2000);
		}

		// Verify for the values
		Verify.verify(true, "Button one opacity value is not correct.", buttonOneOpacityToEnter,
				javaScriptWidgetPageObject.buttonOneOpacity.getAttribute("value"));
		Verify.verify(true, "Button two opacity value is not correct.", buttonTwoOpacityToEnter,
				javaScriptWidgetPageObject.buttonTwoOpacity.getAttribute("value"));
		Verify.verify(true, "Review Loader opacity value is not correct.", reviewLoaderOpacityToEnter,
				javaScriptWidgetPageObject.reviewLoaderOpacity.getAttribute("value"));
		Verify.verify(true, "Initial Review Count value is not correct.", initialReviewCountToEnter,
				javaScriptWidgetPageObject.initialReviewCount.getAttribute("value"));
		Verify.verify(true, "On load review count value is not correct.", onLoadReviewCountToEnter,
				javaScriptWidgetPageObject.onLoadReviewCount.getAttribute("value"));
		Verify.verify(true, "On load button size is not correct.", onLoadButtonSizeToEnter,
				javaScriptWidgetPageObject.onLoadButtonSize.getAttribute("value"));
		Verify.verify(true, "Button one link value is not correct.", buttonOneLinkToEnter,
				javaScriptWidgetPageObject.buttonOneLink.getAttribute("value"));
		Verify.verify(true, "Button two link value is not correct.", buttonTwoLinkToEnter,
				javaScriptWidgetPageObject.buttonTwoLink.getAttribute("value"));
		softAssert.assertEquals(socialSurveyFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyCheckBox), "Not matched");
		softAssert.assertEquals(socialSurveyVerifiedFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterSocialSurveyVerifiedCheckBox),
				"Social survey verified filter value is not correct.");
		softAssert.assertEquals(zillowFilterToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.filterZillowCheckBox),
				"Zillow filter filter value is not correct.");
		softAssert.assertEquals(hideBarGraphValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideBarGraphCheckBox),
				"Hide bar graph value is not correct.");
		softAssert.assertEquals(hideOptionsValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideOptionsTabCheckBox),
				"Hide Options tab value is not correct.");
		softAssert.assertEquals(hideContactBtnValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideContactButtonCheckBox),
				"Hide contact button  value is not correct.");
		softAssert.assertEquals(hideWriteReviewButtonValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.hideWriteReviewButtonCheckBox),
				"Hide Write Review value is not correct.");
		softAssert.assertEquals(allowModestRatingValueToEnter,
				CommonFunctions.getCheckBoxValue(javaScriptWidgetPageObject.allowModestRatingCheckBox),
				"Allow modest rating value is not correct.");

		// Switch to admin
		Thread.sleep(3000);
		agentDashboardPageObject.userImage.click();
		Thread.sleep(2000);
		agentDashboardPageObject.switchToAdminItem.click();
		Thread.sleep(2000);

		// Log out
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

		softAssert.assertAll();
	}

	@Given("^Launch the LO search URL$")
	public void launch_the_lo_search_url() throws Throwable {

		// Launch the LO search URL
		CommonFunctions.fn_OpenURL(prop.getProperty("LOSEARCHURL"));
		Thread.sleep(2000);
		CommonFunctions.fn_WaitTillPageLoads("Search Professionals");

		// Click on professionals link - Highest Rated - 5 rating - 100 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.professionalsLink);
		LOSearchPageObject.professionalsLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.highestRatedLink);
		LOSearchPageObject.highestRatedLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.star5Link);
		LOSearchPageObject.star5Link.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews100Link);
		LOSearchPageObject.reviews100Link.click();
		Thread.sleep(2000);
		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 5.00, 100);
		}

		// Click on 50 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews50Link);
		LOSearchPageObject.reviews50Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 5.00, 50);
		}

		// Click on 5 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews5Link);
		LOSearchPageObject.reviews5Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 5.00, 5);
		}

		// Click 4 star - 100 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.star4Link);
		LOSearchPageObject.star4Link.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews100Link);
		LOSearchPageObject.reviews100Link.click();
		Thread.sleep(2000);
		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 4.00, 100);
		}

		// Click on 50 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews50Link);
		LOSearchPageObject.reviews50Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 4.00, 50);
		}

		// Click on 5 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews5Link);
		LOSearchPageObject.reviews5Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 4.00, 5);
		}

		// Click 3 star - 100 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.star3Link);
		LOSearchPageObject.star3Link.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews100Link);
		LOSearchPageObject.reviews100Link.click();
		Thread.sleep(2000);
		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 3.00, 100);
		}

		// Click on 50 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews50Link);
		LOSearchPageObject.reviews50Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 3.00, 50);
		}

		// Click on 5 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews5Link);
		LOSearchPageObject.reviews5Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 3.00, 5);
		}

		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@When("^User searches with different parameters$")
	public void user_searches_with_different_parameters() throws Throwable {

		// Click on Loan Offices link - Highest Rated - 5 rating - 100 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.loanOfficesLink);
		LOSearchPageObject.loanOfficesLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.highestRatedLink);
		LOSearchPageObject.highestRatedLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.star5Link);
		LOSearchPageObject.star5Link.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews100Link);
		LOSearchPageObject.reviews100Link.click();
		Thread.sleep(2000);
		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 5.00, 100);
		}

		// Click on 50 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews50Link);
		LOSearchPageObject.reviews50Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 5.00, 50);
		}

		// Click on 5 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews5Link);
		LOSearchPageObject.reviews5Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 5.00, 5);
		}

		// Click 4 star - 100 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.star4Link);
		LOSearchPageObject.star4Link.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews100Link);
		LOSearchPageObject.reviews100Link.click();
		Thread.sleep(2000);
		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 4.00, 100);
		}

		// Click on 50 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews50Link);
		LOSearchPageObject.reviews50Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 4.00, 50);
		}

		// Click on 5 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews5Link);
		LOSearchPageObject.reviews5Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 4.00, 5);
		}

		// Click 3 star - 100 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.star3Link);
		LOSearchPageObject.star3Link.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews100Link);
		LOSearchPageObject.reviews100Link.click();
		Thread.sleep(2000);
		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 3.00, 100);
		}

		// Click on 50 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews50Link);
		LOSearchPageObject.reviews50Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 3.00, 50);
		}

		// Click on 5 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews5Link);
		LOSearchPageObject.reviews5Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 3.00, 5);
		}

		driver.navigate().refresh();
		Thread.sleep(2000);

	}

	@Then("^Results should be proper$")
	public void results_should_be_proper() throws Throwable {

		// Click on Companies link - Highest Rated - 5 rating - 100 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.companiesLink);
		LOSearchPageObject.companiesLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.highestRatedLink);
		LOSearchPageObject.highestRatedLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.star5Link);
		LOSearchPageObject.star5Link.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews100Link);
		LOSearchPageObject.reviews100Link.click();
		Thread.sleep(2000);
		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 5.00, 100);
		}

		// Click on 50 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews50Link);
		LOSearchPageObject.reviews50Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 5.00, 50);
		}

		// Click on 5 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews5Link);
		LOSearchPageObject.reviews5Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 5.00, 5);
		}

		// Click 4 star - 100 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.star4Link);
		LOSearchPageObject.star4Link.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews100Link);
		LOSearchPageObject.reviews100Link.click();
		Thread.sleep(2000);
		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 4.00, 100);
		}

		// Click on 50 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews50Link);
		LOSearchPageObject.reviews50Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 4.00, 50);
		}

		// Click on 5 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews5Link);
		LOSearchPageObject.reviews5Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 4.00, 5);
		}

		// Click 3 star - 100 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.star3Link);
		LOSearchPageObject.star3Link.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews100Link);
		LOSearchPageObject.reviews100Link.click();
		Thread.sleep(2000);
		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 3.00, 100);
		}

		// Click on 50 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews50Link);
		LOSearchPageObject.reviews50Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 3.00, 50);
		}

		// Click on 5 > reviews
		CommonFunctions.fn_WaitForAnElementToBeClickable(LOSearchPageObject.reviews5Link);
		LOSearchPageObject.reviews5Link.click();
		Thread.sleep(2000);

		if (LOSearchPageObject.ratings.size() == 0) {
			softAssert.assertEquals(LOSearchPageObject.textArea.getText(), "No Results found", "Not equal");
		} else {
			CommonFunctions.verifyForSerchedPosts(LOSearchPageObject, 3.00, 5);
		}

		driver.navigate().refresh();
		Thread.sleep(2000);

	}

	@Given("^Login to existing companny for verifying reports$")
	public void login_to_existing_companny_for_verifying_reports() throws Throwable {

		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Search the existing company
		companyName = ExcelUtil.getCellData("Login Details", 9, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(4000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

	}

	@When("^User downloads the reports$")
	public void user_downloads_the_reports() throws Throwable {

		// Navigate to Reporting page
		Thread.sleep(2000);
		compAdminDashboardPageObject.dashBoardLink.click();
		Thread.sleep(4000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.reportingLink, "Reporting", "Reporting");
		Thread.sleep(2000);
		Verify.verify(reportingPageObject.reportSelectDropDown.isDisplayed());

		// Select the Company User Report
		CommonFunctions.fn_SelectByVisibleText(reportingPageObject.reportSelectDropDown, "Company User Report");
		Thread.sleep(2000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(reportingPageObject.startDate);

		// Click on generate report button
		reportingPageObject.generateReportButton.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		CommonFunctions.fn_FluentWaitTillTextIsPresent(reportingPageObject.firstRowStatusCellElement, "Download");
		reportingPageObject.firstRowStatusCellElement = driver
				.findElement(By.xpath("//tr[@id='recent-activity-row0']/td[6]"));
		reportingPageObject.firstRowStatusCellElement.findElement(By.tagName("a")).click();
		Thread.sleep(3000);
		dirPath = "C:\\Users\\savita\\Downloads\\";

		File companyUserReportFile = CommonFunctions.fn_GetLatestFilefromDir(dirPath);
		String companyUserReportFileName = companyUserReportFile.getName();
		System.out.println(companyUserReportFileName);

		int numberOfRowsInCompUserReport = ExcelUtil.getNumberOfRows(companyUserReportFileName, "Sheet0", dirPath) - 1;

		// Navigate to manage team
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "User Management",
				"User Management");
		Thread.sleep(3000);
		int numberOfUsers = Integer.parseInt(manageTeamPageObject.totalCountOfUsers.getText());

		// Verify for the count
		softAssert.assertEquals(numberOfUsers, numberOfRowsInCompUserReport,
				"Count of rows in company user report is not equal to the number of users on UI ");

		// Switch to admin
		compAdminDashboardPageObject.userImage.click();
		Thread.sleep(2000);
		compAdminDashboardPageObject.switchToSSAdmin.click();
		Thread.sleep(4000);

		// Search the existing company
		companyName = ExcelUtil.getCellData("Login Details", 9, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(4000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

		// Navigate to Reporting page
		Thread.sleep(2000);
		compAdminDashboardPageObject.dashBoardLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.reportingLink, "Reporting", "Reporting");
		Thread.sleep(2000);
		Verify.verify(reportingPageObject.reportSelectDropDown.isDisplayed());

		// Select the Verified User Report
		CommonFunctions.fn_SelectByVisibleText(reportingPageObject.reportSelectDropDown, "Verified Users Report");
		Thread.sleep(2000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(reportingPageObject.startDate);

		// Click on generate report button
		reportingPageObject.generateReportButton.click();
		Thread.sleep(70000);
		// CommonFunctions.fn_FluentWaitTillTextIsPresent(reportingPageObject.firstRowStatusCellElement,
		// "Download");
		reportingPageObject.firstRowStatusCellElement = driver
				.findElement(By.xpath("//tr[@id='recent-activity-row0']/td[6]"));
		reportingPageObject.firstRowStatusCellElement.findElement(By.tagName("a")).click();
		Thread.sleep(3000);

		File verifiedUserReportFile = CommonFunctions.fn_GetLatestFilefromDir(dirPath);
		String verifiedUserReportFileName = verifiedUserReportFile.getName();
		System.out.println(verifiedUserReportFileName);

		int numberOfRowsInVerifiedUserReport = ExcelUtil.getNumberOfRows(companyUserReportFileName, "Sheet0", dirPath)
				- 1;

		// Navigate to manage team
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "User Management",
				"User Management");
		Thread.sleep(2000);
		manageTeamPageObject.selectedFilterDropDown.click();
		Thread.sleep(2000);
		manageTeamPageObject.selectVerifiedUsers.click();
		Thread.sleep(2000);
		CommonFunctions.fn_WaitForAnElementToBeClickable(manageTeamPageObject.selectedFilterDropDown);
		int numberOfVerifiedUsers = Integer.parseInt(manageTeamPageObject.totalCountOfUsers.getText());

		// Verify for the count
		softAssert.assertEquals(numberOfVerifiedUsers, numberOfRowsInVerifiedUserReport,
				"Count of rows in verified user report is not equal to the number of users on UI ");

		// Switch to admin
		compAdminDashboardPageObject.userImage.click();
		Thread.sleep(2000);
		compAdminDashboardPageObject.switchToSSAdmin.click();
		Thread.sleep(4000);

		// Search the existing company
		companyName = ExcelUtil.getCellData("Login Details", 9, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(4000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

		// Navigate to Reporting page
		Thread.sleep(2000);
		compAdminDashboardPageObject.dashBoardLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.reportingLink, "Reporting", "Reporting");
		Thread.sleep(2000);
		Verify.verify(reportingPageObject.reportSelectDropDown.isDisplayed());

		// Select the Incomplete Survey Results Report
		CommonFunctions.fn_SelectByVisibleText(reportingPageObject.reportSelectDropDown,
				"Incomplete Survey Results Report");
		Thread.sleep(2000);
		// CommonFunctions.fn_WaitForAnElementToBeVisible(reportingPageObject.startDate);

		// Click on generate report button
		reportingPageObject.generateReportButton.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(60000);
		// CommonFunctions.fn_FluentWaitTillTextIsPresent(reportingPageObject.firstRowStatusCellElement,
		// "Download");
		reportingPageObject.firstRowStatusCellElement = driver
				.findElement(By.xpath("//tr[@id='recent-activity-row0']/td[6]"));
		reportingPageObject.firstRowStatusCellElement.findElement(By.tagName("a")).click();
		Thread.sleep(3000);

		File incompleteSurveyReultsReportFile = CommonFunctions.fn_GetLatestFilefromDir(dirPath);
		String incompleteSurveyReultsReportFileName = incompleteSurveyReultsReportFile.getName();
		System.out.println(incompleteSurveyReultsReportFileName);

		int numberOfRowsInIncompleteSurveyReultsReport = ExcelUtil.getNumberOfRows(incompleteSurveyReultsReportFileName,
				"Sheet0", dirPath) - 1;

		// Navigate to dashboard
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.dashBoardLink, "Dashboard", "Dashboard");
		Thread.sleep(2000);

		int numberOfIncompleteSurveyReults = Integer
				.parseInt(compAdminDashboardPageObject.incompleteSurveyCount.getText().split(" ")[0]);

		// Verify for the count
		softAssert.assertEquals(numberOfIncompleteSurveyReults, numberOfRowsInIncompleteSurveyReultsReport,
				"Count of rows in incomplete survey results report is not equal to the number of users on UI ");

	}

	@Then("^Report should have the correct value with that of UI$")
	public void report_should_have_the_correct_value_with_that_of_ui() throws Throwable {

		// Switch to admin
		compAdminDashboardPageObject.userImage.click();
		Thread.sleep(2000);
		compAdminDashboardPageObject.switchToSSAdmin.click();
		Thread.sleep(4000);

		// Search the existing company
		companyName = ExcelUtil.getCellData("Login Details", 9, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(4000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

		// Navigate to Reporting page Thread.sleep(2000);
		compAdminDashboardPageObject.dashBoardLink.click();
		Thread.sleep(2000);
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.reportingLink, "Reporting", "Reporting");
		Thread.sleep(2000);
		Verify.verify(reportingPageObject.reportSelectDropDown.isDisplayed());

		// Select the Survey Statistics Report
		CommonFunctions.fn_SelectByVisibleText(reportingPageObject.reportSelectDropDown, "Survey Statistics Report");
		Thread.sleep(2000);

		// Click on generate report button
		reportingPageObject.generateReportButton.click();
		Thread.sleep(2000);
		Thread.sleep(70000);
		reportingPageObject.firstRowStatusCellElement = driver
				.findElement(By.xpath("//tr[@id='recent-activity-row0']/td[6]"));
		reportingPageObject.firstRowStatusCellElement.findElement(By.tagName("a")).click();
		Thread.sleep(3000);

		dirPath = "C:\\Users\\savita\\Downloads\\";
		File surveyStatisticsReport = CommonFunctions.fn_GetLatestFilefromDir(dirPath);
		String surveyStatisticsReportFileName = surveyStatisticsReport.getName();
		System.out.println(surveyStatisticsReportFileName);

		List<String> branchNames = ExcelUtil.getAllCellValuesByColumnName(surveyStatisticsReportFileName, "Sheet0",
				dirPath, "BRANCH");
		List<String> monthNames = ExcelUtil.getAllCellValuesByColumnName(surveyStatisticsReportFileName, "Sheet0",
				dirPath, "MONTH");
		String timeSlot1 = ExcelUtil.getCellValueByColumnName("Reports Verification", "Time Slot1");
		String yearStr = timeSlot1.split("_")[0];
		String monthStr = timeSlot1.split("_")[1];
		monthStr = CommonFunctions.fn_GetMonth(Integer.parseInt(monthStr));
		String branch1 = ExcelUtil.getCellValueByColumnName("Reports Verification", "Branch1");
		int rowNumber1 = 0, rowNumber2 = 0;
		System.out.println(monthNames);
		System.out.println("*********");
		System.out.println(timeSlot1);

		for (int i = 0; i < monthNames.size(); i++) {
			if (monthNames.get(i).contains(timeSlot1) && branchNames.get(i).equalsIgnoreCase(branch1)) {
				rowNumber1 = i;
			}
		}

		System.out.println(rowNumber1);
		String branchName1 = branchNames.get(rowNumber1);
		System.out.println("Branch " + branchName1);

		// Navigate to dashboard
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.dashBoardLink, "Dashboard", "Dashboard");
		Thread.sleep(2000);

		// Select the branch
		compAdminDashboardPageObject.dashboardSelectionDropDown.click();
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.dashboardSelectionDropDownItems,
				branchName1);
		Thread.sleep(2000);

		// Select the time slot
		compAdminDashboardPageObject.allTimeDropDown.click();
		Thread.sleep(2000);
		if (timeSlot1.contains("All Time") || timeSlot1.contains("This Month") || timeSlot1.contains("Last Month")
				|| timeSlot1.contains("This Year")) {
			CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.allTimeDropDownOptions, timeSlot1);
			Thread.sleep(2000);
		} else {
			CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.allTimeDropDownOptions,
					monthStr + " " + yearStr);
			Thread.sleep(2000);
		}

		// Verify for the values
		int processedCountInReport = Integer.parseInt(ExcelUtil.getCellValueByColumnName(surveyStatisticsReportFileName,
				"Sheet0", dirPath, "TRX_RCVD", rowNumber1));
		int processedCountOnUI = Integer.parseInt(compAdminDashboardPageObject.processedCount.getText());
		System.out.println(processedCountInReport + " " + processedCountOnUI);
		softAssert.assertEquals(processedCountInReport, processedCountOnUI,
				"TRX_RCVD and processed count is not correct.");

		int duplicateCountInReport = Integer.parseInt(ExcelUtil.getCellValueByColumnName(surveyStatisticsReportFileName,
				"Sheet0", dirPath, "DUPLICATE", rowNumber1));
		int duplicateCountOnUI = Integer.parseInt(compAdminDashboardPageObject.duplicateCount.getText());
		softAssert.assertEquals(duplicateCountInReport, duplicateCountOnUI, "Duplicate count is not correct.");

		int corruptedCountInReport = Integer.parseInt(ExcelUtil.getCellValueByColumnName(surveyStatisticsReportFileName,
				"Sheet0", dirPath, "CORRUPTED", rowNumber1));
		int corruptedCountOnUI = Integer.parseInt(compAdminDashboardPageObject.corruptedCount.getText());
		softAssert.assertEquals(corruptedCountInReport, corruptedCountOnUI, "Corrupted count is not correct.");

		int surveysCompletedCountInReport = Integer.parseInt(ExcelUtil.getCellValueByColumnName(
				surveyStatisticsReportFileName, "Sheet0", dirPath, "SURVEYS COMPLETED", rowNumber1));
		int surveysCompletedCountOnUI = Integer
				.parseInt(compAdminDashboardPageObject.completedCount.getText().split(" ")[0]);
		softAssert.assertEquals(surveysCompletedCountInReport, surveysCompletedCountOnUI,
				"Completed count is not correct.");

		String completedPercentageInReport = "(" + ExcelUtil.getCellValueByColumnName(surveyStatisticsReportFileName,
				"Sheet0", dirPath, "COMPLETE PERCENTAGE", rowNumber1) + "%)";
		String completedPercentageOnUI = compAdminDashboardPageObject.completedCount.getText().split(" ")[1];
		softAssert.assertEquals(completedPercentageInReport, completedPercentageOnUI,
				"Completed percentage is not correct.");

		int surveysInCompletedCountInReport = processedCountInReport - surveysCompletedCountInReport;
		int surveysInCompletedCountOnUI = Integer
				.parseInt(compAdminDashboardPageObject.incompleteSurveyCount.getText().split(" ")[0]);
		softAssert.assertEquals(surveysInCompletedCountInReport, surveysInCompletedCountOnUI,
				"Incompleted count is not correct.");

		String incompletedPercentageInReport = "("
				+ Integer.toString((surveysInCompletedCountInReport * 100) / processedCountInReport) + "%)";
		String incompletedPercentageOnUI = compAdminDashboardPageObject.incompleteSurveyCount.getText().split(" ")[1];
		softAssert.assertEquals(incompletedPercentageInReport, incompletedPercentageOnUI,
				"Incompleted percentage is not correct.");

		/* **second branch** */
		String timeSlot2 = ExcelUtil.getCellValueByColumnName("Reports Verification", "Time Slot2");
		String yearStr2 = timeSlot1.split("_")[0];
		String monthStr2 = timeSlot1.split("_")[1];
		monthStr2 = CommonFunctions.fn_GetMonth(Integer.parseInt(monthStr2));
		String branch2 = ExcelUtil.getCellValueByColumnName("Reports Verification", "Branch1");

		for (int i = 0; i < monthNames.size(); i++) {
			if (monthNames.get(i).contains(timeSlot2) && branchNames.get(i).equalsIgnoreCase(branch2)) {
				rowNumber2 = i;
			}
		}

		System.out.println(rowNumber2);
		String branchName2 = branchNames.get(rowNumber2);
		System.out.println("Branch " + branchName2);

		// Navigate to dashboard
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.dashBoardLink, "Dashboard", "Dashboard");
		Thread.sleep(2000);

		// Select the branch
		compAdminDashboardPageObject.dashboardSelectionDropDown.click();
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.dashboardSelectionDropDownItems,
				branchName2);
		Thread.sleep(2000);

		// Select the time slot
		compAdminDashboardPageObject.allTimeDropDown.click();
		Thread.sleep(2000);
		if (timeSlot1.contains("All Time") || timeSlot1.contains("This Month") || timeSlot1.contains("Last Month")
				|| timeSlot1.contains("This Year")) {
			CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.allTimeDropDownOptions, timeSlot2);
			Thread.sleep(2000);
		} else {
			CommonFunctions.fn_ClickOnItemInDropDown(compAdminDashboardPageObject.allTimeDropDownOptions,
					monthStr2 + " " + yearStr2);
			Thread.sleep(2000);
		}

		// Verify for the values
		int processedCountInReport2 = Integer.parseInt(ExcelUtil
				.getCellValueByColumnName(surveyStatisticsReportFileName, "Sheet0", dirPath, "TRX_RCVD", rowNumber2));
		int processedCountOnUI2 = Integer.parseInt(compAdminDashboardPageObject.processedCount.getText());
		System.out.println(processedCountInReport + " " + processedCountOnUI);
		softAssert.assertEquals(processedCountInReport2, processedCountOnUI2,
				"TRX_RCVD and processed count is not correct.");

		int duplicateCountInReport2 = Integer.parseInt(ExcelUtil
				.getCellValueByColumnName(surveyStatisticsReportFileName, "Sheet0", dirPath, "DUPLICATE", rowNumber2));
		int duplicateCountOnUI2 = Integer.parseInt(compAdminDashboardPageObject.duplicateCount.getText());
		softAssert.assertEquals(duplicateCountInReport2, duplicateCountOnUI2, "Duplicate count is not correct.");

		int corruptedCountInReport2 = Integer.parseInt(ExcelUtil
				.getCellValueByColumnName(surveyStatisticsReportFileName, "Sheet0", dirPath, "CORRUPTED", rowNumber2));
		int corruptedCountOnUI2 = Integer.parseInt(compAdminDashboardPageObject.corruptedCount.getText());
		softAssert.assertEquals(corruptedCountInReport2, corruptedCountOnUI2, "Corrupted count is not correct.");

		int surveysCompletedCountInReport2 = Integer.parseInt(ExcelUtil.getCellValueByColumnName(
				surveyStatisticsReportFileName, "Sheet0", dirPath, "SURVEYS COMPLETED", rowNumber2));
		int surveysCompletedCountOnUI2 = Integer
				.parseInt(compAdminDashboardPageObject.completedCount.getText().split(" ")[0]);
		softAssert.assertEquals(surveysCompletedCountInReport2, surveysCompletedCountOnUI2,
				"Completed count is not correct.");

		String completedPercentageInReport2 = ExcelUtil.getCellValueByColumnName(surveyStatisticsReportFileName,
				"Sheet0", dirPath, "COMPLETE PERCENTAGE", rowNumber2);
		String completedPercentageOnUI2 = compAdminDashboardPageObject.completedCount.getText().split(" ")[1];
		softAssert.assertEquals(completedPercentageInReport2, completedPercentageOnUI2,
				"Completed percentage is not correct.");

		int surveysInCompletedCountInReport2 = processedCountInReport2 - surveysCompletedCountInReport2;
		int surveysInCompletedCountOnUI2 = Integer
				.parseInt(compAdminDashboardPageObject.incompleteSurveyCount.getText().split(" ")[0]);
		softAssert.assertEquals(surveysInCompletedCountInReport2, surveysInCompletedCountOnUI2,
				"Incompleted count is not correct.");

		String incompletedPercentageInReport2 = Integer
				.toString((surveysInCompletedCountInReport2 * 100) / processedCountInReport2);
		String incompletedPercentageOnUI2 = compAdminDashboardPageObject.incompleteSurveyCount.getText().split(" ")[1];
		softAssert.assertEquals(incompletedPercentageInReport2, incompletedPercentageOnUI2,
				"Incompleted percentage is not correct.");

		// Logout
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

		softAssert.assertAll();
	}

	@Given("^Login to existing company for verifying quick edits$")
	public void login_to_existing_company_for_verifying_quick_edits() throws Throwable {

		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Search the existing company
		companyName = ExcelUtil.getCellData("Login Details", 10, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(4000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

		// Navigate to manage team and edit the user
		regionName = ExcelUtil.getCellValueByColumnName("Quick Edits", "Region");
		branchName = ExcelUtil.getCellValueByColumnName("Quick Edits", "Existing Branch");
		agentName = ExcelUtil.getCellValueByColumnName("Quick Edits", "Existing Agent");
		System.out.println(regionName + branchName + agentName);
		editOrLoginAsAgent(regionName, branchName, agentName, "Edit");

		softAssert.assertEquals(CommonFunctions.isElementPresent(By.xpath("//div[@id='v-ed-hide-pp-chk-box']")), true,
				"Hide public page checkbox is not present although logged into comp from ss admin");

		// Logout
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

		// Login directly to comp admin
		CommonFunctions.fn_LoginAsCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 10, 1),
				ExcelUtil.getCellData("Login Details", 10, 2));

		// Edit the agent
		editOrLoginAsAgent(regionName, branchName, agentName, "Edit");

		softAssert.assertEquals(CommonFunctions.isElementPresent(By.xpath("//div[@id='v-ed-hide-pp-chk-box']")), false,
				"Hide public page checkbox is not present although logged into comp from ss admin");

		// Logout
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

	}

	@When("^Created a new agent and update the logo$")
	public void created_a_new_agent_and_update_the_logo() throws Throwable {

		// Login
		// Login directly to comp admin
		CommonFunctions.fn_LoginAsCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 10, 1),
				ExcelUtil.getCellData("Login Details", 10, 2));

		// Navigate to Manage Team
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "User Management",
				"User Management");
		Thread.sleep(3000);

		// Create a new agent
		// Navigate to add team members
		manageTeamPageObject.addTeamMembersButton.click();
		Thread.sleep(2000);

		// Enter all the fields to create User to Office
		addTeamMembersPageObject.individualTab.click();
		CommonFunctions.fn_WaitForAnElementToBeVisible(addTeamMembersPageObject.assignToDropDownInput);
		Thread.sleep(2000);
		addTeamMembersPageObject.assignToDropDownInput.click();
		CommonFunctions.fn_WaitForAnElementToBeVisible(addTeamMembersPageObject.assignToDropDownList);
		CommonFunctions.fn_ClickOnItemInDropDown(addTeamMembersPageObject.assignToDropDownListItems, "Office");
		Thread.sleep(2000);
		addTeamMembersPageObject.selectOfficeDropDownInput.click();
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(addTeamMembersPageObject.selectOfficeListItems,
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Existing Branch"));
		Thread.sleep(2000);
		addTeamMembersPageObject.addUserDropDownInput.clear();
		Thread.sleep(2000);

		// Run instance creation
		runInstance = (int) CommonFunctions.fn_GenerateRandomNumber(System.currentTimeMillis());
		String[] userForComp = ExcelUtil.getCellValueByColumnName("Quick Edits", "User For Office").split("@");
		userForCompany = userForComp[0] + "+" + runInstance + "@" + userForComp[1];

		// Email
		agentName = userForComp[0] + "+" + runInstance;
		addTeamMembersPageObject.addUserDropDownInput.sendKeys(userForCompany);
		Thread.sleep(2000);
		addTeamMembersPageObject.saveButton.click();
		Thread.sleep(2000);

		// Change the profile image and comp logo
		editOrLoginAsAgent(regionName, branchName, agentName, "Edit");
		Thread.sleep(4000);
		quickEditPageObject.editButton.click();
		Thread.sleep(4000);
		quickEditPageObject.profileImageEditIcon.click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec(resourcesPath + "\\ProfileImageUpload.exe");
		Thread.sleep(5000);
		quickEditPageObject.uploadButton.click();
		Thread.sleep(5000);
		quickEditPageObject.companyLogoEditIcon.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(resourcesPath + "\\CompanyLogoUpload.exe");
		Thread.sleep(5000);
		quickEditPageObject.saveButton.click();
		Thread.sleep(2000);
		//String profileImage = quickEditPageObject.profileImage.getAttribute("src");
		//String logoImage = quickEditPageObject.profileImage.getAttribute("src");

		// Login to the agent
		compAdminDashboardPageObject.dashBoardLink.click();
		Thread.sleep(4000);
		editOrLoginAsAgent(regionName, branchName, agentName, "Login");
		Thread.sleep(4000);
		agentDashboardPageObject.editProfileLink.click();
		Thread.sleep(3000);
		// softAssert.assertEquals(agentProfilePageObject.profileImage1.getAttribute("src"),
		// profileImage, "Profile image is not updated correctly");
		// softAssert.assertEquals(agentProfilePageObject.companyLogo.getAttribute("src"),
		// logoImage, "Profile image is not updated correctly");

		// Switch back to admin
		agentDashboardPageObject.userImage.click();
		Thread.sleep(2000);
		agentDashboardPageObject.switchToAdminItem.click();
		Thread.sleep(2000);

		// Logout
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Search the existing company
		companyName = ExcelUtil.getCellData("Login Details", 10, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(4000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

		// Navigate to settings to enable 'Allow partner survey'
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.configureLink, "Edit Settings", "Edit Settings");

		if (compAdminSettingsPageObject.allowPartnerSurveyCheckBoxValue.getAttribute("value")
				.equalsIgnoreCase("false")) {
			compAdminSettingsPageObject.allowPartnerSurveyCheckBox.click();
			Thread.sleep(2000);
		}

		// Navigate to manage team and edit the user to check the hide public page
		editOrLoginAsAgent(regionName, branchName, agentName, "Edit");
		quickEditPageObject.editButton.click();
		Thread.sleep(2000);

		if (CommonFunctions.isElementPresent(By.xpath("//input[@id='at-pst-cb']/preceding-sibling::div"))) {
			softAssert.assertEquals(quickEditPageObject.allowPartnerSurveyCheckBoxValue.getAttribute("value"), "true",
					"Allow partner survey is not checked");
		}

		if (quickEditPageObject.hidePublicPageCheckBoxValue.getAttribute("value").equalsIgnoreCase("false")) {
			quickEditPageObject.hidePublicPageCheckBox.click();
			Thread.sleep(2000);
		}

		publicPageURL = "http://" + quickEditPageObject.baseURL.getText()
				+ quickEditPageObject.profileURLInputTextBox.getAttribute("value");
		System.out.println(publicPageURL);
		quickEditPageObject.saveButton.click();
		Thread.sleep(3000);
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

		// Navigate to public page and verify if it shows 404 error
		// driver.navigate().to(publicPageURL);
		CommonFunctions.fn_OpenURL(publicPageURL);
		Thread.sleep(2000);
		softAssert.assertEquals(CommonFunctions.isElementPresent(By.xpath("//div[@class='ss-404-not-found-txt']")),
				true, "Faield: Public page is loaded although hide public page is enabled.");

		// Navigate back to application
		// driver.navigate().back();
		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Search the existing company
		companyName = ExcelUtil.getCellData("Login Details", 10, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(4000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

		// Edit to disable the hide public page
		editOrLoginAsAgent(regionName, branchName, agentName, "Edit");
		quickEditPageObject.editButton.click();
		Thread.sleep(2000);
		if (quickEditPageObject.hidePublicPageCheckBoxValue.getAttribute("value").equalsIgnoreCase("true")) {
			quickEditPageObject.hidePublicPageCheckBox.click();
			Thread.sleep(2000);
		}
		quickEditPageObject.saveButton.click();
		Thread.sleep(2000);

		// Logout
		CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);

		// Navigate to public page and verify if it shows 404 error
		CommonFunctions.fn_OpenURL(publicPageURL);
		softAssert.assertEquals(CommonFunctions.isElementPresent(By.xpath("//div[@class='ss-404-not-found-txt']")),
				false, "Faield: Public page is not loaded although hide public page is disabled.");

	}

	@Then("^Details should be updated in agent login$")
	public void details_should_be_updated_in_agent_login() throws Throwable {

		// Navigate back to application
		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Search the existing company
		companyName = ExcelUtil.getCellData("Login Details", 10, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(4000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

		// Edit
		editOrLoginAsAgent(regionName, branchName, agentName, "Edit");
		Thread.sleep(2000);

		// Edit and enter all the details
		quickEditPageObject.editButton.click();
		Thread.sleep(2000);
		quickEditPageObject.firstName.clear();
		quickEditPageObject.firstName.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "First Name"));
		Thread.sleep(2000);
		quickEditPageObject.lastName.clear();
		quickEditPageObject.lastName.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "Last Name"));
		Thread.sleep(2000);
		quickEditPageObject.email.clear();
		quickEditPageObject.email.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "Email"));
		Thread.sleep(2000);
		quickEditPageObject.title.clear();
		quickEditPageObject.title.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "Title"));
		Thread.sleep(2000);
		quickEditPageObject.address1.clear();
		quickEditPageObject.address1.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "Address1"));
		Thread.sleep(2000);
		quickEditPageObject.address2.clear();
		quickEditPageObject.address2.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "Address2"));
		Thread.sleep(2000);
		String agentCountry = ExcelUtil.getCellValueByColumnName("Quick Edits", "Country");
		if (!(agentCountry.equalsIgnoreCase(quickEditPageObject.country.getAttribute("value")))) {
			quickEditPageObject.country.clear();
			quickEditPageObject.country.sendKeys(agentCountry);
			Thread.sleep(2000);
			CommonFunctions.fn_ClickOnItemInDropDown(quickEditPageObject.countryListItems, agentCountry);
			Thread.sleep(2000);
		}
		CommonFunctions.fn_SelectByVisibleText(quickEditPageObject.state,
				ExcelUtil.getCellValueByColumnName("Quick Edits", "State"));
		String agentCity = ExcelUtil.getCellValueByColumnName("Quick Edits", "City");
		if (!(agentCity.equalsIgnoreCase(quickEditPageObject.city.getAttribute("value")))) {
			quickEditPageObject.city.clear();
			quickEditPageObject.city.sendKeys(agentCity);
			Thread.sleep(2000);
			CommonFunctions.fn_ClickOnItemInDropDown(quickEditPageObject.countryListItems, agentCity);
			Thread.sleep(2000);
		}
		quickEditPageObject.zipCode.clear();
		quickEditPageObject.zipCode.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "Zip"));
		Thread.sleep(2000);
		quickEditPageObject.phone.clear();
		quickEditPageObject.phone.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "Phone"));
		Thread.sleep(2000);
		quickEditPageObject.website.clear();
		quickEditPageObject.website.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "Website"));
		Thread.sleep(2000);
		quickEditPageObject.aboutMe.clear();
		quickEditPageObject.aboutMe.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "About Me"));
		Thread.sleep(2000);
		quickEditPageObject.disclaimer.clear();
		quickEditPageObject.disclaimer.sendKeys(ExcelUtil.getCellValueByColumnName("Quick Edits", "Disclaimer"));
		Thread.sleep(2000);
		quickEditPageObject.minimumScoreToAutoPost.click();
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(quickEditPageObject.minimumScoreToAutoPostItems,
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Minimum Score To Post"));
		Thread.sleep(2000);
		if (quickEditPageObject.autoPostEnabledCheckBoxValue.getAttribute("value").equalsIgnoreCase("true")) {
			quickEditPageObject.autoPostEnabledCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already unchecked and the value is false");
		}

		if (quickEditPageObject.hidePublicPageCheckBoxValue.getAttribute("value").equalsIgnoreCase("false")) {
			quickEditPageObject.hidePublicPageCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already checked and the value is true");
		}

		if (quickEditPageObject.replyToReviewsCheckBoxValue.getAttribute("value").equalsIgnoreCase("false")) {
			quickEditPageObject.replyToReviewsCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already checked and the value is true");
		}

		if (quickEditPageObject.adminPrivilegesCheckBoxValue.getAttribute("value").equalsIgnoreCase("false")) {
			quickEditPageObject.adminPrivilegesCheckBox.click();
			Thread.sleep(2000);
		} else {
			System.out.println("It is already checked and the value is true");
		}

		Thread.sleep(2000);
		quickEditPageObject.minimumScoreToReply.click();
		Thread.sleep(2000);
		CommonFunctions.fn_ClickOnItemInDropDown(quickEditPageObject.minimumScoreToReplyItems,
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Minimum Score To Reply"));
		Thread.sleep(2000);

		quickEditPageObject.saveButton.click();
		Thread.sleep(2000);
		compAdminDashboardPageObject.dashBoardLink.click();
		Thread.sleep(4000);

		// Login to agent
		agentName = ExcelUtil.getCellValueByColumnName("Quick Edits", "First Name") + " "
				+ ExcelUtil.getCellValueByColumnName("Quick Edits", "Last Name");
		editOrLoginAsAgent(regionName, branchName, agentName, "Login");

		// Navigate to Edit profile and verify the values
		agentDashboardPageObject.editProfileLink.click();
		Thread.sleep(2000);
		softAssert
				.assertEquals(agentProfilePageObject.profileName.getAttribute("value"),
						ExcelUtil.getCellValueByColumnName("Quick Edits", "First Name") + " "
								+ ExcelUtil.getCellValueByColumnName("Quick Edits", "Last Name"),
						"Profile name is incorrect.");
		softAssert.assertEquals(agentProfilePageObject.title.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Title"), "Title is incorrect");
		agentProfilePageObject.addressContainer.click();
		Thread.sleep(3000);
		softAssert.assertEquals(agentProfilePageObject.address1.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Address1"), "Address1 is incorrect");
		softAssert.assertEquals(agentProfilePageObject.address2.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Address2"), "Address2 is incorrect");
		softAssert.assertEquals(agentProfilePageObject.country.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Country"), "Country is incorrect");
		softAssert.assertEquals(agentProfilePageObject.state.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "State"), "State is incorrect");
		softAssert.assertEquals(agentProfilePageObject.city.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "City"), "City is incorrect");
		softAssert.assertEquals((int) Double.parseDouble(agentProfilePageObject.zipCode.getAttribute("value")),
				(int) Double.parseDouble(ExcelUtil.getCellValueByColumnName("Quick Edits", "Zip")), "Zip is incorrect");
		agentProfilePageObject.cancelButton.click();
		Thread.sleep(3000);
		softAssert.assertEquals(agentProfilePageObject.publicPageURL.getText(), publicPageURL,
				"Public page URL is incorrect");

		softAssert.assertEquals(agentProfilePageObject.website.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Website"), "Website is incorrect");
		softAssert.assertEquals(agentProfilePageObject.phone.getAttribute("title"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Phone"), "Phone is incorrect");
		softAssert.assertEquals(agentProfilePageObject.aboutMe.getText(),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "About Me"), "About me is incorrect");
		softAssert.assertEquals(agentProfilePageObject.disclaimer.getText(),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Disclaimer"), "Disclaimer is incorrect");

		// Navigate to Settings to verify
		agentDashboardPageObject.configureLink.click();
		Thread.sleep(3000);
		softAssert.assertEquals(agentConfigurePageObject.minScoreToPost.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Minimum Score To Post"),
				"Minimum score to post is incorrect");
		softAssert.assertEquals(agentConfigurePageObject.autoPostCheckBoxValue.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Auto Post"),
				"Auto post check box value is incorrect");
		softAssert.assertEquals(agentConfigurePageObject.replyToReviewsCheckBoxValue.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Reply To Reviews"),
				"Reply to reviews check box value is incorrect");
		softAssert.assertEquals(agentConfigurePageObject.minScoreToReply.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Minimum Score To Reply"),
				"Minimum score to reply is incorrect");
		softAssert.assertEquals(agentConfigurePageObject.hidePublicPageCheckBoxValue.getAttribute("value"),
				ExcelUtil.getCellValueByColumnName("Quick Edits", "Hide Public Page"),
				"Hide Public Page check box value is incorrect");

		// Switch to admin
		agentDashboardPageObject.userImage.click();
		Thread.sleep(3000);
		agentDashboardPageObject.switchToAdminItem.click();
		Thread.sleep(3000);

		// Search the existing company
		companyName = ExcelUtil.getCellData("Login Details", 10, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(4000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

		// Delete the agent
		editOrLoginAsAgent(regionName, branchName, agentName, "Delete");

		if (viewHierarchyPageObject.popupHeader.getText().contains("Delete User")) {
			viewHierarchyPageObject.deleteButton.click();
			Thread.sleep(2000);
		}

		softAssert.assertEquals(viewHierarchyPageObject.successMessage.getText(), "User has been deleted successfully",
				"User is not deleted");

		// Logout
		agentDashboardPageObject.userImage.click();
		Thread.sleep(2000);
		agentDashboardPageObject.logoutItem.click();
		Thread.sleep(2000);

		softAssert.assertAll();
	}

	private void editOrLoginAsAgent(String regionName, String branchName, String agentName, String action)
			throws InterruptedException {

		// Navigate to Manage Team - View Hierarchy
		CommonFunctions.fn_NavigateToPage(compAdminDashboardPageObject.manageTeamLink, "User Management",
				"User Management");
		Thread.sleep(3000);
		manageTeamPageObject.viewHierarchyButton.click();
		Thread.sleep(2000);

		// Click on region
		for (int i = 0; i < viewHierarchyPageObject.regionNames.size(); i++) {
			if (viewHierarchyPageObject.regionNames.get(i).getText().toLowerCase().contains(regionName.toLowerCase())) {
				viewHierarchyPageObject.regionRightArrows.get(i).click();
				Thread.sleep(2000);
			}
		}

		// Click on branch
		for (int i = 0; i < viewHierarchyPageObject.branchNames.size(); i++) {
			if (viewHierarchyPageObject.branchNames.get(i).getText().toLowerCase().contains(branchName.toLowerCase())) {
				viewHierarchyPageObject.branchRightArrows.get(i).click();
				Thread.sleep(2000);
			}
		}

		// Click on the edit icon for the user
		for (int i = 0; i < viewHierarchyPageObject.agentNames.size(); i++) {
			if (viewHierarchyPageObject.agentNames.get(i).getText().toLowerCase().contains(agentName.toLowerCase())) {
				if (action.contains("Edit")) {
					viewHierarchyPageObject.agentQuickEditButtons.get(i).click();
					Thread.sleep(2000);
				}
				if (action.contains("Login")) {
					viewHierarchyPageObject.agentsLoginAs.get(i).click();
					Thread.sleep(2000);
				}
				if (action.contains("Delete")) {
					viewHierarchyPageObject.agentDeleteButtons.get(i).click();
					Thread.sleep(2000);
				}
			}
		}
	}

	@Given("^Login to existing company for verifying new dashboard$")
    public void login_to_existing_company_for_verifying_new_dashboard() throws Throwable {
		// Login to the SS Admin
		CommonFunctions.fn_OpenURL(prop.getProperty("URL"));
		CommonFunctions.fn_LoginAsSSorCompAdmin(loginPageObject, ExcelUtil.getCellData("Login Details", 1, 1),
				ExcelUtil.getCellData("Login Details", 1, 2));
		CommonFunctions.fn_WaitTillPageLoads("Hierarchy");

		// Search the existing company
		companyName = ExcelUtil.getCellData("Login Details", 11, 3);
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssAdminHierarchyPageObject.companySearchBox);
		System.out.println(companyName);
		ssAdminHierarchyPageObject.companySearchBox.sendKeys(companyName);
		ssAdminHierarchyPageObject.companySearchIcon.click();
		Thread.sleep(4000);

		// Click on login as if the company searched is found
		if (ssAdminHierarchyPageObject.companyName.getText().toLowerCase().contains(companyName.toLowerCase())) {
			ssAdminHierarchyPageObject.companyAdminLoginAs.click();
			Thread.sleep(4000);
			CommonFunctions.fn_WaitTillPageLoads("Dashboard");
		} else {
			System.out.println("Company is not searched and displayed  in first row.");
		}

    }

    @When("^Navigated to dashboard$")
    public void navigated_to_dashboard() throws Throwable {
        
    	Thread.sleep(3000);
    	// Get the values on UI
    	int processedCount = Integer.parseInt(compAdminDashboardPageObject.processedCount.getText());
    	int incompleteSurveyCount = Integer.parseInt((compAdminDashboardPageObject.incompleteSurveyCount.getText().split(" "))[0]);
    	int completedCount = Integer.parseInt((compAdminDashboardPageObject.completedCount.getText().split(" "))[0]);
    	int socialPostsCount = Integer.parseInt(compAdminDashboardPageObject.socialPostsCount.getText());
    	int zillowReviewsCount = Integer.parseInt(compAdminDashboardPageObject.zillowReviewsCount.getText());
    	int thirdPartyCount = Integer.parseInt(compAdminDashboardPageObject.thirdPartyCount.getText());
    	int googleReviewsCount = Integer.parseInt(compAdminDashboardPageObject.googleReviewsCount.getText());
    	System.out.println(googleReviewsCount);
    	int facebookReviewsCount = Integer.parseInt(compAdminDashboardPageObject.facebookReviewsCount.getText());
    	System.out.println(facebookReviewsCount);
    	
    	int unprocessedCount= Integer.parseInt(compAdminDashboardPageObject.unprocessedCount.getText());
    	int unassignedCount= Integer.parseInt(compAdminDashboardPageObject.unassignedCount.getText());
    	int duplicateCount= Integer.parseInt(compAdminDashboardPageObject.duplicateCount.getText());
    	int corruptedCount= Integer.parseInt(compAdminDashboardPageObject.corruptedCount.getText());
    	System.out.println(corruptedCount);
    	int otherCount= Integer.parseInt(compAdminDashboardPageObject.otherCount.getText());
    	int unsubscribedCount= Integer.parseInt(compAdminDashboardPageObject.unsubscribedCount.getText());
    	
    	// Connect to DB
    	Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://ss-report-demo.c3n1qsdsmjxc.us-west-2.rds.amazonaws.com","ss_app", "W{[2349,C~42k]e");
		statement = connection.createStatement();
		
		// Get values from DB
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Completed Count");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int completedCountInDB = resultSet.getInt(1);
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Incomplete");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int inCompletedCountInDB = resultSet.getInt(1);
		
		int processedCountInDB = completedCountInDB+inCompletedCountInDB;
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Zillow Reviews");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int zillowReviewsCountInDB = resultSet.getInt(1);
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Third Party Reviews");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int thirdPartyReviewsCountInDB = resultSet.getInt(1);
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Google Reviews");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int googleReviewsCountInDB = resultSet.getInt(1);
		
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Facebook Reviews");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int facebookReviewsCountInDB = resultSet.getInt(1);
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Unassigned");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int unassignedCountInDB = resultSet.getInt(1);
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Duplicate");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int duplicateCountInDB = resultSet.getInt(1);
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Corrupted");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int corruptedCountInDB = resultSet.getInt(1);
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Great");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int greatCountInDB = resultSet.getInt(1);
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "OK");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int okCountInDB = resultSet.getInt(1);
		
		query = ExcelUtil.getCellValueByColumnName("New Dashboard", "Unpleasant");
		resultSet = statement.executeQuery(query);
		resultSet.next();
		int unpleasantCountInDB = resultSet.getInt(1);
		
		// Verify values
    	softAssert.assertEquals(completedCount, completedCountInDB, "Completed count is incorrect");
    	softAssert.assertEquals(incompleteSurveyCount, inCompletedCountInDB, "Incomplete count is incorrect");
    	softAssert.assertEquals(processedCount, processedCountInDB, "Processed count is incorrect");
    	softAssert.assertEquals(zillowReviewsCount, zillowReviewsCountInDB, "Zillow count is incorrect");
    	softAssert.assertEquals(thirdPartyCount, thirdPartyReviewsCountInDB, "Third Party count is incorrect");
    	softAssert.assertEquals(googleReviewsCount, googleReviewsCountInDB, "Google count is incorrect");
    	softAssert.assertEquals(facebookReviewsCount, facebookReviewsCountInDB, "Facebook count is incorrect");
    	//softAssert.assertEquals(socialPostsCount, socialPostsCountInDB, "Social posts count is incorrect");
    	
    	//softAssert.assertEquals(unprocessedCount, unprocessedCountInDB, "Unprocessed count is incorrect");
    	softAssert.assertEquals(unassignedCount, unassignedCountInDB, "Unassigned count is incorrect");
    	softAssert.assertEquals(duplicateCount, duplicateCountInDB, "Duplicate count is incorrect");
    	softAssert.assertEquals(corruptedCount, corruptedCountInDB, "Corrupted count is incorrect");
    	//softAssert.assertEquals(otherCount, otherCountInDB, "Other count is incorrect");
    	//softAssert.assertEquals(unsubscribedCount, unsubscribedCountInDB, "Unsubscribed count is incorrect");
    		
    	// Calcuate SPS with formula SPS=[(Great-Unpleasant)/(Great+Unpleasant+Ok)]*100
    	int SPSinDB = ((greatCountInDB-unpleasantCountInDB)/(greatCountInDB+unpleasantCountInDB+okCountInDB))*100;
    	compAdminDashboardPageObject.promoterStatsTab.click();
    	Thread.sleep(3000);
    	String socialPromoterScore = compAdminDashboardPageObject.socialPromoterScore.getText();
    	int SPS = Integer.parseInt(socialPromoterScore.substring(13));
    	softAssert.assertEquals(SPS, SPSinDB, "SPS is incorrect");
    	
    }

    @Then("^Values on UI should match with that of DB$")
    public void values_on_ui_should_match_with_that_of_db() throws Throwable {
        
    	CommonFunctions.fn_LogOutAsCompAdmin(compAdminDashboardPageObject);
    	softAssert.assertAll();
    	  	
    }
	
	@And("^Test$")
	public void test() throws Exception {

		
	}
}
