package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RewardStorePage {
	
WebDriver driver;
	
	public RewardStorePage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwardProceed ;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
    public WebElement explorePlus ;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/img[2]")
    public WebElement myRewardStore ;
	
	 public void pressForwardProceed() {
		 forwardProceed.click();
	   	  
	     }
	 
	 public void pressExplore() {
		 explorePlus.click();
	   	  
	     }
	 
	 public void pressReward() {
		 myRewardStore.click();
	   	  
	     }
	
	

}
