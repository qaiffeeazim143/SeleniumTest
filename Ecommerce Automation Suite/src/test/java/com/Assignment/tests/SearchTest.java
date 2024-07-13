package com.Assignment.tests;


import java.io.IOException;

import org.testng.annotations.Test;

import com.Assignment.pages.Search;
import com.Assignment.utils.ExcelUtils;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;

public class SearchTest extends BaseTest {
	
	
	@Test (groups= {"Search"})
	public void validSearch( ) throws InterruptedException, IOException  {
		extentTest = extent.startTest("Verifying the valid Search");
		Search sea = new Search(driver);
		sea.pressForwardSearch();
		sea.enterSearch(ExcelUtils.getValidSearch());
		sea.pressSearchButton();
		Log4j.logger.info("Valid Search Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "valid Search Verification done Succesfully");
		extent.endTest(extentTest);
		
	}
	
	@Test (groups= {"Search"})
	public void inValidSearch( ) throws InterruptedException, IOException  {
		extentTest = extent.startTest("Verifying the inValid Search");
		Search sea = new Search(driver);
		sea.pressForwardSearch();
		sea.enterSearch(ExcelUtils.getData());
		sea.pressSearchButton();
		Log4j.logger.info("Invalid Search Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "Invalid Search Verification done Succesfully");
		extent.endTest(extentTest);
	}
}
