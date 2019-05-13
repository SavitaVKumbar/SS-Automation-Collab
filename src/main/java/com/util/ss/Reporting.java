package com.util.ss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.ss.BaseClass;

public class Reporting extends BaseClass {

	public static void captureScreenShot() {
		
		File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
		try {
		FileUtils.copyFile(src, new File("target/cucumber-reports/screenshot.jpg"));
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
	}	
	
	public static void syncWait() throws InterruptedException {
		Thread.sleep(2000);
		captureScreenShot();
	}
}
