package com.Assignment.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Assignment.pages.ComparePage;
import com.Assignment.utils.ExcelUtils;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;

public class CompareTest extends BaseTest {
	
	@Test (groups= {"Compare"})
	public void Compared( ) throws InterruptedException, IOException  {
		extentTest = extent.startTest("Verifying the Compare Page");
		ComparePage comp = new ComparePage(driver);
		comp.enterUserMail(ExcelUtils.getUserCredential());
		comp.enterPass(ExcelUtils.getvalidPassword());
		comp.clickedLoginButton();
		Thread.sleep(1000);
		comp.enterSearched(ExcelUtils.getValidSearch());
		comp.pressSearchedButton();
		comp.pressCompare();
		Log4j.logger.info("Compare Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "Compare Page Verification done Succesfully");
		extent.endTest(extentTest);
		
		
		
	}

}
