package com.testrunner.ss;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.base.ss.BaseClass;
import com.cucumber.listener.Reporter;
import com.util.ss.ExcelUtil;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@SuppressWarnings("unused")
@CucumberOptions(features = { "features/CreateCompany.feature" }, glue = { "com.stepdefinitions.ss" }, tags = {
		"@NewTest" }, plugin = { "pretty", "html:target/cucumber-reports" }, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws IOException {
		System.out.println("Before Class is running");
		driver = BaseClass.initializeDriver();
		driver.manage().window().maximize();
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test is running");
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			
			File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
			try {
			FileUtils.copyFile(src, new File("target/cucumber-reports/"+result.getTestName()+"jpg"));
			} catch (IOException e){
				System.out.println(e.getMessage());
			}

		}
	}	

	@AfterClass
	public void tearDown() {
		System.out.println("After Class is running");
		driver.close();
		driver.quit();
	}

}