package com.util.ss;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.base.ss.BaseClass;
import com.pageobjects.ss.CompAdminDashboardPage;
import com.pageobjects.ss.CompSocialMonitorPage;
import com.pageobjects.ss.GmailPage;
import com.pageobjects.ss.LOSearchPage;
import com.pageobjects.ss.LoginPage;
import com.pageobjects.ss.SSAdminHomePage;
import com.pageobjects.ss.SendInvitePage;
import com.sun.tools.javac.util.Assert;

public class CommonFunctions extends BaseClass {
	
	static int  countOfRefresh = 0;

	public static void fn_OpenURL(String url) {
		driver.get(url);
	}

	public static void fn_LoginAsSSorCompAdmin(LoginPage lp, String email, String password) {
		System.out.println("Email to be entered is " + email);
		System.out.println("Password to be entered is " + password);
		lp.SSAdminUserId.sendKeys(email);
		lp.SSAdminPassword.sendKeys(password);
		lp.mainLoginButton.click();
	}

	public static void fn_LoginAsCompAdmin(LoginPage lp, String email, String password) {
		System.out.println("Email to be entered is " + email);
		System.out.println("Password to be entered is " + password);
		lp.SSAdminUserId.sendKeys(email);
		lp.SSAdminPassword.sendKeys(password);
		lp.mainLoginButton.click();
	}

	public static void fn_LoginToGmail(GmailPage gp, String email, String password) throws InterruptedException {
		System.out.println("Email to be entered is " + email);
		System.out.println("Password to be entered is " + password);
		gp.gmailUsername.sendKeys(email);
		gp.identifierNext.click();
		Thread.sleep(1000);
		gp.gmailPassword.sendKeys(password);
		Thread.sleep(1000);
		gp.passwordNext.click();
	}

	public static void fn_SendInvite(SendInvitePage sip, String firstName, String lastName, String email,
			String inviteEmail) {
		sip.customerFirstName.sendKeys(firstName);
		sip.customerLastName.sendKeys(lastName);
		sip.customerEmail.sendKeys(email);
		sip.customerCustomEmail.sendKeys(inviteEmail);
		sip.doneButton.click();
	}

