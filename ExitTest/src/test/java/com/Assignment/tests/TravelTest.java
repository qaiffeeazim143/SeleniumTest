package com.Assignment.tests;

import org.testng.annotations.Test;

import com.Assignment.pages.TravelPage;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;



public class TravelTest extends BaseTest {
	
	@Test (groups= {"travel"})
	public void Travel( ) throws InterruptedException  {
		extentTest = extent.startTest("Verifying the Travel Page");
		TravelPage tr = new TravelPage(driver);
		tr.pressForwardProceeding();
		tr.pressExplored();
		tr.pressflight();
		Log4j.logger.info("Travel Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "Travel Page Verification done Succesfully");
		extent.endTest(extentTest);
		
	}
}
