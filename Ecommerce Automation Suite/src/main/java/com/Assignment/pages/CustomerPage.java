package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	
WebDriver driver;
	
	public CustomerPage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwardChecking;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]")
    public WebElement MoreOpt ;
	
	@FindBy(how=How.XPATH,using="//a[@href='/helpcentre']")
    public WebElement Care;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/span[1]")
    public WebElement FlipkartPlus;
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'What is SuperCoins?')]")
    public WebElement SuperCoins;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
    public WebElement FeedBack;
  
	public void pressForwardChecking() {
		 forwardChecking.click();
	   	  
	     }
	
	public void pressMoreOpt() {
		MoreOpt.click();
	   	  
	     }
	
	public void pressCare() {
		Care.click();
	   	  
	     }
	
	public void pressPlus() {
		FlipkartPlus.click();
	   	  
	     }
	public void pressCoins() {
		SuperCoins.click();
	   	  
	     }
	
	public void pressFeedBack() {
		FeedBack.click();
	   	  
	     }
}
