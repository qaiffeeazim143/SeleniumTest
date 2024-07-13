package com.Assignment.tests;

import org.testng.annotations.Test;

import com.Assignment.pages.FeeStructurePage;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;

public class FeeStructureTest extends BaseTest {
	
	@Test (groups= {"fee"})
	public void Fees( ) throws InterruptedException  {
		
		extentTest = extent.startTest("Verifying the FeeStructure Page");
		FeeStructurePage fe = new FeeStructurePage(driver);
		fe.pressForwardProceed();
		fe.pressMoreOnContainer();
		fe.pressSelled();
		fe.pressFeeStructure();
		Log4j.logger.info("Fee Structure Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "FeeStructure Page Verification done Succesfully");
		extent.endTest(extentTest);
		
		
		
	}

}
