package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DownloadAppPage {
WebDriver driver;
	
	public DownloadAppPage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwardChecks;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]")
    public WebElement More ;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Download App')]")
    public WebElement DownloadApp ;
	
	 public void pressForwardClicks() {
		 forwardChecks.click();
	   	  
	     }
	 
	 public void pressMore() {
		 More.click();
	   	  
	     }
	 
	 public void pressDownloadApp() {
		 DownloadApp.click();
	   	  
	     }
	

}
