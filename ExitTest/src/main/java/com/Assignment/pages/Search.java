package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Search {
WebDriver driver;
	
	public Search(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwardCheck ;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
    public WebElement Search ;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
    public WebElement searchButton ;
	
	
	 public void pressForwardSearch() {
		 forwardCheck.click();
	   	  
	     }
	 public void enterSearch(String userSearch) {
	    	Search.sendKeys(userSearch);
	  	  
	    }
	 
	 public void pressSearchButton() {
	    	searchButton.click();
	   	  
	     }
	

}