	public static void fn_LogOutAsSSAdmin(SSAdminHomePage ssap) {
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssap.userImage);
		ssap.userImage.click();
		CommonFunctions.fn_WaitForAnElementToBeClickable(ssap.logoutItem);
		ssap.logoutItem.click();
	}

	public static void fn_LogOutAsCompAdmin(CompAdminDashboardPage cadp) {
		cadp.userImage.click();
		cadp.logoutLink.click();
	}

	public static void fn_NavigateToPage(WebElement WE, String pageName, String pageTitle) {
		WE.click();
		if(pageTitle!=null) {
			System.out.println("Link for page " + pageName + " is clicked");
			fn_WaitTillPageLoads(pageTitle);
		}
	}

	public static void fn_WaitTillPageLoads(String pageTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(pageTitle));
	}
	
	@SuppressWarnings("deprecation")
	public static void fn_FluentWaitTillTextIsPresent (WebElement element, String text) {
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(120, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		
	}
	
	public static void fn_WaitTillTextIsPresentInElement(WebElement elementToBeVerified, String textToBePresent) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(elementToBeVerified, textToBePresent));
	}
	
	public static void fn_SearchGmail(GmailPage gp, String subjectOfGmail) throws InterruptedException {
		
		Thread.sleep(2000);

		fn_WaitForAnElementToBeClickable(driver.findElement(By.xpath("//input[@aria-label = 'Search mail']")));
		gp.searchInputField = driver.findElement(By.xpath("//input[@aria-label = 'Search mail']"));
		gp.searchInputField.clear();
		gp.searchInputField.sendKeys(subjectOfGmail);
		gp.searchInputField.sendKeys(Keys.ENTER);

	}

	public static void fn_SearchAndClickOnGmail1(GmailPage gp, String subjectOfGmail, String scriptStartTime) throws Exception {
		boolean emailSelected = false;

		fn_SearchGmail(gp, subjectOfGmail);
		gp.spanSubject = driver.findElements(By.xpath("//span[@class='y2']"));
		int sizeOfSpanElements = gp.spanSubject.size();
		System.out.println(gp.spanSubject);
		for (int i = 0; i < sizeOfSpanElements; i++) {
			String spanSubjectText = gp.spanSubject.get(i).getText();
			System.out.println("Span text " + spanSubjectText + " at " + i);
			if (gp.spanSubject.get(i).getText().contains(subjectOfGmail)) {
				System.out.println("Email with the from name is found");
				CommonFunctions.fn_WaitForAnElementToBeClickable(gp.spanSubject.get(i));
				gp.spanSubject.get(i).click();
				System.out.println("Clicked on the email");
				emailSelected = true;
			}
			gp.spanSubject = driver.findElements(By.xpath("//*[@class='y2']"));
			sizeOfSpanElements = gp.spanSubject.size();
		}
		if (!emailSelected) {
			gp.refreshButton = driver
					.findElement(By.xpath("(//div[@class = 'G-Ni J-J5-Ji']/div/div[@class='asa'])[7]"));
			fn_WaitForAnElementToBeVisible(gp.refreshButton);
			gp.refreshButton = driver
					.findElement(By.xpath("(//div[@class = 'G-Ni J-J5-Ji']/div/div[@class='asa'])[7]"));
			fn_WaitForAnElementToBeClickable(gp.refreshButton);
			gp.refreshButton.click();
			
			System.out.println("Refreshing....");
			try {
				fn_SearchAndClickOnGmail(gp, subjectOfGmail, scriptStartTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void fn_SearchAndClickOnGmail(GmailPage gp, String subjectOfGmail, String scriptStartTime) throws Exception {
		
		boolean emailSelected = false;

		fn_SearchGmail(gp, subjectOfGmail);
		gp.spanSubject = driver.findElements(By.xpath("//span[@class='y2']"));
		int sizeOfSpanElements = gp.spanSubject.size();
		System.out.println(gp.spanSubject);
		
		for (int i = 0; i < sizeOfSpanElements; i++) {
			System.out.println(gp.spanSubject.get(i).getText());
			if (gp.spanSubject.get(i).getText().toLowerCase().contains(subjectOfGmail.toLowerCase())) {
				System.out.println("Email with the subject is found");
				System.out.println(gp.timeOfEmailElement.get(i).getAttribute("title"));
				System.out.println(scriptStartTime);
				String compareStatus = CommonFunctions.fn_CompareDateTime(gp.timeOfEmailElement.get(i).getAttribute("title"), scriptStartTime);
				if(compareStatus.equalsIgnoreCase("After")||compareStatus.equalsIgnoreCase("Equal")) {
					Thread.sleep(3000);
					fn_ClickOnElementUsingActions(gp.spanSubject.get(i));					
					System.out.println("Clicked on the email");
					emailSelected = true;
				}
			}
			gp.spanSubject = driver.findElements(By.xpath("//*[@class='y2']"));
			sizeOfSpanElements = gp.spanSubject.size();
		}
		
		if(countOfRefresh>=300) {
			System.out.println("Email not found even after refreshing for 300 times");
			Assert.error();
		}
		
		if (!emailSelected) {
			gp.refreshButton = driver
					.findElement(By.xpath("(//div[@class = 'G-Ni J-J5-Ji']/div/div[@class='asa'])[7]"));
			fn_WaitForAnElementToBeVisible(gp.refreshButton);
			gp.refreshButton = driver
					.findElement(By.xpath("(//div[@class = 'G-Ni J-J5-Ji']/div/div[@class='asa'])[7]"));
			fn_WaitForAnElementToBeClickable(gp.refreshButton);
			gp.refreshButton.click();
			countOfRefresh = countOfRefresh+1;
			fn_SearchAndClickOnGmail(gp, subjectOfGmail, scriptStartTime);
		}
	}
	
	public static void fn_ClickOnElementUsingActions(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}
	
	public static void fn_LogoutFromGmail(GmailPage gmailPageObject) {
		CommonFunctions.fn_ClickOnElementUsingActions(gmailPageObject.userImage);
		CommonFunctions.fn_ClickOnElementUsingActions(gmailPageObject.signOutLink);
		CommonFunctions.fn_WaitTillPageLoads("Gmail");
	}
	
	public static void fn_ClickOnItemInDropDown(List<WebElement> dropDownListItems, String listItemToSelect) {
		int sizeOfListItems = dropDownListItems.size();
		System.out.println("Entered this method");
		for (int i = 0; i < sizeOfListItems; i++) {
			if (dropDownListItems.get(i).getText().equalsIgnoreCase(listItemToSelect)||dropDownListItems.get(i).getText().contains(listItemToSelect)) {
				dropDownListItems.get(i).click();
				break;
			}
		}
	} 
	
	public static void fn_ClickOnItemInDropDownUsingActions(List<WebElement> dropDownListItems, String listItemToSelect) throws InterruptedException {
		int sizeOfListItems = dropDownListItems.size();
		System.out.println("Entered this method");
		for (int i = 0; i < sizeOfListItems; i++) {
			if (dropDownListItems.get(i).getText().equalsIgnoreCase(listItemToSelect)||dropDownListItems.get(i).getText().contains(listItemToSelect)) {
				fn_MouseHover(dropDownListItems.get(i));
				Thread.sleep(2000);
				dropDownListItems.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	} 
	
	public static int fn_SearchReview(CompSocialMonitorPage csmp, String agentName, String mediaType, String reviewText) {
		
		int index = -1;
		
		for(int i = 0; i<csmp.agentNames.size(); i++) {
			if(csmp.agentNames.get(i).getText().equalsIgnoreCase(agentName)) {
				if(csmp.socialMediaTypes.get(i).getText().equalsIgnoreCase(mediaType) && csmp.reviewTexts.get(i).getText().equalsIgnoreCase(reviewText)) {
					System.out.println("The review is present at "+i);
					index = i;
				}
				else 
					System.out.println("Review is not found with the text and media type from this agent");
			}
			else {
				System.out.println("Review is not found from this agent");
			}
		}
		
		return index;
	}
	public static void fn_CloseBannerIfPresent(CompAdminDashboardPage cadp) {
		
		if(!(cadp.bannerDoNotShowButton.getSize().toString().contains("(0, 0)"))) {
			cadp.bannerDoNotShowButton.click();
			cadp.bannerCloseButton.click();
		}
		else {
			System.out.println("Banner was not displayed");
		}
	}
	
	public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}

	public static void fn_ClickOnEmail(GmailPage gp, String fromOfGmail, String scriptStartTime)
			throws InterruptedException {

		for (int i = 0; i < gp.emails1.size(); i++) {
			if (gp.emails1.get(i).getText().equals(fromOfGmail)) {

				gp.emails1.get(i).click();
				System.out.println("Clicked on the email");
			}
		}

	}

	public static void fn_ClickOnEmail1(GmailPage gp, String subjectOfGmail, String scriptStartTime)
			throws InterruptedException {
		int sizeOfSpanSubject = gp.spanSubject.size();
		for (int i = 0; i < sizeOfSpanSubject; i++) {
			System.out.println(gp.spanSubject.get(i).getText());
			if (gp.spanSubject.get(i).getText().contains(subjectOfGmail)) {

				gp.spanSubject.get(i).click();
				System.out.println("Clicked on the email");
			}

			gp.spanSubject = driver.findElements(By.xpath("//span[@class='y2']"));
			sizeOfSpanSubject = gp.spanSubject.size();
		}

	}

	public static void fn_WaitForNewWindow(final int windowsBefore) {

		ExpectedCondition<Boolean> windowCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.getWindowHandles().size() == windowsBefore + 1;
			}
		};

		WebDriverWait waitForWindow = new WebDriverWait(driver, 30);
		waitForWindow.until(windowCondition);

	}

	public static void fn_WaitForAnElementToBeClickable(WebElement elementToBeClickable) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(elementToBeClickable));
	}
	
	public static void fn_WaitForAnElementToBeInvisible(WebElement elementToBeClickable) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(elementToBeClickable));
	}


	public static void fn_SwitchToNewWindow() {

		String childWindow = null;
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		while (iterator.hasNext()) {
			childWindow = iterator.next();
		}
		driver.switchTo().window(childWindow);

	}

	public static void fn_WaitForAnElementToBeVisible(WebElement elementToBeClickable) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(elementToBeClickable));
	}

	public static String fn_ConvertTo12HourFormat(long input) {

		Time time = new Time(input);
		System.out.println(time.toString());
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		DateFormat outputformat = new SimpleDateFormat("hh:mm:ss aa");
		Date date = null;
		String output = null;
		try {
			date = df.parse(time.toString());
			output = outputformat.format(date);
			System.out.println(output);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return output;

	}

	public static String fn_getCurrentDateTime() {

		Date date = new Date();
		String strDateFormat = "EEE, MMM dd, yyyy, hh:mm a";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate = dateFormat.format(date);
		System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
		return formattedDate;

	}

	public static String fn_CompareDateTime(String timeOfEmail, String scriptStartTime) {

		String compareStatus = "";
		try {
			Date start = new SimpleDateFormat("EEE, MMM dd, yyyy, hh:mm a", Locale.ENGLISH).parse(timeOfEmail);
			Date end = new SimpleDateFormat("EEE, MMM dd, yyyy, hh:mm a", Locale.ENGLISH).parse(scriptStartTime);
			System.out.println(start);
			System.out.println(end);
			if (start.compareTo(end) > 0) {
				System.out.println("start is after end");
				compareStatus = "After";
			} else if (start.compareTo(end) < 0) {
				System.out.println("start is before end");
				compareStatus = "Before";
			} else if (start.compareTo(end) == 0) {
				System.out.println("start is equal to end");
				compareStatus = "Equal";
			} else {
				System.out.println("Something weird happened...");
				compareStatus = "NONE";
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return compareStatus;

	}

	public static List<WebElement> fn_GetRows(WebElement table) {
		return (table.findElements(By.tagName("tr")));
	}

	public static int fn_GetRowCount(WebElement table) {
		return fn_GetRows(table).size();
	}
	
	public static WebElement fn_GetCellElement(WebElement table, String columnName, int rowNumber) {
		
		WebElement cellElement=null;
		List<WebElement> rows = fn_GetRows(table);
		int columNumber = fn_GetColumnNumber(table, columnName);
		System.out.println("Column Number "+columNumber);
		
		cellElement = rows.get(rowNumber).findElements(By.tagName("td")).get(columNumber);
		
		return cellElement;
	}
	
	public static String fn_GetCellValue(WebElement table, String columnName, int rowNumber) {
		
		String cellValue=null;
		List<WebElement> rows = fn_GetRows(table);
		int columNumber = fn_GetColumnNumber(table, columnName);
		
		cellValue = rows.get(rowNumber).findElements(By.tagName("td")).get(columNumber).getText();
		
		return cellValue;
	}
	
	public static int fn_GetColumnNumber(WebElement table, String columnName) {
		
		int columnNumber = -1;
		List<WebElement> rows = fn_GetRows(table);
		String columnNameCellValue =  null;;
		
		for(int i=1; i<rows.size(); i++) {
			List<WebElement> columns = fn_GetRows(table).get(i).findElements(By.tagName("td"));
			int columnsCount =columns.size();
			for(int j=1; j<columnsCount; j++) {
				columnNameCellValue = columns.get(j).getText();
				System.out.println(columnNameCellValue);
				if(columnNameCellValue.toLowerCase().contains(columnName)) {
					columnNumber = j;
					break;
				}
			}
		}
		
		return columnNumber;
	}
	
	public static int fn_GetRowNumber(WebElement table, String columnName, String cellValue) {
		
		int rowNumber = -1;
		List<WebElement> rows = fn_GetRows(table);
		String columnNameCellValue =  null;
		int columnNumber = fn_GetColumnNumber(table, cellValue);
		
		for(int i=1; i<rows.size(); i++) {
			List<WebElement> columns = fn_GetRows(table).get(i).findElements(By.tagName("td"));			
			int columnsCount =columns.size();
			
			for(int j=1; j<columnsCount; j++) {
				while(j==columnNumber) {
					columnNameCellValue = columns.get(j).getText();
					System.out.println(columnNameCellValue);
					if(columnNameCellValue.toLowerCase().contains(cellValue)) {
						rowNumber = i;
						break;
					}
				}
			}
		}
		
		return rowNumber;
	}

	
	// Select the drop down using "select by visible text", so pass VisibleText
	public static void fn_SelectByVisibleText(WebElement WE, String VisibleText) {
		Select selObj = new Select(WE);
		selObj.selectByVisibleText(VisibleText);
	}

	// Select the drop down using "select by index", so pass IndexValue
	public static void fn_SelectByIndex(WebElement WE, int IndexValue) {
		Select selObj = new Select(WE);
		selObj.selectByIndex(IndexValue);
	}

	// Select the drop down using "select by value", so pass Value
	public static void fn_SelectByValue(WebElement WE, String Value) {
		Select selObj = new Select(WE);
		selObj.selectByValue(Value);
	}

	public static void fn_MouseHover(WebElement we) {
		Actions actObj = new Actions(driver);
		actObj.moveToElement(we).build().perform();
	}

	public static String fn_GetTimeStamp() {
		DateFormat DF = DateFormat.getDateTimeInstance();
		Date dte = new Date();
		String DateValue = DF.format(dte);
		DateValue = DateValue.replaceAll(":", "_");
		DateValue = DateValue.replaceAll(",", "");
		return DateValue;
	}

	public static String fn_TakeSnapshot(WebDriver driver, String DestFilePath) throws IOException {
		String TS = fn_GetTimeStamp();
		TakesScreenshot tss = (TakesScreenshot) driver;
		File srcfileObj = tss.getScreenshotAs(OutputType.FILE);
		DestFilePath = DestFilePath + TS + ".png";
		File DestFileObj = new File(DestFilePath);
		FileUtils.copyFile(srcfileObj, DestFileObj);
		return DestFilePath;
	}

	public static long fn_GenerateRandomNumber(long seed) {

		Random generator = new Random();
		generator.setSeed(System.currentTimeMillis());
		long i = generator.nextInt(1000000) % 1000000;
		return i;

	}
	
	public static File fn_GetLatestFilefromDir(String dirPath){
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        return null;
	    }
	
	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) {
	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	           lastModifiedFile = files[i];
	       }
	    }
	    return lastModifiedFile;
	}
	
	
	public static String fn_GetMonth(String strMonth){
		
		  if(strMonth.equals("Jan"))
			  strMonth ="01";
		  else if (strMonth.equals("Feb"))
			     strMonth ="02";
		  else if (strMonth.equals("March"))
			     strMonth ="03";
		  else if (strMonth.equals("Apr"))
			     strMonth ="04";
		  else if (strMonth.equals("May"))
			     strMonth ="05";
		  else if (strMonth.equals("Jun"))
			     strMonth ="06";
		  else if (strMonth.equals("Jul"))
			     strMonth ="07";
		  else if (strMonth.equals("Aug"))
			     strMonth ="08";
		  else if (strMonth.equals("Sep"))
			     strMonth ="09";
		  else if (strMonth.equals("Oct"))
			     strMonth ="10";
		  else if (strMonth.equals("Nov"))
			     strMonth ="11";
		  else if (strMonth.equals("Dec"))
			     strMonth ="12";
		  return strMonth;
	    
	}
	
	
	public static String fn_GetMonth(int month){
		String strMonth = null;
		
		  if(month == 1)
			  strMonth ="Jan";
		  else if (month == 2)
			     strMonth ="Feb";
		  else if (month == 3)
			     strMonth ="March";
		  else if (month == 4)
			     strMonth ="Apr";
		  else if (month == 5)
			     strMonth ="May";
		  else if (month == 6)
			     strMonth ="Jun";
		  else if (month == 7)
			     strMonth ="Jul";
		  else if (month == 8)
			     strMonth ="Aug";
		  else if (month == 9)
			     strMonth ="Sep";
		  else if (month == 10)
			     strMonth ="Oct";
		  else if (month == 11)
			     strMonth ="Nov";
		  else if (month == 12)
			     strMonth ="Dec";
		  return strMonth;
	    
	}
	
	public static boolean isElementPresent(By locatorKey) {
	    try {
	        driver.findElement(locatorKey);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}

	public boolean isElementVisible(String cssLocator){
	    return driver.findElement(By.cssSelector(cssLocator)).isDisplayed();
	}
	
	public static String getCheckBoxValue(WebElement element) {
		if(element.getAttribute("class").contains("checked")) 
			return "Unchecked";
		else
			return "Checked";
	}
	
	public static void checkCheckBox(WebElement element, String checkBoxValue) {
		
		if(checkBoxValue.equalsIgnoreCase("Checked")) {
			if(element.getAttribute("class").contains("checked")) {
				element.click();
			}
		}
		if(checkBoxValue.equalsIgnoreCase("Unchecked")) {
			if(!(element.getAttribute("class").contains("checked"))) {
				element.click();
			}
		}

	}
	
	public static void verifyForSerchedPosts(LOSearchPage LOSearchPageObject, double ratingu, int count) throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		
		do {
			LOSearchPageObject.ratings = driver.findElements(By.xpath("//div[@class='srch-eng-result-rat srch-eng-result-rat-txt']"));
			LOSearchPageObject.countOfReviews = driver.findElements(By.xpath("//div[@class='srch-eng-result-rev-count srch-eng-result-rat-txt']"));
			for(int i=0; i<LOSearchPageObject.ratings.size(); i++) {
				double rating = Double.parseDouble(LOSearchPageObject.ratings.get(i).getText());
				int numberOfReview = Integer.parseInt((LOSearchPageObject.countOfReviews.get(i).getText().split(" "))[0]);
				if(rating>=ratingu) {
					System.out.println("Rating for "+i+" post is correct");
				}
				else
				{
					softAssert.fail("Rating for "+i+" post is incorrect");
				}
				
				if(numberOfReview>count) {
					System.out.println("Count of reviews for "+i+" post is correct");
				}
				else
				{
					softAssert.fail("Count of reviews for "+i+" post is incorrect");
				}
			}
			if(isElementPresent(By.xpath("//div[@class='srch-eng-page-no']/following-sibling::div"))) {
				if(driver.findElement(By.xpath("//div[@class='srch-eng-page-no']/following-sibling::div")).isDisplayed()) {
					driver.findElement(By.xpath("//div[@class='srch-eng-page-no']/following-sibling::div")).click();
					Thread.sleep(4000);
					LOSearchPageObject.ratings = driver.findElements(By.xpath("//div[@class='srch-eng-result-rat srch-eng-result-rat-txt']"));
					LOSearchPageObject.countOfReviews = driver.findElements(By.xpath("//div[@class='srch-eng-result-rev-count srch-eng-result-rat-txt']"));
				}
				else {
					System.out.println("No more posts");
					break;
				}
				
			}
			else {
				System.out.println("No more posts");
				break;
			}
				
		}while(Integer.parseInt(LOSearchPageObject.pageNumber.getText()) <= 5);
	}
}
