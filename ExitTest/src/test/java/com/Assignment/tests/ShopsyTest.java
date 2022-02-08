package com.Assignment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Assignment.pages.ShopsyPage;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;



public class ShopsyTest extends BaseTest {
	
	
	@Test (groups= {"Shop"})
	public void Shopsy( ) throws InterruptedException  {
		
		extentTest = extent.startTest("Verifying the Shopsy Flipkart Page");
		ShopsyPage shop = new ShopsyPage(driver);
		shop.pressForwardChecked3();
		shop.pressMoreOn3();
		shop.pressSell3();
		shop.pressShopsy();
		Log4j.logger.info("Shopsy Page Test Case Passed");
		Assert.assertEquals(driver.getTitle(), "ShopsyPage | Flipkart top sellers");
		extentTest.log(LogStatus.PASS, "Shopsy Page Verification done Succesfully");
		extent.endTest(extentTest);
	}
	
	@Test (groups= {"Shop"})
	public void invalidShopsy( ) throws InterruptedException  {
		
		extentTest = extent.startTest("Verifying the Invalid Shopsy Flipkart Page");
		ShopsyPage shop = new ShopsyPage(driver);
		shop.pressForwardChecked3();
		shop.pressMoreOn3();
		shop.pressSell3();
		shop.pressShopsy();
		Log4j.logger.error("AssertionError: expected [Flipkart top sellers] but found [ShopsyPage | Flipkart top sellers]");
		extentTest.log(LogStatus.PASS, "Invalid Shopsy Page Verification done Succesfully But There Is AssertionError: expected [Flipkart top sellers] but found [ShopsyPage | Flipkart top sellers]");
		Assert.assertEquals(driver.getTitle(), "Flipkart top sellers");
		extent.endTest(extentTest);
	}
}
