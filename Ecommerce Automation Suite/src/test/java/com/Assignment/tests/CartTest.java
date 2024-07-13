package com.Assignment.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Assignment.pages.CartPage;
import com.Assignment.utils.ExcelUtils;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;

public class CartTest extends BaseTest{
	
	@Test (groups= {"Cart"})
	public void Cart( ) throws InterruptedException, IOException  {
		extentTest = extent.startTest("Verifying the Cart Page");
		CartPage car = new CartPage(driver);
	    car.enterUserMailValue(ExcelUtils.getUserCredential());
	    car.enterPassValue(ExcelUtils.getvalidPassword());
		car.clickedLoginButtonClick();
		Thread.sleep(1000);
	    car.enterSearchedValue(ExcelUtils.getValidSearch());
		car.pressSearchedButtonClick();
		car.pressCompareClick();
		car.pressCompareCont();
		car.pressChooseProduct();
		car.pressaddtoCart();
		Log4j.logger.info("Cart Page Test Case Passed");
		extentTest.log(LogStatus.PASS, "Cart Page Verification done Succesfully");
		extent.endTest(extentTest);
		
		
		
		
		
	}

}
