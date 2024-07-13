package com.Assignment.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Assignment.pages.DownloadAppPage;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;

public class DownloadAppTest extends BaseTest {
	
	@Test (groups= {"App"})
	public void downloadApp( ) throws InterruptedException  {
		extentTest = extent.startTest("Verifying the Download App");
		DownloadAppPage	app = new DownloadAppPage(driver);
		app.pressForwardClicks();
		app.pressMore();
		app.pressDownloadApp();
		Log4j.logger.info("Download App Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "Download App Verification done Succesfully");
		extent.endTest(extentTest);
		
		
	}

}
