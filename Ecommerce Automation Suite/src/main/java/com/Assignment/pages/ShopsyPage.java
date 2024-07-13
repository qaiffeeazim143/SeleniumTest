package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShopsyPage {
	
WebDriver driver;
	
	public ShopsyPage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwardChecked3;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]")
    public WebElement MoreOn3 ;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Sell on Flipkart')]")
    public WebElement Sell3;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Know more about Shopsy')]")
    public WebElement Shopsy;
	
	
	public void pressForwardChecked3() {
		 forwardChecked3.click();
	   	  
	     }
	
	public void pressMoreOn3() {
		 MoreOn3.click();
	   	  
	     }
	
	public void pressSell3() {
		Sell3.click();
	   	  
	     }
	
	public void pressShopsy() {
		Shopsy.click();
	   	  
	     }
	
	

}
