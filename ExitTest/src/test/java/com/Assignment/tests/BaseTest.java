package com.Assignment.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Assignment.utils.ScreenShots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class BaseTest {
	
	static WebDriver driver;
	static File file= new File(".\\Resources1\\config.properties");
	static FileInputStream fis = null;
	static Properties prop = new Properties();
	
	public static ExtentReports extent;
	public static ExtentTest extentTest ;
	
	static {
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@BeforeSuite (groups= {"Login","Search","App","Sell","Care","Offer","fee","Compare","Reward","travel","Cart","Order","Service","faq","Shop"})
	public void setExtent() {
		extent = new ExtentReports("./Reports1/ExtentReport.html");
	}
	
	@AfterSuite (groups= {"Login","Search","App","Sell","Care","Offer","fee","Compare","Reward","travel","Cart","Order","Service","faq","Shop"})
	public void endReport() {
		extent.flush();
		extent.close();
	}
	
	@AfterMethod (groups= {"Login","Search","App","Sell","Care","Offer","fee","Compare","Reward","travel","Cart","Order","Service","faq","Shop"})
	public void attachScreenshot(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			String screenshotPath = ScreenShots.captureScreenshot(driver,result.getName());
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(screenshotPath) );
			extent.endTest(extentTest);
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test Case passed Succesfully");
		}
	}
	
	
	@BeforeMethod (groups= {"Login","Search","App","Sell","Care","Offer","fee","Compare","Reward","travel","Cart","Order","Service","faq","Shop"})
	public static void initializeWebdriver(){
		if(prop.getProperty("Browser").equalsIgnoreCase("Chrome")){
			
	System.setProperty(prop.getProperty("chromeDriverProperty"),prop.getProperty("chromeDriverPath"));
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
	   }
	
	else if(prop.getProperty("Browser").equalsIgnoreCase("edge")){
			
		System.setProperty(prop.getProperty("edgeDriverProperty"),prop.getProperty("edgeDriverPath"));
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		}
		
	else if(prop.getProperty("Browser").equalsIgnoreCase("Firefox")) { 
	System.setProperty(prop.getProperty("FirefoxDriverProperty"),prop.getProperty("FirefoxDriverPath"));
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
	}
		
	else if(prop.getProperty("Browser").equalsIgnoreCase("headless_chrome")) {
		System.setProperty(prop.getProperty("chromeDriverProperty"),prop.getProperty("chromeDriverPath"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		
		
		
	}
		
	
		
		
		
		 
	}
		
	@BeforeMethod (groups= {"Login","Search","App","Sell","Care","Offer","fee","Compare","Reward","travel","Cart","Order","Service","faq","Shop"})
	public static void openUrl() {
		driver.get(prop.getProperty("url1"));
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod (groups= {"Login","Search","App","Sell","Care","Offer","fee","Compare","Reward","travel","Cart","Order","Service","faq","Shop"})
	public static void closeBrowser(){
		driver.close();
		
	}
	

}
