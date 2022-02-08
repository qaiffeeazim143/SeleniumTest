package com.Assignment.tests;

import org.testng.annotations.Test;

import com.Assignment.pages.RewardStorePage;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;

public class RewardStoreTest extends BaseTest {
	
	@Test (groups= {"Reward"})
	public void Reward( ) throws InterruptedException  {
		extentTest = extent.startTest("Verifying the RewardStore Page");
		RewardStorePage store = new RewardStorePage(driver);
		store.pressForwardProceed();
		store.pressExplore();
		store.pressReward();
		Log4j.logger.info("Reward Store Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "RewardStore Page Verification done Succesfully");
		extent.endTest(extentTest);
		
		
		
	}
	

}
