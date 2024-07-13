package com.Assignment.tests;

import org.testng.annotations.Test;

import com.Assignment.pages.FaqPage;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;





public class FaqTest extends BaseTest {
	
	@Test (groups= {"faq"})
	public void SellOnFlip( ) throws InterruptedException  {
		
		extentTest = extent.startTest("Verifying the FAQ on Flipkart Page");
		FaqPage fq = new FaqPage(driver);
		fq.pressForwardChecked2();
		fq.pressMoreOn2();
		fq.pressSell2();
		fq.pressFaq();
		Log4j.logger.info("FAQ Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "FAQ Page Verification done Succesfully");
		extent.endTest(extentTest);
		
		
		
		
		
		
		
		
	}
}
