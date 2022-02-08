package com.Assignment.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Assignment.pages.PlacedOrderPage;
import com.Assignment.utils.ExcelUtils;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;



public class PlacedOrderTest extends BaseTest {
	
	@Test (groups= {"Order"})
	public void placedOrder( ) throws InterruptedException, IOException  {
		extentTest = extent.startTest("Verifying the Placed Order Page");
		PlacedOrderPage or = new PlacedOrderPage(driver);
		or.enterUserMail1(ExcelUtils.getUserCredential());
		or.enterPass1(ExcelUtils.getvalidPassword());
		or.clickedLoginButton1();
		Thread.sleep(1000);
		or.enterSearched1(ExcelUtils.getValidSearch());
		or.pressSearchedButton1();
		or.pressCompare1();
		or.pressCompareCont1();
		or.pressChooseProduct1();
		or.pressaddtoCart1();
		or.pressOrder1();
		Log4j.logger.info("Order Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "Order Page Verification done Succesfully");
		extent.endTest(extentTest);
		
		
		
		
		
		
		
		
	}

	
	

}
