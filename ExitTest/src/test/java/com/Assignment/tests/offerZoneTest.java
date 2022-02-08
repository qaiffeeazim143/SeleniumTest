package com.Assignment.tests;

import org.testng.annotations.Test;

import com.Assignment.pages.offerZonePage;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;

public class offerZoneTest extends BaseTest {
	
	@Test (groups= {"Offer"})
	public void Offer( ) throws InterruptedException  {
		
		extentTest = extent.startTest("Verifying the OfferZone Page");
		offerZonePage off = new offerZonePage(driver);
		off.pressForwarded();
		off.pressMoreContainer();
		off.pressNotification();
		off.pressOfferZone();
		off.pressviewAll();
		Log4j.logger.info("Offer Zone Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "OfferZone Page Verification done Succesfully");
		extent.endTest(extentTest);
		
	}

}
