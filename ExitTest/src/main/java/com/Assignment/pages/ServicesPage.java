package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {
	
WebDriver driver;
	
	public ServicesPage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwardCheckedPress;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]")
    public WebElement MoreOnPress ;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Sell on Flipkart')]")
    public WebElement SellPress;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='app']/div[1]/div[1]/ul[1]/li[2]/a[1]")
    public WebElement Service;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Flipkart Fulfilment')]")
    public WebElement Fulfilment;
	
	
	
	
	public void pressForwardChecked1() {
		 forwardCheckedPress.click();
	   	  
	     }
	
	public void pressMoreOn1() {
		 MoreOnPress.click();
	   	  
	     }
	
	public void pressSell1() {
		SellPress.click();
	   	  
	     }
	
	public void pressService() {
		Service.click();
	   	  
	     }
	public void pressFulfilment() {
		Fulfilment.click();
	   	  
	     }
	

}
