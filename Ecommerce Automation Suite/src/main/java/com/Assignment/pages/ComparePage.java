package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {
	
WebDriver driver;
	
	public ComparePage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }

	
	@FindBy(how=How.XPATH,using="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
    public WebElement EmailOrMobileNumber ;
	
	 @FindBy(how=How.XPATH,using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	    public WebElement Pass ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
	    public WebElement LogButton ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
	    public WebElement Searched ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
	    public WebElement searchedButton ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/span[1]/label[1]/div[1]")
	    public WebElement Compare ;
	 
	 public void enterUserMail(String EnterMailOrMobile) {
	    	EmailOrMobileNumber.sendKeys(EnterMailOrMobile);
	  	  
	    }
	 public void enterPass(String Password) {
	    	Pass.sendKeys(Password);
	     	  
	       }
	 
	 public void clickedLoginButton() {
	    	LogButton.click();
	   	  
	     }
	 public void enterSearched(String userSearch) {
	    	Searched.sendKeys(userSearch);
	  	  
	    }
	 
	 public void pressSearchedButton() {
	    	searchedButton.click();
	   	  
	     }
	 public void pressCompare() {
		    Compare.click();
	   	  
	     }
	 
}
