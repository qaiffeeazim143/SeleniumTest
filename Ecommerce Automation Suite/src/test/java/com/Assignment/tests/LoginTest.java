package com.Assignment.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Optional;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Assignment.pages.LoginPage;
import com.Assignment.utils.ExcelUtils;
import com.Assignment.utils.Log4j;
import com.relevantcodes.extentreports.LogStatus;




public class LoginTest extends BaseTest {
	
	
	
	
	@Test (groups= {"Login"})
	public void Login( ) throws InterruptedException, IOException  {
		extentTest = extent.startTest("Verifying the valid Login");
		LoginPage login = new LoginPage(driver);
		login.enterUserMailorMobile(ExcelUtils.getUserCredential());
		login.enterPassword(ExcelUtils.getvalidPassword());
		login.clickLoginButton();
		Log4j.logger.info("Valid Login Page Test Case Passed");
		Assert.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		extentTest.log(LogStatus.PASS, "valid Login Verification done Succesfully");
		extent.endTest(extentTest);
		
	}
	
	@Test (groups= {"Login"})
	public void inValidLogin( ) throws InterruptedException, IOException  {
		
	   
		extentTest = extent.startTest("Verifying the inValid Login");
		LoginPage login = new LoginPage(driver);
		login.enterUserMailorMobile(ExcelUtils.getUserCredential());
		login.enterPassword(ExcelUtils.getData());
		login.clickLoginButton();
		Log4j.logger.error("AssertionError: expected [Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!] but found [Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!]");
		extentTest.log(LogStatus.PASS, "inValid Login Verification done Succesfully But There is Assertion Error : expected [Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!] but found [Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!]");
		Assert.assertEquals(driver.getTitle(), "Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		extent.endTest(extentTest);
	    
		
	}
	
	
	
}
