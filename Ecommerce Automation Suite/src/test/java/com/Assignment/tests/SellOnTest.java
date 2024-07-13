package com.Assignment.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Assignment.pages.SellOnPage;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;

public class SellOnTest extends BaseTest{
	
	@Test (groups= {"Sell"})
	public void SellOnFlip( ) throws InterruptedException  {
		
		extentTest = extent.startTest("Verifying the SellOn Flipkart Page");
		SellOnPage sel = new SellOnPage(driver);
		sel.pressForwardChecked();
		sel.pressMoreOn();
		sel.pressSell();
		Log4j.logger.info("Sell On Page Test Case Passed");
		Assert.assertEquals(driver.getTitle(), "Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce");
		extentTest.log(LogStatus.PASS, "SellOn Page Verification done Succesfully");
		extent.endTest(extentTest);
		
		
	}
	
	@Test (groups= {"Sell"})
	public void InvalidsellOnFlip( ) throws InterruptedException  {
		
		extentTest = extent.startTest("Verifying the InvalidSellOn Flipkart Page");
		SellOnPage sel = new SellOnPage(driver);
		sel.pressForwardChecked();
		sel.pressMoreOn();
		sel.pressSell();
		Log4j.logger.error("AssertionError: expected [Online on Flipkart | Grow your business with the leader in Indian e-commerce] but found [Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce]");
		extentTest.log(LogStatus.PASS, " Invalid SellOn Page Verification done Succesfully But There is AssertionError: expected [Online on Flipkart | Grow your business with the leader in Indian e-commerce] but found [Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce]");
		Assert.assertEquals(driver.getTitle(), "Online on Flipkart | Grow your business with the leader in Indian e-commerce");
		extent.endTest(extentTest);
		
		
	}

}
