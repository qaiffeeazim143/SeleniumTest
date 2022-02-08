package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FeeStructurePage {
	
WebDriver driver;
	
	public FeeStructurePage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwardProceed;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]")
    public WebElement MoreOnContainer ;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Sell on Flipkart')]")
    public WebElement Selled;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Fee Structure')]")
    public WebElement Fee;
	
	
	
	public void pressForwardProceed() {
		forwardProceed.click();
	   	  
	     }
	
	public void pressMoreOnContainer() {
		MoreOnContainer.click();
	   	  
	     }
	
	public void pressSelled() {
		Selled.click();
	   	  
	     }
	
	public void pressFeeStructure() {
		Fee.click();
	   	  
	     }
	
	

}
