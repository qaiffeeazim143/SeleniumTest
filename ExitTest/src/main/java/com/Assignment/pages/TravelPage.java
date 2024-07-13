package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TravelPage {
	
WebDriver driver;
	
	public TravelPage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwardProceeding ;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
    public WebElement exploredPlus ;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Flights')]")
    public WebElement flight ;
	
	 public void pressForwardProceeding() {
		 forwardProceeding.click();
	   	  
	     }
	 
	 public void pressExplored() {
		 exploredPlus.click();
	   	  
	     }
	 public void pressflight() {
		 flight.click();
	   	  
	     }

}
