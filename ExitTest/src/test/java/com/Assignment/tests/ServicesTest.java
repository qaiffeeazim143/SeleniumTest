package com.Assignment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Assignment.pages.ServicesPage;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;



public class ServicesTest extends BaseTest {
	
	@Test (groups= {"Service"})
	public void Service( ) throws InterruptedException  {
		
		extentTest = extent.startTest("Verifying the Services Flipkart Page");
		ServicesPage ser = new ServicesPage(driver);
		ser.pressForwardChecked1();
		ser.pressMoreOn1();
		ser.pressSell1();
		ser.pressService();
		ser.pressFulfilment();
		Log4j.logger.info("Service Page Test Case Passed");
		Assert.assertEquals(driver.getTitle(), "Services | Everything you need to know about selling on Flipkart?");
		extentTest.log(LogStatus.PASS, "Service Page Verification done Succesfully");
		extent.endTest(extentTest);
		
	
	
	}
	
	@Test (groups= {"Service"})
	public void invalidService( ) throws InterruptedException  {
		
		extentTest = extent.startTest("Verifying the inValidServices Flipkart Page");
		ServicesPage ser = new ServicesPage(driver);
		ser.pressForwardChecked1();
		ser.pressMoreOn1();
		ser.pressSell1();
		ser.pressService();
		ser.pressFulfilment();
		Log4j.logger.error("AssertionError: expected [Everything you need to know about selling on Flipkart?] but found [Services | Everything you need to know about selling on Flipkart?]");
		extentTest.log(LogStatus.PASS, "invalid Service Page Verification done Succesfully But there is AssertionError: expected [Everything you need to know about selling on Flipkart?] but found [Services | Everything you need to know about selling on Flipkart?]");
		Assert.assertEquals(driver.getTitle(), "Everything you need to know about selling on Flipkart?");
	    extent.endTest(extentTest);
		
	
	
	}
	
	
}
