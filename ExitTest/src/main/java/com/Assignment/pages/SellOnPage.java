package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SellOnPage {
	
WebDriver driver;
	
	public SellOnPage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwardChecked;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]")
    public WebElement MoreOn ;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Sell on Flipkart')]")
    public WebElement Sell;
	
	public void pressForwardChecked() {
		 forwardChecked.click();
	   	  
	     }
	
	public void pressMoreOn() {
		 MoreOn.click();
	   	  
	     }
	
	public void pressSell() {
		Sell.click();
	   	  
	     }
	
	
	

}
