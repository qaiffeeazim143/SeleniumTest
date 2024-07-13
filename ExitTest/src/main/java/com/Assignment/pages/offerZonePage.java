package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class offerZonePage {
	
WebDriver driver;
	
	public offerZonePage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwarded;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]")
    public WebElement MoreContainer ;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Notification Preferences')]")
    public WebElement Notification;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Offer Zone')]")
    public WebElement offZone;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
    public WebElement viewAll;
	
	
	public void pressForwarded() {
		forwarded.click();
	   	  
	     }
	public void pressMoreContainer() {
		MoreContainer.click();
	   	  
	     }
	
	public void pressNotification() {
		Notification.click();
	   	  
	     }
	
	public void pressOfferZone() {
		offZone.click();
	   	  
	     }
	
	public void pressviewAll() {
		viewAll.click();
	   	  
	     }
	
	

}
