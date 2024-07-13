package com.Assignment.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Assignment.pages.CustomerPage;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;

public class CustomerTest extends BaseTest {
	
	@Test (groups= {"Care"})
	public void CustomerCare( ) throws InterruptedException  {
		
		extentTest = extent.startTest("Verifying the CustomerCare on Flipkart Page");
		CustomerPage cust = new CustomerPage(driver);
		cust.pressForwardChecking();
		cust.pressMoreOpt();
		cust.pressCare();
		cust.pressPlus();
		cust.pressCoins();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		cust.pressFeedBack();
		Log4j.logger.info("Customer Care Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "CustomerCare Page Verification done Succesfully");
		extent.endTest(extentTest);
		
		
	}

}
